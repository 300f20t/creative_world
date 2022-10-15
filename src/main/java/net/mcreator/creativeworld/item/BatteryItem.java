
package net.mcreator.creativeworld.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import net.mcreator.creativeworld.procedures.BatteryKoghdaPriedmietIzghotovlienpierieplavlienProcedure;
import net.mcreator.creativeworld.init.CreativeWorldModTabs;

public class BatteryItem extends Item {
	public BatteryItem() {
		super(new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVE_WOR_1D).durability(1001).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		BatteryKoghdaPriedmietIzghotovlienpierieplavlienProcedure.execute(itemstack);
	}
}
