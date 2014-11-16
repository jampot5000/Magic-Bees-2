package magicbees2.bee.branch.magical;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class BeeWatern extends Bee {

	public BeeWatern() {
		super("watern", "aquatilis", Group.MAGICAL, 0x313C5E, Defaults.DEFAULT_COLOR, false, true);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.WATERY), 25);
		
		// Bee Specialties
		this.addSpecialty(new ItemStack(Blocks.ice, 1), 2);
	}
	
	@Override
	public String getSpeed() {
		return "speedNorm";
	}

	@Override
	public String getLifespan() {
		return "lifespanNormal";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceDown2";
	}
	
	@Override
	public String getHumidityTolerance() {
		return "toleranceUp1";
	}
	
	@Override
	public String getFlowerProvider() {
		return "flowersSnow";
	}

}
