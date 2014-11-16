package magicbees2.bee.branch.metallic;

import net.minecraft.item.ItemStack;
import forestry.api.genetics.IClassification;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.IItems;

public class BeeLead extends Bee {
	
	public BeeLead() {
		super("lead", "plumbeus", Group.METALLIC, 0x96BFC4, 0x91A9F3, false, true);
		
		// Bee Product(s)
		this.addProduct(new ItemStack(IItems.fComb, 1, 0), 10);
		
		// Bee Specialties
		// TODO: Add Nugget
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
