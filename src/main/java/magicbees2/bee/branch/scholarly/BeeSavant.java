package magicbees2.bee.branch.scholarly;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import forestry.api.core.EnumHumidity;

public class BeeSavant extends Bee {

	private static final Group SCHOLARLY = Group.SCHOLARLY;
	
	public BeeSavant() {
		super("savant", "philologus", SCHOLARLY, 0xFFA042, Defaults.DEFAULT_COLOR, true, false);
		
		// Humidity
		this.setHumidity(EnumHumidity.ARID);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.PAPERY), 40);
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
