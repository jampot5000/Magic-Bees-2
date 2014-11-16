package magicbees2.bee.branch.bloody;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeBound extends Bee {

	private static final Group BLOODY = Group.BLOODY;
	
	public BeeBound() {
		super("BMBloody", "sanguis", BLOODY, 0xB7102F, Defaults.DEFAULT_COLOR, false, false);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
