package magicbees2.bee.branch.thaumic;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumTemperature;

public class BeeBatty extends Bee {

	private static final Group THAUMIC = Group.THAUMIC;
	
	public BeeBatty() {
		super("TCBatty", "chiroptera", THAUMIC, 0x27350D, 0xE15236, false, true);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
