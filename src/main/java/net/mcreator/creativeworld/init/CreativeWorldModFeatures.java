
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.creativeworld.world.features.ores.TitanOreFeature;
import net.mcreator.creativeworld.world.features.ores.TinOreFeature;
import net.mcreator.creativeworld.world.features.ores.CreativiumOreFeature;
import net.mcreator.creativeworld.world.features.ores.AccumulatiumOreFeature;
import net.mcreator.creativeworld.world.features.RubbertreeFeature;
import net.mcreator.creativeworld.world.features.MediumoilmineFeature;
import net.mcreator.creativeworld.world.features.MediumgasmineFeature;
import net.mcreator.creativeworld.world.features.LittleoilmineFeature;
import net.mcreator.creativeworld.world.features.LittlegasmineFeature;
import net.mcreator.creativeworld.CreativeWorldMod;

@Mod.EventBusSubscriber
public class CreativeWorldModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CreativeWorldMod.MODID);
	public static final RegistryObject<Feature<?>> TIN_ORE = REGISTRY.register("tin_ore", TinOreFeature::feature);
	public static final RegistryObject<Feature<?>> RUBBERTREE = REGISTRY.register("rubbertree", RubbertreeFeature::feature);
	public static final RegistryObject<Feature<?>> LITTLEOILMINE = REGISTRY.register("littleoilmine", LittleoilmineFeature::feature);
	public static final RegistryObject<Feature<?>> MEDIUMOILMINE = REGISTRY.register("mediumoilmine", MediumoilmineFeature::feature);
	public static final RegistryObject<Feature<?>> LITTLEGASMINE = REGISTRY.register("littlegasmine", LittlegasmineFeature::feature);
	public static final RegistryObject<Feature<?>> MEDIUMGASMINE = REGISTRY.register("mediumgasmine", MediumgasmineFeature::feature);
	public static final RegistryObject<Feature<?>> CREATIVIUM_ORE = REGISTRY.register("creativium_ore", CreativiumOreFeature::feature);
	public static final RegistryObject<Feature<?>> ACCUMULATIUM_ORE = REGISTRY.register("accumulatium_ore", AccumulatiumOreFeature::feature);
	public static final RegistryObject<Feature<?>> TITAN_ORE = REGISTRY.register("titan_ore", TitanOreFeature::feature);
}
