package magicbees2.bee.genetics;

import java.util.HashMap;
import java.util.Map;

import magicbees2.Defaults;
import magicbees2.api.apiculture.ITemplate;
import magicbees2.item.Comb.Type;
import magicbees2.item.Drop.D;
import magicbees2.item.IItems;
import magicbees2.item.Pollen.P;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import forestry.api.apiculture.EnumBeeType;
import forestry.api.apiculture.IAlleleBeeSpecies;
import forestry.api.apiculture.IBeeGenome;
import forestry.api.apiculture.IBeeHousing;
import forestry.api.apiculture.IBeeRoot;
import forestry.api.genetics.AlleleManager;
import forestry.api.genetics.IClassification;

public class Bee extends AlleleSpecies implements IAlleleBeeSpecies, ITemplate {
	
	private IBeeRoot root;
	private String texture;
	
	private final HashMap<ItemStack, Integer> products = new HashMap();
	private final HashMap<ItemStack, Integer> specialties = new HashMap();
	
	public Bee(String uid, String binomial, IClassification branch, int color1) {
		this(uid, binomial, branch, color1, Defaults.DEFAULT_COLOR);
	}

	public Bee(String uid, String binomial, IClassification branch, int color1, int color2) {
		this(uid, binomial, branch, color1, color2, false, false, true, true);
	}
	
	public Bee(String uid, String binomial, IClassification branch, int color1, int color2, boolean hasGlow, boolean isDominant) {
		this(uid, binomial, branch, color1, color2, hasGlow, true, true, isDominant);
	}
	
	protected Bee(String uid, String binomial, IClassification branch, int color1, int color2, boolean hasGlow, boolean isSecret, boolean isCounted, boolean isDominant) {
		super(uid, binomial, branch, color1, color2, hasGlow, isSecret, isCounted, isDominant);
		root = (IBeeRoot) AlleleManager.alleleRegistry.getSpeciesRoot("rootBees");
		
		this.setAllele(this);
		this.getRoot().registerTemplate(this.getGenome());
				
		this.texture = "textures/entity/bees/honeyBee.png";
	}

	@Override
	public IBeeRoot getRoot() {
		return root;
	}

	@Override
	public boolean isNocturnal() {
		return false;
	}

	@Override
	public Map<ItemStack, Integer> getProducts() {
		return products;
	}
	
	public void addProduct(ItemStack produce, int chance) {
		products.put(produce, chance);
	}

	@Override
	public Map<ItemStack, Integer> getSpecialty() {
		return specialties;
	}
	
	public void addSpecialty(ItemStack produce, int chance) {
		specialties.put(produce, Integer.valueOf(chance));
	}

	@Override
	public boolean isJubilant(IBeeGenome genome, IBeeHousing housing) {
		return false; // TODO?
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(EnumBeeType type, int renderpass) {
		return icons[type.ordinal()][renderpass];
	}

	@Override
	public String getEntityTexture() {
		return texture;
	}
	
	public ItemStack getStack(D d) {
		return new ItemStack(IItems.drop, 1, d.ordinal());
	}
	
	public ItemStack getStack(Type t) {
		return new ItemStack(IItems.comb, 1, t.ordinal());
	}
	
	public ItemStack getStack(P p) {
		return new ItemStack(IItems.pollen, 1, p.ordinal());
	}

	/**
	 * The default values are characteristics of the magic species.
	 * 
	 */
	@Override
	public String getSpeed() {
		return "speedSlowest";
	}

	@Override
	public String getLifespan() {
		return "lifespanShorter";
	}

	@Override
	public String getFertility() {
		return "fertilityNormal";
	}

	@Override
	public String getTemperatureTolerance() {
		return "toleranceNone";
	}

	@Override
	public String getNocturnal() {
		return "boolFalse";
	}

	@Override
	public String getHumidityTolerance() {
		return "toleranceNone";
	}

	@Override
	public String getTolerant() {
		return "boolFalse";
	}

	@Override
	public String getCaveDwelling() {
		return "boolFalse";
	}

	@Override
	public String getFlowerProvider() {
		return "flowersVanilla";
	}

	@Override
	public String getFlowering() {
		return "floweringSlowest";
	}

	@Override
	public String getTerritory() {
		return "territoryDefault";
	}

	@Override
	public String getEffect() {
		return "effectNone";
	}

}
