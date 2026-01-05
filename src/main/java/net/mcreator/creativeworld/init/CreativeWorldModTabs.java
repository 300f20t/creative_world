/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.creativeworld.CreativeWorldMod;

public class CreativeWorldModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreativeWorldMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVEWORLDITEMS = REGISTRY.register("creativeworlditems",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.creative_world.creativeworlditems")).icon(() -> new ItemStack(CreativeWorldModItems.CARBONPLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreativeWorldModItems.ALARGEBUCKET.get());
				tabData.accept(CreativeWorldModItems.ALARGEBUCKETOFWATER_9.get());
				tabData.accept(CreativeWorldModItems.IRONPLATE.get());
				tabData.accept(CreativeWorldModItems.TIN_INGOT.get());
				tabData.accept(CreativeWorldModItems.TINPLATE.get());
				tabData.accept(CreativeWorldModItems.COPPERPLATE.get());
				tabData.accept(CreativeWorldModItems.THECOREOFTHEFORMATION.get());
				tabData.accept(CreativeWorldModItems.THECOREOFMATTER.get());
				tabData.accept(CreativeWorldModItems.CREATINGCORE.get());
				tabData.accept(CreativeWorldModItems.CRUSHEDIRONORE.get());
				tabData.accept(CreativeWorldModItems.CRUSHEDCOPPERORE.get());
				tabData.accept(CreativeWorldModItems.CRUSHEDTINORE.get());
				tabData.accept(CreativeWorldModItems.TINNUGGET.get());
				tabData.accept(CreativeWorldModItems.COPPERNUGGET.get());
				tabData.accept(CreativeWorldModItems.WASHEDCRUSHEDIRONORE.get());
				tabData.accept(CreativeWorldModItems.WASHEDCRUSHEDCOPPERORE.get());
				tabData.accept(CreativeWorldModItems.WASHEDCRUSHEDTINORE.get());
				tabData.accept(CreativeWorldModItems.CREATIVEMOD.get());
				tabData.accept(CreativeWorldModItems.LATEX.get());
				tabData.accept(CreativeWorldModItems.RUBBER.get());
				tabData.accept(CreativeWorldModItems.TINCOVER.get());
				tabData.accept(CreativeWorldModItems.OIL_BUCKET.get());
				tabData.accept(CreativeWorldModItems.GAS_BUCKET.get());
				tabData.accept(CreativeWorldModItems.RAWTIN.get());
				tabData.accept(CreativeWorldModItems.BRONZEDUST.get());
				tabData.accept(CreativeWorldModItems.BRONZE_INGOT.get());
				tabData.accept(CreativeWorldModItems.COALDUST.get());
				tabData.accept(CreativeWorldModItems.ELECTRICALCIRCUIT.get());
				tabData.accept(CreativeWorldModItems.CREATIVIUM_INGOT.get());
				tabData.accept(CreativeWorldModItems.ACCUMULATIUM_INGOT.get());
				tabData.accept(CreativeWorldModItems.CREATIVIUMNUGGET.get());
				tabData.accept(CreativeWorldModItems.ACCUMULATIUMNUGGET.get());
				tabData.accept(CreativeWorldModItems.CARBONPLATE.get());
				tabData.accept(CreativeWorldModItems.THECOREOFINVULNERABILITY.get());
				tabData.accept(CreativeWorldModItems.BRONZEPLATE.get());
				tabData.accept(CreativeWorldModItems.TITAN_INGOT.get());
				tabData.accept(CreativeWorldModItems.TITANPLATE.get());
				tabData.accept(CreativeWorldModItems.COMPOSITEPLATE.get());
				tabData.accept(CreativeWorldModItems.REEL.get());
				tabData.accept(CreativeWorldModItems.CREATIVEREEL.get());
				tabData.accept(CreativeWorldModItems.RAWTITAN.get());
				tabData.accept(CreativeWorldModBlocks.COPPER_WIRE.get().asItem());
				tabData.accept(CreativeWorldModBlocks.INSULATED_COPPER_WIRE.get().asItem());
				tabData.accept(CreativeWorldModItems.A_LARGE_BUCKET_OF_FLUID_9.get());
				tabData.accept(CreativeWorldModItems.BATTREY_0.get());
				tabData.accept(CreativeWorldModItems.BATTREY_1.get());
				tabData.accept(CreativeWorldModItems.BATTREY_2.get());
				tabData.accept(CreativeWorldModItems.BATTREY_3.get());
				tabData.accept(CreativeWorldModItems.ELECTRIC_MOTOR.get());
				tabData.accept(CreativeWorldModItems.CREATIVE_ELECTRIC_MOTOR.get());
			}).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVEWORLDTOOLS = REGISTRY.register("creativeworldtools",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.creative_world.creativeworldtools")).icon(() -> new ItemStack(CreativeWorldModItems.BEDROCKBREACKER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreativeWorldModItems.IRONWRENCH.get());
				tabData.accept(CreativeWorldModItems.IRONHAMMER.get());
				tabData.accept(CreativeWorldModItems.TIN_PICKAXE.get());
				tabData.accept(CreativeWorldModItems.TIN_AXE.get());
				tabData.accept(CreativeWorldModItems.TIN_SHOVEL.get());
				tabData.accept(CreativeWorldModItems.TIN_HOE.get());
				tabData.accept(CreativeWorldModItems.COPPER_PICKAXE.get());
				tabData.accept(CreativeWorldModItems.COPPER_AXE.get());
				tabData.accept(CreativeWorldModItems.COPPER_SHOVEL.get());
				tabData.accept(CreativeWorldModItems.COPPER_HOE.get());
				tabData.accept(CreativeWorldModItems.WIRECUTTERS.get());
				tabData.accept(CreativeWorldModItems.BEDROCKBREACKER.get());
				tabData.accept(CreativeWorldModItems.TAP.get());
				tabData.accept(CreativeWorldModItems.ENERGYDETECTOR.get());
				tabData.accept(CreativeWorldModItems.BRONZE_PICKAXE.get());
				tabData.accept(CreativeWorldModItems.BRONZE_AXE.get());
				tabData.accept(CreativeWorldModItems.BRONZE_SHOVEL.get());
				tabData.accept(CreativeWorldModItems.BRONZE_HOE.get());
				tabData.accept(CreativeWorldModItems.CREATIVIUM_PICKAXE.get());
				tabData.accept(CreativeWorldModItems.CREATIVIUM_AXE.get());
				tabData.accept(CreativeWorldModItems.CREATIVIUM_SHOVEL.get());
				tabData.accept(CreativeWorldModItems.CREATIVIUM_HOE.get());
				tabData.accept(CreativeWorldModItems.ACCUMULATIUM_PICKAXE.get());
				tabData.accept(CreativeWorldModItems.ACCUMULATIUM_AXE.get());
				tabData.accept(CreativeWorldModItems.ACCUMULATIUM_SHOVEL.get());
				tabData.accept(CreativeWorldModItems.ACCUMULATIUM_HOE.get());
				tabData.accept(CreativeWorldModItems.TITAN_PICKAXE.get());
				tabData.accept(CreativeWorldModItems.TITAN_AXE.get());
				tabData.accept(CreativeWorldModItems.TITAN_SHOVEL.get());
				tabData.accept(CreativeWorldModItems.TITAN_HOE.get());
				tabData.accept(CreativeWorldModItems.COMPOSITE_PLATE_TOOL_PICKAXE.get());
				tabData.accept(CreativeWorldModItems.COMPOSITE_PLATE_TOOL_AXE.get());
				tabData.accept(CreativeWorldModItems.COMPOSITE_PLATE_TOOL_SHOVEL.get());
				tabData.accept(CreativeWorldModItems.COMPOSITE_PLATE_TOOL_HOE.get());
				tabData.accept(CreativeWorldModItems.KEYCARD.get());
				tabData.accept(CreativeWorldModItems.DRILL.get());
				tabData.accept(CreativeWorldModItems.ADVANCEDDRILL.get());
				tabData.accept(CreativeWorldModItems.CREATIVEDRILL.get());
				tabData.accept(CreativeWorldModItems.IRON_MORTAR.get());
			}).withTabsBefore(CREATIVEWORLDITEMS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVEWORLDBLOCKS = REGISTRY.register("creativeworldblocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.creative_world.creativeworldblocks")).icon(() -> new ItemStack(CreativeWorldModBlocks.ADVENCEDMACHINECASE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreativeWorldModBlocks.MACHINECASE.get().asItem());
				tabData.accept(CreativeWorldModBlocks.TIN_ORE.get().asItem());
				tabData.accept(CreativeWorldModBlocks.TIN_BLOCK.get().asItem());
				tabData.accept(CreativeWorldModBlocks.RESIN_WOOD.get().asItem());
				tabData.accept(CreativeWorldModBlocks.RESIN_LOG.get().asItem());
				tabData.accept(CreativeWorldModBlocks.RESIN_PLANKS.get().asItem());
				tabData.accept(CreativeWorldModBlocks.RESIN_LEAVES.get().asItem());
				tabData.accept(CreativeWorldModBlocks.RESIN_STAIRS.get().asItem());
				tabData.accept(CreativeWorldModBlocks.RESIN_SLAB.get().asItem());
				tabData.accept(CreativeWorldModBlocks.RESIN_FENCE.get().asItem());
				tabData.accept(CreativeWorldModBlocks.RESIN_FENCE_GATE.get().asItem());
				tabData.accept(CreativeWorldModBlocks.RSINLOGWITHRESIN.get().asItem());
				tabData.accept(CreativeWorldModBlocks.BRONZE_BLOCK.get().asItem());
				tabData.accept(CreativeWorldModBlocks.ADVENCEDMACHINECASE.get().asItem());
				tabData.accept(CreativeWorldModBlocks.CREATIVIUM_ORE.get().asItem());
				tabData.accept(CreativeWorldModBlocks.CREATIVIUM_BLOCK.get().asItem());
				tabData.accept(CreativeWorldModBlocks.ACCUMULATIUM_ORE.get().asItem());
				tabData.accept(CreativeWorldModBlocks.ACCUMULATIUM_BLOCK.get().asItem());
				tabData.accept(CreativeWorldModBlocks.TITAN_ORE.get().asItem());
				tabData.accept(CreativeWorldModBlocks.TITAN_BLOCK.get().asItem());
				tabData.accept(CreativeWorldModBlocks.RESINTREESAPLING.get().asItem());
			}).withTabsBefore(CREATIVEWORLDTOOLS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATIVEWORLDCOMBAT = REGISTRY.register("creativeworldcombat",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.creative_world.creativeworldcombat")).icon(() -> new ItemStack(CreativeWorldModItems.CREATIVIUM_SWORD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreativeWorldModItems.TIN_SWORD.get());
				tabData.accept(CreativeWorldModItems.TIN_ARMOR_HELMET.get());
				tabData.accept(CreativeWorldModItems.TIN_ARMOR_CHESTPLATE.get());
				tabData.accept(CreativeWorldModItems.TIN_ARMOR_LEGGINGS.get());
				tabData.accept(CreativeWorldModItems.TIN_ARMOR_BOOTS.get());
				tabData.accept(CreativeWorldModItems.COPPER_SWORD.get());
				tabData.accept(CreativeWorldModItems.COPPER_ARMOR_HELMET.get());
				tabData.accept(CreativeWorldModItems.COPPER_ARMOR_CHESTPLATE.get());
				tabData.accept(CreativeWorldModItems.COPPER_ARMOR_LEGGINGS.get());
				tabData.accept(CreativeWorldModItems.COPPER_ARMOR_BOOTS.get());
				tabData.accept(CreativeWorldModItems.ELECTRICJETPACK_CHESTPLATE.get());
				tabData.accept(CreativeWorldModItems.BRONZE_SWORD.get());
				tabData.accept(CreativeWorldModItems.BRONZE_ARMOR_HELMET.get());
				tabData.accept(CreativeWorldModItems.BRONZE_ARMOR_CHESTPLATE.get());
				tabData.accept(CreativeWorldModItems.BRONZE_ARMOR_LEGGINGS.get());
				tabData.accept(CreativeWorldModItems.BRONZE_ARMOR_BOOTS.get());
				tabData.accept(CreativeWorldModItems.ADVANCEDELECTRICJETPACK_CHESTPLATE.get());
				tabData.accept(CreativeWorldModItems.CREATIVIUM_SWORD.get());
				tabData.accept(CreativeWorldModItems.CREATIVIUM_ARMOR_HELMET.get());
				tabData.accept(CreativeWorldModItems.CREATIVIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(CreativeWorldModItems.CREATIVIUM_ARMOR_LEGGINGS.get());
				tabData.accept(CreativeWorldModItems.CREATIVIUM_ARMOR_BOOTS.get());
				tabData.accept(CreativeWorldModItems.ACCUMULATIUM_SWORD.get());
				tabData.accept(CreativeWorldModItems.ACCUMULATIUM_ARMOR_HELMET.get());
				tabData.accept(CreativeWorldModItems.ACCUMULATIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(CreativeWorldModItems.ACCUMULATIUM_ARMOR_LEGGINGS.get());
				tabData.accept(CreativeWorldModItems.ACCUMULATIUM_ARMOR_BOOTS.get());
				tabData.accept(CreativeWorldModItems.TITAN_SWORD.get());
				tabData.accept(CreativeWorldModItems.TITAN_ARMOR_HELMET.get());
				tabData.accept(CreativeWorldModItems.TITAN_ARMOR_CHESTPLATE.get());
				tabData.accept(CreativeWorldModItems.TITAN_ARMOR_LEGGINGS.get());
				tabData.accept(CreativeWorldModItems.TITAN_ARMOR_BOOTS.get());
				tabData.accept(CreativeWorldModItems.COMPOSITE_PLATE_ARMOR_ARMOR_HELMET.get());
				tabData.accept(CreativeWorldModItems.COMPOSITE_PLATE_ARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(CreativeWorldModItems.COMPOSITE_PLATE_ARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(CreativeWorldModItems.COMPOSITE_PLATE_ARMOR_ARMOR_BOOTS.get());
				tabData.accept(CreativeWorldModItems.COMPOSITE_PLATE_TOOL_SWORD.get());
			}).withTabsBefore(CREATIVEWORLDBLOCKS.getId()).build());
}