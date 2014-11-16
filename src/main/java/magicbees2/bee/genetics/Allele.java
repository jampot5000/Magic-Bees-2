package magicbees2.bee.genetics;

import cpw.mods.fml.common.registry.LanguageRegistry;
import forestry.api.apiculture.IAlleleBeeSpecies;
import forestry.api.genetics.AlleleManager;
import forestry.api.genetics.IAllele;
import forestry.api.genetics.IAlleleRegistry;

public class Allele implements IAllele {
	
	boolean isDominant;
	
	protected String uid;
	protected String name;
	
	public Allele (String uid, boolean isDominant) {
		this(uid, isDominant, false);
	}
	
	protected Allele (String uid, boolean isDominant, boolean skip) {
		this.uid = uid;
		this.name = "allele." + uid;
		
		this.isDominant = isDominant;
		
		if (!skip)
			AlleleManager.alleleRegistry.registerAllele(this);
	}

	@Override
	public String getUID() {
		return "magicbees2." + this.uid;
	}

	@Override
	public boolean isDominant() {
		return isDominant;
	}

	@Override
	public String getName() {
		return LanguageRegistry.instance().getStringLocalization(getUID());
	}

	@Override
	public String getUnlocalizedName() {
		return name;
	}
	
	public static IAllele getAllele(String name) {
		return AlleleManager.alleleRegistry.getAllele(name);
	}
	
	public static IAllele[] getTemplate(String name) {
		IAlleleRegistry registry = AlleleManager.alleleRegistry;
		return registry.getSpeciesRoot("rootBees").getTemplate("forestry.species" + name);
	}
	
	// Forestry Bees!
	public static IAlleleBeeSpecies speciesForest = (IAlleleBeeSpecies) getAllele("forestry.speciesForest");
	public static IAlleleBeeSpecies speciesMeadows = (IAlleleBeeSpecies) getAllele("forestry.speciesMeadows");
	public static IAlleleBeeSpecies speciesModest = (IAlleleBeeSpecies) getAllele("forestry.speciesModest");
	public static IAlleleBeeSpecies speciesWintry = (IAlleleBeeSpecies) getAllele("forestry.speciesWintry");
	public static IAlleleBeeSpecies speciesTropical = (IAlleleBeeSpecies) getAllele("forestry.speciesTropical");
	public static IAlleleBeeSpecies speciesMarshy = (IAlleleBeeSpecies) getAllele("forestry.speciesMarshy");
	public static IAlleleBeeSpecies speciesCommon = (IAlleleBeeSpecies) getAllele("forestry.speciesCommon");
	public static IAlleleBeeSpecies speciesCultivated = (IAlleleBeeSpecies) getAllele("forestry.speciesCultivated");
	public static IAlleleBeeSpecies speciesMonastic = (IAlleleBeeSpecies) getAllele("forestry.speciesMonastic");
	public static IAlleleBeeSpecies speciesDemonic = (IAlleleBeeSpecies) getAllele("forestry.speciesDemonic");
	public static IAlleleBeeSpecies speciesImperial = (IAlleleBeeSpecies) getAllele("forestry.speciesImperial");
	
	// Forestry Templates!
	public static IAllele[] templateForest = getTemplate("Forest");
	public static IAllele[] templateMeadows = getTemplate("Meadows");
	public static IAllele[] templateModest = getTemplate("Modest");
	public static IAllele[] templateWintry = getTemplate("Wintry");
	public static IAllele[] templateTropical = getTemplate("Tropical");
	public static IAllele[] templateMarshy = getTemplate("Marshy");
	public static IAllele[] templateCommon = getTemplate("Common");
	public static IAllele[] templateCultivated = getTemplate("Cultivated");
	
	// Abominable Branch
	public static Bee speciesHateful;
	public static Bee speciesInfernal;
	public static Bee speciesSpiteful;
	public static Bee speciesWithering;
	
	// Arcane Branch
	public static Bee speciesArcane;
	public static Bee speciesEsoteric;
	public static Bee speciesMysterious;

	// Extrinsic Branch
	public static Bee speciesAbandoned;
	public static Bee speciesDraconic;
	public static Bee speciesForlorn;
	public static Bee speciesNameless;
	public static Bee speciesOblivion;
	
