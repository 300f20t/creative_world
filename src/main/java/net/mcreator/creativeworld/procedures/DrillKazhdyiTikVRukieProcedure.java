package net.mcreator.creativeworld.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.creativeworld.init.CreativeWorldModItems;

public class DrillKazhdyiTikVRukieProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreativeWorldModItems.CREATIVEDRILL.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreativeWorldModItems.ADVANCEDDRILL.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreativeWorldModItems.DRILL.get()) {
			return true;
		}
		return false;
	}
}
