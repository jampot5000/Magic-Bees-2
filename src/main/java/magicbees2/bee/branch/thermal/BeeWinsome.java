package magicbees2.bee.branch.thermal;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeWinsome extends Bee {

	private static final Group ADORABLE = Group.ADORABLE;
	
	public BeeWinsome() {
		super("TEWinsome", "cuniculus", ADORABLE, 0x096B67, Defaults.DEFAULT_COLOR, false, false);
		
		// Temperature
		this.setTemperature(EnumTemperature.COLD);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
