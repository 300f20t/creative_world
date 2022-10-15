
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

public abstract class CreativiumArmorItem extends ArmorItem {
	public CreativiumArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 125;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{16, 48, 40, 16}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 72;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CreativeWorldModItems.CREATIVIUM_INGOT.get()));
			}

			@Override
			public String getName() {
				return "creativium_armor";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends CreativiumArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVE_WOR_1D));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "creative_world:textures/models/armor/creativium_layer_1.png";
		}
	}

	public static class Chestplate extends CreativiumArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVE_WOR_1D));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "creative_world:textures/models/armor/creativium_layer_1.png";
		}
	}

	public static class Leggings extends CreativiumArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVE_WOR_1D));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "creative_world:textures/models/armor/creativium_layer_2.png";
		}
	}

	public static class Boots extends CreativiumArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVE_WOR_1D));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "creative_world:textures/models/armor/creativium_layer_1.png";
		}
	}
}
