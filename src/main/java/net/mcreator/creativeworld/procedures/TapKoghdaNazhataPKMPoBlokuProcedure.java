package net.mcreator.creativeworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.creativeworld.init.CreativeWorldModItems;
import net.mcreator.creativeworld.init.CreativeWorldModBlocks;

public class TapKoghdaNazhataPKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CreativeWorldModBlocks.RSINLOGWITHRESIN.get()) {
			world.setBlock(BlockPos.containing(x, y, z), CreativeWorldModBlocks.RESIN_LOG.get().defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + (entity.getX() - x) / 3), (y + (entity.getY() - y) / 3), (z + (entity.getZ() - z) / 3), new ItemStack(CreativeWorldModItems.LATEX.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			if (1 == Mth.nextInt(RandomSource.create(), 1, 2)) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + (entity.getX() - x) / 3), (y + (entity.getY() - y) / 3), (z + (entity.getZ() - z) / 3), new ItemStack(CreativeWorldModItems.LATEX.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (world instanceof ServerLevel _level) {
				itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
				});
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		}
	}
}