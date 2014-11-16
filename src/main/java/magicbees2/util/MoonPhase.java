package magicbees2.util;

import net.minecraft.world.World;

/**
 * Class to abstract the moon phase from the world time a bit.
 * 
 */
public enum MoonPhase
{
	FULL("full"),
	WANING_GIBBOUS("gibbousWaning"),
	WANING_HALF("halfWaning"),
	WANING_CRESCENT("crescentWaning"),
	NEW("new"),
	WAXING_CRESCENT("crecentWaxing"),
	WAXING_HALF("halfWaxing"),
	WAXING_GIBBOUS("gibbousWaxing");
	
	private String phaseName;
	private MoonPhase(String name) {
		this.phaseName = name;
	}
	
	public boolean isBetween(MoonPhase first, MoonPhase second) {
		boolean flag = false;
		
		if (first.ordinal() <= second.ordinal()) {
			
			// Straightforward.
			
			boolean b1 = (first.ordinal() <= this.ordinal());
			boolean b2 = (this.ordinal() <= second.ordinal());
			
			flag = (b1 && b2);
			
		} else {
			
			// Wraps around the boundary.
			
			boolean b1 = (first.ordinal() <= this.ordinal());
			boolean b2 = (this.ordinal() <= WAXING_GIBBOUS.ordinal());
			
			boolean b3 = (FULL.ordinal() <= this.ordinal());
			boolean b4 = (this.ordinal() <= second.ordinal());
			
			
			flag = ((b1 && b2) || (b3 && b4));
		}
		
		return flag;
	}
	
	public String getLocalizedName() {
		return "No Description (for now)";
	}
	
	public static MoonPhase getMoonPhase(World w) {
		return getMoonPhaseFromTime(w.getWorldTime());
	}
	
	public static MoonPhase getMoonPhaseFromTime(long time) {
		return MoonPhase.values()[(int)((time - 6000) / 24000L) % 8];
	}
}
