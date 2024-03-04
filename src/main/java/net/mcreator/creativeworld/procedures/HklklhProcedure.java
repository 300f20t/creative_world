package net.mcreator.creativeworld.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.creativeworld.init.CreativeWorldModItems;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;

public class HklklhProcedure {
	public HklklhProcedure() {
		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			execute(handler.getPlayer());
		});
	}

	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		while (true) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == CreativeWorldModItems.ADVANCEDELECTRICJETPACK_CHESTPLATE) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue() >= 2500) {
					return true;
				}
			}
		}
		return false;
	}
}
