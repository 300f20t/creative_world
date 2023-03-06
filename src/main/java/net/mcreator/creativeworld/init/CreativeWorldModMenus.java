
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.creativeworld.world.inventory.MsrpmroMenu;
import net.mcreator.creativeworld.world.inventory.FgfhffhghkjkkytwqaMenu;
import net.mcreator.creativeworld.world.inventory.FdgdfMenu;
import net.mcreator.creativeworld.CreativeWorldMod;

public class CreativeWorldModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CreativeWorldMod.MODID);
	public static final RegistryObject<MenuType<MsrpmroMenu>> MSRPMRO = REGISTRY.register("msrpmro", () -> IForgeMenuType.create(MsrpmroMenu::new));
	public static final RegistryObject<MenuType<FdgdfMenu>> FDGDF = REGISTRY.register("fdgdf", () -> IForgeMenuType.create(FdgdfMenu::new));
	public static final RegistryObject<MenuType<FgfhffhghkjkkytwqaMenu>> FGFHFFHGHKJKKYTWQA = REGISTRY.register("fgfhffhghkjkkytwqa", () -> IForgeMenuType.create(FgfhffhghkjkkytwqaMenu::new));
}
