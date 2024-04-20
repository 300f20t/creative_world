package net.mcreator.creativeworld.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.creativeworld.network.CreativeWorldModVariables;

public class QTclear2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			CreativeWorldModVariables.PlayerVariables _vars = entity.getData(CreativeWorldModVariables.PLAYER_VARIABLES);
			_vars.QT_2 = false;
			_vars.syncPlayerVariables(entity);
		}
	}
}
