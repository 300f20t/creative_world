
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.creativeworld.world.inventory.MsrpmroMenu;
import net.mcreator.creativeworld.world.inventory.FgfhffhghkjkkytwqaMenu;
import net.mcreator.creativeworld.world.inventory.FdgdfMenu;
import net.mcreator.creativeworld.CreativeWorldMod;

public class CreativeWorldModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, CreativeWorldMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<MsrpmroMenu>> MSRPMRO = REGISTRY.register("msrpmro", () -> IMenuTypeExtension.create(MsrpmroMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FdgdfMenu>> FDGDF = REGISTRY.register("fdgdf", () -> IMenuTypeExtension.create(FdgdfMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FgfhffhghkjkkytwqaMenu>> FGFHFFHGHKJKKYTWQA = REGISTRY.register("fgfhffhghkjkkytwqa", () -> IMenuTypeExtension.create(FgfhffhghkjkkytwqaMenu::new));
}
