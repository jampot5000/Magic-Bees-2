package magicbees2.bee.branch.time;

import forestry.api.genetics.IClassification;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;

public class BeeLordly extends Bee {
	
	public BeeLordly() {
		super("lordly", "rassilonis", Group.TIME, 0xC6AF86, 0x8E0213, false, false);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.TEMPORAL), 19);
	}

	@Override
	public String getSpeed() {
		return "speedNorm";
	}
	
	@Override
	public String getLifespan() {
		return "lifespanLong";
	}
	
	@Override
	public String getNocturnal() {
		return "boolTrue";
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
		return "effectDrunkard";
	}
	
}
