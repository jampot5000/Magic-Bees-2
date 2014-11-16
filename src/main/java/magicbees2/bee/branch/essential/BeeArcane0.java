package magicbees2.bee.branch.essential;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeArcane0 extends Bee {

	private static final Group ESSENTIAL = Group.ESSENTIAL;
	
	public BeeArcane0() {
		super("AMArcane", "magica arcanum", ESSENTIAL, 0x76184D, 0xE3A55B, true, false);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
