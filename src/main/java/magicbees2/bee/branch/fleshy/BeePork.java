package magicbees2.bee.branch.fleshy;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumTemperature;

public class BeePork extends Bee {

	private static final Group FLESHY = Group.FLESHY;
	
	public BeePork() {
		super("TCPork", "porcina", FLESHY, 0x725D2F, 0xD2BF93, false, true);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
