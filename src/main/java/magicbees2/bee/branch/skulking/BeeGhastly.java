package magicbees2.bee.branch.skulking;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BeeGhastly extends Bee {
	
	public BeeGhastly() {
		super("ghastly", "pallens", Group.SKULKING, 0xCCCCEE, 0xBF877C, false, false);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.FURTIVE), 8);
		
		// Bee Specialties
		this.addSpecialty(new ItemStack(Items.ghast_tear, 1), 2);
	}
	
	@Override
	public String getSpeed() {
		return "speedFast";
	}
	
	@Override
	public String getFertility() {
		return "fertilityLow";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceBoth1";
	}
	
	@Override
	public String getNocturnal() {
		return "boolTrue";
	}
	
	@Override
	public String getTolerant() {
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
	public String getEffect() { // TODO: Spawn Ghast Effect
		return "effectNone";
	}

}
