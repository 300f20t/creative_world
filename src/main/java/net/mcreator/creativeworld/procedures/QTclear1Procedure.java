package net.mcreator.creativeworld.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.creativeworld.network.CreativeWorldModVariables;

public class QTclear1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.QT_1 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
