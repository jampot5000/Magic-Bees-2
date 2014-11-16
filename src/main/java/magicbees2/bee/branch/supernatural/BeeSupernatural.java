package magicbees2.bee.branch.supernatural;

import forestry.api.genetics.IClassification;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import magicbees2.item.Pollen.P;

public class BeeSupernatural extends Bee {
	
	public BeeSupernatural() {
		super("supernatural", "coeleste", Group.SUPERNATURAL, 0x005614, 0xFF9D60, true, true);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.OTHERWORLD), 18);
		
		// Bee Specialties
		this.addSpecialty(this.getStack(P.UNUSUAL), 8);
	}

	@Override
	public String getSpeed() {
		return "speedNorm";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceBoth2";
	}
	
	@Override
	public String getNocturnal() {
		return "boolTrue";
	}
	
	@Override
	public String getHumidityTolerance() {
		return "toleranceBoth1";
	}
	
}
