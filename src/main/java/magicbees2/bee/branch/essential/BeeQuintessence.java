package magicbees2.bee.branch.essential;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;

public class BeeQuintessence extends Bee {

	private static final Group ESSENTIAL = Group.ESSENTIAL;
	
	public BeeQuintessence() {
		super("AMQuintessence", "cor essentia", ESSENTIAL, 0xE3A45B, 0xE3A55B, true, true);

		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
