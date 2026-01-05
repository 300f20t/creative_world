package net.mcreator.creativeworld.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.creativeworld.init.CreativeWorldModGameRules;

import javax.annotation.Nullable;

import java.util.Collections;

@EventBusSubscriber
public class LockcreativemoditemcraftingProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.getLevelData().getGameRules().getBoolean(CreativeWorldModGameRules.ALLOWCREATIVEMODE)) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(ResourceLocation.parse("xcdfvgbhnj")).ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
		}
		if (world.getLevelData().getGameRules().getBoolean(CreativeWorldModGameRules.ALLOWCREATIVEMODE)) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("xcdfvgbhnj")));
		}
	}
}