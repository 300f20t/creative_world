
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.creativeworld.block.entity.SolarpanelBlockEntity;
import net.mcreator.creativeworld.block.entity.InfinityenergyBlockEntity;
import net.mcreator.creativeworld.block.entity.FanBlockEntity;
import net.mcreator.creativeworld.block.entity.CrusherBlockEntity;
import net.mcreator.creativeworld.block.entity.CoalgeneratorBlockEntity;
import net.mcreator.creativeworld.block.entity.Coalgenerator1BlockEntity;
import net.mcreator.creativeworld.block.entity.BatteryblockBlockEntity;
import net.mcreator.creativeworld.CreativeWorldMod;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class CreativeWorldModBlockEntities {
	public static BlockEntityType<?> COALGENERATOR;
	public static BlockEntityType<?> CRUSHER;
	public static BlockEntityType<?> FAN;
	public static BlockEntityType<?> BATTERYBLOCK;
	public static BlockEntityType<?> SOLARPANEL;
	public static BlockEntityType<?> INFINITYENERGY;
	public static BlockEntityType<?> COALGENERATOR_1;

	public static void load() {
		COALGENERATOR = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(CreativeWorldMod.MODID, "coalgenerator"),
				FabricBlockEntityTypeBuilder.create(CoalgeneratorBlockEntity::new, CreativeWorldModBlocks.COALGENERATOR).build(null));
		CRUSHER = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(CreativeWorldMod.MODID, "crusher"), FabricBlockEntityTypeBuilder.create(CrusherBlockEntity::new, CreativeWorldModBlocks.CRUSHER).build(null));
		FAN = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(CreativeWorldMod.MODID, "fan"), FabricBlockEntityTypeBuilder.create(FanBlockEntity::new, CreativeWorldModBlocks.FAN).build(null));
		BATTERYBLOCK = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(CreativeWorldMod.MODID, "batteryblock"),
				FabricBlockEntityTypeBuilder.create(BatteryblockBlockEntity::new, CreativeWorldModBlocks.BATTERYBLOCK).build(null));
		SOLARPANEL = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(CreativeWorldMod.MODID, "solarpanel"), FabricBlockEntityTypeBuilder.create(SolarpanelBlockEntity::new, CreativeWorldModBlocks.SOLARPANEL).build(null));
		INFINITYENERGY = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(CreativeWorldMod.MODID, "infinityenergy"),
				FabricBlockEntityTypeBuilder.create(InfinityenergyBlockEntity::new, CreativeWorldModBlocks.INFINITYENERGY).build(null));
		COALGENERATOR_1 = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(CreativeWorldMod.MODID, "coalgenerator_1"),
				FabricBlockEntityTypeBuilder.create(Coalgenerator1BlockEntity::new, CreativeWorldModBlocks.COALGENERATOR_1).build(null));
	}
}
