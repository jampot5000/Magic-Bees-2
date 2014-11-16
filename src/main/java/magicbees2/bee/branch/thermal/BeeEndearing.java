package magicbees2.bee.branch.thermal;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeEndearing extends Bee {

	private static final Group ADORABLE = Group.ADORABLE;
	
	public BeeEndearing() {
		super("TEWinsome", "cuniculus", ADORABLE, 0x069E97, Defaults.DEFAULT_COLOR, true, true);
		
		// Temperature
		this.setTemperature(EnumTemperature.COLD);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
