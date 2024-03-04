
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.creativeworld.CreativeWorldMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class CreativeWorldModTabs {
	public static ResourceKey<CreativeModeTab> TAB_CREATIVEWORLDITEMS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(CreativeWorldMod.MODID, "creativeworlditems"));
	public static ResourceKey<CreativeModeTab> TAB_CREATIVEWORLDBLOCKS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(CreativeWorldMod.MODID, "creativeworldblocks"));
	public static ResourceKey<CreativeModeTab> TAB_CREATIVEWORLDTOOLS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(CreativeWorldMod.MODID, "creativeworldtools"));
	public static ResourceKey<CreativeModeTab> TAB_CREATIVEWORLDCOMBAT = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(CreativeWorldMod.MODID, "creativeworldcombat"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_CREATIVEWORLDITEMS,
				FabricItemGroup.builder().title(Component.translatable("item_group." + CreativeWorldMod.MODID + ".creativeworlditems")).icon(() -> new ItemStack(CreativeWorldModItems.CARBONPLATE)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_CREATIVEWORLDBLOCKS,
				FabricItemGroup.builder().title(Component.translatable("item_group." + CreativeWorldMod.MODID + ".creativeworldblocks")).icon(() -> new ItemStack(CreativeWorldModBlocks.ADVENCEDMACHINECASE)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_CREATIVEWORLDTOOLS,
				FabricItemGroup.builder().title(Component.translatable("item_group." + CreativeWorldMod.MODID + ".creativeworldtools")).icon(() -> new ItemStack(CreativeWorldModItems.BEDROCKBREACKER)).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_CREATIVEWORLDCOMBAT,
				FabricItemGroup.builder().title(Component.translatable("item_group." + CreativeWorldMod.MODID + ".creativeworldcombat")).icon(() -> new ItemStack(CreativeWorldModItems.CREATIVIUM_SWORD)).build());
	}
}