	// Gem Branch
	public static Bee speciesApatite;
	public static Bee speciesDiamond;
	public static Bee speciesEmerald;
	
	// Magical Branch
	public static Bee speciesAware;
	public static Bee speciesEarthen;
	public static Bee speciesEthereal;
	public static Bee speciesFiren;
	public static Bee speciesWatern;
	public static Bee speciesWinden;
	
	// Metallic Branch
	public static Bee speciesAluminium;
	public static Bee speciesArdite;
	public static Bee speciesCobolt;
	public static Bee speciesCopper;
	public static Bee speciesGold;
	public static Bee speciesIron;
	public static Bee speciesLead;
	public static Bee speciesManuyllyn;
	public static Bee speciesSilver;
	public static Bee speciesTin;
	
	// Scholarly Branch
	public static Bee speciesPupil;
	public static Bee speciesSavant;
	public static Bee speciesScholarly;

	// Skulking Branch
	public static Bee speciesGhastly;
	public static Bee speciesSkulking;
	public static Bee speciesSmouldering;
	public static Bee speciesSpidery;
	
	// Soul Branch
	public static Bee speciesSoul;
	public static Bee speciesSpirit;

	// Supernatural Branch
	public static Bee speciesCharmed;
	public static Bee speciesEnchanted;
	public static Bee speciesSupernatural;

	// Time Branch
	public static Bee speciesDoctoral;	
	public static Bee speciesLordly;
	public static Bee speciesTimely;
	
	// Transmuting Branch
	public static Bee speciesCrumbling;
	public static Bee speciesMutable;
	public static Bee speciesTransmuting;
	
	// Viled Branch
	public static Bee speciesAttuned;
	public static Bee speciesEldritch;
	public static Bee speciesInvisible;
	public static Bee speciesMystical;
	public static Bee speciesSorcerous;
	public static Bee speciesUnusual;
	
	/*// ----------------- Mod Integration ------------------------
	
	// ---- Ars Magica -------------
	// Essential Branch
	public static Bee speciesAir;
	public static Bee speciesArcane0;
	public static Bee speciesEarth;
	public static Bee speciesFire;
	public static Bee speciesEssence;
	public static Bee speciesIce;
	public static Bee speciesLightning;
	public static Bee speciesPlant;
	public static Bee speciesQuintessence;
	public static Bee speciesVortex;
	public static Bee speciesWater;
	public static Bee speciesWight;
	
	// ---- Blood Magic -------------
    // Bloody Branch
	public static Bee speciesBloody;
	public static Bee speciesBound;
	
	// ---- Equivalent Exchange -------------
	// Alchemical Branch
	public static Bee speciesMinium;
	
	// ---- Redstone Arsenal -------------
    // Thermal Branch (see below)
	public static Bee speciesFluxed;
	
	// ---- Thaumcraft -------------
	// Fleshy Branch
	public static Bee speciesBeefy;
	public static Bee speciesChicken;
	public static Bee speciesPork;
	
	// Thaumic Branch
	public static Bee speciesAir0;
	public static Bee speciesAttractive;
	public static Bee speciesBatty;
	public static Bee speciesBrainy;
	public static Bee speciesChaos;
	public static Bee speciesEarth0;
	public static Bee speciesFire0;
	public static Bee speciesOrder;
	public static Bee speciesPure;
	public static Bee speciesRejuvenating;
	public static Bee speciesTaint;
	public static Bee speciesVis;
	public static Bee speciesWater0;
	public static Bee speciesWispy;
	
	// ---- Thermal Expansion -------------
    // Abominable Branch (see above)
	public static Bee speciesBlizzy;
	public static Bee speciesDante;
	public static Bee speciesGelid;
	public static Bee speciesPyro;
	
	// Adorable Branch
	public static Bee speciesEndearing;
	public static Bee speciesWinsome;
	
	// Thermal Branch
	public static Bee speciesBronze;
	public static Bee speciesCoal;
	public static Bee speciesDestabilized;
	public static Bee speciesElectrum;
	public static Bee speciesInvar;
	public static Bee speciesLux;
	public static Bee speciesNickel;
	public static Bee speciesPlatinum;*/

}
