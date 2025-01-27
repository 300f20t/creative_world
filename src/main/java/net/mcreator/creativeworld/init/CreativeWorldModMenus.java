
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.ComponentSerialization;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.registries.Registries;

import net.mcreator.creativeworld.world.inventory.MsrpmroMenu;
import net.mcreator.creativeworld.world.inventory.FgfhffhghkjkkytwqaMenu;
import net.mcreator.creativeworld.world.inventory.FdgdfMenu;
import net.mcreator.creativeworld.CreativeWorldMod;

import javax.annotation.Nullable;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CreativeWorldModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, CreativeWorldMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<MsrpmroMenu>> MSRPMRO = REGISTRY.register("msrpmro", () -> IMenuTypeExtension.create(MsrpmroMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FdgdfMenu>> FDGDF = REGISTRY.register("fdgdf", () -> IMenuTypeExtension.create(FdgdfMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FgfhffhghkjkkytwqaMenu>> FGFHFFHGHKJKKYTWQA = REGISTRY.register("fgfhffhghkjkkytwqa", () -> IMenuTypeExtension.create(FgfhffhghkjkkytwqaMenu::new));

	public static void setText(String boxname, String value, @Nullable ServerPlayer player) {
		if (player != null) {
			PacketDistributor.sendToPlayer(player, new GuiSyncMessage(boxname, value));
		} else {
			PacketDistributor.sendToAllPlayers(new GuiSyncMessage(boxname, value));
		}
	}

	public static record GuiSyncMessage(String editbox, String value) implements CustomPacketPayload {
		public static final Type<GuiSyncMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(CreativeWorldMod.MODID, "gui_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, GuiSyncMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, GuiSyncMessage message) -> {
			ComponentSerialization.TRUSTED_STREAM_CODEC.encode(buffer, Component.literal(message.editbox));
			ComponentSerialization.TRUSTED_STREAM_CODEC.encode(buffer, Component.literal(message.value));
		}, (RegistryFriendlyByteBuf buffer) -> {
			String editbox = ComponentSerialization.TRUSTED_STREAM_CODEC.decode(buffer).getString();
			String value = ComponentSerialization.TRUSTED_STREAM_CODEC.decode(buffer).getString();
			return new GuiSyncMessage(editbox, value);
		});

		@Override
		public Type<GuiSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final GuiSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND) {
				context.enqueueWork(() -> {
					CreativeWorldModScreens.handleTextBoxMessage(message);
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		CreativeWorldMod.addNetworkMessage(GuiSyncMessage.TYPE, GuiSyncMessage.STREAM_CODEC, GuiSyncMessage::handleData);
	}
}
