package net.mcreator.creativeworld.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.creativeworld.init.CreativeWorldModItems;

public class Alargebucketofwater9KazhdyiTikVRukieProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getItem() == CreativeWorldModItems.ALARGEBUCKETOFWATER_9.get()) {
			itemstack.getOrCreateTag().putDouble("mb", 10000);
			itemstack.getOrCreateTag().putString("fluid_full_name", "minecraft:water_bucket");
		} else if (itemstack.getItem() == CreativeWorldModItems.A_LARGE_BUCKET_OF_FLUID_9.get()) {
			itemstack.getOrCreateTag().putDouble("mb", 10000);
			itemstack.getOrCreateTag().putString("fluid_full_name", "minecraft:lava_bucket");
		}
	}
}
