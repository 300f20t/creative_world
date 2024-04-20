
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.creativeworld.block.entity.SolarpanelBlockEntity;
import net.mcreator.creativeworld.block.entity.InfinityenergyBlockEntity;
import net.mcreator.creativeworld.block.entity.FanBlockEntity;
import net.mcreator.creativeworld.block.entity.CrusherBlockEntity;
import net.mcreator.creativeworld.block.entity.CoalgeneratorBlockEntity;
import net.mcreator.creativeworld.block.entity.Coalgenerator1BlockEntity;
import net.mcreator.creativeworld.block.entity.BatteryblockBlockEntity;
import net.mcreator.creativeworld.CreativeWorldMod;

public class CreativeWorldModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CreativeWorldMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> COALGENERATOR = register("coalgenerator", CreativeWorldModBlocks.COALGENERATOR, CoalgeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRUSHER = register("crusher", CreativeWorldModBlocks.CRUSHER, CrusherBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COALGENERATOR_1 = register("coalgenerator_1", CreativeWorldModBlocks.COALGENERATOR_1, Coalgenerator1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SOLARPANEL = register("solarpanel", CreativeWorldModBlocks.SOLARPANEL, SolarpanelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FAN = register("fan", CreativeWorldModBlocks.FAN, FanBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BATTERYBLOCK = register("batteryblock", CreativeWorldModBlocks.BATTERYBLOCK, BatteryblockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> INFINITYENERGY = register("infinityenergy", CreativeWorldModBlocks.INFINITYENERGY, InfinityenergyBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
