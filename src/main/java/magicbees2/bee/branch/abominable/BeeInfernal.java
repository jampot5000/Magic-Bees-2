package magicbees2.bee.branch.abominable;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeInfernal extends Bee {
	
	public BeeInfernal() {
		super("infernal", "infernales", Group.ABOMINABLE, 0xFF1C1C, 0x960F00, false, true);
		
		// Humidity
		this.setHumidity(EnumHumidity.ARID);
		
		// Temperature
		this.setTemperature(EnumTemperature.HELLISH);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.MOLTEN), 12);
	}

	@Override
	public String getSpeed() {
		return "speedSlow";
	}
	
	@Override
	public String getLifespan() {
		return "lifespanShort";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceDown2";
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
		return "flowersNether";
	}
	
	@Override
	public String getEffect() {
		return "effectAggressive";
	}
	
}
