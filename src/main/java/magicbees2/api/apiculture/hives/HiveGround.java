/*******************************************************************************
 * Copyright 2011-2014 SirSengir
 *
 * This work (the API) is licensed under the "MIT" License, see LICENSE.txt for details.
 ******************************************************************************/
package magicbees2.api.apiculture.hives;

import java.util.HashSet;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import forestry.api.core.EnumTemperature;

public abstract class HiveGround extends HiveBasic {

	private final HashSet<Material> groundMaterials = new HashSet<Material>();

	public HiveGround(Block hiveBlock, int hiveMeta, float genChance, Block... groundBlocks) {
		super(hiveBlock, hiveMeta, genChance);

		for (Block block : groundBlocks)
			groundMaterials.add(block.getMaterial());
	}

	@Override
	public boolean isGoodBiome(BiomeGenBase biome) {
		return !EnumTemperature.isBiomeHellish(biome);
	}

	@Override
	public boolean isGoodLocation(World world, int x, int y, int z) {
		Block ground = world.getBlock(x, y - 1, z);
		return groundMaterials.contains(ground.getMaterial());
	}

	@Override
	public int getYForHive(World world, int x, int z) {
		int y = world.getHeightValue(x, z);

		// Get to the ground...
		while (y >= 0 && (world.getBlock(x, y - 1, z).isLeaves(world, x, y - 1, z) || canReplace(world, x, y - 1, z))) {
			y--;
		}

		return y;
	}
	
}
