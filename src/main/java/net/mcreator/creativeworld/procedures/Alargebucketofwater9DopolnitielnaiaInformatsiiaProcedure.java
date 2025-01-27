package net.mcreator.creativeworld.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;

public class Alargebucketofwater9DopolnitielnaiaInformatsiiaProcedure {
	public static String execute(ItemStack itemstack) {
		return new java.text.DecimalFormat("##.##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("mb")) + "/10000" + " "
				+ itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getString("fluid_name");
	}
}
