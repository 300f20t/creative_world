package net.mcreator.creativeworld.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class BedrockbreackerPriShchielchkiePravoiKnopkoiMyshiNaBlokieProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (Blocks.BEDROCK == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = (new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock())).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
				});
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 40);
		}
		if (Blocks.COMMAND_BLOCK == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = (new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock())).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
				});
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 40);
		}
		if (Blocks.REPEATING_COMMAND_BLOCK == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = (new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock())).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
				});
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 40);
		}
		if (Blocks.CHAIN_COMMAND_BLOCK == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = (new ItemStack((world.getBlockState(BlockPos.containing(x, y, z))).getBlock())).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
				});
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 40);
		}
	}
}