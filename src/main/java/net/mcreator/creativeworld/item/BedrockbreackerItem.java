
package net.mcreator.creativeworld.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.creativeworld.procedures.BedrockbreackerPriShchielchkiePravoiKnopkoiMyshiNaBlokieProcedure;
import net.mcreator.creativeworld.init.CreativeWorldModTabs;

import java.util.List;

public class BedrockbreackerItem extends PickaxeItem {
	public BedrockbreackerItem() {
		super(new Tier() {
			public int getUses() {
				return 5;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.CRYING_OBSIDIAN), new ItemStack(Items.DIAMOND));
			}
		}, 1, -2.4f, new Item.Properties().tab(CreativeWorldModTabs.TAB_CREATIVEWORLDTOOLS).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("destroy bedrock"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		BedrockbreackerPriShchielchkiePravoiKnopkoiMyshiNaBlokieProcedure.execute(context.getLevel(), context.getClickedPos().getX(),
				context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return retval;
	}
}
