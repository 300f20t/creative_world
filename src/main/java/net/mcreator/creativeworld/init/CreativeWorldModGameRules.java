
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CreativeWorldModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> ALLOWCREATIVEMODE;
	public static GameRules.Key<GameRules.BooleanValue> ALLOW_CHEAT_ITEMS;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		ALLOWCREATIVEMODE = GameRules.register("allowcreativemode", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
		ALLOW_CHEAT_ITEMS = GameRules.register("allowCheatItems", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	}
}
