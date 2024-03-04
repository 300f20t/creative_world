
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.creativeworld.world.inventory.MsrpmroMenu;
import net.mcreator.creativeworld.world.inventory.FgfhffhghkjkkytwqaMenu;
import net.mcreator.creativeworld.world.inventory.FdgdfMenu;
import net.mcreator.creativeworld.CreativeWorldMod;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

public class CreativeWorldModMenus {
	public static MenuType<MsrpmroMenu> MSRPMRO;
	public static MenuType<FdgdfMenu> FDGDF;
	public static MenuType<FgfhffhghkjkkytwqaMenu> FGFHFFHGHKJKKYTWQA;

	public static void load() {
		MSRPMRO = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(CreativeWorldMod.MODID, "msrpmro"), new ExtendedScreenHandlerType<>(MsrpmroMenu::new));
		MsrpmroMenu.screenInit();
		FDGDF = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(CreativeWorldMod.MODID, "fdgdf"), new ExtendedScreenHandlerType<>(FdgdfMenu::new));
		FdgdfMenu.screenInit();
		FGFHFFHGHKJKKYTWQA = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(CreativeWorldMod.MODID, "fgfhffhghkjkkytwqa"), new ExtendedScreenHandlerType<>(FgfhffhghkjkkytwqaMenu::new));
		FgfhffhghkjkkytwqaMenu.screenInit();
	}
}
