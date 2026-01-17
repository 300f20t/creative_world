package net.mcreator.creativeworld.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
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
public class JetpackSystemProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		ItemStack armorPart = ItemStack.EMPTY;
		armorPart = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).copy();
		if (CreativeWorldModItems.ELECTRICJETPACK_CHESTPLATE.get() == armorPart.getItem()) {
			FlyJetpackSystemProcedure.execute(entity);
		} else if (CreativeWorldModItems.ADVANCEDELECTRICJETPACK_CHESTPLATE.get() == armorPart.getItem()) {
			FlyJetpackSystemProcedure.execute(entity);
		} else if (CreativeWorldModItems.CREATIVIUM_ARMOR_CHESTPLATE.get() == armorPart.getItem()) {
			FlyJetpackSystemProcedure.execute(entity);
		}
	}
}