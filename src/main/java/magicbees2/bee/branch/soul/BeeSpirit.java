package magicbees2.bee.branch.soul;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeSpirit extends Bee {
	
	public BeeSpirit() {
		super("spirit", "larva", Group.SOUL, 0xB2964B, Defaults.DEFAULT_COLOR, false, true);
		
		// Humidity
		this.setTemperature(EnumTemperature.WARM);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.INTELLECT), 22);
		
		// Bee Specialties
		this.addSpecialty(this.getStack(Type.SOUL), 16);
	}

	@Override
	public String getLifespan() {
		return "lifespanShortened";
	}
	
	@Override
	public String getHumidityTolerance() {
		return "toleranceBoth1";
	}

	@Override
	public String getTolerant() {
		return "boolTrue";
	}
	
}
