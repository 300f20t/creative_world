
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeWorldModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> ALLOWCREATIVEMODE = GameRules.register("allowcreativemode", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> ALLOW_CHEAT_ITEMS = GameRules.register("allowCheatItems", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
}
