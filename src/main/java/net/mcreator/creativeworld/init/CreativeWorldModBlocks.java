
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.creativeworld.block.TitanOreBlock;
import net.mcreator.creativeworld.block.TitanBlockBlock;
import net.mcreator.creativeworld.block.TinOreBlock;
import net.mcreator.creativeworld.block.TinBlockBlock;
import net.mcreator.creativeworld.block.StationaryparticlebinderBlock;
import net.mcreator.creativeworld.block.SolarpanelBlock;
import net.mcreator.creativeworld.block.RsinlogwithresinBlock;
import net.mcreator.creativeworld.block.ResintreesaplingBlock;
import net.mcreator.creativeworld.block.ResinWoodBlock;
import net.mcreator.creativeworld.block.ResinStairsBlock;
import net.mcreator.creativeworld.block.ResinSlabBlock;
import net.mcreator.creativeworld.block.ResinPlanksBlock;
import net.mcreator.creativeworld.block.ResinLogBlock;
import net.mcreator.creativeworld.block.ResinLeavesBlock;
import net.mcreator.creativeworld.block.ResinFenceGateBlock;
import net.mcreator.creativeworld.block.ResinFenceBlock;
import net.mcreator.creativeworld.block.QuantumteleporterblockBlock;
import net.mcreator.creativeworld.block.Quantumteleporterblock2Block;
import net.mcreator.creativeworld.block.MachinecaseBlock;
import net.mcreator.creativeworld.block.InsulatedCopperWireBlock;
import net.mcreator.creativeworld.block.InfinityenergyBlock;
import net.mcreator.creativeworld.block.FanBlock;
import net.mcreator.creativeworld.block.CrusherBlock;
import net.mcreator.creativeworld.block.CreativiumOreBlock;
import net.mcreator.creativeworld.block.CreativiumBlockBlock;
import net.mcreator.creativeworld.block.CopperWireBlock;
import net.mcreator.creativeworld.block.CoalgeneratorBlock;
import net.mcreator.creativeworld.block.Coalgenerator1Block;
import net.mcreator.creativeworld.block.BronzeBlockBlock;
import net.mcreator.creativeworld.block.BatteryblockBlock;
import net.mcreator.creativeworld.block.BUGBlock;
import net.mcreator.creativeworld.block.AdvencedsolarpanelBlock;
import net.mcreator.creativeworld.block.AdvencedmachinecaseBlock;
import net.mcreator.creativeworld.block.AccumulatiumOreBlock;
import net.mcreator.creativeworld.block.AccumulatiumBlockBlock;
import net.mcreator.creativeworld.CreativeWorldMod;

public class CreativeWorldModBlocks {
	public static Block COPPER_WIRE;
	public static Block INSULATED_COPPER_WIRE;
	public static Block TIN_ORE;
	public static Block TITAN_ORE;
	public static Block ACCUMULATIUM_ORE;
	public static Block CREATIVIUM_ORE;
	public static Block TIN_BLOCK;
	public static Block BRONZE_BLOCK;
	public static Block ACCUMULATIUM_BLOCK;
	public static Block CREATIVIUM_BLOCK;
	public static Block RESIN_LOG;
	public static Block RSINLOGWITHRESIN;
	public static Block RESIN_WOOD;
	public static Block RESIN_PLANKS;
	public static Block RESIN_STAIRS;
	public static Block RESIN_SLAB;
	public static Block RESIN_LEAVES;
	public static Block RESIN_FENCE;
	public static Block RESIN_FENCE_GATE;
	public static Block TITAN_BLOCK;
	public static Block MACHINECASE;
	public static Block COALGENERATOR;
	public static Block CRUSHER;
	public static Block FAN;
	public static Block BATTERYBLOCK;
	public static Block SOLARPANEL;
	public static Block ADVENCEDMACHINECASE;
	public static Block ADVENCEDSOLARPANEL;
	public static Block INFINITYENERGY;
	public static Block QUANTUMTELEPORTERBLOCK;
	public static Block QUANTUMTELEPORTERBLOCK_2;
	public static Block STATIONARYPARTICLEBINDER;
	public static Block RESINTREESAPLING;
	public static Block COALGENERATOR_1;
	public static Block BUG;

