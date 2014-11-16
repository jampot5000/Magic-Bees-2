package magicbees2.bee.branch.time;

import forestry.api.genetics.IClassification;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;

public class BeeDoctoral extends Bee {

	public BeeDoctoral() {
		super("doctoral", "medicus qui", Group.TIME, 0xDDE5FC, 0x4B6E8C, true, false);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.TEMPORAL), 24);
		
		// Bee Specialties
		// TODO: Add jelly babies
	}

	@Override
	public String getSpeed() {
		return "speedNorm";
	}
	
	@Override
	public String getLifespan() {
		return "lifespanLongest";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceBoth3";
	}
	
	@Override
	public String getNocturnal() {
		return "boolTrue";
	}
	
	@Override
	public String getHumidityTolerance() {
		return "toleranceBoth1";
	}

	@Override
	public String getTolerant() {
		return "boolTrue";
	}
	
	@Override
	public String getTerritory() {
		return "territoryLarge";
	}

	@Override
	public String getEffect() {
		return "effectHeroic";
	}
	
}
