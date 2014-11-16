package magicbees2.bee.branch.abominable;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeWithering extends Bee {
	
	public BeeWithering() {
		super("withering", "vietus", Group.ABOMINABLE, 0x5B5B5B, 0x960F00, true, false);
		
		// Humidity
		this.setHumidity(EnumHumidity.ARID);
		
		// Temperature
		this.setTemperature(EnumTemperature.HELLISH);
		
		// Bee Specialties
		// TODO: Add Resource
	}

	@Override
	public String getLifespan() {
		return "lifespanShort";
	}
	
	@Override
	public String getFertility() {
		return "fertilityLow";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceDown2";
	}
	
	@Override
	public String getNocturnal() {
		return "boolTrue";
	}
	
	@Override
	public String getCaveDwelling() {
		return "boolTrue";
	}
	
	@Override
	public String getFlowerProvider() {
		return "flowersNether";
	}
	
	@Override
	public String getTerritory() {
		return "territoryLargest";
	}
	
	@Override
	public String getEffect() { 
		return "effectNone"; // TODO: Withering Effect
	}
	
}
