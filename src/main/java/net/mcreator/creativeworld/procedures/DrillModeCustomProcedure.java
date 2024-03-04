package net.mcreator.creativeworld.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.creativeworld.network.CreativeWorldModVariables;

public class DrillModeCustomProcedure {
	public static boolean execute(LevelAccessor world) {
		if (CreativeWorldModVariables.MapVariables.get(world).drillMode == 2) {
			return true;
		}
		return false;
	}
}
