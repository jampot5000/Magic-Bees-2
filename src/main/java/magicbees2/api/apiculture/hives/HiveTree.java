/*******************************************************************************
 * Copyright 2011-2014 SirSengir
 *
 * This work (the API) is licensed under the "MIT" License, see LICENSE.txt for details.
 ******************************************************************************/
package magicbees2.api.apiculture.hives;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import forestry.api.core.EnumTemperature;

public abstract class HiveTree extends HiveBasic {

	public HiveTree(Block hiveBlock, int hiveMeta, float genChance) {
		super(hiveBlock, hiveMeta, genChance);
	}

	@Override
	public boolean isGoodBiome(BiomeGenBase biome) {
		return !EnumTemperature.isBiomeHellish(biome);
	}

	@Override
	public boolean isGoodLocation(World world, int x, int y, int z) {
		Block blockAbove = world.getBlock(x, y + 1, z);
		if (!blockAbove.isLeaves(world, x, y + 1, z))
			return false;

		// not a good location if right on top of something
		return canReplace(world, x, y - 1, z);
	}

	@Override
	public int getYForHive(World world, int x, int z) {
		
		// get top leaf block
		int y = world.getHeightValue(x, z) - 1;
		if (!world.getBlock(x, y, z).isLeaves(world, x, y, z))
			return -1;

		// get to the bottom of the leaves
		do { y--; } while (world.getBlock(x, y, z).isLeaves(world, x, y, z));

		return y;
	}
	
}
