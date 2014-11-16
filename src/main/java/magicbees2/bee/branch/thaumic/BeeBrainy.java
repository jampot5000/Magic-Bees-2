package magicbees2.bee.branch.thaumic;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumTemperature;

public class BeeBrainy extends Bee {

	private static final Group THAUMIC = Group.THAUMIC;
	
	public BeeBrainy() {
		super("TCBrainy", "cerebrum", THAUMIC, 0x83FF70, 0xE15236, false, true);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
