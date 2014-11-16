package magicbees2.bee.branch.extrinsic;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import forestry.api.core.EnumTemperature;

public class BeeNameless extends Bee {
	
	public BeeNameless() {
		super("nameless", "sine nomine", Group.EXTRINSIC, 0x8CA7CB, 0xF696FF, false, true);
		
		// Temperature
		this.setTemperature(EnumTemperature.COLD);

		// Bee Product(s)
		this.addProduct(this.getStack(Type.FORGOTTEN), 19);
	}

	@Override
	public String getFertility() {
		return "fertilityHigh";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceUp2";
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
	public String getCaveDwelling() {
		return "boolTrue";
	}
	
	@Override
	public String getFlowerProvider() {
		return "flowersEnd";
	}
	
	@Override
	public String getEffect() {
		return "effectAggressive";
	}
	
}
