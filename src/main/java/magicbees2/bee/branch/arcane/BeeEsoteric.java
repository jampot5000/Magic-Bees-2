package magicbees2.bee.branch.arcane;

import forestry.api.genetics.IClassification;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;

public class BeeEsoteric extends Bee {
	
	public BeeEsoteric() {
		super("esoteric", "secretiore", Group.ARCANE, 0x001099, 0xFF9D60, false, true);
		
		// Bee Product(s)
		this.addProduct(getStack(Type.OCCULT), 18);

	}
	
	@Override
	public String getFertility() {
		return "fertilityHigh";
	}
	
	@Override
	public String getFlowering() {
		return "floweringSlow";
	}

}
