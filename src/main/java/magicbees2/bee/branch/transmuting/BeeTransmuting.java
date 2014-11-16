package magicbees2.bee.branch.transmuting;

import net.minecraft.item.ItemStack;
import forestry.api.genetics.IClassification;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.IItems;
import magicbees2.item.Comb.Type;

public class BeeTransmuting extends Bee {
	
	public BeeTransmuting() {
		super("transmuting", "transmuting", Group.TRANSMUTING, 0xDBB24C, 0xA2D2D8, false, false);
		
		// Bee Product(s)
		this.addProduct(new ItemStack(IItems.fComb, 1, 7), 10);
		this.addProduct(this.getStack(Type.TRANSMUTED), 30);
		
		this.addProduct(new ItemStack(IItems.fComb, 1, 6), 5);
		this.addProduct(new ItemStack(IItems.fComb, 1, 2), 5);
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
	
	@Override
	public String getEffect() {
		return "effectNone"; // TODO: Transmuting Effect
	}
	
}
