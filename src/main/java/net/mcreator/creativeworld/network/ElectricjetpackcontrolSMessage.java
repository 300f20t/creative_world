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
public record ElectricjetpackcontrolSMessage(int eventType, int pressedms) implements CustomPacketPayload {
	public static final Type<ElectricjetpackcontrolSMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(CreativeWorldMod.MODID, "key_electricjetpackcontrol_s"));
	public static final StreamCodec<RegistryFriendlyByteBuf, ElectricjetpackcontrolSMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, ElectricjetpackcontrolSMessage message) -> {
		buffer.writeInt(message.eventType);
		buffer.writeInt(message.pressedms);
	}, (RegistryFriendlyByteBuf buffer) -> new ElectricjetpackcontrolSMessage(buffer.readInt(), buffer.readInt()));

	@Override
	public Type<ElectricjetpackcontrolSMessage> type() {
		return TYPE;
	}

	public static void handleData(final ElectricjetpackcontrolSMessage message, final IPayloadContext context) {
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
		CreativeWorldMod.addNetworkMessage(ElectricjetpackcontrolSMessage.TYPE, ElectricjetpackcontrolSMessage.STREAM_CODEC, ElectricjetpackcontrolSMessage::handleData);
	}
}