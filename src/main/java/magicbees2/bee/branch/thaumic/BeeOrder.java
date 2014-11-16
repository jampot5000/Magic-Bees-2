package magicbees2.bee.branch.thaumic;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumTemperature;

public class BeeOrder extends Bee {

	private static final Group THAUMIC = Group.THAUMIC;
	
	public BeeOrder() {
		super("TCOrder", "ordinatus", THAUMIC, 0xAA32FC, 0x999999, true, true);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
