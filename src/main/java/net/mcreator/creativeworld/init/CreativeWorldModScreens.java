
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.creativeworld.client.gui.MsrpmroScreen;
import net.mcreator.creativeworld.client.gui.FgfhffhghkjkkytwqaScreen;
import net.mcreator.creativeworld.client.gui.FdgdfScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeWorldModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CreativeWorldModMenus.MSRPMRO.get(), MsrpmroScreen::new);
			MenuScreens.register(CreativeWorldModMenus.FDGDF.get(), FdgdfScreen::new);
			MenuScreens.register(CreativeWorldModMenus.FGFHFFHGHKJKKYTWQA.get(), FgfhffhghkjkkytwqaScreen::new);
		});
	}
}
