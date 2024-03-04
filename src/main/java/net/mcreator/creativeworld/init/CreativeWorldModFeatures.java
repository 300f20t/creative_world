
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.creativeworld.world.features.configurations.StructureFeatureConfiguration;
import net.mcreator.creativeworld.world.features.StructureFeature;
import net.mcreator.creativeworld.block.TitanOreBlock;
import net.mcreator.creativeworld.block.TinOreBlock;
import net.mcreator.creativeworld.block.CreativiumOreBlock;
import net.mcreator.creativeworld.block.AccumulatiumOreBlock;
import net.mcreator.creativeworld.CreativeWorldMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class CreativeWorldModFeatures {
	public static void load() {
		register("tin_ore", new OreFeature(OreConfiguration.CODEC), TinOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("titan_ore", new OreFeature(OreConfiguration.CODEC), TitanOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("accumulatium_ore", new OreFeature(OreConfiguration.CODEC), AccumulatiumOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("creativium_ore", new OreFeature(OreConfiguration.CODEC), CreativiumOreBlock.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(CreativeWorldMod.MODID, "structure_feature"), new StructureFeature(StructureFeatureConfiguration.CODEC));
	}

	public static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(CreativeWorldMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(CreativeWorldMod.MODID, registryName)));
	}
}
