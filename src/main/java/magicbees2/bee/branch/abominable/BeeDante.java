package magicbees2.bee.branch.abominable;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeDante extends Bee {
	
	public BeeDante() {
		super("TEDante", "inferno", Group.ABOMINABLE, 0x4AAFF7, Defaults.DEFAULT_COLOR, false, false);
		
		// Humidity
		this.setHumidity(EnumHumidity.ARID);
		
		// Temperature
		this.setTemperature(EnumTemperature.HELLISH);
	}

}
