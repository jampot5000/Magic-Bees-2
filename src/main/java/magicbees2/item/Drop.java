package magicbees2.item;

import net.minecraft.item.Item;

public class Drop {

	public static enum D {
		
		// Drops ?
		ENCHANTED, INTELLECT, DESTABILIZED, CARBON, LUX, ENDEARING
	}
	
	private int color1;
	private int color2;
    
	public Drop (int color1, int color2) {
		
		this.color1 = color1;
		this.color2 = color2;
		
	}
	
	public int getColor1() {
		return color1;
	}
	
	public int getColor2() {
		return color2;
	}
	
}
