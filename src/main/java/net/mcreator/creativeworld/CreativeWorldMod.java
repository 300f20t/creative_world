/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.creativeworld;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.creativeworld.network.CreativeWorldModVariables;
import net.mcreator.creativeworld.init.CreativeWorldModTrades;
import net.mcreator.creativeworld.init.CreativeWorldModTabs;
import net.mcreator.creativeworld.init.CreativeWorldModProcedures;
import net.mcreator.creativeworld.init.CreativeWorldModMenus;
import net.mcreator.creativeworld.init.CreativeWorldModKeyMappingsServer;
import net.mcreator.creativeworld.init.CreativeWorldModItems;
import net.mcreator.creativeworld.init.CreativeWorldModGameRules;
import net.mcreator.creativeworld.init.CreativeWorldModFeatures;
import net.mcreator.creativeworld.init.CreativeWorldModBlocks;
import net.mcreator.creativeworld.init.CreativeWorldModBlockEntities;

import net.fabricmc.api.ModInitializer;

public class CreativeWorldMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "creative_world";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing CreativeWorldMod");

		CreativeWorldModTabs.load();
		CreativeWorldModGameRules.load();

		CreativeWorldModBlocks.load();
		CreativeWorldModItems.load();
		CreativeWorldModBlockEntities.load();

		CreativeWorldModFeatures.load();

		CreativeWorldModProcedures.load();

		CreativeWorldModMenus.load();
		CreativeWorldModKeyMappingsServer.serverLoad();

		CreativeWorldModTrades.registerTrades();

		CreativeWorldModVariables.SyncJoin();
		CreativeWorldModVariables.SyncChangeWorld();
	}
}
