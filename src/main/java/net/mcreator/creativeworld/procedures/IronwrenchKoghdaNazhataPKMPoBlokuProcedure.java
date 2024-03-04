package net.mcreator.creativeworld.procedures;

import net.minecraft.world.level.block.Blocks;
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

public class IronwrenchKoghdaNazhataPKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreativeWorldModItems.IRONWRENCH) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CreativeWorldModBlocks.COALGENERATOR) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(CreativeWorldModBlocks.COALGENERATOR);
					_setstack.setCount(1);
					_player.getInventory().add(_setstack);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CreativeWorldModBlocks.CRUSHER) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(CreativeWorldModBlocks.CRUSHER);
					_setstack.setCount(1);
					_player.getInventory().add(_setstack);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CreativeWorldModBlocks.FAN) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(CreativeWorldModBlocks.FAN);
					_setstack.setCount(1);
					_player.getInventory().add(_setstack);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CreativeWorldModBlocks.BATTERYBLOCK) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(CreativeWorldModBlocks.BATTERYBLOCK);
					_setstack.setCount(1);
					_player.getInventory().add(_setstack);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CreativeWorldModBlocks.SOLARPANEL) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, RandomSource.create(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(CreativeWorldModBlocks.SOLARPANEL);
					_setstack.setCount(1);
					_player.getInventory().add(_setstack);
				}
			}
		}
	}
}
