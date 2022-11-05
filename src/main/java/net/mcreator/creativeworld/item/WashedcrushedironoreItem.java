
package net.mcreator.creativeworld.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.creativeworld.init.CreativeWorldModTabs;

public class WashedcrushedironoreItem extends Item {
	public WashedcrushedironoreItem() {
		super(new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVEWORLDITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
