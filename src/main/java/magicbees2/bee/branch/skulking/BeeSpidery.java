package magicbees2.bee.branch.skulking;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import forestry.api.core.EnumHumidity;

public class BeeSpidery extends Bee {
	
	public BeeSpidery() {
		super("spidery", "araneolus", Group.SKULKING, 0x0888888, 0x222222, false, true);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.FURTIVE), 13);
		this.addProduct(new ItemStack(Items.string, 1), 8);
		
		// Bee Specialties
		this.addSpecialty(new ItemStack(Items.spider_eye, 1), 8);
		
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
	
	@Override
	public String getTerritory() {
		return "territoryLarger";
	}
	
	@Override
	public String getEffect() { // TODO: Spawn Spider Effect
		return "effectNone";
	}
	
}
