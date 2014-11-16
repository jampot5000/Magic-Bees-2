package magicbees2.block;

import java.util.ArrayList;
import java.util.Collection;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import forestry.api.apiculture.EnumBeeType;
import forestry.api.apiculture.IBee;
import forestry.api.apiculture.IBeeGenome;
import forestry.api.apiculture.IBeeRoot;
import forestry.api.apiculture.IHiveDrop;
import forestry.api.genetics.AlleleManager;
import forestry.api.genetics.IAllele;

public class HiveDrop implements IHiveDrop {

	private int chance;
	private int ignoblePercent;
	
	private IBeeRoot root;
	private IAllele[] template;
	
	private ArrayList<ItemStack> additional = new ArrayList<ItemStack>();
	
	/* 40% chance to get an ignoable bee */
	public HiveDrop(IAllele[] template, ItemStack[] bonus, int chance) {
		this(template, bonus, chance, 40);
	}
	
	public HiveDrop(IAllele[] template, ItemStack[] bonus, int chance, int percent) {
		root = (IBeeRoot) AlleleManager.alleleRegistry.getSpeciesRoot("rootBees");
		
		this.template = template;
		this.chance = chance;
		this.ignoblePercent = percent;
		
		for (ItemStack stack : bonus)
			this.additional.add(stack);
		
	}
	
	@Override
	public ItemStack getPrincess(World world, int x, int y, int z, int fortune) {
		IBee bee = root.getBee(world, root.templateAsGenome(this.template));
		
		if (world.rand.nextInt() < this.ignoblePercent) {
			bee.setIsNatural(false);
		}
		
		return root.getMemberStack(bee, EnumBeeType.PRINCESS.ordinal());
	}

	@Override
	public Collection<ItemStack> getDrones(World world, int x, int y, int z, int fortune) {
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		IBee bee = root.getBee(world, root.templateAsGenome(this.template));
		
		if (world.rand.nextInt() < this.ignoblePercent) {
			bee.setIsNatural(false);
		}
		
		ret.add(root.getMemberStack(bee, EnumBeeType.DRONE.ordinal()));
		
		return ret;
	}

	@Override
	public Collection<ItemStack> getAdditional(World world, int x, int y, int z, int fortune) {
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		
		for(ItemStack itemstack : additional)
			ret.add(itemstack);

		return ret;
	}

	@Override
	public int getChance(World world, int x, int y, int z) {
		return chance;
	}
	
	public int getIgnoblePercentage() {
		return ignoblePercent;
	}
	
	public void setIgnoblePercentage(int percent) {
		this.ignoblePercent = percent;
	}

}
