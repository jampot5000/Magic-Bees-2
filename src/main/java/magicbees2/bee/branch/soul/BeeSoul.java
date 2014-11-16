package magicbees2.bee.branch.soul;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeSoul extends Bee {
	
	public BeeSoul() {
		super("soul", "anima", Group.SOUL, 0x7D591B, Defaults.DEFAULT_COLOR, true, false);
		
		// Humidity
		this.setTemperature(EnumTemperature.HELLISH);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.INTELLECT), 28);
		
		// Bee Specialties
		this.addSpecialty(this.getStack(Type.SOUL), 20);
	}
	
	@Override
	public String getLifespan() {
		return "lifespanNormal";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceDown2";
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
