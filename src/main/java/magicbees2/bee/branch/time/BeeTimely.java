package magicbees2.bee.branch.time;

import forestry.api.genetics.IClassification;
import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;

public class BeeTimely extends Bee {
	
	public BeeTimely() {
		super("timely", "gallifreis", Group.TIME, 0xC6AF86, Defaults.DEFAULT_COLOR, false, true);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.TEMPORAL), 16);
	}
	
	@Override
	public String getSpeed() {
		return "speedNorm";
	}
	
	@Override
	public String getLifespan() {
		return "lifespanElongated";
	}
	
	@Override
	public String getHumidityTolerance() {
		return "toleranceBoth1";
	}

	@Override
	public String getTolerant() {
		return "boolTrue";
	}
	
	@Override
	public String getEffect() {
		return "effectNone"; // TODO: Slow Speed Effect
	}
	
}
