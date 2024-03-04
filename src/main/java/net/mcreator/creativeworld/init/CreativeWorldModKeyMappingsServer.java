
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.creativeworld.network.ElectricjetpackcontrolMessage;
import net.mcreator.creativeworld.network.DrillModeSwitchMessage;
import net.mcreator.creativeworld.CreativeWorldMod;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

public class CreativeWorldModKeyMappingsServer {
	public static void serverLoad() {
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(CreativeWorldMod.MODID, "electricjetpackcontrol"), ElectricjetpackcontrolMessage::apply);
		ServerPlayNetworking.registerGlobalReceiver(new ResourceLocation(CreativeWorldMod.MODID, "drill_mode_switch"), DrillModeSwitchMessage::apply);
	}
}
