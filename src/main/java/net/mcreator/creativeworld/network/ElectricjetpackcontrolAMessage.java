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
public record ElectricjetpackcontrolAMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<ElectricjetpackcontrolAMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(CreativeWorldMod.MODID, "key_electricjetpackcontrol_a"));
	public static final StreamCodec<RegistryFriendlyByteBuf, ElectricjetpackcontrolAMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ElectricjetpackcontrolAMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new ElectricjetpackcontrolAMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<ElectricjetpackcontrolAMessage> type() {
		return TYPE;
	}

	public static void handleData(final ElectricjetpackcontrolAMessage message, final IPayloadContext context) {
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
		CreativeWorldMod.addNetworkMessage(ElectricjetpackcontrolAMessage.TYPE, ElectricjetpackcontrolAMessage.STREAM_CODEC, ElectricjetpackcontrolAMessage::handleData);
	}
}