package net.mcreator.creativeworld.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;

import net.mcreator.creativeworld.procedures.CrushedcopperoreKoghdaNazhataPKMPoBlokuProcedure;

public class CrushedcopperoreItem extends Item {
	public CrushedcopperoreItem() {
		super(new Item.Properties());
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public SoundEvent getEatingSound() {
		return SoundEvents.EMPTY;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		CrushedcopperoreKoghdaNazhataPKMPoBlokuProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}