
package net.mcreator.creativeworld.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.creativeworld.init.CreativeWorldModItems;

public class BronzeSwordItem extends SwordItem {
	public BronzeSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 323;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CreativeWorldModItems.BRONZE_INGOT.get()));
			}
		}, 3, -3f, new Item.Properties());
	}
}
