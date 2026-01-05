package net.mcreator.creativeworld.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.creativeworld.init.CreativeWorldModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class BlackscreenOtobrazhatOvierlieiVIghrieProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
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