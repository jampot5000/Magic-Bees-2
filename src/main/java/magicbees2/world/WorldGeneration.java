package magicbees2.world;

import java.util.Random;

import magicbees2.api.apiculture.IHive;
import magicbees2.api.apiculture.hives.HiveManager;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class WorldGeneration implements IWorldGenerator {

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		decoreateHives(world, rand, chunkX * 16, chunkZ * 16);		
	}
	
	/**
	 * This method belongs to Forestry, but has not yet been implemented. This will be removed later on.
	 * @param world
	 * @param rand
	 * @param worldX
	 * @param worldZ
	 */
	private void decoreateHives(World world, Random rand, int worldX, int worldZ) {
		for (IHive hive : HiveManager.getHives()) {
			genHive(world, rand, worldX, worldZ, hive);
		}
	}
	
	/**
	 * This method belongs to Forestry, but has not yet been implemented. This will be removed later on.
	 * @param world
	 * @param rand
	 * @param worldX
	 * @param worldZ
	 * @param hive
	 */
	private void genHive(World world, Random rand, int worldX, int worldZ, IHive hive) {
		if (hive.genChance() < rand.nextFloat() * 128.0f)
			return;

		BiomeGenBase biome = world.getBiomeGenForCoords(worldX, worldZ);
		EnumHumidity humidity = EnumHumidity.getFromValue(biome.rainfall);

		if (!hive.isGoodBiome(biome) || !hive.isGoodHumidity(humidity))
			return;

		for (int tries = 0; tries < 4; tries ++) {
			int x = worldX + rand.nextInt(16);
			int z = worldZ + rand.nextInt(16);

			if (tryGenHive(world, x, z, hive))
				return;
		}
		
	}
	
	/**
	 * This method belongs to Forestry, but has not yet been implemented. This will be removed later on.
	 * @param world
	 * @param x
	 * @param z
	 * @param hive
	 * @return
	 */
	private boolean tryGenHive(World world, int x, int z, IHive hive) {
		int y = hive.getYForHive(world, x, z);

		if (y < 0)
			return false;

		if (!hive.canReplace(world, x, y, z))
			return false;

		BiomeGenBase biome = world.getBiomeGenForCoords(x, z);
		EnumTemperature temperature = EnumTemperature.getFromValue(biome.getFloatTemperature(x, y, z));
		if (!hive.isGoodTemperature(temperature))
			return false;

		if (!hive.isGoodLocation(world, x, y, z)) 
			return false;

		return setHive(world, x, y, z, hive);
	}
	
	/**
	 * This method belongs to Forestry, but has not yet been implemented. This will be removed later on.
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * @param hive
	 * @return
	 */
	protected boolean setHive(World world, int x, int y, int z, IHive hive) {
		Block hiveBlock = hive.getHiveBlock();
		boolean placed = world.setBlock(x, y, z, hiveBlock, hive.getHiveMeta(), 2);
		if (!placed)
			return false;
		
		Block placedBlock = world.getBlock(x, y, z);
		if (!Block.isEqualTo(hiveBlock, placedBlock))
			return false;

		hiveBlock.onBlockAdded(world, x, y, z);
		world.markBlockForUpdate(x, y, z);
		
		hive.postGen(world, x, y, z);
		return true;
	}
	
}
