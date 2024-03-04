
package net.mcreator.creativeworld.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.BlockTags;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.creativeworld.procedures.CreativedrillPriRazrushieniiBlokaInstrumientomProcedure;
import net.mcreator.creativeworld.init.CreativeWorldModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class CreativedrillItem extends TieredItem {
	public CreativedrillItem() {
		super(new Tier() {
			public int getUses() {
				return 8192;
			}

			public float getSpeed() {
				return 25f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 16;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, new Item.Properties().fireResistant());
		ItemGroupEvents.modifyEntriesEvent(CreativeWorldModTabs.TAB_CREATIVEWORLDTOOLS).register(content -> content.accept(this));
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState blockstate) {
		int tier = 16;
		if (tier < 3 && blockstate.is(BlockTags.NEEDS_DIAMOND_TOOL)) {
			return false;
		} else if (tier < 2 && blockstate.is(BlockTags.NEEDS_IRON_TOOL)) {
			return false;
		} else {
			return tier < 1 && blockstate.is(BlockTags.NEEDS_STONE_TOOL)
					? false
					: (blockstate.is(BlockTags.MINEABLE_WITH_AXE) || blockstate.is(BlockTags.MINEABLE_WITH_HOE) || blockstate.is(BlockTags.MINEABLE_WITH_PICKAXE) || blockstate.is(BlockTags.MINEABLE_WITH_SHOVEL));
		}
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
		return 25f;
	}

	@Override
	public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
		if (equipmentSlot == EquipmentSlot.MAINHAND) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			builder.putAll(super.getDefaultAttributeModifiers(equipmentSlot));
			builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", 18f, AttributeModifier.Operation.ADDITION));
			builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", -2.6, AttributeModifier.Operation.ADDITION));
			return builder.build();
		}
		return super.getDefaultAttributeModifiers(equipmentSlot);
	}

	@Override
	public boolean hurtEnemy(ItemStack stack, LivingEntity entity, LivingEntity sourceentity) {
		stack.hurtAndBreak(2, sourceentity, i -> i.broadcastBreakEvent(EquipmentSlot.MAINHAND));
		return true;
	}

	@Override
	public boolean mineBlock(ItemStack stack, Level world, BlockState state, BlockPos pos, LivingEntity entity) {
		stack.hurtAndBreak(1, entity, i -> i.broadcastBreakEvent(EquipmentSlot.MAINHAND));
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		CreativedrillPriRazrushieniiBlokaInstrumientomProcedure.execute(world, x, y, z, entity);
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
