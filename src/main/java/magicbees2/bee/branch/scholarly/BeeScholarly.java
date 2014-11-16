package magicbees2.bee.branch.scholarly;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import forestry.api.core.EnumHumidity;

public class BeeScholarly extends Bee {
	
	public BeeScholarly() {
		super("scholarly", "studiosis", Group.SCHOLARLY, 0x6E0000, Defaults.DEFAULT_COLOR, false, false);
		
		// Humidity
		this.setHumidity(EnumHumidity.ARID);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.PAPERY), 25);
	}

	@Override
	public String getSpeed() {
		return "speedSlow";
	}

	@Override
	public String getLifespan() {
		return "lifespanElongated";
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
	public String getCaveDwelling() {
		return "boolTrue";
	}
	
	@Override
	public String getFlowerProvider() { // TODO: flowersBookshelf.
		return "flowersVanilla";
	}
	
}
