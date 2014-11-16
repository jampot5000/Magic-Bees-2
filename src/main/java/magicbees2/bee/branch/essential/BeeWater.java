package magicbees2.bee.branch.essential;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeWater extends Bee {

	private static final Group ESSENTIAL = Group.ESSENTIAL;
	
	public BeeWater() {
		super("AMWater", "magica aqua", ESSENTIAL, 0x3B7D8C, 0xE3A55B, false, false);
		
		// Humidity
		this.setHumidity(EnumHumidity.DAMP);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
