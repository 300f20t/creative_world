
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.creativeworld.network.ElectricjetpackcontrolMessage;
import net.mcreator.creativeworld.CreativeWorldMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CreativeWorldModKeyMappings {
	public static final KeyMapping ELECTRICJETPACKCONTROL = new KeyMapping("key.creative_world.electricjetpackcontrol", GLFW.GLFW_KEY_SPACE,
			"key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CreativeWorldMod.PACKET_HANDLER.sendToServer(new ElectricjetpackcontrolMessage(0, 0));
				ElectricjetpackcontrolMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(ELECTRICJETPACKCONTROL);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				ELECTRICJETPACKCONTROL.consumeClick();
			}
		}
	}
}
