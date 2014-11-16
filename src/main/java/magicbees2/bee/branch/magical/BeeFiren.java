package magicbees2.bee.branch.magical;

import forestry.api.genetics.IClassification;
import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;

public class BeeFiren extends Bee {
	
	public BeeFiren() {
		super("firen", "ardens", Group.MAGICAL, 0xD35119, Defaults.DEFAULT_COLOR, false, true);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.FIREY), 25);
	}
	
	@Override
	public String getSpeed() {
		return "speedNorm";
	}
	
	@Override
	public String getLifespan() {
		return "lifespanNormal";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceUp2";
	}
	
	@Override
	public String getHumidityTolerance() {
		return "toleranceDown1";
	}

	@Override
	public String getFlowerProvider() {
		return "flowersCacti";
	}

}
