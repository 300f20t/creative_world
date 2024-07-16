
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.creativeworld.block.entity.SolarpanelBlockEntity;
import net.mcreator.creativeworld.block.entity.InfinityenergyBlockEntity;
import net.mcreator.creativeworld.block.entity.FanBlockEntity;
import net.mcreator.creativeworld.block.entity.CrusherBlockEntity;
import net.mcreator.creativeworld.block.entity.CoalgeneratorBlockEntity;
import net.mcreator.creativeworld.block.entity.Coalgenerator1BlockEntity;
import net.mcreator.creativeworld.block.entity.BatteryblockBlockEntity;
import net.mcreator.creativeworld.CreativeWorldMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeWorldModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, CreativeWorldMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> COALGENERATOR = register("coalgenerator", CreativeWorldModBlocks.COALGENERATOR, CoalgeneratorBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> CRUSHER = register("crusher", CreativeWorldModBlocks.CRUSHER, CrusherBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> COALGENERATOR_1 = register("coalgenerator_1", CreativeWorldModBlocks.COALGENERATOR_1, Coalgenerator1BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> SOLARPANEL = register("solarpanel", CreativeWorldModBlocks.SOLARPANEL, SolarpanelBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> FAN = register("fan", CreativeWorldModBlocks.FAN, FanBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BATTERYBLOCK = register("batteryblock", CreativeWorldModBlocks.BATTERYBLOCK, BatteryblockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> INFINITYENERGY = register("infinityenergy", CreativeWorldModBlocks.INFINITYENERGY, InfinityenergyBlockEntity::new);

	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, COALGENERATOR.get(), (blockEntity, side) -> ((CoalgeneratorBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, COALGENERATOR.get(), (blockEntity, side) -> ((CoalgeneratorBlockEntity) blockEntity).getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CRUSHER.get(), (blockEntity, side) -> ((CrusherBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, CRUSHER.get(), (blockEntity, side) -> ((CrusherBlockEntity) blockEntity).getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, COALGENERATOR_1.get(), (blockEntity, side) -> ((Coalgenerator1BlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, COALGENERATOR_1.get(), (blockEntity, side) -> ((Coalgenerator1BlockEntity) blockEntity).getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SOLARPANEL.get(), (blockEntity, side) -> ((SolarpanelBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, SOLARPANEL.get(), (blockEntity, side) -> ((SolarpanelBlockEntity) blockEntity).getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FAN.get(), (blockEntity, side) -> ((FanBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, FAN.get(), (blockEntity, side) -> ((FanBlockEntity) blockEntity).getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BATTERYBLOCK.get(), (blockEntity, side) -> ((BatteryblockBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, BATTERYBLOCK.get(), (blockEntity, side) -> ((BatteryblockBlockEntity) blockEntity).getEnergyStorage());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, INFINITYENERGY.get(), (blockEntity, side) -> ((InfinityenergyBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, INFINITYENERGY.get(), (blockEntity, side) -> ((InfinityenergyBlockEntity) blockEntity).getEnergyStorage());
	}
}
