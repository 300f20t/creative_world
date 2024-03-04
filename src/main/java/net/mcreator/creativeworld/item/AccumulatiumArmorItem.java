
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

public abstract class AccumulatiumArmorItem extends ArmorItem {
	public AccumulatiumArmorItem(Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 86;
			}

			@Override
			public int getDefenseForType(Type type) {
				return new int[]{10, 12, 12, 10}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 54;
			}

			@Override
			public SoundEvent getEquipSound() {
				return null;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CreativeWorldModItems.ACCUMULATIUM_INGOT));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "accumulatium";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.5f;
			}
		}, type, properties);
	}

	public static class Helmet extends AccumulatiumArmorItem {
		public Helmet() {
			super(Type.HELMET, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(CreativeWorldModTabs.TAB_CREATIVEWORLDCOMBAT).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
		}
	}

	public static class Chestplate extends AccumulatiumArmorItem {

		public Chestplate() {
			super(Type.CHESTPLATE, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(CreativeWorldModTabs.TAB_CREATIVEWORLDCOMBAT).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
		}
	}

	public static class Leggings extends AccumulatiumArmorItem {

		public Leggings() {
			super(Type.LEGGINGS, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(CreativeWorldModTabs.TAB_CREATIVEWORLDCOMBAT).register(content -> content.accept(this));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
		}
	}

	public static class Boots extends AccumulatiumArmorItem {

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
