package magicbees2.bee.branch.abominable;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumTemperature;

public class BeeBlizzy extends Bee {

	public BeeBlizzy() {
		super("TEBlizzy", "blizzard", Group.ABOMINABLE, 0x0073C4, Defaults.DEFAULT_COLOR, false, false);
		
		// Temperature
		this.setTemperature(EnumTemperature.COLD);
	}

}
