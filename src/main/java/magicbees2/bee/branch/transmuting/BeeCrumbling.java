package magicbees2.bee.branch.transmuting;

import net.minecraft.item.ItemStack;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.IItems;
import magicbees2.item.Comb.Type;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeCrumbling extends Bee {
	
	public BeeCrumbling() {
		super("crumbling", "crumbling", Group.TRANSMUTING, 0xDBB24C, 0xDBA4A4, false, false);
		
		// Humidity
		this.setHumidity(EnumHumidity.ARID);
		
		// Temperature
		this.setTemperature(EnumTemperature.HOT);
		
		// Bee Product(s)
		this.addProduct(new ItemStack(IItems.fComb, 1, 7), 10);
		this.addProduct(this.getStack(Type.TRANSMUTED), 30);
		
		this.addProduct(new ItemStack(IItems.fComb, 1, 10), 10);
		this.addProduct(new ItemStack(IItems.fComb, 1, 1), 15);
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
