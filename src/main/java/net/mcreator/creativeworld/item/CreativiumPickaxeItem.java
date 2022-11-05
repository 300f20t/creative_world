
package net.mcreator.creativeworld.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.creativeworld.init.CreativeWorldModTabs;
import net.mcreator.creativeworld.init.CreativeWorldModItems;

public class CreativiumPickaxeItem extends PickaxeItem {
	public CreativiumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4595;
			}

			public float getSpeed() {
				return 21f;
			}

			public float getAttackDamageBonus() {
				return 14f;
			}

			public int getLevel() {
				return 16;
			}

			public int getEnchantmentValue() {
				return 110;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CreativeWorldModItems.CREATIVIUM_INGOT.get()));
			}
		}, 1, -2.7999999999999998f, new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVEWORLDTOOLS).fireResistant());
	}
}
