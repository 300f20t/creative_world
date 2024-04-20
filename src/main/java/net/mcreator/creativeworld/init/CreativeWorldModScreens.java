
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.creativeworld.client.gui.MsrpmroScreen;
import net.mcreator.creativeworld.client.gui.FgfhffhghkjkkytwqaScreen;
import net.mcreator.creativeworld.client.gui.FdgdfScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeWorldModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(CreativeWorldModMenus.MSRPMRO.get(), MsrpmroScreen::new);
		event.register(CreativeWorldModMenus.FDGDF.get(), FdgdfScreen::new);
		event.register(CreativeWorldModMenus.FGFHFFHGHKJKKYTWQA.get(), FgfhffhghkjkkytwqaScreen::new);
	}
}
