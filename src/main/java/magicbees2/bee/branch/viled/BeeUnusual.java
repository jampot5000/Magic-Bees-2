package magicbees2.bee.branch.viled;

import forestry.api.apiculture.EnumBeeChromosome;
import forestry.api.genetics.IClassification;
import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;

public class BeeUnusual extends Bee {
	
	public BeeUnusual() {
		super("unusual", "inusitatus", Group.VEILED, 0x72D361);
		
		// Bee Product(s)
		this.addProduct(getStack(Type.MUNDANE), 15);
		
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceBoth2";
	}

}
