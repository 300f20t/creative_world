package net.mcreator.creativeworld.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.creativeworld.init.CreativeWorldModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BlackscreenOtobrazhatOvierlieiVIghrieProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ());
		}
	}

	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return execute(null, world, x, y, z);
	}

	private static boolean execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CreativeWorldModBlocks.OIL.get()) {
			return true;
		}
		return false;
	}
}
