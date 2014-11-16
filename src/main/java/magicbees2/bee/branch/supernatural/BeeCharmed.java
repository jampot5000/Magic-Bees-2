package magicbees2.bee.branch.supernatural;

import forestry.api.genetics.IClassification;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;

public class BeeCharmed extends Bee {
	
	public BeeCharmed() {
		super("charmed", "larvatus", Group.SUPERNATURAL, 0x48EEEC, 0xFF9D60, false, true);	
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.OTHERWORLD), 18);
	}

	@Override
	public String getSpeed() {
		return "speedNorm";
	}
	
	@Override
	public String getNocturnal() {
		return "boolTrue";
	}
	
}
