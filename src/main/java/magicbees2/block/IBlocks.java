package magicbees2.block;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class IBlocks {

	public static Block alveary;
	public static BlockHive hive;
	
	public static void init() {
		
		// Forestry
		alveary = GameRegistry.findBlock("Forestry", "alveary");
		
		// Block Initialization
    	hive = new BlockHive();
    	
    	hive.setHarvestLevel("scoop", 0, 0);
    	hive.setHarvestLevel("scoop", 0, 1);
    	hive.setHarvestLevel("scoop", 0, 2);
    	hive.setHarvestLevel("scoop", 0, 3);
    	hive.setHarvestLevel("scoop", 0, 4);
    	hive.setHarvestLevel("scoop", 0, 5);
    	
    	// Block Registration
    	GameRegistry.registerBlock(hive, ItemBlockHive.class, hive.getUnlocalizedName().substring(5));
    	
	}
}
