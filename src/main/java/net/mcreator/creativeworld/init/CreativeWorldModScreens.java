
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.Minecraft;

import net.mcreator.creativeworld.init.CreativeWorldModMenus.GuiSyncMessage;
import net.mcreator.creativeworld.client.gui.MsrpmroScreen;
import net.mcreator.creativeworld.client.gui.FgfhffhghkjkkytwqaScreen;
import net.mcreator.creativeworld.client.gui.FdgdfScreen;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeWorldModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(CreativeWorldModMenus.MSRPMRO.get(), MsrpmroScreen::new);
		event.register(CreativeWorldModMenus.FDGDF.get(), FdgdfScreen::new);
		event.register(CreativeWorldModMenus.FGFHFFHGHKJKKYTWQA.get(), FgfhffhghkjkkytwqaScreen::new);
	}

	static void handleTextBoxMessage(GuiSyncMessage message) {
		String editbox = message.editbox();
		String value = message.value();
		Screen currentScreen = Minecraft.getInstance().screen;
		if (currentScreen instanceof WidgetScreen sc) {
			HashMap<String, Object> widgets = sc.getWidgets();
			Object obj = widgets.get("text:" + editbox);
			if (obj instanceof EditBox box) {
				box.setValue(value);
			}
		}
	}

	public interface WidgetScreen {
		HashMap<String, Object> getWidgets();
	}
}
