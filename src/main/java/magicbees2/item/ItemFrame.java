package magicbees2.item;

import cpw.mods.fml.common.registry.GameRegistry;
import forestry.api.apiculture.IBee;
import forestry.api.apiculture.IBeeGenome;
import forestry.api.apiculture.IBeeHousing;
import forestry.api.apiculture.IHiveFrame;
import forestry.api.core.Tabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemFrame extends Item implements IHiveFrame {
	
	public ItemFrame() {
		
		this.setUnlocalizedName("Faggot Frame");
		this.setCreativeTab(Tabs.tabApiculture);
		GameRegistry.registerItem(this, "superframe");
		
	}

	@Override
	public float getTerritoryModifier(IBeeGenome genome, float currentModifier) {
		return 50;
	}

	@Override
	public float getMutationModifier(IBeeGenome genome, IBeeGenome mate, float currentModifier) {
		return 1f;
	}

	@Override
	public float getLifespanModifier(IBeeGenome genome, IBeeGenome mate, float currentModifier) {
		return 0.0001F;
	}

	@Override
	public float getProductionModifier(IBeeGenome genome, float currentModifier) {
		return 0f;
	}

	@Override
	public float getFloweringModifier(IBeeGenome genome, float currentModifier) {
		return 1f;
	}

	@Override
	public float getGeneticDecay(IBeeGenome genome, float currentModifier) {
		return 0;
	}

	@Override
	public boolean isSealed() {
		return false;
	}

	@Override
	public boolean isSelfLighted() {
		return true;
	}

	@Override
	public boolean isSunlightSimulated() {
		return true;
	}

	@Override
	public boolean isHellish() {
		return false;
	}

	@Override
	public ItemStack frameUsed(IBeeHousing housing, ItemStack frame, IBee queen, int wear) {
		return frame;
	}

}
