package net.mcreator.creativeworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.creativeworld.network.CreativeWorldModVariables;

public class QTclearallProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CreativeWorldModVariables.MapVariables.get(world).QT_1 = false;
		CreativeWorldModVariables.MapVariables.get(world).syncData(world);
		CreativeWorldModVariables.MapVariables.get(world).QT_2 = false;
		CreativeWorldModVariables.MapVariables.get(world).syncData(world);
	}
}
