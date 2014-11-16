package magicbees2.bee.branch.thaumic;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumTemperature;

public class BeeRejuvenating extends Bee {

	private static final Group THAUMIC = Group.THAUMIC;
	
	public BeeRejuvenating() {
		super("TCRejuvenating", "arcanus vitae", THAUMIC, 0x91D0D9, 0x675ED1, false, false);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
