package net.mcreator.creativeworld.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;

public class ThecoreoftheformationItem extends Item {
	public ThecoreoftheformationItem() {
		super(new Item.Properties().rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public SoundEvent getEatingSound() {
		return SoundEvents.EMPTY;
	}
}