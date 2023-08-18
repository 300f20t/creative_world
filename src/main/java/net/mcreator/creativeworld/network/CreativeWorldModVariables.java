package net.mcreator.creativeworld.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.creativeworld.CreativeWorldMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeWorldModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		CreativeWorldMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.QT_1 = original.QT_1;
			clone.QT_2 = original.QT_2;
			clone.first_QT_ID_x = original.first_QT_ID_x;
			clone.seckond_QT_ID_x = original.seckond_QT_ID_x;
			clone.first_QT_ID_y = original.first_QT_ID_y;
			clone.seckond_QT_ID_y = original.seckond_QT_ID_y;
			clone.first_QT_ID_z = original.first_QT_ID_z;
			clone.seckond_QT_ID_z = original.seckond_QT_ID_z;
			if (!event.isWasDeath()) {
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("creative_world", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean QT_1 = false;
		public boolean QT_2 = false;
		public double first_QT_ID_x = 0;
		public double seckond_QT_ID_x = 0;
		public double first_QT_ID_y = 0;
		public double seckond_QT_ID_y = 0;
		public double first_QT_ID_z = 0;
		public double seckond_QT_ID_z = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				CreativeWorldMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("QT_1", QT_1);
			nbt.putBoolean("QT_2", QT_2);
			nbt.putDouble("first_QT_ID_x", first_QT_ID_x);
			nbt.putDouble("seckond_QT_ID_x", seckond_QT_ID_x);
			nbt.putDouble("first_QT_ID_y", first_QT_ID_y);
			nbt.putDouble("seckond_QT_ID_y", seckond_QT_ID_y);
			nbt.putDouble("first_QT_ID_z", first_QT_ID_z);
			nbt.putDouble("seckond_QT_ID_z", seckond_QT_ID_z);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			QT_1 = nbt.getBoolean("QT_1");
			QT_2 = nbt.getBoolean("QT_2");
			first_QT_ID_x = nbt.getDouble("first_QT_ID_x");
			seckond_QT_ID_x = nbt.getDouble("seckond_QT_ID_x");
			first_QT_ID_y = nbt.getDouble("first_QT_ID_y");
			seckond_QT_ID_y = nbt.getDouble("seckond_QT_ID_y");
			first_QT_ID_z = nbt.getDouble("first_QT_ID_z");
			seckond_QT_ID_z = nbt.getDouble("seckond_QT_ID_z");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.QT_1 = message.data.QT_1;
					variables.QT_2 = message.data.QT_2;
					variables.first_QT_ID_x = message.data.first_QT_ID_x;
					variables.seckond_QT_ID_x = message.data.seckond_QT_ID_x;
					variables.first_QT_ID_y = message.data.first_QT_ID_y;
					variables.seckond_QT_ID_y = message.data.seckond_QT_ID_y;
					variables.first_QT_ID_z = message.data.first_QT_ID_z;
					variables.seckond_QT_ID_z = message.data.seckond_QT_ID_z;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
