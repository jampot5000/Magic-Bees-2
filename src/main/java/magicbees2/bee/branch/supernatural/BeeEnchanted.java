package magicbees2.bee.branch.supernatural;

import forestry.api.genetics.IClassification;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;

public class BeeEnchanted extends Bee {
	
	public BeeEnchanted() {
		super("enchanted", "cantatus", Group.SUPERNATURAL, 0x18E726, 0xFF9D60, false, true);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.OTHERWORLD), 20);
	}

	@Override
	public String getSpeed() {
		return "speedNorm";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceBoth1";
	}
	
	@Override
	public String getNocturnal() {
		return "boolTrue";
	}
	
}
