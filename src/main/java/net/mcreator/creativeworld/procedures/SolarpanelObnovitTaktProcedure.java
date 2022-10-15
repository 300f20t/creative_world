package net.mcreator.creativeworld.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicBoolean;

public class SolarpanelObnovitTaktProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.canSeeSkyFromBelowWater(new BlockPos(x, y, z)) && world instanceof Level _lvl && _lvl.isDay() && new Object() {
			public boolean canExtractEnergy(LevelAccessor level, BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.UP).ifPresent(capability -> _retval.set(capability.canExtract()));
				return _retval.get();
			}
		}.canExtractEnergy(world, new BlockPos(x, y - 1, z))) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y - 1, z));
				int _amount = 100;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z - 1));
				int _amount = 100;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.NORTH).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z + 1));
				int _amount = 100;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.SOUTH).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x - 1, y, z));
				int _amount = 100;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.WEST).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x + 1, y, z));
				int _amount = 100;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.EAST).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
	}
}
