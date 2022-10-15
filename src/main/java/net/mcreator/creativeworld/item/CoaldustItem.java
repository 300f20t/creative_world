
package net.mcreator.creativeworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.creativeworld.init.CreativeWorldModTabs;

public class CoaldustItem extends Item {
	public CoaldustItem() {
		super(new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVE_WOR_1D).stacksTo(64).rarity(Rarity.COMMON));
	}
}
