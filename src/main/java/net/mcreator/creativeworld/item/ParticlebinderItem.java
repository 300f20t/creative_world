
package net.mcreator.creativeworld.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.creativeworld.procedures.Quantumteleporterblock2NaBlokieNazhataPravaiaKnopkaMyshiProcedure;

public class ParticlebinderItem extends Item {
	public ParticlebinderItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		Quantumteleporterblock2NaBlokieNazhataPravaiaKnopkaMyshiProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
