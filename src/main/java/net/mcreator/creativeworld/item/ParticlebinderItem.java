
package net.mcreator.creativeworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.creativeworld.init.CreativeWorldModTabs;

public class ParticlebinderItem extends Item {
	public ParticlebinderItem() {
		super(new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVEWORLDTOOLS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
