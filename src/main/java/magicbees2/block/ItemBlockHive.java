package magicbees2.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockHive extends ItemBlock {

	public ItemBlockHive(Block block) {
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int meta) {
		return meta;
	}
	
	 @Override
    public String getUnlocalizedName(ItemStack itemstack) {
		 switch (itemstack.getItemDamage()) {
		 	case 0: return this.getUnlocalizedName() + ".curious";
		 	case 1: return this.getUnlocalizedName() + ".unusual";
		 	case 2: return this.getUnlocalizedName() + ".resonant";
		 	case 3: return this.getUnlocalizedName() + ".deep";
		 	case 4: return this.getUnlocalizedName() + ".infernal";
		 	case 5: return this.getUnlocalizedName() + ".oblivion";
		 	default: return this.getUnlocalizedName();
		 }
    }
	 
}
