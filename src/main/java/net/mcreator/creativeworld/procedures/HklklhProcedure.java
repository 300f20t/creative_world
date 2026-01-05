package net.mcreator.creativeworld.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.creativeworld.init.CreativeWorldModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class HklklhProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static boolean execute(Entity entity) {
		return execute(null, entity);
	}

	private static boolean execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == CreativeWorldModItems.ADVANCEDELECTRICJETPACK_CHESTPLATE.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue() >= 2500) {
				return true;
			}
		}
		return false;
	}
}