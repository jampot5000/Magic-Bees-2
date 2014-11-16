package magicbees2.item;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class IItems {
	
	// Forestry
	public static Item fComb;
	public static Item fHoney;
		
	public static ItemComb comb;
	public static ItemDrop drop;
	public static ItemFrame frame;
	public static ItemPollen pollen;

	public static void init() {
		
		// Mod Initialization
		fComb = GameRegistry.findItem("Forestry", "beeCombs");
		fHoney = GameRegistry.findItem("Forestry", "honeyDrop");
		
		// Item Initialization
		comb = new ItemComb();
		drop = new ItemDrop();
		frame = new ItemFrame();
		pollen = new ItemPollen();

    	// Item Registration
    	GameRegistry.registerItem(comb, "comb");
		GameRegistry.registerItem(drop, "drop");
		GameRegistry.registerItem(pollen, "pollen");
	}
	
}
