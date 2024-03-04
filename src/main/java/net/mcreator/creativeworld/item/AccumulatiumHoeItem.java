
package net.mcreator.creativeworld.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.network.chat.Component;

import net.mcreator.creativeworld.init.CreativeWorldModTabs;
import net.mcreator.creativeworld.init.CreativeWorldModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class AccumulatiumHoeItem extends HoeItem {
	public AccumulatiumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 3072;
			}

			public float getSpeed() {
				return 18f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 12;
			}

			public int getEnchantmentValue() {
				return 84;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CreativeWorldModItems.ACCUMULATIUM_INGOT));
			}
		}, 0, 8f, new Item.Properties());
		ItemGroupEvents.modifyEntriesEvent(CreativeWorldModTabs.TAB_CREATIVEWORLDTOOLS).register(content -> content.accept(this));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
