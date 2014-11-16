package magicbees2.bee.branch.magical;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;

public class BeeEarthen extends Bee {

	public BeeEarthen() {
		super("earthen", "fictili", Group.MAGICAL, 0x78822D, Defaults.DEFAULT_COLOR, false, true);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.EARTHY), 25);
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
	public String getHumidityTolerance() {
		return "toleranceBoth1";
	}
	
}
