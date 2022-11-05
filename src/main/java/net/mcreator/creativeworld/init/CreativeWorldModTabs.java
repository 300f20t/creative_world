
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CreativeWorldModTabs {
	public static CreativeModeTab TAB_CREATIVEWORLDITEMS;
	public static CreativeModeTab TAB_CREATIVEWORLDBLOCKS;
	public static CreativeModeTab TAB_CREATIVEWORLDTOOLS;
	public static CreativeModeTab TAB_CREATIVEWORLDCOMBAT;

	public static void load() {
		TAB_CREATIVEWORLDITEMS = new CreativeModeTab("tabcreativeworlditems") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CreativeWorldModItems.CARBONPLATE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CREATIVEWORLDBLOCKS = new CreativeModeTab("tabcreativeworldblocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CreativeWorldModBlocks.ADVENCEDMACHINECASE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CREATIVEWORLDTOOLS = new CreativeModeTab("tabcreativeworldtools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CreativeWorldModItems.BEDROCKBREACKER.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CREATIVEWORLDCOMBAT = new CreativeModeTab("tabcreativeworldcombat") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CreativeWorldModItems.CREATIVIUM_SWORD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
