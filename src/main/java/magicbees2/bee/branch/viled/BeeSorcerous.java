package magicbees2.bee.branch.viled;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import forestry.api.apiculture.EnumBeeChromosome;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeSorcerous extends Bee {
	
	public BeeSorcerous() {
		super("sorcerous", "fascinatio", Group.VEILED, 0xEA9A9A);
		
		// Humidity
		this.setHumidity(EnumHumidity.ARID);
		
		// Temperature
		this.setTemperature(EnumTemperature.HOT);
		
		// Bee Product(s)
		this.addProduct(getStack(Type.MUNDANE), 15);

	}
	
	@Override
	public String getFertility() {
		return "fertilityHigh";
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
