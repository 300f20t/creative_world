
package net.mcreator.creativeworld.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.creativeworld.procedures.EndlesswatersourceKoghdaNazhataPKMPoBlokuProcedure;
import net.mcreator.creativeworld.init.CreativeWorldModTabs;

import java.util.List;

public class EndlesswatersourceItem extends Item {
	public EndlesswatersourceItem() {
		super(new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVE_WOR_1D).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("infinity/infinity mb"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		EndlesswatersourceKoghdaNazhataPKMPoBlokuProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}
}
