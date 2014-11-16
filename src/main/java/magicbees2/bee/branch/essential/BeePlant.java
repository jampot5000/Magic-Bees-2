package magicbees2.bee.branch.essential;

import forestry.api.genetics.IClassification;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;

public class BeePlant extends Bee {

	private static final Group ESSENTIAL = Group.ESSENTIAL;
	
	public BeePlant() {
		super("AMPlant", "magica herba", ESSENTIAL, 0x49B549, 0xE3A55B, false, false);

		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
