package magicbees2.bee.branch.magical;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;

public class BeeWinden extends Bee {
	
	public BeeWinden() {
		super("winden", "ventosum", Group.MAGICAL, 0xFFFDBA, Defaults.DEFAULT_COLOR, false, true);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.AIRY), 25);
	}

	@Override
	public String getSpeed() {
		return "speedFaster";
	}
	
	@Override
	public String getLifespan() {
		return "lifespanNormal";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceBoth2";
	}
	
	@Override
	public String getFlowering() {
		return "floweringFaster";
	}
	
}
