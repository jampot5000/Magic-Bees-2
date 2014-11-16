package magicbees2.bee.branch.abominable;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeSpiteful extends Bee {
	
	public BeeSpiteful() {
		super("spiteful", "maligna", Group.ABOMINABLE, 0x5FCC00, 0x960F00, true, false);
		
		// Humidity
		this.setHumidity(EnumHumidity.ARID);
		
		// Temperature
		this.setTemperature(EnumTemperature.HELLISH);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.MOLTEN), 24);
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
	public String getTerritory() {
		return "territoryLarger";
	}
	
	@Override
	public String getEffect() {
		return "effectMisanthrope";
	}
	
}
