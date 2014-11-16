/*******************************************************************************
 * Copyright 2011-2014 SirSengir
 *
 * This work (the API) is licensed under the "MIT" License, see LICENSE.txt for details.
 ******************************************************************************/
package magicbees2.api.apiculture.hives;

import java.util.ArrayList;

import magicbees2.api.apiculture.IHive;
import magicbees2.bee.BeeManager;
import magicbees2.block.HiveDrop;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import forestry.api.apiculture.IHiveDrop;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;
import forestry.api.genetics.IAllele;

public abstract class HiveBasic implements IHive {

	protected Block hiveBlock;
	protected int hiveMeta;
	
	protected float genChance;
	
	protected ArrayList<IHiveDrop> drops = new ArrayList<IHiveDrop>();

	public HiveBasic(Block hiveBlock, int hiveMeta, float genChance) {
		if (hiveBlock == null)
			throw new IllegalArgumentException("Tried to create hive with null hive block");
		this.hiveBlock = hiveBlock;
		this.hiveMeta = hiveMeta;
		this.genChance = genChance;
	}

	@Override
	public Block getHiveBlock() {
		return hiveBlock;
	}

	@Override
	public int getHiveMeta() {
		return hiveMeta;
	}

	@Override
	public ArrayList<IHiveDrop> getDrops() {
		return drops;
	}

	@Override
	public void addDrop(IHiveDrop drop) {
		drops.add(drop);
	}

	@Override
	public float genChance() {
		return genChance;
	}

	@Override
	public void postGen(World world, int x, int y, int z) {

	}

	@Override
	public boolean isGoodBiome(BiomeGenBase biome) {
		return true;
	}

	@Override
	public boolean isGoodHumidity(EnumHumidity humidity) {
		return true;
	}

	@Override
	public boolean isGoodTemperature(EnumTemperature temperature) {
		return true;
	}

	@Override
	public boolean isGoodLocation(World world, int x, int y, int z) {
		return true;
	}

	@Override
	public boolean canReplace(World world, int x, int y, int z) {
		Material material = world.getBlock(x, y, z).getMaterial();
		
		return (material.isReplaceable()  && !material.isLiquid()) || material == Material.air || material == Material.plants;
	}
	
}
