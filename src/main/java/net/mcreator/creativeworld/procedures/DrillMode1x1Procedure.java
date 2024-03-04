package net.mcreator.creativeworld.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.creativeworld.network.CreativeWorldModVariables;

public class DrillMode1x1Procedure {
	public static boolean execute(LevelAccessor world) {
		if (CreativeWorldModVariables.MapVariables.get(world).drillMode == 0) {
			return true;
		}
		return false;
	}
}
