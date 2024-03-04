
package net.mcreator.creativeworld.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.creativeworld.init.CreativeWorldModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class BronzeplateItem extends Item {
	public BronzeplateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
		ItemGroupEvents.modifyEntriesEvent(CreativeWorldModTabs.TAB_CREATIVEWORLDITEMS).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
