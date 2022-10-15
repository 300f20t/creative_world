package net.mcreator.creativeworld.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;

import net.mcreator.creativeworld.init.CreativeWorldModItems;
import net.mcreator.creativeworld.init.CreativeWorldModBlocks;

public class TapKoghdaNazhataPKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CreativeWorldModBlocks.RSINLOGWITHRESIN.get()) {
			world.setBlock(new BlockPos(x, y, z), CreativeWorldModBlocks.RESIN_LOG.get().defaultBlockState(), 3);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(CreativeWorldModItems.LATEX.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		}
	}
}