	public static void load() {
		COPPER_WIRE = register("copper_wire", new CopperWireBlock());
		INSULATED_COPPER_WIRE = register("insulated_copper_wire", new InsulatedCopperWireBlock());
		TIN_ORE = register("tin_ore", new TinOreBlock());
		TITAN_ORE = register("titan_ore", new TitanOreBlock());
		ACCUMULATIUM_ORE = register("accumulatium_ore", new AccumulatiumOreBlock());
		CREATIVIUM_ORE = register("creativium_ore", new CreativiumOreBlock());
		TIN_BLOCK = register("tin_block", new TinBlockBlock());
		BRONZE_BLOCK = register("bronze_block", new BronzeBlockBlock());
		ACCUMULATIUM_BLOCK = register("accumulatium_block", new AccumulatiumBlockBlock());
		CREATIVIUM_BLOCK = register("creativium_block", new CreativiumBlockBlock());
		RESIN_LOG = register("resin_log", new ResinLogBlock());
		RSINLOGWITHRESIN = register("rsinlogwithresin", new RsinlogwithresinBlock());
		RESIN_WOOD = register("resin_wood", new ResinWoodBlock());
		RESIN_PLANKS = register("resin_planks", new ResinPlanksBlock());
		RESIN_STAIRS = register("resin_stairs", new ResinStairsBlock());
		RESIN_SLAB = register("resin_slab", new ResinSlabBlock());
		RESIN_LEAVES = register("resin_leaves", new ResinLeavesBlock());
		RESIN_FENCE = register("resin_fence", new ResinFenceBlock());
		RESIN_FENCE_GATE = register("resin_fence_gate", new ResinFenceGateBlock());
		TITAN_BLOCK = register("titan_block", new TitanBlockBlock());
		MACHINECASE = register("machinecase", new MachinecaseBlock());
		COALGENERATOR = register("coalgenerator", new CoalgeneratorBlock());
		CRUSHER = register("crusher", new CrusherBlock());
		FAN = register("fan", new FanBlock());
		BATTERYBLOCK = register("batteryblock", new BatteryblockBlock());
		SOLARPANEL = register("solarpanel", new SolarpanelBlock());
		ADVENCEDMACHINECASE = register("advencedmachinecase", new AdvencedmachinecaseBlock());
		ADVENCEDSOLARPANEL = register("advencedsolarpanel", new AdvencedsolarpanelBlock());
		INFINITYENERGY = register("infinityenergy", new InfinityenergyBlock());
		QUANTUMTELEPORTERBLOCK = register("quantumteleporterblock", new QuantumteleporterblockBlock());
		QUANTUMTELEPORTERBLOCK_2 = register("quantumteleporterblock_2", new Quantumteleporterblock2Block());
		STATIONARYPARTICLEBINDER = register("stationaryparticlebinder", new StationaryparticlebinderBlock());
		RESINTREESAPLING = register("resintreesapling", new ResintreesaplingBlock());
		COALGENERATOR_1 = register("coalgenerator_1", new Coalgenerator1Block());
		BUG = register("bug", new BUGBlock());
	}

	public static void clientLoad() {
		CopperWireBlock.clientInit();
		InsulatedCopperWireBlock.clientInit();
		TinOreBlock.clientInit();
		TitanOreBlock.clientInit();
		AccumulatiumOreBlock.clientInit();
		CreativiumOreBlock.clientInit();
		TinBlockBlock.clientInit();
		BronzeBlockBlock.clientInit();
		AccumulatiumBlockBlock.clientInit();
		CreativiumBlockBlock.clientInit();
		ResinLogBlock.clientInit();
		RsinlogwithresinBlock.clientInit();
		ResinWoodBlock.clientInit();
		ResinPlanksBlock.clientInit();
		ResinStairsBlock.clientInit();
		ResinSlabBlock.clientInit();
		ResinLeavesBlock.clientInit();
		ResinFenceBlock.clientInit();
		ResinFenceGateBlock.clientInit();
		TitanBlockBlock.clientInit();
		MachinecaseBlock.clientInit();
		CoalgeneratorBlock.clientInit();
		CrusherBlock.clientInit();
		FanBlock.clientInit();
		BatteryblockBlock.clientInit();
		SolarpanelBlock.clientInit();
		AdvencedmachinecaseBlock.clientInit();
		AdvencedsolarpanelBlock.clientInit();
		InfinityenergyBlock.clientInit();
		QuantumteleporterblockBlock.clientInit();
		Quantumteleporterblock2Block.clientInit();
		StationaryparticlebinderBlock.clientInit();
		ResintreesaplingBlock.clientInit();
		Coalgenerator1Block.clientInit();
		BUGBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(CreativeWorldMod.MODID, registryName), block);
	}
}
