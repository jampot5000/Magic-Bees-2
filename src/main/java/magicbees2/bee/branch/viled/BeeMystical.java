package magicbees2.bee.branch.viled;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.IItems;
import magicbees2.item.Comb.Type;
import net.minecraft.item.ItemStack;

public class BeeMystical extends Bee {
	
	public BeeMystical() {
		super("mystical", "mysticum", Group.VEILED, 0xAFFFB7);
		
		// Bee Product(s)
		addProduct(getStack(Type.MUNDANE), 15);
	}

}
