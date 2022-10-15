
package net.mcreator.creativeworld.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.creativeworld.init.CreativeWorldModTabs;
import net.mcreator.creativeworld.init.CreativeWorldModItems;

public class AccumulatiumSwordItem extends SwordItem {
	public AccumulatiumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1675;
			}

			public float getSpeed() {
				return 18f;
			}

			public float getAttackDamageBonus() {
				return 34f;
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
		}, 3, -3f, new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVE_WOR_1D));
	}
}
