package magicbees2.bee.branch.arcane;

import forestry.api.genetics.IClassification;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;

public class BeeMysterious extends Bee {

	public BeeMysterious() {
		super("mysterious", "mysticus", Group.ARCANE, 0x762bc2, 0xFF9D60, false, true);
		
		// Bee Product(s)
		this.addProduct(getStack(Type.OCCULT), 20);
		
	}

	@Override
	public String getFertility() {
		return "fertilityHigh";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceBoth2";
	}
	
	@Override
	public String getFlowering() {
		return "floweringSlow";
	}
	
}
