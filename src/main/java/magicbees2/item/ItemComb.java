package magicbees2.item;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import magicbees2.item.Comb.Type;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import forestry.api.core.Tabs;

public class ItemComb extends Item {

	private static final LinkedHashMap<Type, Comb> combs = new LinkedHashMap<Type, Comb>();
	
	@SideOnly(Side.CLIENT)
	private IIcon itemIcon2;
	
	public ItemComb() {
		
		this.setHasSubtypes(true);
		this.setUnlocalizedName("comb");
		
		this.setCreativeTab(Tabs.tabApiculture);

		init(); // Populate map with combs!
	}

	private void init() {
		
		// Basic Combs
		combs.put(Type.MUNDANE, new Comb(0xFF9859, 0xFFC58E, true));
		combs.put(Type.MOLTEN, new Comb(0xCC3333, 0x1E160E, true));
		combs.put(Type.OCCULT, new Comb(0x9872FF, 0x2D2D2D, true));
		combs.put(Type.OTHERWORLD, new Comb(0x3EE0D8, 0x3A3820, true));
		combs.put(Type.TRANSMUTED, new Comb(0xE5425D, 0x323291, true));
		
		// ?
		combs.put(Type.PAPERY, new Comb(0xBCA664, 0x35332E, true));
		combs.put(Type.SOUL, new Comb(0x7F7171, 0x876D53, true));
		combs.put(Type.FURTIVE, new Comb(0xB7ACB7, 0x636363, false));
		combs.put(Type.INTELLECT, new Comb(0x0092e9, 0x618fff, false));
		combs.put(Type.TEMPORAL, new Comb(0x2F9381, 0x773C31, false));
		combs.put(Type.FORGOTTEN, new Comb(0xB191D8, 0x35443B, false));
		
		// ?
		combs.put(Type.AIRY, new Comb(0xffff7e, 0x606308, false));
		combs.put(Type.FIREY, new Comb(0xff3C01, 0x5B0D10, false));
		combs.put(Type.WATERY, new Comb(0x0090ff, 0x102F6B, false));
		combs.put(Type.EARTHY, new Comb(0x00a000, 0x043004, false));
		
	}
	
	public ArrayList<Comb> getCombs() {
		return new ArrayList<Comb>(combs.values());
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
		for(int i = 0; i < getCombs().size(); i++) {
			Comb comb = getCombs().get(i);
			
			if (!comb.isSecret())
				list.add(new ItemStack(this, 1, i));
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack stack, int pass) {
		Comb comb = getCombs().get(stack.getItemDamage());
		
		int colour = comb.getColor1();

		if (pass >= 1)
			colour = comb.getColor2();
		
		return colour;
	}
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon("forestry:beeCombs.0");
        this.itemIcon2 = par1IconRegister.registerIcon("forestry:beeCombs.1");
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
