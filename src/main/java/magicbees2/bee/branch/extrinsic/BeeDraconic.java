package magicbees2.bee.branch.extrinsic;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeDraconic extends Bee {
	
	public BeeDraconic() {
		super("draconic", "draconic", Group.EXTRINSIC, 0x9F56AD, 0x5A3B62, true, false);
		
		// Temperature
		this.setTemperature(EnumTemperature.COLD);
		
		// Bee Specialties
		// TODO: Add Resource
	}

	@Override
	public String getLifespan() {
		return "lifespanLongest";
	}
	
	@Override
	public String getFertility() {
		return "fertilityLow";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceUp2";
	}

	@Override
	public String getNocturnal() {
		return "boolTrue";
	}

	@Override
	public String getHumidityTolerance() {
		return "toleranceBoth1";
	}
	
	@Override
	public String getCaveDwelling() {
		return "boolTrue";
	}
	
	@Override
	public String getFlowerProvider() {
		return "flowersEnd";
	}
	
	@Override
	public String getEffect() {
		return "effectMisanthrope";
	}
	
}
