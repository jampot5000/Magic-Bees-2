package magicbees2.bee.branch.scholarly;

import magicbees2.Defaults;
import magicbees2.bee.genetics.Bee;
import magicbees2.bee.genetics.Group;
import magicbees2.item.Comb.Type;
import forestry.api.core.EnumHumidity;

public class BeePupil extends Bee {
	
	public BeePupil() {
		super("pupil", "disciplina", Group.SCHOLARLY, 0xFFFF00, Defaults.DEFAULT_COLOR, false, true);
		
		// Humidity
		this.setHumidity(EnumHumidity.ARID);
		
		// Bee Product(s)
		this.addProduct(this.getStack(Type.PAPERY), 20);
	}
	
	@Override
	public String getSpeed() {
		return "speedSlower";
	}

	@Override
	public String getLifespan() {
		return "lifespanElongated";
	}
	
	@Override
	public String getTemperatureTolerance() {
		return "toleranceUp2";
	}
	
	@Override
	public String getNocturnal() {
		return "boolTrue";
	}
	
	@Override
	public String getCaveDwelling() {
		return "boolTrue";
	}
	
	@Override
	public String getFlowerProvider() { // TODO: flowersBookshelf.
		return "flowersVanilla";
	}

}
