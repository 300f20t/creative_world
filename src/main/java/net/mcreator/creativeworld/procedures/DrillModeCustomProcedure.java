package net.mcreator.creativeworld.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.creativeworld.network.CreativeWorldModVariables;

public class DrillModeCustomProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(CreativeWorldModVariables.PLAYER_VARIABLES).drillMode == 2) {
			return true;
		}
		return false;
	}
}
