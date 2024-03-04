
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraft.world.level.GameRules;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;

public class CreativeWorldModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> ALLOWCREATIVEMODE;
	public static GameRules.Key<GameRules.BooleanValue> ALLOW_CHEAT_ITEMS;

	public static void load() {
		ALLOWCREATIVEMODE = GameRuleRegistry.register("allowcreativemode", GameRules.Category.PLAYER, GameRuleFactory.createBooleanRule(false));
		ALLOW_CHEAT_ITEMS = GameRuleRegistry.register("allow_cheat_items", GameRules.Category.PLAYER, GameRuleFactory.createBooleanRule(false));
	}
}
