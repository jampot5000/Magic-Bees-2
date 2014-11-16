package magicbees2.item;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import magicbees2.item.Drop.D;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import forestry.api.core.Tabs;

public class ItemDrop extends Item {

	private static final LinkedHashMap<D, Drop> drops = new LinkedHashMap<D, Drop>();
	
	@SideOnly(Side.CLIENT)
	private IIcon itemIcon2;
	
	public ItemDrop() {
		
		this.setHasSubtypes(true);
		this.setUnlocalizedName("drop");
		
		this.setCreativeTab(Tabs.tabApiculture);
		
		init();
	}
	
	private void init() {
		drops.put(D.ENCHANTED, new Drop(0x6E1C6D, 0xFF8FFF));
		drops.put(D.INTELLECT, new Drop(0x25914D, 0x18E072));
		drops.put(D.DESTABILIZED, new Drop(0xCC002C, 0x6B0118));
		drops.put(D.CARBON, new Drop(0x454545, 0x0F0F0F));
		drops.put(D.LUX, new Drop(0xF5F3A4, 0xC9C87D));
		drops.put(D.ENDEARING, new Drop(0x12E3D9, 0x069E97));
	}
	
	public ArrayList<Drop> getDrops() {
		return new ArrayList<Drop>(drops.values());
	}
	
	@Override
	public int getRenderPasses(int meta) {
		return 2;
	}
	
	@Override
	public IIcon getIcon(ItemStack itemstack, int pass) {
		return (pass == 0) ? itemIcon : itemIcon2;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean requiresMultipleRenderPasses() {
		return true;
	}
	

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tabs, List list) {
		for(int i = 0; i < getDrops().size(); i++) {
			Drop drop = getDrops().get(i);
			
			list.add(new ItemStack(this, 1, i));
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack stack, int pass) {
		Drop drop = getDrops().get(stack.getItemDamage());
		
		int colour = drop.getColor1();

		if (pass >= 1)
			colour = drop.getColor2();
		
		return colour;
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon("forestry:honeyDrop.0");
        this.itemIcon2 = par1IconRegister.registerIcon("forestry:honeyDrop.1");
    }
	
	@Override
    public String getUnlocalizedName(ItemStack itemstack) {
		 switch (itemstack.getItemDamage()) {
		 	case 0: return this.getUnlocalizedName() + ".mundane";
		 	case 1: return this.getUnlocalizedName() + ".molten";
		 	case 2: return this.getUnlocalizedName() + ".occult";
		 	case 3: return this.getUnlocalizedName() + ".otherworldly";
		 	case 4: return this.getUnlocalizedName() + ".transmuted";
		 	default: return this.getUnlocalizedName();
		 }
    }
	
}
