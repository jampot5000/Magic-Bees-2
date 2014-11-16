package magicbees2.bee.branch.thaumic;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeWater0 extends Bee {

	private static final Group THAUMIC = Group.THAUMIC;
	
	public BeeWater0() {
		super("TCWater", "umidus", THAUMIC, 0x36CFD9, 0x999999, true, true);
		
		// Humidity
		this.setHumidity(EnumHumidity.DAMP);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
