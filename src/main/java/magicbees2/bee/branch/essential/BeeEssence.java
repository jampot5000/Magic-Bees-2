package magicbees2.bee.branch.essential;

import forestry.api.genetics.IClassification;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;

public class BeeEssence extends Bee {

	private static final Group ESSENTIAL = Group.ESSENTIAL;
	
	public BeeEssence() {
		super("AMEssence", "essentia", ESSENTIAL, 0x86BBC5, 0xE3A55B, false, true);

		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
