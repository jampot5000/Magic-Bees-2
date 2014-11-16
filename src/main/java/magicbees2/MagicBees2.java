package magicbees2;

import magicbees2.bee.BeeManager;
import magicbees2.block.BlockHive;
import magicbees2.block.IBlocks;
import magicbees2.block.ItemBlockHive;
import magicbees2.item.IItems;
import magicbees2.item.ItemComb;
import magicbees2.world.WorldGeneration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = MagicBees2.MODID, version = MagicBees2.VERSION)
public class MagicBees2 {
	
    public static final String MODID = "MagicBees2";
    public static final String VERSION = "1.0";
        
    @EventHandler
	public void preInit(FMLPreInitializationEvent event) {
    	
	}
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	
    	/* World Hive Generation */
    	GameRegistry.registerWorldGenerator(new WorldGeneration(), 0);
    }
    
    @EventHandler
	public void modsLoaded(FMLPostInitializationEvent fml) {

    	IBlocks.init();
    	IItems.init();
    	
    	BeeManager.initialize();
    }
    
}
