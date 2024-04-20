
package net.mcreator.creativeworld.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.creativeworld.init.CreativeWorldModItems;

public class AccumulatiumAxeItem extends AxeItem {
	public AccumulatiumAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1675;
			}

			public float getSpeed() {
				return 18f;
			}

			public float getAttackDamageBonus() {
				return 46f;
			}

			public int getLevel() {
				return 12;
			}

			public int getEnchantmentValue() {
				return 84;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CreativeWorldModItems.ACCUMULATIUM_INGOT.get()));
			}
		}, 1, -2.6f, new Item.Properties());
	}
}
