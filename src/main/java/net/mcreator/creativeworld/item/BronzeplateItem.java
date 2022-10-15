
package net.mcreator.creativeworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.creativeworld.init.CreativeWorldModTabs;

public class BronzeplateItem extends Item {
	public BronzeplateItem() {
		super(new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVE_WOR_1D).stacksTo(64).rarity(Rarity.COMMON));
	}
}
