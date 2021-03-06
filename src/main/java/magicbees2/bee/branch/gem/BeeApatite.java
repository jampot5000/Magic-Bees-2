package magicbees2.bee.branch.gem;

import net.minecraft.item.ItemStack;
import forestry.api.genetics.IClassification;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.IItems;

public class BeeApatite extends Bee {
	
	public BeeApatite() {
		super("apatite", "apatite", Group.GEM, 0x2EA7EC, 0x001D51, false, false);
		
		// Bee Product(s)
		this.addProduct(new ItemStack(IItems.fComb, 1, 0), 10);
		
		// Bee Specialties
		// TODO: Add Nugget
	}

	@Override
	public String getSpeed() {
		return "speedNorm";
	}
	
	@Override
	public String getLifespan() {
		return "lifespanNormal";
	}
	
	@Override
	public String getFertility() {
		return "fertilityLow";
	}
	
	@Override
	public String getNocturnal() {
		return "boolTrue";
	}
	
	@Override
	public String getCaveDwelling() {
		return "boolTrue";
	}
	
}
