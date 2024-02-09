package net.mcreator.creativeworld.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicBoolean;

public class WireEnergyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (new Object() {
			public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(world, BlockPos.containing(x + 1, y, z))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("input_direction", 1);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if (new Object() {
			public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(world, BlockPos.containing(x - 1, y, z))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("input_direction", 2);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if (new Object() {
			public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(world, BlockPos.containing(x, y + 1, z))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("input_direction", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if (new Object() {
			public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(world, BlockPos.containing(x, y - 1, z))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("input_direction", 4);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if (new Object() {
			public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(world, BlockPos.containing(x, y, z + 1))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("input_direction", 5);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if (new Object() {
			public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(world, BlockPos.containing(x, y, z - 1))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("input_direction", 6);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("input_direction", 0);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (new Object() {
			public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(world, BlockPos.containing(x + 1, y, z))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("output_direction", 1);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if (new Object() {
			public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(world, BlockPos.containing(x - 1, y, z))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("output_direction", 2);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if (new Object() {
			public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(world, BlockPos.containing(x, y + 1, z))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("output_direction", 3);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if (new Object() {
			public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(world, BlockPos.containing(x, y - 1, z))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("output_direction", 4);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if (new Object() {
			public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(world, BlockPos.containing(x, y, z + 1))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("output_direction", 5);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if (new Object() {
			public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(world, BlockPos.containing(x, y, z - 1))) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("output_direction", 6);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("output_direction", 0);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
