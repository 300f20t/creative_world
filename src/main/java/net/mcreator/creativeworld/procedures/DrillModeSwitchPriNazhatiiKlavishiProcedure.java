package net.mcreator.creativeworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.creativeworld.network.CreativeWorldModVariables;

public class DrillModeSwitchPriNazhatiiKlavishiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (CreativeWorldModVariables.MapVariables.get(world).drillMode == 2) {
			CreativeWorldModVariables.MapVariables.get(world).drillMode = 0;
			CreativeWorldModVariables.MapVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("1x1"), false);
		} else if (CreativeWorldModVariables.MapVariables.get(world).drillMode == 0) {
			CreativeWorldModVariables.MapVariables.get(world).drillMode = 1;
			CreativeWorldModVariables.MapVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("3x3"), false);
		} else {
			CreativeWorldModVariables.MapVariables.get(world).drillMode = 2;
			CreativeWorldModVariables.MapVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("5x5"), false);
		}
	}
}
