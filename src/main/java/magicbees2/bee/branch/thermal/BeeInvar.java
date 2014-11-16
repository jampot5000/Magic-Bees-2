package magicbees2.bee.branch.thermal;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;

public class BeeInvar extends Bee {

	private static final Group THERMAL = Group.THERMAL;
	
	public BeeInvar() {
		super("TEInvar", "invar", THERMAL, 0xCDE3A1, Defaults.DEFAULT_COLOR, false, false);
		
		// Humidity
		this.setHumidity(EnumHumidity.ARID);
		
		// Temperature
		this.setTemperature(EnumTemperature.HOT);
		
		// Bee Products
		// this.addProduct(new ItemStack(Items.stick), 10);

		// ?? 
		// this.addAllele(EnumBeeChromosome.SPEED, Allele.speedBlinding);
		
	}

}
