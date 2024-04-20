
package net.mcreator.creativeworld.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.creativeworld.procedures.Alargebucketofwater9KazhdyiTikVRukieProcedure;
import net.mcreator.creativeworld.procedures.Alargebucketofwater9DopolnitielnaiaInformatsiiaProcedure;
import net.mcreator.creativeworld.procedures.AlargebucketPriShchielchkiePKMPoBlokuProcedure;

import java.util.List;

public class Alargebucketofwater9Item extends Item {
	public Alargebucketofwater9Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		Entity entity = itemstack.getEntityRepresentation();
		list.add(Component.literal(Alargebucketofwater9DopolnitielnaiaInformatsiiaProcedure.execute(itemstack)));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		AlargebucketPriShchielchkiePKMPoBlokuProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getClickedFace(), context.getPlayer(),
				context.getItemInHand());
		return InteractionResult.SUCCESS;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			Alargebucketofwater9KazhdyiTikVRukieProcedure.execute(itemstack);
	}
}
