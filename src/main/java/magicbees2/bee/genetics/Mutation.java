package magicbees2.bee.genetics;

import java.util.ArrayList;
import java.util.Collection;

import cpw.mods.fml.common.registry.LanguageRegistry;
import magicbees2.util.MoonPhase;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.oredict.OreDictionary;
import forestry.api.apiculture.IAlleleBeeSpecies;
import forestry.api.apiculture.IBeeGenome;
import forestry.api.apiculture.IBeeHousing;
import forestry.api.apiculture.IBeeMutation;
import forestry.api.apiculture.IBeeRoot;
import forestry.api.apiculture.IBeekeepingMode;
import forestry.api.genetics.AlleleManager;
import forestry.api.genetics.IAllele;
import forestry.api.genetics.IGenome;

public class Mutation implements IBeeMutation {
	
	private int chance;
	
	private float bonus;
	
	private Type biome;
	private Block requiredBlock;
	
	private String oreDictEntry;
	
	private IBeeRoot root;
	
	private boolean isSecret, isMoonRestricted;
	
	private IAllele parent0; 
	private IAllele parent1; 
	private IAllele mutation[];
	
	private MoonPhase startMoonPhase, endMoonPhase;
	
	
	public Mutation(IAlleleBeeSpecies species0, IAlleleBeeSpecies species1, Bee allele, int chance) {
		this(species0, species1, allele.getGenome(), chance);
	}
	
	public Mutation(IAlleleBeeSpecies species0, IAlleleBeeSpecies species1, IAllele[] mutation, int chance) {
		root = (IBeeRoot) AlleleManager.alleleRegistry.getSpeciesRoot("rootBees");
		
		this.parent0 = species0;
		this.parent1 = species1;
		
		this.mutation = mutation;
		
		this.chance = chance;
		
		getRoot().registerMutation(this);
	}
	
	@Override
	public IAllele getAllele0() {
		return parent0;
	}

	@Override
	public IAllele getAllele1() {
		return parent1;
	}

	@Override
	public IAllele[] getTemplate() {
		return mutation;
	}

	@Override
	public float getBaseChance() {
		return chance;
	}

	@Override
	public Collection<String> getSpecialConditions() {
		ArrayList<String> conditions = new ArrayList<String>();
		
		if (this.requiredBlock != null) {
			conditions.add(format("research.required", new ItemStack(this.requiredBlock, 1).getDisplayName()));
		} else if (this.oreDictEntry != null) {
			ArrayList<ItemStack> itemstacks = OreDictionary.getOres(this.oreDictEntry);
			
			if (itemstacks.size() > 0)
				conditions.add(format("research.required", itemstacks.get(0).getDisplayName()));
		}
		
		
		if (biome != null) {
			String biome = (this.biome.name().substring(0, 1) + this.biome.name().substring(1).toLowerCase());
		
		    conditions.add(format("research.biome", biome));
		}
		
		return conditions;
	}

	@Override
	public boolean isPartner(IAllele allele) {
		return parent0.getUID().equals(allele.getUID()) || parent1.getUID().equals(allele.getUID());
	}

	@Override
	public IAllele getPartner(IAllele allele) {
		IAllele val = parent0;
		
		if (val.getUID().equals(allele.getUID()))
			val = parent1;
		
		return val;
	}

	@Override
	public boolean isSecret() {
		return isSecret;
	}

	@Override
	public IBeeRoot getRoot() {
		return root;
	}

	@Override
	public float getChance(IBeeHousing housing, IAllele allele0, IAllele allele1, IGenome genome0, IGenome genome1) {
		
		float finalChance = 0F;
		float chance = this.chance * 1F;
		
		if (this.parent0.getUID().equals(allele0.getUID()) && this.parent1.getUID().equals(allele1.getUID()) ||
			this.parent0.getUID().equals(allele1.getUID()) && this.parent1.getUID().equals(allele0.getUID())) {
			
			World world = housing.getWorld();
			
			IBeekeepingMode mode = getRoot().getBeekeepingMode(world);
			BiomeGenBase base = world.getBiomeGenForCoords(housing.getXCoord(), housing.getZCoord());
			
			// Moon Phase
			if (this.startMoonPhase != null && this.endMoonPhase != null) {
				if (this.isMoonRestricted && !MoonPhase.getMoonPhase(world).isBetween(this.startMoonPhase, this.endMoonPhase)) {
					chance = 0;
				} else if (this.bonus != -1f) {
					if (MoonPhase.getMoonPhase(world).isBetween(this.startMoonPhase, this.endMoonPhase)) {
						chance = (int)(chance * this.bonus);
					}	
				}
			}
			
			/* Required Block (Basic Block Support) */
			if( this.requiredBlock != null && !isRequiredBlock(housing, true))
				chance = 0;
			
			/* Required Block (Ore Dictionary Support) */
			if (this.oreDictEntry != null && !isRequiredBlock(housing, false))
				chance = 0;
			
			if(this.biome != null && !isGoodBiome(base, this.biome))
				chance = 0;
			
			float chance1 = mode.getMutationModifier((IBeeGenome) genome0, (IBeeGenome) genome1, chance);
			float chance2 = housing.getMutationModifier((IBeeGenome) genome0, (IBeeGenome) genome1, chance);
			
			finalChance = Math.round(chance * chance1 * chance2);
		}
		
		return finalChance;
	}
	
	public void setBiome(Type type) {
		this.biome = type;
	}
	
	public Mutation setRequiredBlock(Block block) {
		this.requiredBlock = block;
		return this;
	}
	
	public Mutation setOreDictEntry(String entry) {
		this.oreDictEntry = entry;
		return this;
	}
	
	private boolean isGoodBiome(BiomeGenBase biome, Type type) {
		return BiomeDictionary.isBiomeOfType(biome, type);
	}
	
	private boolean isRequiredBlock(IBeeHousing house, boolean isReq) {
		World world = house.getWorld();
		
		int x = house.getXCoord();
		int y = house.getYCoord();
		int z = house.getZCoord();
		
		return (isBlock(world, x, y - 1, z, isReq)) || (isBlock(world, x, y - 2, z, isReq));
	}
	
	private boolean isBlock(World world, int x, int y, int z, boolean isRequired) {
		Block block = world.getBlock(x, y, z);
		
		if (block.isAir(world, x, y, z))
			return false;
		
		if(block instanceof IBeeHousing)
			return false;
		
		ItemStack itemstack = new ItemStack(block, 1, world.getBlockMetadata(x, y, z));
		
		if (isRequired) {
			ItemStack stack = new ItemStack(this.requiredBlock, 1);
			
			if (ItemStack.areItemStacksEqual(stack, itemstack))					
				return true;
			
		} else {
		
			for (ItemStack stack : OreDictionary.getOres(this.oreDictEntry)) {
				if (OreDictionary.itemMatches(stack, itemstack, false))
					return true;				
			}
			
		}
	
		return false;
	}

	private String format(String local, String name) {
		return String.format(LanguageRegistry.instance().getStringLocalization(local), name);
	}
}
