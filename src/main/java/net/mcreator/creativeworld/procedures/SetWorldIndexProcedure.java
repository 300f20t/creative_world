package net.mcreator.creativeworld.procedures;

import net.mcreator.creativeworld.network.CreativeWorldModVariables;

public class SetWorldIndexProcedure {
	public static void execute() {
		CreativeWorldModVariables.worldIndex = CreativeWorldModVariables.worldIndex + 1;
	}
}
