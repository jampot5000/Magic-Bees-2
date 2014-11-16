package magicbees2.item;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import magicbees2.item.Pollen.P;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import forestry.api.core.Tabs;

public class ItemPollen extends Item {

	private static final LinkedHashMap<P, Pollen> pollen = new LinkedHashMap<P, Pollen>();
	
	@SideOnly(Side.CLIENT)
	private IIcon itemIcon2;
	
	public ItemPollen() {
		
		this.setHasSubtypes(true);
		this.setUnlocalizedName("pollen");
		
		this.setCreativeTab(Tabs.tabApiculture);
		
		init(); // Populate...
	}
	
	private void init() {
		pollen.put(P.UNUSUAL, new Pollen(0x6E1C6D, 0xFF8FFF));
		pollen.put(P.PHASED, new Pollen(0x25914D, 0x18E072));
	}
	
	public ArrayList<Pollen> getDrops() {
		return new ArrayList<Pollen>(pollen.values());
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
			list.add(new ItemStack(this, 1, i));
		}
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack stack, int pass) {
		Pollen drop = getDrops().get(stack.getItemDamage());
		
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
