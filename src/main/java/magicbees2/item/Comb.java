package magicbees2.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Comb {
	
	public static enum Type {
		
		// Basic Combs
		MUNDANE, MOLTEN, OCCULT, OTHERWORLD, TRANSMUTED,
		
		// ?
		PAPERY, SOUL, FURTIVE, INTELLECT, TEMPORAL, FORGOTTEN,
		
		// ? 
		AIRY, FIREY, WATERY, EARTHY
		
	}
	
	private int color1;
	private int color2;
	
	private boolean isSecret;
    
	public Comb (int color1, int color2, boolean isSecret) {
		
		this.color1 = color1;
		this.color2 = color2;
		
		this.isSecret = isSecret;
	}
	
	public int getColor1() {
		return color1;
	}
	
	public int getColor2() {
		return color2;
	}
	
	public boolean isSecret() {
		return isSecret;
	}
	
}
