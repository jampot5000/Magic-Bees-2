package magicbees2.bee.branch.abominable;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumTemperature;

public class BeeGelid extends Bee {
	
	public BeeGelid() {
		super("TEGelid", "cyro", Group.ABOMINABLE, 0x4AAFF7, Defaults.DEFAULT_COLOR, true, true);
		
		// Temperature
		this.setTemperature(EnumTemperature.COLD);
	}

}
