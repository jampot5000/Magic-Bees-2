package magicbees2.bee.branch.fleshy;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumTemperature;

public class BeeBeef extends Bee {

	private static final Group FLESHY = Group.FLESHY;
	
	public BeeBeef() {
		super("TCBeef", "bubulae", FLESHY, 0x40221A, 0xAC6753, false, true);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
