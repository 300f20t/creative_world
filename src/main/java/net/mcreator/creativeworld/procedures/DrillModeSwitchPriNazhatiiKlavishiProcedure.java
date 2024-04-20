package net.mcreator.creativeworld.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.creativeworld.network.CreativeWorldModVariables;

public class DrillModeSwitchPriNazhatiiKlavishiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(CreativeWorldModVariables.PLAYER_VARIABLES).drillMode == 2) {
			{
				CreativeWorldModVariables.PlayerVariables _vars = entity.getData(CreativeWorldModVariables.PLAYER_VARIABLES);
				_vars.drillMode = 0;
				_vars.syncPlayerVariables(entity);
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("1x1"), false);
		} else if (entity.getData(CreativeWorldModVariables.PLAYER_VARIABLES).drillMode == 0) {
			{
				CreativeWorldModVariables.PlayerVariables _vars = entity.getData(CreativeWorldModVariables.PLAYER_VARIABLES);
				_vars.drillMode = 1;
				_vars.syncPlayerVariables(entity);
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("3x3"), false);
		} else {
			{
				CreativeWorldModVariables.PlayerVariables _vars = entity.getData(CreativeWorldModVariables.PLAYER_VARIABLES);
				_vars.drillMode = 2;
				_vars.syncPlayerVariables(entity);
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("5x5"), false);
		}
	}
}
