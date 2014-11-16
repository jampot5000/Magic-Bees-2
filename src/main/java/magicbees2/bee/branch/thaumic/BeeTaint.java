package magicbees2.bee.branch.thaumic;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumTemperature;

public class BeeTaint extends Bee {

	private static final Group THAUMIC = Group.THAUMIC;
	
	public BeeTaint() {
		super("TCFlux", "arcanus labe", THAUMIC, 0x91376A, 0x675ED1, false, false);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
