package net.mcreator.creativeworld.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.creativeworld.init.CreativeWorldModItems;

public class RtyuklProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (CreativeWorldModItems.CREATIVEMOD.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem()) {
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.CREATIVE);
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		}
	}
}
