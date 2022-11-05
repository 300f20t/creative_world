
package net.mcreator.creativeworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.creativeworld.init.CreativeWorldModTabs;

public class CreativiumnuggetItem extends Item {
	public CreativiumnuggetItem() {
		super(new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVEWORLDITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
