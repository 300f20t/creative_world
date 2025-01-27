package net.mcreator.creativeworld.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;
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
				&& ((itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("fluid_full_name")).equals("")
						|| (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("fluid_full_name")).equals(BuiltInRegistries.ITEM
								.getKey(((world.getFluidState(BlockPos.containing(sx, sy, sz)).createLegacyBlock()).getBlock() instanceof LiquidBlock _liquid ? new ItemStack(_liquid.fluid.getBucket()) : ItemStack.EMPTY).getItem()).toString())
						|| itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("mb") == 0)) {
			{
				final String _tagName = "mb";
				final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("mb") + 1000);
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			{
				final String _tagName = "fluid_full_name";
				final String _tagValue = (BuiltInRegistries.ITEM
						.getKey(((world.getFluidState(BlockPos.containing(sx, sy, sz)).createLegacyBlock()).getBlock() instanceof LiquidBlock _liquid ? new ItemStack(_liquid.fluid.getBucket()) : ItemStack.EMPTY).getItem()).toString());
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putString(_tagName, _tagValue));
			}
			{
				final String _tagName = "fluid_name";
				final String _tagValue = (((world.getFluidState(BlockPos.containing(sx, sy, sz)).createLegacyBlock()).getBlock() instanceof LiquidBlock _liquid ? new ItemStack(_liquid.fluid.getBucket()) : ItemStack.EMPTY).getDisplayName()
						.getString());
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putString(_tagName, _tagValue));
			}
			world.setBlock(BlockPos.containing(sx, sy, sz), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(sx, sy, sz))).getBlock() == Blocks.AIR || !(world.getFluidState(BlockPos.containing(sx, sy, sz)).createLegacyBlock()).getFluidState().isSource()) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("mb") != 0) {
				{
					final String _tagName = "mb";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("mb") - 1000);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
				world.setBlock(BlockPos.containing(sx, sy, sz),
						(BuiltInRegistries.ITEM
								.get(ResourceLocation.parse(((itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("fluid_full_name"))).toLowerCase(java.util.Locale.ENGLISH))) instanceof BucketItem _bucket
										? _bucket.content.defaultFluidState().createLegacyBlock()
										: Blocks.AIR.defaultBlockState()),
						3);
			}
		}
		if ((itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("fluid_full_name")).equals("minecraft:water_bucket")) {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("mb") != 0) {
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("mb") >= 10000) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(CreativeWorldModItems.ALARGEBUCKETOFWATER_9.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					{
						final String _tagName = "mb";
						final double _tagValue = 10000;
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
				}
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("mb") == 9000
						&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreativeWorldModItems.ALARGEBUCKETOFWATER_9.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(CreativeWorldModItems.ALARGEBUCKET.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					{
						final String _tagName = "mb";
						final double _tagValue = 9000;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "fluid_full_name";
						final String _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("fluid_full_name"));
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putString(_tagName, _tagValue));
					}
					{
						final String _tagName = "fluid_name";
						final String _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("fluid_name"));
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putString(_tagName, _tagValue));
					}
				}
			}
		} else {
			if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("mb") != 0) {
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("mb") >= 10000) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(CreativeWorldModItems.A_LARGE_BUCKET_OF_FLUID_9.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					{
						final String _tagName = "mb";
						final double _tagValue = 10000;
						CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
					}
				}
				if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("mb") == 9000
						&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreativeWorldModItems.A_LARGE_BUCKET_OF_FLUID_9.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(CreativeWorldModItems.ALARGEBUCKET.get()).copy();
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					{
						final String _tagName = "mb";
						final double _tagValue = 9000;
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
					}
					{
						final String _tagName = "fluid_full_name";
						final String _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("fluid_full_name"));
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putString(_tagName, _tagValue));
					}
					{
						final String _tagName = "fluid_name";
						final String _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("fluid_name"));
						CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putString(_tagName, _tagValue));
					}
				}
			}
		}
	}
}
