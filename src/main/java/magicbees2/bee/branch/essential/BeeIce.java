package magicbees2.bee.branch.essential;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeIce extends Bee {

	private static final Group ESSENTIAL = Group.ESSENTIAL;
	
	public BeeIce() {
		super("AMIce", "magica glacium", ESSENTIAL, 0x86BAC6, 0xE3A55B, false, false);
		
		// Temperature
		this.setTemperature(EnumTemperature.COLD);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
