package magicbees2.block.hive;

import java.util.ArrayList;

import magicbees2.api.apiculture.hives.HiveBrick;
import magicbees2.bee.BeeManager;
import magicbees2.block.HiveDrop;
import magicbees2.block.IBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import forestry.api.genetics.IAllele;

public class HiveInfernal extends HiveBrick {

	public HiveInfernal(float genChance) {
		super(IBlocks.hive, 4, genChance, Blocks.netherrack);
		
		this.initPopulation();
	}
	
	private void initPopulation() {
		
		String uid1 = "magicbees2.species.infernal";
		String uid2 = "forestry.speciesSteadfast";
		IAllele[] template1 = BeeManager.getRoot().getTemplate(uid1);
		IAllele[] template2 = BeeManager.getRoot().getTemplate(uid2);
		
		if (template1 == null || template2 == null) {
			throw new IllegalArgumentException("[MagicBees2] Hive population error. Please report this.");
		}

		ItemStack[] itemstack = new ItemStack[] {
				
			// You can add comb(s) or other items here.
		    // ex. (new ItemStack(Items.glowstone, 1, 0);
			
			new ItemStack(Items.glowstone_dust, 2)
				
		};
		
		ArrayList<HiveDrop> ret = new ArrayList<HiveDrop>();
		
		ret.add(new HiveDrop(template1, itemstack, 80));
		ret.add(new HiveDrop(template2, itemstack, 5));
		
		
		this.drops.addAll(ret);
	}

}
