package magicbees2.bee.branch.thermal;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeBronze extends Bee {

	private static final Group THERMAL = Group.THERMAL;
	
	public BeeBronze() {
		super("TEBronze", "pyropus", THERMAL, 0xB56D07, Defaults.DEFAULT_COLOR, false, false);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
