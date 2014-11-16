package magicbees2.bee.branch.essential;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeVortex extends Bee {

	private static final Group ESSENTIAL = Group.ESSENTIAL;
	
	public BeeVortex() {
		super("AMVortex", "gurges", ESSENTIAL, 0x71BBE2, 0x0B35A8, false, true);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
