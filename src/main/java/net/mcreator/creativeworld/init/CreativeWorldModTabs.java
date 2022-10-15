
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CreativeWorldModTabs {
	public static CreativeModeTab TAB_CREATIVE_WOR_1D;

	public static void load() {
		TAB_CREATIVE_WOR_1D = new CreativeModeTab("tabcreative_wor_1d") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CreativeWorldModBlocks.COALGENERATOR.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
