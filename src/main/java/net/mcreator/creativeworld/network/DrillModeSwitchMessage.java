
package net.mcreator.creativeworld.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;

import net.mcreator.creativeworld.procedures.DrillModeSwitchPriNazhatiiKlavishiProcedure;
import net.mcreator.creativeworld.CreativeWorldMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record DrillModeSwitchMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<DrillModeSwitchMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(CreativeWorldMod.MODID, "key_drill_mode_switch"));
	public static final StreamCodec<RegistryFriendlyByteBuf, DrillModeSwitchMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, DrillModeSwitchMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new DrillModeSwitchMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<DrillModeSwitchMessage> type() {
		return TYPE;
	}

	public static void handleData(final DrillModeSwitchMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				pressAction(context.player(), message.eventType, message.pressedms);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			DrillModeSwitchPriNazhatiiKlavishiProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CreativeWorldMod.addNetworkMessage(DrillModeSwitchMessage.TYPE, DrillModeSwitchMessage.STREAM_CODEC, DrillModeSwitchMessage::handleData);
	}
}
