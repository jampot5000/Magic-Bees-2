package magicbees2.bee.branch.thaumic;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumTemperature;

public class BeeEarth0 extends Bee {

	private static final Group THAUMIC = Group.THAUMIC;
	
	public BeeEarth0() {
		super("TCEarth", "sordida", THAUMIC, 0x005100, 0x999999, true, true);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
