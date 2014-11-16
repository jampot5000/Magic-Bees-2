package magicbees2.block.hive;

import java.util.ArrayList;

import magicbees2.api.apiculture.hives.HiveGround;
import magicbees2.bee.BeeManager;
import magicbees2.block.HiveDrop;
import magicbees2.block.IBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;
import forestry.api.genetics.IAllele;

public class HiveResonant extends HiveGround {

	public HiveResonant(float genChance) {
		super(IBlocks.hive, 2, genChance, Blocks.grass, Blocks.sand, Blocks.tallgrass);
		
		this.initPopulation();
	}
	
	@Override
	public boolean isGoodHumidity(EnumHumidity humidity) {
		return humidity == EnumHumidity.NORMAL;
	}

	@Override
	public boolean isGoodTemperature(EnumTemperature temperature) {
		return temperature == EnumTemperature.NORMAL;
	}
	
	private void initPopulation() {
		
		String uid1 = "magicbees2.species.sorcerous";
		String uid2 = "forestry.speciesValiant";
		IAllele[] template1 = BeeManager.getRoot().getTemplate(uid1);
		IAllele[] template2 = BeeManager.getRoot().getTemplate(uid2);
		
		if (template1 == null || template2 == null) {
			throw new IllegalArgumentException("[MagicBees2] Hive population error. Please report this.");
		}

		ItemStack[] itemstack = new ItemStack[] {
				
			// You can add comb(s) or other items here.
		    // ex. (new ItemStack(Items.glowstone, 1, 0);
				
		};
		
		ArrayList<HiveDrop> ret = new ArrayList<HiveDrop>();
		
		ret.add(new HiveDrop(template1, itemstack, 80));
		ret.add(new HiveDrop(template2, itemstack, 5));
		
		
		this.drops.addAll(ret);
	}


}
