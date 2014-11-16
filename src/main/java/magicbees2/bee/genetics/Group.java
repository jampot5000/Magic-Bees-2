package magicbees2.bee.genetics;

import java.util.ArrayList;

import cpw.mods.fml.common.registry.LanguageRegistry;
import forestry.api.genetics.AlleleManager;
import forestry.api.genetics.IAlleleSpecies;
import forestry.api.genetics.IClassification;
import forestry.api.genetics.IClassification.EnumClassLevel;

public enum Group implements IClassification
{
	VEILED("Veiled", "Velatapis"),
	ARCANE("Arcane", "Arcanapis"),
	SUPERNATURAL("Supernatural", "Occultapis"),
	SCHOLARLY("Scholarly", "Doctapis"),
	SKULKING("Skulking", "Malevolenapis"),
	MAGICAL("Magic", "Magicapis"),
	TIME("Time", "Tempestivapis"),
	SOUL("Soul", "Animapis"),
	
	ABOMINABLE("Abominable", "Detestabilapis"),
	EXTRINSIC("Extrinsic", "Extrarapis"),
	
	METALLIC("Metallic", "Metalliapis"),
	GEM("Gem", "Lapidapis"),
	TRANSMUTING("Transmuting", "Transmutapis"),
	
	// Thaumcraft
	FLESHY("Fleshy", "Carnosapis"),
	THAUMIC("Thaumic", "Thaumiapis"),
	
	
	ALCHEMICAL("Alchemical", "Alchimiapis"),
	
	ESSENTIAL("Essential", "Essentiapis"),
	
	THERMAL ("Thermal", "Thermametallic"),
	ADORABLE ("Adorable", "Amabilis"),

    BLOODY ("Bloody", "Sanguis")
	;
	
	private String uid;
	private String latin;
	
	
	private EnumClassLevel level;
	private IClassification parent;
	
	private ArrayList<IAlleleSpecies> species;
	
	private Group(String name, String scientific) {
		this.uid = "classification." + name.toLowerCase();
		this.latin = scientific;
		this.level = EnumClassLevel.GENUS;
		this.species = new ArrayList();
		this.parent = AlleleManager.alleleRegistry.getClassification("family.apidae");
		AlleleManager.alleleRegistry.registerClassification(this);
	}
	
	@Override
	public EnumClassLevel getLevel()
	{
		return this.level;
	}

	@Override
	public String getUID() {
		return this.uid;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getScientific() {
		return this.latin;
	}

	@Override
	public String getDescription() {
		return null;
	}

	@Override
	public IClassification[] getMemberGroups() {
		return null;
	}

	@Override
	public void addMemberGroup(IClassification group) {
		
	}

	@Override
	public IAlleleSpecies[] getMemberSpecies() {
		return this.species.toArray(new IAlleleSpecies[this.species.size()]);
	}

	@Override
	public void addMemberSpecies(IAlleleSpecies species) {
		if (!this.species.contains(species)) {
			this.species.add(species);
		}
	}

	@Override
	public IClassification getParent() {
		return this.parent;
	}

	@Override
	public void setParent(IClassification parent) {
		this.parent = parent;
	}

}
