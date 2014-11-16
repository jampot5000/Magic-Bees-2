package magicbees2.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Pollen {
	
	public static enum P {
		
		// Pollen
		UNUSUAL, PHASED
		
	}
	
	private int color1;
	private int color2;
    
	public Pollen (int color1, int color2) {
		
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
