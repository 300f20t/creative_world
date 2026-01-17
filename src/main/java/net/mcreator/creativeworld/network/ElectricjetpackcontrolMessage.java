package net.mcreator.creativeworld.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;

import net.mcreator.creativeworld.CreativeWorldMod;

@EventBusSubscriber
public record ElectricjetpackcontrolMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<ElectricjetpackcontrolMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(CreativeWorldMod.MODID, "key_electricjetpackcontrol"));
	public static final StreamCodec<RegistryFriendlyByteBuf, ElectricjetpackcontrolMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ElectricjetpackcontrolMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new ElectricjetpackcontrolMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<ElectricjetpackcontrolMessage> type() {
		return TYPE;
	}

	public static void handleData(final ElectricjetpackcontrolMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CreativeWorldMod.addNetworkMessage(ElectricjetpackcontrolMessage.TYPE, ElectricjetpackcontrolMessage.STREAM_CODEC, ElectricjetpackcontrolMessage::handleData);
	}
}