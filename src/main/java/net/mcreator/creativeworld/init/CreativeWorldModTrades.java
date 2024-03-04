
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.creativeworld.init;

import org.jetbrains.annotations.NotNull;

import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;

public class CreativeWorldModTrades {
	public static void registerTrades() {
		TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 1, factories -> {
			factories.add(new BasicTrade(new ItemStack(Items.EMERALD), ItemStack.EMPTY, new ItemStack(CreativeWorldModItems.RUBBER, 5), 10, 5, 0.05f));
		});
	}

	private record BasicTrade(ItemStack price, ItemStack price2, ItemStack offer, int maxTrades, int xp, float priceMult) implements VillagerTrades.ItemListing {
		@Override
		public @NotNull MerchantOffer getOffer(Entity entity, RandomSource random) {
			return new MerchantOffer(price, price2, offer, maxTrades, xp, priceMult);
		}
	}
}
