
package net.mcreator.creativeworld.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.creativeworld.init.CreativeWorldModItems;

public class SdfghnItem extends Item {
	public SdfghnItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(100).saturationMod(100f).alwaysEat().meat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 64;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0f;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(CreativeWorldModItems.THECOREOFMATTER.get());
		super.finishUsingItem(itemstack, world, entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
