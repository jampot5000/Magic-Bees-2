package magicbees2.block;

import java.util.ArrayList;
import java.util.List;

import magicbees2.api.apiculture.hives.HiveManager;
import magicbees2.material.MaterialHive;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import forestry.api.apiculture.IHiveDrop;
import forestry.api.core.Tabs;

public class BlockHive extends Block {
	
	@SideOnly(Side.CLIENT)
	public IIcon[] icons = new IIcon[2];
	
	public BlockHive() {
		super(new MaterialHive());
		
		this.setHardness(1.0F);
		this.setLightLevel(0.5F);
		
		this.setBlockName("hive");
		this.setCreativeTab(Tabs.tabApiculture);
	}

	@Override
	public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity) {
		return false;
	}
	
	@Override
	public int damageDropped(int meta) {
		return meta;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List itemsList) {
		int length = HiveManager.getHives().size();
		
		for(int i = 0; i < length; i++) {
			itemsList.add(new ItemStack(this, 1, i));
		}
		
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int i, int j) {
		
		if (j < 0 || j >= 8)
			return null;

		if (i == 0 || i == 1) {
			if ((j * 2 < icons.length) && (icons[j * 2] != null)) {
				return icons[j * 2];
			} else {
				return icons[2];
			}
		} else if (j * 2 + 1 < icons.length && icons[j * 2 + 1] != null) {
			return icons[j * 2 + 1];
		} else {
			return icons[3];
		}

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon) {
		icons = new IIcon[12];
		
		for (int i = 0; i < 6; i++) {
			icons[i * 2] = icon.registerIcon("magicbees2:beehive." + i + ".top");
			icons[(i * 2) + 1] = icon.registerIcon("magicbees2:beehive." + i + ".side");
		}
		
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		ArrayList<IHiveDrop> hive = HiveManager.getHives().get(metadata).getDrops();
		
		if (hive.isEmpty()) 
			return drops;
						
		// Princess
		for (IHiveDrop drop : hive) {
			if (world.rand.nextInt(100) < drop.getChance(world, x, y, z)) {
				drops.add(drop.getPrincess(world, x, y, z, fortune));
			}
		}

		// Drone
		for (IHiveDrop drop : hive) {
			
			if (world.rand.nextInt(100) < drop.getChance(world, x, y, z)) {
				drops.addAll(drop.getDrones(world, x, y, z, fortune));
			}
		}

		// Additional
		for (IHiveDrop drop : hive) {

			if (world.rand.nextInt(100) < drop.getChance(world, x, y, z)) {
				drops.addAll(drop.getAdditional(world, x, y, z, fortune));
			}
		}
		
		return drops;
	}
	
}
