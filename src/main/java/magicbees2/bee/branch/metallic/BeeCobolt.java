package magicbees2.bee.branch.metallic;

import net.minecraft.item.ItemStack;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.IItems;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeCobolt extends Bee {
	
	public BeeCobolt() {
		super("cobalt", "caeruleo", Group.METALLIC, 0x03265F, 0x59AAEF, false, false);
		
		// Humidity
		this.setHumidity(EnumHumidity.ARID);
		
		// Temperature
		this.setTemperature(EnumTemperature.HOT);
		
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
