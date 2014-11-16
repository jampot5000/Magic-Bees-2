package magicbees2.bee.branch.viled;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import forestry.api.apiculture.EnumBeeChromosome;

public class BeeEldritch extends Bee {

	public BeeEldritch() {
		super("eldritch", "prodigiosus", Group.VEILED, 0x8D75A0, Defaults.DEFAULT_COLOR, false, true);

		// Bee Product(s)
		this.addProduct(getStack(Type.MUNDANE), 15);
	}
	
	@Override
	public String getSpeed() {
		return "speedSlower";
	}

}
