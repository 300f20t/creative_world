
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.creativeworld.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@EventBusSubscriber
public class CreativeWorldModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.LEATHERWORKER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(CreativeWorldModItems.RUBBER.get(), 2), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CreativeWorldModItems.CREATIVIUM_INGOT.get()), new ItemStack(Items.EMERALD, 64), 10, 5, 0.05f));
		}
	}
}
