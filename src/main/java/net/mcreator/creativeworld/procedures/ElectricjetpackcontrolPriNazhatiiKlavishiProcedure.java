package net.mcreator.creativeworld.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.creativeworld.init.CreativeWorldModItems;

public class ElectricjetpackcontrolPriNazhatiiKlavishiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		while ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == CreativeWorldModItems.ELECTRICJETPACK_CHESTPLATE.get()) {
			entity.setDeltaMovement(new Vec3(0, 0.5, 0));
		}
	}
}