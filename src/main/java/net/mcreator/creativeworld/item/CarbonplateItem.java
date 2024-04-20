
package net.mcreator.creativeworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CarbonplateItem extends Item {
	public CarbonplateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
