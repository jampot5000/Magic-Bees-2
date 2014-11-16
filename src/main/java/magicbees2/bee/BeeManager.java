package magicbees2.bee;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.oredict.OreDictionary;
import magicbees2.Defaults;
import magicbees2.api.apiculture.hives.HiveManager;
import magicbees2.bee.branch.abominable.BeeHateful;
import magicbees2.bee.branch.abominable.BeeInfernal;
import magicbees2.bee.branch.abominable.BeeSpiteful;
import magicbees2.bee.branch.abominable.BeeWithering;
import magicbees2.bee.branch.arcane.BeeArcane;
import magicbees2.bee.branch.arcane.BeeEsoteric;
import magicbees2.bee.branch.arcane.BeeMysterious;
import magicbees2.bee.branch.extrinsic.BeeAbandoned;
import magicbees2.bee.branch.extrinsic.BeeDraconic;
import magicbees2.bee.branch.extrinsic.BeeForlorn;
import magicbees2.bee.branch.extrinsic.BeeNameless;
import magicbees2.bee.branch.extrinsic.BeeOblivion;
import magicbees2.bee.branch.gem.BeeApatite;
import magicbees2.bee.branch.gem.BeeDiamond;
import magicbees2.bee.branch.gem.BeeEmerald;
import magicbees2.bee.branch.magical.BeeEarthen;
import magicbees2.bee.branch.magical.BeeEthereal;
import magicbees2.bee.branch.magical.BeeFiren;
import magicbees2.bee.branch.magical.BeeWatern;
import magicbees2.bee.branch.magical.BeeWinden;
import magicbees2.bee.branch.metallic.BeeAluminum;
import magicbees2.bee.branch.metallic.BeeArdite;
import magicbees2.bee.branch.metallic.BeeCobolt;
import magicbees2.bee.branch.metallic.BeeCopper;
import magicbees2.bee.branch.metallic.BeeGold;
import magicbees2.bee.branch.metallic.BeeIron;
import magicbees2.bee.branch.metallic.BeeLead;
import magicbees2.bee.branch.metallic.BeeManyullyn;
import magicbees2.bee.branch.metallic.BeeSilver;
import magicbees2.bee.branch.metallic.BeeTin;
import magicbees2.bee.branch.scholarly.BeePupil;
import magicbees2.bee.branch.scholarly.BeeSavant;
import magicbees2.bee.branch.scholarly.BeeScholarly;
import magicbees2.bee.branch.skulking.BeeGhastly;
import magicbees2.bee.branch.skulking.BeeSkulking;
import magicbees2.bee.branch.skulking.BeeSmouldering;
import magicbees2.bee.branch.skulking.BeeSpidery;
import magicbees2.bee.branch.soul.BeeAware;
import magicbees2.bee.branch.soul.BeeSoul;
import magicbees2.bee.branch.soul.BeeSpirit;
import magicbees2.bee.branch.supernatural.BeeCharmed;
import magicbees2.bee.branch.supernatural.BeeEnchanted;
import magicbees2.bee.branch.supernatural.BeeSupernatural;
import magicbees2.bee.branch.time.BeeDoctoral;
import magicbees2.bee.branch.time.BeeLordly;
import magicbees2.bee.branch.time.BeeTimely;
import magicbees2.bee.branch.transmuting.BeeCrumbling;
import magicbees2.bee.branch.transmuting.BeeInvisible;
import magicbees2.bee.branch.transmuting.BeeMutable;
import magicbees2.bee.branch.transmuting.BeeTransmuting;
import magicbees2.bee.branch.viled.BeeAttuned;
import magicbees2.bee.branch.viled.BeeEldritch;
import magicbees2.bee.branch.viled.BeeMystical;
import magicbees2.bee.branch.viled.BeeSorcerous;
import magicbees2.bee.branch.viled.BeeUnusual;
import magicbees2.bee.genetics.Allele;
import magicbees2.bee.genetics.Mutation;
import magicbees2.block.hive.HiveCurious;
import magicbees2.block.hive.HiveDeep;
import magicbees2.block.hive.HiveInfernal;
import magicbees2.block.hive.HiveOblivion;
import magicbees2.block.hive.HiveResonant;
import magicbees2.block.hive.HiveUnusual;
import forestry.api.apiculture.IBeeRoot;
import forestry.api.genetics.AlleleManager;

public class BeeManager {
	
	private static IBeeRoot root;
	
