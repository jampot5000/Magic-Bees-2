package magicbees2.bee.branch.transmuting;

import net.minecraft.item.ItemStack;
import forestry.api.genetics.IClassification;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import magicbees2.item.IItems;

public class BeeMutable extends Bee {
	
	public BeeMutable() {
		super("mutable", "mutable", Group.TRANSMUTING, 0xDBB24C, 0xE0D5A6, false, false);
		
		// Bee Product(s)
		this.addProduct(new ItemStack(IItems.fComb, 1, 7), 10);
		this.addProduct(this.getStack(Type.TRANSMUTED), 10);
	}

	@Override
	public String getLifespan() {
		return "lifespanShortest";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceDown2";
	}
	
	@Override
	public String getHumidityTolerance() {
		return "toleranceUp1";
	}
	
}
