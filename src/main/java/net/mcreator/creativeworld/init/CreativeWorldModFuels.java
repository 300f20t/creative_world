
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class CreativeWorldModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == CreativeWorldModItems.THECOREOFMATTER.get())
			event.setBurnTime(1000000000);
		else if (itemstack.getItem() == CreativeWorldModBlocks.GAS.get().asItem())
			event.setBurnTime(128000);
		else if (itemstack.getItem() == CreativeWorldModBlocks.OIL.get().asItem())
			event.setBurnTime(100000);
	}
}
