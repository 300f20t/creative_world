
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.creativeworld.client.gui.MsrpmroScreen;
import net.mcreator.creativeworld.client.gui.FgfhffhghkjkkytwqaScreen;
import net.mcreator.creativeworld.client.gui.FdgdfScreen;

public class CreativeWorldModScreens {
	public static void load() {
		MenuScreens.register(CreativeWorldModMenus.MSRPMRO, MsrpmroScreen::new);
		MenuScreens.register(CreativeWorldModMenus.FDGDF, FdgdfScreen::new);
		MenuScreens.register(CreativeWorldModMenus.FGFHFFHGHKJKKYTWQA, FgfhffhghkjkkytwqaScreen::new);
	}
}
