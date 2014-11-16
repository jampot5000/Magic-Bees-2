package magicbees2.bee.branch.thaumic;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumTemperature;

public class BeeWispy extends Bee {

	private static final Group THAUMIC = Group.THAUMIC;
	
	public BeeWispy() {
		super("TCWispy", "umbrabilis", THAUMIC, 0x9CB8D5, 0xE15236, false, false);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