	public static void initialize() {
		root = (IBeeRoot) AlleleManager.alleleRegistry.getSpeciesRoot("rootBees");	
		
		/**
		 * ---- Ore Dictionary Registration ----
		 * 
		 */

		
		/**
		 * ---- Bee Registration ----
		 * 
		 */

		// Abominable Branch
		Allele.speciesHateful = new BeeHateful();
		Allele.speciesInfernal = new BeeInfernal();
		Allele.speciesSpiteful = new BeeSpiteful();
		Allele.speciesWithering = new BeeWithering();
		
		// Arcane Branch
		Allele.speciesArcane = new BeeArcane();
		Allele.speciesEsoteric = new BeeEsoteric();
		Allele.speciesMysterious = new BeeMysterious();
		
		// Extrinsic Branch
		Allele.speciesAbandoned = new BeeAbandoned();
		Allele.speciesDraconic = new BeeDraconic();
		Allele.speciesForlorn = new BeeForlorn();
		Allele.speciesNameless = new BeeNameless();
		Allele.speciesOblivion = new BeeOblivion();
		
		// Gem Branch
		Allele.speciesApatite = new BeeApatite();
		Allele.speciesDiamond = new BeeDiamond();
		Allele.speciesEmerald = new BeeEmerald();
		
		// Magical Branch
		Allele.speciesAware = new BeeAware();
		Allele.speciesEarthen = new BeeEarthen();
		Allele.speciesEthereal = new BeeEthereal();
		Allele.speciesFiren = new BeeFiren();
		Allele.speciesWatern = new BeeWatern();
		Allele.speciesWinden = new BeeWinden();
		
		// Metallic Branch
		Allele.speciesAluminium = new BeeAluminum();
		Allele.speciesArdite = new BeeArdite();
		Allele.speciesCobolt = new BeeCobolt();
		Allele.speciesCopper = new BeeCopper();
		Allele.speciesGold = new BeeGold();
		Allele.speciesIron = new BeeIron();
		Allele.speciesLead = new BeeLead();
		Allele.speciesManuyllyn = new BeeManyullyn();
		Allele.speciesSilver = new BeeSilver();
		Allele.speciesTin = new BeeTin();
		
		// Scholarly Branch
		Allele.speciesPupil = new BeePupil();
		Allele.speciesSavant = new BeeSavant();
		Allele.speciesScholarly = new BeeScholarly();
		
		// Skulking Branch
		Allele.speciesGhastly = new BeeGhastly();
		Allele.speciesSkulking = new BeeSkulking();
		Allele.speciesSmouldering = new BeeSmouldering();
		Allele.speciesSpidery = new BeeSpidery();
		
		// Soul Branch
		Allele.speciesSoul = new BeeSoul();
		Allele.speciesSpirit = new BeeSpirit();
		
		// Supernatural Branch
		Allele.speciesCharmed = new BeeCharmed();
		Allele.speciesEnchanted = new BeeEnchanted();
		Allele.speciesSupernatural = new BeeSupernatural();
		
		// Time Branch
		Allele.speciesDoctoral = new BeeDoctoral();
		Allele.speciesLordly = new BeeLordly();
		Allele.speciesTimely = new BeeTimely();
		
		// Transmuting Branch
		Allele.speciesCrumbling = new BeeCrumbling();
		Allele.speciesMutable = new BeeMutable();
		Allele.speciesTransmuting = new BeeTransmuting();
		
		// Viled Branch
		Allele.speciesAttuned = new BeeAttuned();
		Allele.speciesEldritch = new BeeEldritch();
		Allele.speciesInvisible = new BeeInvisible();
    	Allele.speciesMystical = new BeeMystical();
    	Allele.speciesSorcerous = new BeeSorcerous();
    	Allele.speciesUnusual = new BeeUnusual();
    	
    	/**
    	 * ---- Mod Integration ----
    	 * 
    	 */
    	
    	/*// ---- Ars Magica -------------
    	Allele.speciesAir = new BeeAir();
    	Allele.speciesArcane0 = new BeeArcane0();
    	Allele.speciesEarth = new BeeEarth();
    	Allele.speciesEssence = new BeeEssence();
    	Allele.speciesFire = new BeeFire();
    	Allele.speciesIce = new BeeIce();
    	Allele.speciesLightning = new BeeLightning();
    	Allele.speciesPlant = new BeePlant();
    	Allele.speciesQuintessence = new BeeQuintessence();
    	Allele.speciesVortex = new BeeVortex();
    	Allele.speciesWater = new BeeWater();
    	Allele.speciesWight = new BeeWight();
    	
    	// ---- Blood Magic ------------
    	Allele.speciesBloody = new BeeBloody();
    	Allele.speciesBound = new BeeBound();
    	
    	// ---- Equivalent Exchange ----
    	Allele.speciesMinium = new BeeMinium();
    	
    	// ---- Redstone Arsenal -------
    	// Thermal Branch
    	Allele.speciesFluxed = new BeeFluxed();
    	
    	// ---- Thaumcraft -------------
    	// Fleshy Branch
    	Allele.speciesBeefy = new BeeBeef();
    	Allele.speciesChicken = new BeeChicken();
    	Allele.speciesPork = new BeePork();
    	
    	// Thaumic Branch
    	Allele.speciesAir0 = new BeeAir0();
    	Allele.speciesAttractive = new BeeAttractive();
    	Allele.speciesBatty = new BeeBatty();
    	Allele.speciesBrainy = new BeeBrainy();
    	Allele.speciesChaos = new BeeChaos();
    	Allele.speciesEarth0 = new BeeEarth0();
        Allele.speciesFire0 = new BeeFire0();
        Allele.speciesOrder = new BeeOrder();
        Allele.speciesPure = new BeePure();
        Allele.speciesRejuvenating = new BeeRejuvenating();
        Allele.speciesTaint = new BeeTaint();
        Allele.speciesVis = new BeeVis();
        Allele.speciesWater0 = new BeeWater0();
        Allele.speciesWispy = new BeeWispy();
    	
        // ---- Thermal Expansion ------
        // Abominable Branch
        Allele.speciesBlizzy = new BeeBlizzy();
        Allele.speciesDante = new BeeDante();
        Allele.speciesGelid = new BeeGelid();
        Allele.speciesPyro = new BeePyro();
        
        // Adorable Branch
        Allele.speciesEndearing = new BeeEndearing();
        Allele.speciesWinsome = new BeeWinsome();
        
        // Thermal Branch
        Allele.speciesBronze = new BeeBronze();
        Allele.speciesCoal = new BeeCoal();
        Allele.speciesDestabilized = new BeeDestabilized();
        Allele.speciesElectrum = new BeeElectrum();
        Allele.speciesInvar = new BeeInvar();
        Allele.speciesLux = new BeeLux();
        Allele.speciesNickel = new BeeNickel();
        Allele.speciesPlatinum = new BeePlatinum(); */
        
    	/**
    	 * ---- Bee Mutation(s) ----
    	 * 
    	 */
  	
    	// Common Mutation
    	new Mutation(Allele.speciesMystical, Allele.speciesForest, Allele.templateCommon, 15);
    	new Mutation(Allele.speciesSorcerous, Allele.speciesMeadows, Allele.templateCommon, 15);
    	new Mutation(Allele.speciesUnusual, Allele.speciesModest, Allele.templateCommon, 15);
    	new Mutation(Allele.speciesAttuned, Allele.speciesWintry, Allele.templateCommon, 15);
    	
    	// Cultivated Mutation
    	new Mutation(Allele.speciesMystical, Allele.speciesCommon, Allele.templateCultivated, 12);
    	new Mutation(Allele.speciesSorcerous, Allele.speciesCommon, Allele.templateCultivated, 12);
    	new Mutation(Allele.speciesUnusual, Allele.speciesCommon, Allele.templateCultivated, 12);
    	new Mutation(Allele.speciesAttuned, Allele.speciesCommon, Allele.templateCultivated, 12);
    	
    	// Eldritch Mutation
    	new Mutation(Allele.speciesMystical, Allele.speciesCultivated, Allele.speciesEldritch, 12);
    	new Mutation(Allele.speciesSorcerous, Allele.speciesCultivated, Allele.speciesEldritch, 12);
    	new Mutation(Allele.speciesUnusual, Allele.speciesCultivated, Allele.speciesEldritch, 12);
    	new Mutation(Allele.speciesAttuned, Allele.speciesCultivated, Allele.speciesEldritch, 12);
    	
    	// Esoteric Mutation
    	new Mutation(Allele.speciesCultivated, Allele.speciesEldritch, Allele.speciesEsoteric, 10);
    	
    	// Mysterious Mutation
    	new Mutation(Allele.speciesEldritch, Allele.speciesEsoteric, Allele.speciesMysterious, 8);
    	
    	// Arcane Mutation (Moon Phase)
    	new Mutation(Allele.speciesEsoteric, Allele.speciesMysterious, Allele.speciesArcane, 8);
    	
    	// Charmed Mutation
    	new Mutation(Allele.speciesCultivated, Allele.speciesEldritch, Allele.speciesCharmed, 10);
    	
    	// Enchanted Mutation
    	new Mutation(Allele.speciesEldritch, Allele.speciesCharmed, Allele.speciesEnchanted, 8);
    	
    	// Supernatural (Moon Phase)
    	new Mutation(Allele.speciesCharmed, Allele.speciesEnchanted, Allele.speciesSupernatural, 8);

    	// Ethereal Mutation
    	new Mutation(Allele.speciesArcane, Allele.speciesSupernatural, Allele.speciesEthereal, 7);
    	
    	// Windy Mutation
    	new Mutation(Allele.speciesSupernatural, Allele.speciesEthereal, Allele.speciesWinden.getGenome(), 14).setOreDictEntry("treeLeaves");

    	// Water Mutation
    	new Mutation(Allele.speciesSupernatural, Allele.speciesEthereal, Allele.speciesWatern.getGenome(), 14).setRequiredBlock(Blocks.water);
    	
    	// Fire Mutation
    	new Mutation(Allele.speciesSupernatural, Allele.speciesEthereal, Allele.speciesFiren.getGenome(), 14).setRequiredBlock(Blocks.lava);
    	
    	// Earth Mutation
    	new Mutation(Allele.speciesSupernatural, Allele.speciesEthereal, Allele.speciesEarthen.getGenome(), 14).setRequiredBlock(Blocks.brick_block);
    	
    	// Aware Mutation
    	new Mutation(Allele.speciesEthereal, Allele.speciesAttuned, Allele.speciesAware, 10);
    	
    	// Spirit Mutation
    	new Mutation(Allele.speciesEthereal, Allele.speciesAware, Allele.speciesSpirit, 8);
    	new Mutation(Allele.speciesAttuned, Allele.speciesAware, Allele.speciesSpirit, 8);
    	
    	// Soul Mutation
    	new Mutation(Allele.speciesAware, Allele.speciesSpirit, Allele.speciesSoul, 7);
    	
    	// Pupil Mutation
    	new Mutation(Allele.speciesMonastic, Allele.speciesArcane, Allele.speciesPupil, 10);
    	
    	// Scholarly Mutation
    	new Mutation(Allele.speciesArcane, Allele.speciesPupil, Allele.speciesScholarly, 8);

    	// Savant Mutation
    	new Mutation(Allele.speciesPupil, Allele.speciesScholarly, Allele.speciesSavant, 6);
    	
     	// Timely Mutation
    	new Mutation(Allele.speciesImperial, Allele.speciesEthereal, Allele.speciesTimely, 8);
    	
    	// Lordly Mutation
    	new Mutation(Allele.speciesImperial, Allele.speciesTimely, Allele.speciesLordly, 8);
    	
    	// Doctoral Mutation
    	new Mutation(Allele.speciesTimely, Allele.speciesLordly, Allele.speciesDoctoral, 7);
    	
    	// Hateful Mutation
    	new Mutation(Allele.speciesInfernal, Allele.speciesEldritch, Allele.speciesHateful, 9).setBiome(Type.NETHER);
    	
    	// Spiteful Mutation
    	new Mutation(Allele.speciesInfernal, Allele.speciesHateful, Allele.speciesSpiteful, 7).setBiome(Type.NETHER);
    	
    	// Withering Mutation
    	new Mutation(Allele.speciesDemonic, Allele.speciesSpiteful, Allele.speciesWithering, 6).setBiome(Type.NETHER);
    	
    	// Skulking Mutation
    	new Mutation(Allele.speciesModest, Allele.speciesEldritch, Allele.speciesSkulking, 12);
    	
    	// Spidery Mutation
    	new Mutation(Allele.speciesTropical, Allele.speciesSkulking, Allele.speciesSpidery, 10);
    	
    	// Ghastly Mutation
    	new Mutation(Allele.speciesSkulking, Allele.speciesEthereal, Allele.speciesGhastly, 9);
    	
    	// Smouldering Mutation
    	new Mutation(Allele.speciesSkulking, Allele.speciesHateful, Allele.speciesSmouldering, 7).setBiome(Type.NETHER);
    	
    	// Nameless Mutation
    	new Mutation(Allele.speciesEthereal, Allele.speciesOblivion, Allele.speciesNameless, 10);
    	
    	// Abandoned Mutation
    	new Mutation(Allele.speciesOblivion, Allele.speciesNameless, Allele.speciesAbandoned, 8);
    	
    	// Forlorn Mutation
    	new Mutation(Allele.speciesNameless, Allele.speciesAbandoned, Allele.speciesForlorn, 6);
    	
    	// Draconic Mutation
    	new Mutation(Allele.speciesImperial, Allele.speciesAbandoned, Allele.speciesDraconic, 6).setBiome(Type.END);
        
    	
		// ---- Hive Registration --------------
		HiveManager.put(Defaults.MOD + "curious", new HiveCurious(5));
		HiveManager.put(Defaults.MOD + "unusual", new HiveUnusual(5));
		HiveManager.put(Defaults.MOD + "resonant", new HiveResonant(5));
		HiveManager.put(Defaults.MOD + "deep", new HiveDeep(5));
		HiveManager.put(Defaults.MOD + "infernal", new HiveInfernal(15));
		HiveManager.put(Defaults.MOD + "oblivion", new HiveOblivion(20));
		
	}

	public static IBeeRoot getRoot() {
		return root;
	}
	
}
