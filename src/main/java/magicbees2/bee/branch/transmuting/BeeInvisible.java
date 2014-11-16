package magicbees2.bee.branch.transmuting;

import forestry.api.genetics.IClassification;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;

public class BeeInvisible extends Bee {
	
	public BeeInvisible() {
		super("invisible", "invisible", Group.TRANSMUTING, 0xFFCCFF, 0xFFFFFF, false, false);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.MUNDANE), 35);
	}
	
	@Override
	public String getLifespan() {
		return "lifespanShortest";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceDown2";
	}
	
	@Override
	public String getHumidityTolerance() {
		return "toleranceUp1";
	}

	@Override
	public String getEffect() {
		return "effectNone"; // TODO: Invisibility Effect
	}
	
}
