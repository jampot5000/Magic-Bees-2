package magicbees2.bee.branch.essential;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeAir extends Bee {

	private static final Group ESSENTIAL = Group.ESSENTIAL;
	
	public BeeAir() {
		super("AMAir", "magica aer", ESSENTIAL, 0xD5EB9D, 0xE3A55B, false, false);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
