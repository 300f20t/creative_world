package net.mcreator.creativeworld.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.creativeworld.init.CreativeWorldModGameRules;

import javax.annotation.Nullable;

import java.util.Collections;

@Mod.EventBusSubscriber
public class LockcreativemoditemcraftingProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.getLevelData().getGameRules().getBoolean(CreativeWorldModGameRules.ALLOWCREATIVEMODE)) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.server.getRecipeManager().byKey(new ResourceLocation("xcdfvgbhnj"))
						.ifPresent(_rec -> _serverPlayer.resetRecipes(Collections.singleton(_rec)));
		}
		if (world.getLevelData().getGameRules().getBoolean(CreativeWorldModGameRules.ALLOWCREATIVEMODE)) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(new ResourceLocation[]{new ResourceLocation("xcdfvgbhnj")});
		}
	}
}
