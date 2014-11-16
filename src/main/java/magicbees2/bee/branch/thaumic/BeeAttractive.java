package magicbees2.bee.branch.thaumic;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumTemperature;

public class BeeAttractive extends Bee {

	private static final Group THAUMIC = Group.THAUMIC;
	
	public BeeAttractive() {
		super("TCAttractive", "tractus", THAUMIC, 0x96FFBC, 0x675ED1, false, true);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
