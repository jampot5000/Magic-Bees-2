package magicbees2.bee.branch.magical;

import forestry.api.genetics.IClassification;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;

public class BeeEthereal extends Bee {

	public BeeEthereal() {
		super("ethereal", "diaphanum", Group.MAGICAL, 0xBA3B3B, 0xEFF8FF, false, true);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.OCCULT), 10);
		this.addProduct(this.getStack(Type.OTHERWORLD), 10);
	}

	@Override
	public String getSpeed() {
		return "speedNorm";
	}
	
	@Override
	public String getLifespan() {
		return "lifespanShortened";
	}
	
	@Override
	public String getFlowering() {
		return "floweringAverage";
	}
	
}
