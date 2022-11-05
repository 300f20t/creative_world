
package net.mcreator.creativeworld.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.creativeworld.init.CreativeWorldModTabs;
import net.mcreator.creativeworld.init.CreativeWorldModItems;

public abstract class Composite_plate_armorArmorItem extends ArmorItem {
	public Composite_plate_armorArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 24;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{8, 14, 16, 8}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 27;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CreativeWorldModItems.COMPOSITEPLATE.get()));
			}

			@Override
			public String getName() {
				return "composite_plate_armor_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends Composite_plate_armorArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVEWORLDCOMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "creative_world:textures/models/armor/composite_plate_armor_layer_1.png";
		}
	}

	public static class Chestplate extends Composite_plate_armorArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVEWORLDCOMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "creative_world:textures/models/armor/composite_plate_armor_layer_1.png";
		}
	}

	public static class Leggings extends Composite_plate_armorArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVEWORLDCOMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "creative_world:textures/models/armor/composite_plate_armor_layer_2.png";
		}
	}

	public static class Boots extends Composite_plate_armorArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVEWORLDCOMBAT));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "creative_world:textures/models/armor/composite_plate_armor_layer_1.png";
		}
	}
}
