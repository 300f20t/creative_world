
package net.mcreator.creativeworld.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.network.chat.Component;

import net.mcreator.creativeworld.init.CreativeWorldModTabs;
import net.mcreator.creativeworld.init.CreativeWorldModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;

import java.lang.reflect.Type;

public abstract class Composite_plate_armorArmorItem extends ArmorItem {
	public Composite_plate_armorArmorItem(Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 35;
			}

			@Override
			public int getDefenseForType(Type type) {
				return new int[]{3, 5, 7, 3}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 20;
			}

			@Override
			public SoundEvent getEquipSound() {
				return null;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CreativeWorldModItems.COMPOSITEPLATE));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "composite_plate_armor";
			}

			@Override
			public float getToughness() {
				return 2.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, type, properties);
	}

	public static class Helmet extends Composite_plate_armorArmorItem {
		public Helmet() {
			super(Type.HELMET, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(CreativeWorldModTabs.TAB_CREATIVEWORLDCOMBAT).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
		}
	}

	public static class Chestplate extends Composite_plate_armorArmorItem {

		public Chestplate() {
			super(Type.CHESTPLATE, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(CreativeWorldModTabs.TAB_CREATIVEWORLDCOMBAT).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
		}
	}

	public static class Leggings extends Composite_plate_armorArmorItem {

		public Leggings() {
			super(Type.LEGGINGS, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(CreativeWorldModTabs.TAB_CREATIVEWORLDCOMBAT).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
		}
	}

	public static class Boots extends Composite_plate_armorArmorItem {

		public Boots() {
			super(Type.BOOTS, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(CreativeWorldModTabs.TAB_CREATIVEWORLDCOMBAT).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
		}
	}
}
