package net.mcreator.creativeworld.network;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents;

public class CreativeWorldModVariables {
	public static void SyncJoin() {
		ServerEntityEvents.ENTITY_LOAD.register((entity, world) -> {
			if (entity instanceof Player) {
				if (!world.isClientSide()) {
					SavedData mapdata = MapVariables.get(world);
					SavedData worlddata = WorldVariables.get(world);
				}
			}
		});
	}

	public static void SyncChangeWorld() {
		ServerEntityWorldChangeEvents.AFTER_PLAYER_CHANGE_WORLD.register((player, origin, destination) -> {
			if (!destination.isClientSide()) {
				SavedData worlddata = WorldVariables.get(destination);
			}
		});
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "creative_world_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "creative_world_mapvars";
		public boolean QT_1 = false;
		public boolean QT_2 = false;
		public double first_QT_ID_x = 0;
		public double seckond_QT_ID_x = 0;
		public double first_QT_ID_y = 0;
		public double seckond_QT_ID_y = 0;
		public double first_QT_ID_z = 0;
		public double seckond_QT_ID_z = 0;
		public double crusherIndex = 0.0;
		public double drillMode = 1.0;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			QT_1 = nbt.getBoolean("QT_1");
			QT_2 = nbt.getBoolean("QT_2");
			first_QT_ID_x = nbt.getDouble("first_QT_ID_x");
			seckond_QT_ID_x = nbt.getDouble("seckond_QT_ID_x");
			first_QT_ID_y = nbt.getDouble("first_QT_ID_y");
			seckond_QT_ID_y = nbt.getDouble("seckond_QT_ID_y");
			first_QT_ID_z = nbt.getDouble("first_QT_ID_z");
			seckond_QT_ID_z = nbt.getDouble("seckond_QT_ID_z");
			crusherIndex = nbt.getDouble("crusherIndex");
			drillMode = nbt.getDouble("drillMode");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("QT_1", QT_1);
			nbt.putBoolean("QT_2", QT_2);
			nbt.putDouble("first_QT_ID_x", first_QT_ID_x);
			nbt.putDouble("seckond_QT_ID_x", seckond_QT_ID_x);
			nbt.putDouble("first_QT_ID_y", first_QT_ID_y);
			nbt.putDouble("seckond_QT_ID_y", seckond_QT_ID_y);
			nbt.putDouble("first_QT_ID_z", first_QT_ID_z);
			nbt.putDouble("seckond_QT_ID_z", seckond_QT_ID_z);
			nbt.putDouble("crusherIndex", crusherIndex);
			nbt.putDouble("drillMode", drillMode);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.level().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}
	}
}
