package magicbees2.bee.branch.alchemical;

import forestry.api.genetics.IClassification;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;

public class BeeMinium extends Bee {

	private static final Group ALCHEMICAL = Group.ALCHEMICAL;
	
	public BeeMinium() {
		super("EEMinium", "mutabilis", ALCHEMICAL, 0xAC0921, 0x3A030B, false, true);

		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
