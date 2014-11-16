/*******************************************************************************
 * Copyright 2011-2014 SirSengir
 *
 * This work (the API) is licensed under the "MIT" License, see LICENSE.txt for details.
 ******************************************************************************/
package magicbees2.api.apiculture.hives;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import magicbees2.Defaults;
import magicbees2.api.apiculture.IHive;

public class HiveManager {

	/* LinkedHashMap to keep the insertion order of the hives. */
	private static final LinkedHashMap<String, IHive> hives = new LinkedHashMap<String, IHive>();
	
	/**
	 * Get a list of all hives.
	 * 
	 */
	public static ArrayList<IHive> getHives() {
		return new ArrayList<IHive>(hives.values());
	}

	/**
	 * Add new custom hives here to have them generate in the world.
	 * 
	 */
	public static void put(String hiveName, IHive hive) {
		if (hives.containsKey(hiveName))
			throw new IllegalArgumentException("Hive already exists with name: " + hiveName);
		hives.put(hiveName, hive);
	}

	/**
	 * Get an existing hive to add new IHiveDrop.
	 * 
	 */
	public static IHive get(String hiveName) {
		return hives.get(hiveName);
	}
	
	public static IHive getCuriousHive() { return get(Defaults.MOD + "curious"); }
	public static IHive getUnusualHive() { return get(Defaults.MOD + "unusual"); }
	public static IHive getResonantHive() { return get(Defaults.MOD + "resonant"); }
	public static IHive getDeepHive() { return get(Defaults.MOD + "deep"); }
	public static IHive getInfernal() { return get(Defaults.MOD + "infernal"); }
	public static IHive getOblivion() { return get(Defaults.MOD + "oblivion"); }
	
}

