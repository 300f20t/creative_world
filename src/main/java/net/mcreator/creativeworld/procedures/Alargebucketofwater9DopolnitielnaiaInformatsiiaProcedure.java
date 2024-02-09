package net.mcreator.creativeworld.procedures;

import net.minecraft.world.item.ItemStack;

public class Alargebucketofwater9DopolnitielnaiaInformatsiiaProcedure {
	public static String execute(ItemStack itemstack) {
		return new java.text.DecimalFormat("##.##").format(itemstack.getOrCreateTag().getDouble("mb")) + "/10000" + " " + itemstack.getOrCreateTag().getString("fluid_name");
	}
}
