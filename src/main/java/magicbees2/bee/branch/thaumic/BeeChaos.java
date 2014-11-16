package magicbees2.bee.branch.thaumic;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumTemperature;

public class BeeChaos extends Bee {

	private static final Group THAUMIC = Group.THAUMIC;
	
	public BeeChaos() {
		super("TCChaos", "tenebrarum", THAUMIC, 0xCCCCCC, 0x999999, true, false);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
