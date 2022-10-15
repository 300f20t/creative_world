
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeWorldModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(CreativeWorldModItems.THECOREOFMATTER.get(), 1f);
	}
}
