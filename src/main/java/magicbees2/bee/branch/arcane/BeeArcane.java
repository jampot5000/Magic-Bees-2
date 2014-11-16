package magicbees2.bee.branch.arcane;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import magicbees2.item.Drop.D;

public class BeeArcane extends Bee {

	public BeeArcane() {
		super("arcane", "arcanus", Group.ARCANE, 0xD242DF, 0xFF9D60, true, true);
		
		// Bee Product(s)
		this.addProduct(getStack(Type.MUNDANE), 25);
		
		// Bee Specialties
		this.addSpecialty(getStack(D.ENCHANTED), 9);

	}
	
	@Override
	public String getFertility() {
		return "fertilityNormal";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceBoth2";
	}

	@Override
	public String getFlowering() {
		return "floweringAverage";
	}
	
}
