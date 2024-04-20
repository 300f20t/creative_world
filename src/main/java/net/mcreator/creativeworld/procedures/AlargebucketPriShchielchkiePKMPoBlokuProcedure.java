package net.mcreator.creativeworld.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.creativeworld.init.CreativeWorldModItems;

public class AlargebucketPriShchielchkiePKMPoBlokuProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity, ItemStack itemstack) {
		if (direction == null || entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = x;
		sy = y;
		sz = z;
		if (direction == Direction.EAST) {
			sx = x + 1;
		} else if (direction == Direction.WEST) {
			sx = x - 1;
		} else if (direction == Direction.UP) {
			sy = y + 1;
		} else if (direction == Direction.DOWN) {
			sy = y - 1;
		} else if (direction == Direction.SOUTH) {
			sz = z + 1;
		} else if (direction == Direction.NORTH) {
			sz = z - 1;
		}
		if (((world.getBlockState(BlockPos.containing(sx, sy, sz))).getBlock() instanceof LiquidBlock || !((world.getBlockState(BlockPos.containing(sx, sy, sz))).getBlock() == Blocks.AIR))
				&& (world.getFluidState(BlockPos.containing(sx, sy, sz)).createLegacyBlock()).getFluidState().isSource()
				&& ((itemstack.getOrCreateTag().getString("fluid_full_name")).equals("")
						|| (itemstack.getOrCreateTag().getString("fluid_full_name")).equals(ForgeRegistries.ITEMS
								.getKey(((world.getFluidState(BlockPos.containing(sx, sy, sz)).createLegacyBlock()).getBlock() instanceof LiquidBlock _liquid ? new ItemStack(_liquid.getFluid().getBucket()) : ItemStack.EMPTY).getItem()).toString())
						|| itemstack.getOrCreateTag().getDouble("mb") == 0)) {
			itemstack.getOrCreateTag().putDouble("mb", (itemstack.getOrCreateTag().getDouble("mb") + 1000));
			itemstack.getOrCreateTag().putString("fluid_full_name", (ForgeRegistries.ITEMS
					.getKey(((world.getFluidState(BlockPos.containing(sx, sy, sz)).createLegacyBlock()).getBlock() instanceof LiquidBlock _liquid ? new ItemStack(_liquid.getFluid().getBucket()) : ItemStack.EMPTY).getItem()).toString()));
			itemstack.getOrCreateTag().putString("fluid_name",
					(((world.getFluidState(BlockPos.containing(sx, sy, sz)).createLegacyBlock()).getBlock() instanceof LiquidBlock _liquid ? new ItemStack(_liquid.getFluid().getBucket()) : ItemStack.EMPTY).getDisplayName().getString()));
			world.setBlock(BlockPos.containing(sx, sy, sz), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(sx, sy, sz))).getBlock() == Blocks.AIR || !(world.getFluidState(BlockPos.containing(sx, sy, sz)).createLegacyBlock()).getFluidState().isSource()) {
			if (itemstack.getOrCreateTag().getDouble("mb") != 0) {
				itemstack.getOrCreateTag().putDouble("mb", (itemstack.getOrCreateTag().getDouble("mb") - 1000));
				world.setBlock(BlockPos.containing(sx, sy, sz),
						(ForgeRegistries.ITEMS.getValue(new ResourceLocation(((itemstack.getOrCreateTag().getString("fluid_full_name"))).toLowerCase(java.util.Locale.ENGLISH))) instanceof BucketItem _bucket
								? _bucket.getFluid().defaultFluidState().createLegacyBlock()
								: Blocks.AIR.defaultBlockState()),
						3);
			}
		}
		if ((itemstack.getOrCreateTag().getString("fluid_full_name")).equals("minecraft:water_bucket")) {
			if (itemstack.getOrCreateTag().getDouble("mb") != 0) {
				if (itemstack.getOrCreateTag().getDouble("mb") >= 10000) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(CreativeWorldModItems.ALARGEBUCKETOFWATER_9.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					itemstack.getOrCreateTag().putDouble("mb", 10000);
				}
				if (itemstack.getOrCreateTag().getDouble("mb") == 9000 && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreativeWorldModItems.ALARGEBUCKETOFWATER_9.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(CreativeWorldModItems.ALARGEBUCKET.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("mb", 9000);
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("fluid_full_name", (itemstack.getOrCreateTag().getString("fluid_full_name")));
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("fluid_name", (itemstack.getOrCreateTag().getString("fluid_name")));
				}
			}
		} else {
			if (itemstack.getOrCreateTag().getDouble("mb") != 0) {
				if (itemstack.getOrCreateTag().getDouble("mb") >= 10000) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(CreativeWorldModItems.A_LARGE_BUCKET_OF_FLUID_9.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					itemstack.getOrCreateTag().putDouble("mb", 10000);
				}
				if (itemstack.getOrCreateTag().getDouble("mb") == 9000 && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreativeWorldModItems.A_LARGE_BUCKET_OF_FLUID_9.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(CreativeWorldModItems.ALARGEBUCKET.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("mb", 9000);
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("fluid_full_name", (itemstack.getOrCreateTag().getString("fluid_full_name")));
					(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("fluid_name", (itemstack.getOrCreateTag().getString("fluid_name")));
				}
			}
		}
	}
}
