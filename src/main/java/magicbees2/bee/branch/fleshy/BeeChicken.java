package magicbees2.bee.branch.fleshy;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumTemperature;

public class BeeChicken extends Bee {

	private static final Group FLESHY = Group.FLESHY;
	
	public BeeChicken() {
		super("TCChicken", "pullus", FLESHY, 0x7D431E, 0xE0905E, false, true);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
