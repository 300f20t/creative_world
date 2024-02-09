package net.mcreator.creativeworld.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.creativeworld.network.CreativeWorldModVariables;

public class DrillModeSwitchPriNazhatiiKlavishiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).drillMode == 2) {
			{
				double _setval = 0;
				entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.drillMode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("1x1"), false);
		} else if ((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).drillMode == 0) {
			{
				double _setval = 1;
				entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.drillMode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("3x3"), false);
		} else {
			{
				double _setval = 2;
				entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.drillMode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("5x5"), false);
		}
	}
}
