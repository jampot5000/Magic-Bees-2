package magicbees2.block;

import java.util.ArrayList;

import magicbees2.bee.BeeManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import forestry.api.apiculture.IHiveDrop;
import forestry.api.core.EnumTemperature;
import forestry.api.genetics.IAllele;

public class Hive {

	private int lightLevel;
	
	private String name;
	
	private ArrayList<IHiveDrop> drops;
	
	@SideOnly(Side.CLIENT)
	public IIcon[] icons = new IIcon[2];
	
	protected Hive(String name, int lightLevel) {
		
		this.name = name;
		this.lightLevel = lightLevel;
		
		this.drops = new ArrayList<IHiveDrop>();	
	}
	
	public int getLightLevel() {
		return lightLevel;
	}
	
	public ArrayList<IHiveDrop> getDrops() {
		return drops;
	}
	
	public void addDrop(String name, ItemStack[] itemstack, int chance) {
		String uid = "magicbees2.species." + name;
		IAllele[] template = BeeManager.getRoot().getTemplate(uid);
		
		if (template == null) {
			System.out.println("[MagicBees2] Hive population error; (" + name +") not found. Please report this.");
		} else {
			this.drops.add(new HiveDrop(template, itemstack, chance));
		}
		
	}
	
}
