package magicbees2.bee.branch.essential;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeWight extends Bee {

	private static final Group ESSENTIAL = Group.ESSENTIAL;
	
	public BeeWight() {
		super("AMWight", "vectem", ESSENTIAL, 0xB50000, 0x4C4837, false, false);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
