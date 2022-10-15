package net.mcreator.creativeworld.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;

public class BatteryKoghdaPriedmietIzghotovlienpierieplavlienProcedure {
	public static void execute(ItemStack itemstack) {
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1000, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
