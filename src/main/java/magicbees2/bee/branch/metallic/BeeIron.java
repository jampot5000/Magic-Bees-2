package magicbees2.bee.branch.metallic;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.IItems;
import net.minecraft.item.ItemStack;

public class BeeIron extends Bee {
	
	public BeeIron() {
		super("iron", "ferrus", Group.METALLIC, 0x686868, 0xE9E9E9, false, true);
		
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
