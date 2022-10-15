
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

public abstract class AccumulatiumArmorItem extends ArmorItem {
	public AccumulatiumArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 90;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{12, 36, 30, 12}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 54;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CreativeWorldModItems.ACCUMULATIUM_INGOT.get()));
			}

			@Override
			public String getName() {
				return "accumulatium_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends AccumulatiumArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVE_WOR_1D));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "creative_world:textures/models/armor/accumulatium_layer_1.png";
		}
	}

	public static class Chestplate extends AccumulatiumArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVE_WOR_1D));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "creative_world:textures/models/armor/accumulatium_layer_1.png";
		}
	}

	public static class Leggings extends AccumulatiumArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVE_WOR_1D));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "creative_world:textures/models/armor/accumulatium_layer_2.png";
		}
	}

	public static class Boots extends AccumulatiumArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVE_WOR_1D));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "creative_world:textures/models/armor/accumulatium_layer_1.png";
		}
	}
}
