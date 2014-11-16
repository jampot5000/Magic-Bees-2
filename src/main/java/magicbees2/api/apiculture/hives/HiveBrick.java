package magicbees2.api.apiculture.hives;

import java.util.ArrayList;
import java.util.HashSet;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import forestry.api.core.EnumTemperature;

public abstract class HiveBrick extends HiveBasic {

	private final HashSet<Material> groundMaterials = new HashSet<Material>();
	
	public HiveBrick(Block hiveBlock, int hiveMeta, float genChance, Block... groundBlocks) {
		super(hiveBlock, hiveMeta, genChance);
		
		for (Block block : groundBlocks)
			groundMaterials.add(block.getMaterial());
		
	}
	
	@Override
	public boolean isGoodBiome(BiomeGenBase biome) {
		return EnumTemperature.isBiomeHellish(biome);
	}

	@Override
	public boolean isGoodLocation(World world, int x, int y, int z) {
		ArrayList<Material> ret = new ArrayList<Material>();
		
		ret.add(world.getBlock(x + 1, y, z).getMaterial());
		ret.add(world.getBlock(x - 1, y, z).getMaterial());
		ret.add(world.getBlock(x, y + 1, z).getMaterial());
		ret.add(world.getBlock(x, y - 1, z).getMaterial());
		ret.add(world.getBlock(x, y, z + 1).getMaterial());
		ret.add(world.getBlock(x, y, z - 1).getMaterial());
		
		return groundMaterials.containsAll(ret);
	}
	
	@Override
	public boolean canReplace(World world, int x, int y, int z) {
		Material material = world.getBlock(x, y - 1, z).getMaterial();

		return (material == Material.rock);
	}

	@Override
	public int getYForHive(World world, int x, int z) {
		int y = world.getHeightValue(x, z);

		// Find nether rack.
		while (y >= 0 && (isRock(world, x, y - 1, z)) || canReplace(world, x, y - 1, z)) {
			y--;
		}

		return y;
	}

	private boolean isRock(World world, int x, int y, int z) {
		return (world.getBlock(x, y - 1, z).getMaterial() == Material.rock);
	}
}
