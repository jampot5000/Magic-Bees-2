package magicbees2.bee.branch.viled;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Allele;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import forestry.api.apiculture.EnumBeeChromosome;

public class BeeAttuned extends Bee {
	
	public BeeAttuned() {
		super("attuned", "similis", Group.VEILED, 0x0086A8, Defaults.DEFAULT_COLOR);
		
		// Bee Product(s)
		this.addProduct(getStack(Type.MUNDANE), 15);
		
	}
	
	@Override
	public String getFertility() {
		return "fertilityHigh";
	}
	
}
