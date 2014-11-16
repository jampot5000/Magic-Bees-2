package magicbees2.bee.branch.extrinsic;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeOblivion extends Bee {
	
	public BeeOblivion() {
		super("oblivion", "oblivioni", Group.EXTRINSIC, 0xD5C3E5, 0xF696FF, false, false);
		
		// Temperature
		this.setTemperature(EnumTemperature.COLD);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.FORGOTTEN), 14);
	}
	
	@Override
	public String getFertility() {
		return "fertilityMaximum";
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
