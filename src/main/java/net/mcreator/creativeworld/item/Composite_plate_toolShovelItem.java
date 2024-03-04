
package net.mcreator.creativeworld.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.creativeworld.init.CreativeWorldModTabs;
import net.mcreator.creativeworld.init.CreativeWorldModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class Composite_plate_toolShovelItem extends ShovelItem {
	public Composite_plate_toolShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 42;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(CreativeWorldModItems.COMPOSITEPLATE));
			}
		}, 1, -3f, new Item.Properties());
		ItemGroupEvents.modifyEntriesEvent(CreativeWorldModTabs.TAB_CREATIVEWORLDTOOLS).register(content -> content.accept(this));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
