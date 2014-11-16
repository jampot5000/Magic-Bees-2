package magicbees2.bee.branch.abominable;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeePyro extends Bee {
	
	public BeePyro() {
		super("TEPyro", "pyromaniac", Group.ABOMINABLE, 0xFA930C, Defaults.DEFAULT_COLOR, true, true);
		
		// Humidity
		this.setHumidity(EnumHumidity.ARID);
		
		// Temperature
		this.setTemperature(EnumTemperature.HELLISH);
	}

}
