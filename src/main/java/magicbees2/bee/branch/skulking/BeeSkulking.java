package magicbees2.bee.branch.skulking;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import forestry.api.core.EnumHumidity;

public class BeeSkulking extends Bee {
	
	public BeeSkulking() {
		super("skulking", "malevolens", Group.SKULKING, 0x524827, 0xE15236, false, true);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.FURTIVE), 10);
	}

	@Override
	public String getSpeed() {
		return "speedFast";
	}
	
	@Override
	public String getNocturnal() {
		return "boolTrue";
	}
	
	@Override
	public String getCaveDwelling() {
		return "boolTrue";
	}
	
	@Override
	public String getFlowering() {
		return "floweringFaster";
	}
	
}
