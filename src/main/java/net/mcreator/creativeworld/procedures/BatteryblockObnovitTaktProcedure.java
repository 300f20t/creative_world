package net.mcreator.creativeworld.procedures;

import net.neoforged.neoforge.energy.IEnergyStorage;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class BatteryblockObnovitTaktProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double down = 0;
		double north = 0;
		double west = 0;
		double south = 0;
		double east = 0;
		if (new Object() {
			public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
				if (level instanceof ILevelExtension _ext) {
					IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.UP);
					if (_entityStorage != null)
						return _entityStorage.canReceive();
				}
				return false;
			}
		}.canReceiveEnergy(world, BlockPos.containing(x, y - 1, z))) {
			down = new Object() {
				public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					if (level instanceof ILevelExtension _ext) {
						IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, null);
						if (_entityStorage != null)
							return _entityStorage.extractEnergy(_amount, true);
					}
					return 0;
				}
			}.extractEnergySimulate(world, BlockPos.containing(x, y, z), 10000);
			down = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					if (level instanceof ILevelExtension _ext) {
						IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.UP);
						if (_entityStorage != null)
							return _entityStorage.receiveEnergy(_amount, true);
					}
					return 0;
				}
			}.receiveEnergySimulate(world, BlockPos.containing(x, y - 1, z), (int) down);
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
				if (_entityStorage != null)
					_entityStorage.extractEnergy((int) down, false);
			}
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y - 1, z), Direction.UP);
				if (_entityStorage != null)
					_entityStorage.receiveEnergy((int) down, false);
			}
		}
		if (new Object() {
			public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
				if (level instanceof ILevelExtension _ext) {
					IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.EAST);
					if (_entityStorage != null)
						return _entityStorage.canReceive();
				}
				return false;
			}
		}.canReceiveEnergy(world, BlockPos.containing(x - 1, y, z))) {
			west = new Object() {
				public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					if (level instanceof ILevelExtension _ext) {
						IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, null);
						if (_entityStorage != null)
							return _entityStorage.extractEnergy(_amount, true);
					}
					return 0;
				}
			}.extractEnergySimulate(world, BlockPos.containing(x, y, z), 10000);
			west = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					if (level instanceof ILevelExtension _ext) {
						IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.EAST);
						if (_entityStorage != null)
							return _entityStorage.receiveEnergy(_amount, true);
					}
					return 0;
				}
			}.receiveEnergySimulate(world, BlockPos.containing(x - 1, y, z), (int) west);
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
				if (_entityStorage != null)
					_entityStorage.extractEnergy((int) west, false);
			}
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x - 1, y, z), Direction.EAST);
				if (_entityStorage != null)
					_entityStorage.receiveEnergy((int) west, false);
			}
		}
		if (new Object() {
			public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
				if (level instanceof ILevelExtension _ext) {
					IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.WEST);
					if (_entityStorage != null)
						return _entityStorage.canReceive();
				}
				return false;
			}
		}.canReceiveEnergy(world, BlockPos.containing(x + 1, y, z))) {
			east = new Object() {
				public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					if (level instanceof ILevelExtension _ext) {
						IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, null);
						if (_entityStorage != null)
							return _entityStorage.extractEnergy(_amount, true);
					}
					return 0;
				}
			}.extractEnergySimulate(world, BlockPos.containing(x, y, z), 10000);
			east = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					if (level instanceof ILevelExtension _ext) {
						IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.WEST);
						if (_entityStorage != null)
							return _entityStorage.receiveEnergy(_amount, true);
					}
					return 0;
				}
			}.receiveEnergySimulate(world, BlockPos.containing(x + 1, y, z), (int) east);
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
				if (_entityStorage != null)
					_entityStorage.extractEnergy((int) east, false);
			}
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x + 1, y, z), Direction.WEST);
				if (_entityStorage != null)
					_entityStorage.receiveEnergy((int) east, false);
			}
		}
		if (new Object() {
			public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
				if (level instanceof ILevelExtension _ext) {
					IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.NORTH);
					if (_entityStorage != null)
						return _entityStorage.canReceive();
				}
				return false;
			}
		}.canReceiveEnergy(world, BlockPos.containing(x, y, z + 1))) {
			south = new Object() {
				public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					if (level instanceof ILevelExtension _ext) {
						IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, null);
						if (_entityStorage != null)
							return _entityStorage.extractEnergy(_amount, true);
					}
					return 0;
				}
			}.extractEnergySimulate(world, BlockPos.containing(x, y, z), 10000);
			south = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					if (level instanceof ILevelExtension _ext) {
						IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.NORTH);
						if (_entityStorage != null)
							return _entityStorage.receiveEnergy(_amount, true);
					}
					return 0;
				}
			}.receiveEnergySimulate(world, BlockPos.containing(x, y, z + 1), (int) south);
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
				if (_entityStorage != null)
					_entityStorage.extractEnergy((int) south, false);
			}
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z + 1), Direction.NORTH);
				if (_entityStorage != null)
					_entityStorage.receiveEnergy((int) south, false);
			}
		}
		if (new Object() {
			public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
				if (level instanceof ILevelExtension _ext) {
					IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.SOUTH);
					if (_entityStorage != null)
						return _entityStorage.canReceive();
				}
				return false;
			}
		}.canReceiveEnergy(world, BlockPos.containing(x, y, z - 1))) {
			north = new Object() {
				public int extractEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					if (level instanceof ILevelExtension _ext) {
						IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, null);
						if (_entityStorage != null)
							return _entityStorage.extractEnergy(_amount, true);
					}
					return 0;
				}
			}.extractEnergySimulate(world, BlockPos.containing(x, y, z), 10000);
			north = new Object() {
				public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
					if (level instanceof ILevelExtension _ext) {
						IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, pos, Direction.SOUTH);
						if (_entityStorage != null)
							return _entityStorage.receiveEnergy(_amount, true);
					}
					return 0;
				}
			}.receiveEnergySimulate(world, BlockPos.containing(x, y, z - 1), (int) north);
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z), null);
				if (_entityStorage != null)
					_entityStorage.extractEnergy((int) north, false);
			}
			if (world instanceof ILevelExtension _ext) {
				IEnergyStorage _entityStorage = _ext.getCapability(Capabilities.EnergyStorage.BLOCK, BlockPos.containing(x, y, z - 1), Direction.SOUTH);
				if (_entityStorage != null)
					_entityStorage.receiveEnergy((int) north, false);
			}
		}
	}
}
