package magicbees2.bee.branch.skulking;

import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import forestry.api.core.EnumTemperature;

public class BeeSmouldering extends Bee {
	
	public BeeSmouldering() {
		super("smouldering", "flagrantia", Group.SKULKING, 0xFFC747, 0xEA8344, false, false);
		
		// Temperature
		this.setTemperature(EnumTemperature.HELLISH);
		
		this.addProduct(this.getStack(Type.FURTIVE), 10);
		this.addProduct(this.getStack(Type.MOLTEN), 10);
		
		// Bee Specialties
		this.addSpecialty(new ItemStack(Items.blaze_rod), 5);
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
	public String getEffect() { // TODO: Spawn Blaze Effect
		return "effectNone";
	}
	
}
