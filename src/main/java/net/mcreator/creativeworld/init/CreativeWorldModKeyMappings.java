
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import org.lwjgl.glfw.GLFW;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.KeyMapping;

import net.mcreator.creativeworld.network.ElectricjetpackcontrolMessage;
import net.mcreator.creativeworld.network.DrillModeSwitchMessage;
import net.mcreator.creativeworld.CreativeWorldMod;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

import com.mojang.blaze3d.platform.InputConstants;

public class CreativeWorldModKeyMappings {
	public static class CreativeWorldModKeyMapping extends KeyMapping {
		private boolean isDownOld;

		public CreativeWorldModKeyMapping(String string, int i, String string2) {
			super(string, InputConstants.Type.KEYSYM, i, string2);
		}

		public int action() {
			if (isDownOld != isDown() && isDown()) {
				isDownOld = isDown();
				return 1;
			} else if (isDownOld != isDown() && !isDown()) {
				isDownOld = isDown();
				return 2;
			}
			isDownOld = isDown();
			return 0;
		}
	}

	public static CreativeWorldModKeyMapping ELECTRICJETPACKCONTROL = (CreativeWorldModKeyMapping) KeyBindingHelper
			.registerKeyBinding(new CreativeWorldModKeyMapping("key.creative_world.electricjetpackcontrol", GLFW.GLFW_KEY_SPACE, "key.categories.misc"));
	public static CreativeWorldModKeyMapping DRILL_MODE_SWITCH = (CreativeWorldModKeyMapping) KeyBindingHelper.registerKeyBinding(new CreativeWorldModKeyMapping("key.creative_world.drill_mode_switch", GLFW.GLFW_KEY_M, "key.categories.misc"));

	public static void load() {
		ClientTickEvents.END_CLIENT_TICK.register((client) -> {
			int ELECTRICJETPACKCONTROLaction = ELECTRICJETPACKCONTROL.action();
			if (ELECTRICJETPACKCONTROLaction == 1) {
				ClientPlayNetworking.send(new ResourceLocation(CreativeWorldMod.MODID, "electricjetpackcontrol"), new ElectricjetpackcontrolMessage(true, false));
			} else if (ELECTRICJETPACKCONTROLaction == 2) {
				ClientPlayNetworking.send(new ResourceLocation(CreativeWorldMod.MODID, "electricjetpackcontrol"), new ElectricjetpackcontrolMessage(false, true));
			}
			int DRILL_MODE_SWITCHaction = DRILL_MODE_SWITCH.action();
			if (DRILL_MODE_SWITCHaction == 1) {
				ClientPlayNetworking.send(new ResourceLocation(CreativeWorldMod.MODID, "drill_mode_switch"), new DrillModeSwitchMessage(true, false));
			} else if (DRILL_MODE_SWITCHaction == 2) {
				ClientPlayNetworking.send(new ResourceLocation(CreativeWorldMod.MODID, "drill_mode_switch"), new DrillModeSwitchMessage(false, true));
			}
		});
	}
}
