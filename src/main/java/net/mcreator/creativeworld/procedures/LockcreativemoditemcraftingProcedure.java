package net.mcreator.creativeworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.creativeworld.init.CreativeWorldModGameRules;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;

import java.util.Collections;

public class LockcreativemoditemcraftingProcedure {
	public LockcreativemoditemcraftingProcedure() {
		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			execute(handler.getPlayer().level(), handler.getPlayer());
		});
	}

	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		while (true) {
			if (!world.getLevelData().getGameRules().getBoolean(CreativeWorldModGameRules.ALLOWCREATIVEMODE)) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("xcdfvgbhnj")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
			}
			if (world.getLevelData().getGameRules().getBoolean(CreativeWorldModGameRules.ALLOWCREATIVEMODE)) {
				if (entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("xcdfvgbhnj")});
			}
		}
	}
}
