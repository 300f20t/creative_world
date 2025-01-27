package net.mcreator.creativeworld.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;

import net.mcreator.creativeworld.init.CreativeWorldModItems;

public class Alargebucketofwater9KazhdyiTikVRukieProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getItem() == CreativeWorldModItems.ALARGEBUCKETOFWATER_9.get()) {
			{
				final String _tagName = "mb";
				final double _tagValue = 10000;
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			{
				final String _tagName = "fluid_full_name";
				final String _tagValue = "minecraft:water_bucket";
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putString(_tagName, _tagValue));
			}
		} else if (itemstack.getItem() == CreativeWorldModItems.A_LARGE_BUCKET_OF_FLUID_9.get()) {
			{
				final String _tagName = "mb";
				final double _tagValue = 10000;
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
			}
			{
				final String _tagName = "fluid_full_name";
				final String _tagValue = "minecraft:lava_bucket";
				CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putString(_tagName, _tagValue));
			}
		}
	}
}
