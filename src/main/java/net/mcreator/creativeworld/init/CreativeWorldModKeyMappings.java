/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.creativeworld.network.ElectricjetpackcontrolWMessage;
import net.mcreator.creativeworld.network.ElectricjetpackcontrolShiftMessage;
import net.mcreator.creativeworld.network.ElectricjetpackcontrolMessage;
import net.mcreator.creativeworld.network.DrillModeSwitchMessage;

@EventBusSubscriber(Dist.CLIENT)
public class CreativeWorldModKeyMappings {
	public static final KeyMapping ELECTRICJETPACKCONTROL = new KeyMapping("key.creative_world.electricjetpackcontrol", GLFW.GLFW_KEY_SPACE, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new ElectricjetpackcontrolMessage(0, 0));
				ElectricjetpackcontrolMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				ELECTRICJETPACKCONTROL_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ELECTRICJETPACKCONTROL_LASTPRESS);
				PacketDistributor.sendToServer(new ElectricjetpackcontrolMessage(1, dt));
				ElectricjetpackcontrolMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DRILL_MODE_SWITCH = new KeyMapping("key.creative_world.drill_mode_switch", GLFW.GLFW_KEY_M, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new DrillModeSwitchMessage(0, 0));
				DrillModeSwitchMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ELECTRICJETPACKCONTROL_SHIFT = new KeyMapping("key.creative_world.electricjetpackcontrol_shift", GLFW.GLFW_KEY_LEFT_SHIFT, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new ElectricjetpackcontrolShiftMessage(0, 0));
				ElectricjetpackcontrolShiftMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ELECTRICJETPACKCONTROL_W = new KeyMapping("key.creative_world.electricjetpackcontrol_w", GLFW.GLFW_KEY_W, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new ElectricjetpackcontrolWMessage(0, 0));
				ElectricjetpackcontrolWMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				ELECTRICJETPACKCONTROL_W_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - ELECTRICJETPACKCONTROL_W_LASTPRESS);
				PacketDistributor.sendToServer(new ElectricjetpackcontrolWMessage(1, dt));
				ElectricjetpackcontrolWMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping ELECTRICJETPACKCONTROL_A = new KeyMapping("key.creative_world.electricjetpackcontrol_a", GLFW.GLFW_KEY_A, "key.categories.movement");
	public static final KeyMapping ELECTRICJETPACKCONTROL_S = new KeyMapping("key.creative_world.electricjetpackcontrol_s", GLFW.GLFW_KEY_S, "key.categories.movement");
	public static final KeyMapping ELECTRICJETPACKCONTROL_D = new KeyMapping("key.creative_world.electricjetpackcontrol_d", GLFW.GLFW_KEY_D, "key.categories.movement");
	private static long ELECTRICJETPACKCONTROL_LASTPRESS = 0;
	private static long ELECTRICJETPACKCONTROL_W_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(ELECTRICJETPACKCONTROL);
		event.register(DRILL_MODE_SWITCH);
		event.register(ELECTRICJETPACKCONTROL_SHIFT);
		event.register(ELECTRICJETPACKCONTROL_W);
		event.register(ELECTRICJETPACKCONTROL_A);
		event.register(ELECTRICJETPACKCONTROL_S);
		event.register(ELECTRICJETPACKCONTROL_D);
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				ELECTRICJETPACKCONTROL.consumeClick();
				DRILL_MODE_SWITCH.consumeClick();
				ELECTRICJETPACKCONTROL_SHIFT.consumeClick();
				ELECTRICJETPACKCONTROL_W.consumeClick();
			}
		}
	}
}