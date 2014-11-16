package magicbees2.bee.genetics;

import java.util.Locale;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.mojang.authlib.GameProfile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import forestry.api.apiculture.EnumBeeChromosome;
import forestry.api.apiculture.EnumBeeType;
import forestry.api.core.EnumHumidity;
import forestry.api.core.EnumTemperature;
import forestry.api.core.IIconProvider;
import forestry.api.genetics.AlleleManager;
import forestry.api.genetics.IAllele;
import forestry.api.genetics.IAlleleSpecies;
import forestry.api.genetics.IClassification;
import forestry.api.genetics.IIndividual;

public abstract class AlleleSpecies extends Allele implements IAlleleSpecies, IIconProvider {

	protected int color1;
	protected int color2;
	
	protected boolean hasGlow;
	protected boolean isSecret;
	protected boolean isCounted;
	
	protected String binomial;
	protected String description;
	
	private IAllele genome[];
	private IClassification branch;
	
	private EnumHumidity humidity;
	private EnumTemperature temperature;
	
	@SideOnly(Side.CLIENT)
	protected IIcon[][] icons;
	
	protected AlleleSpecies(String uid, String binomial, IClassification branch, int color1, int color2, boolean hasGlow, boolean isSecret, boolean isCounted, boolean isDominant) {
		super("species." + uid, isDominant, true);
		
		this.branch = branch;

		this.color1 = color1;
		this.color2 = color2;

		this.hasGlow = hasGlow;
		this.isSecret = isSecret;
		this.isCounted = isCounted;
		
		this.humidity = EnumHumidity.NORMAL;
		this.temperature = EnumTemperature.NORMAL;
		
		this.binomial = binomial;
		this.description = "You need to create a description.";

		AlleleManager.alleleRegistry.registerAllele(this);
	}
	
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getBinomial() {
		return binomial;
	}

	@Override
	public String getAuthority() {
		return "Maxcloud";
	}

	@Override
	public IClassification getBranch() {
		return branch;
	}

	@Override
	public int getComplexity() {
		return 3; // TODO
	}

	@Override
	public float getResearchSuitability(ItemStack itemstack) {
		return 0; // TODO
	}

	@Override
	public ItemStack[] getResearchBounty(World world, GameProfile gameProfile, IIndividual individual, int bountyLevel) {
		return null; // TODO
	}

	@Override
	public EnumHumidity getHumidity() {
		return humidity;
	}
	
	public Bee setHumidity(EnumHumidity humid) {
		this.humidity = humid;
		return (Bee) this;
	}
	
	@Override
	public EnumTemperature getTemperature() {
		return temperature;
	}
	
	public Bee setTemperature(EnumTemperature temp) {
		this.temperature = temp;
		return (Bee) this;
	}

	@Override
	public boolean hasEffect() {
		return hasGlow;
	}

	@Override
	public boolean isSecret() {
		return isSecret;
	}

	@Override
	public boolean isCounted() {
		return isCounted;
	}

	@Override
	public int getIconColour(int rp) {
		int value = 0xffffff;
		if (rp == 0) {
			value = this.color1;
		} else if (rp == 1) {
			value = this.color2;
		}
		return value;
	}

	@Override
	public IIconProvider getIconProvider() {
		return this;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(short texUID) {
		return icons[0][0];
	}

	@Override
	public void registerIcons(IIconRegister iicon) {
		this.icons = new IIcon[EnumBeeType.values().length][3];
		
		String root = ("forestry:bees/default/");
		IIcon body1 = iicon.registerIcon(root + "body1");
		
		for (int i = 0; i < EnumBeeType.values().length; i++) {
			if(EnumBeeType.values()[i] == EnumBeeType.NONE)
				continue;
			
			icons[i][0] = iicon.registerIcon(root + EnumBeeType.values()[i].toString().toLowerCase(Locale.ENGLISH) + ".outline");
			icons[i][1] = (EnumBeeType.values()[i] != EnumBeeType.LARVAE) ? body1 : iicon.registerIcon(root + EnumBeeType.values()[i].toString().toLowerCase(Locale.ENGLISH) + ".body");
			icons[i][2] = iicon.registerIcon(root + EnumBeeType.values()[i].toString().toLowerCase(Locale.ENGLISH) + ".body2");
		}
		
	}
	
	public IAllele[] getGenome() {
		return genome;
	}
	
	public void setGenome(IAllele genome[]) {
		this.genome = genome; 
	}

	protected void addAllele(EnumBeeChromosome chromosome, IAllele allele) {
		IAllele[] genome = getGenome();
		int index = chromosome.ordinal();

		if (allele != null) {
			genome[index] = allele;
		}
		
		this.setGenome(genome);
	}
	
	protected void setAllele(Bee bee) {
		IAllele[] genome = new IAllele[14];
		
		genome[0] = bee;
		genome[1] = getAllele("forestry." + bee.getSpeed());
		genome[2] = getAllele("forestry." + bee.getLifespan());
		genome[3] = getAllele("forestry." + bee.getFertility());
		genome[4] = getAllele("forestry." + bee.getTemperatureTolerance());
		genome[5] = getAllele("forestry." + bee.getNocturnal());
		genome[7] = getAllele("forestry." + bee.getHumidityTolerance());
		genome[8] = getAllele("forestry." + bee.getTolerant());
		genome[9] = getAllele("forestry." + bee.getCaveDwelling());
		genome[10] = getAllele("forestry." + bee.getFlowerProvider());
		genome[11] = getAllele("forestry." + bee.getFlowering());
		genome[12] = getAllele("forestry." + bee.getTerritory());
		genome[13] = getAllele("forestry." + bee.getEffect());
			
		this.setGenome(genome);
	}

}
