package magicbees2.bee.branch.extrinsic;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeForlorn extends Bee {

	public BeeForlorn() {
		super("forlorn", "perditus", Group.EXTRINSIC, 0xCBA88C, 0xF696FF, true, false);
		
		// Temperature
		this.setTemperature(EnumTemperature.COLD);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.FORGOTTEN), 30);
	}

	@Override
	public String getSpeed() {
		return "speedSlow";
	}
	
	@Override
	public String getLifespan() {
		return "lifespanLongest";
	}
	
	@Override
	public String getFertility() {
		return "fertilityLow";
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
		return "effectRepulsion";
	}
	
}
