package magicbees2.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class MaterialHive extends Material {

	public MaterialHive() {
		super(MapColor.stoneColor);
		
		this.setRequiresTool();
		this.setImmovableMobility();
	}
}
