package magicbees2.bee.branch.soul;

import forestry.api.genetics.IClassification;
import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;

public class BeeAware extends Bee {

	public BeeAware() {
		super("aware", "sensibilis", Group.SOUL, 0x5E95B5, Defaults.DEFAULT_COLOR, false, false);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.INTELLECT), 18);
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
