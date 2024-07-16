
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

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
import net.mcreator.creativeworld.block.OilBlock;
import net.mcreator.creativeworld.block.NuclearReactorBlock;
import net.mcreator.creativeworld.block.MachinecaseBlock;
import net.mcreator.creativeworld.block.InsulatedCopperWireBlock;
import net.mcreator.creativeworld.block.InfinityenergyBlock;
import net.mcreator.creativeworld.block.GasBlock;
import net.mcreator.creativeworld.block.FanBlock;
import net.mcreator.creativeworld.block.CrusherBlock;
import net.mcreator.creativeworld.block.CreativiumOreBlock;
import net.mcreator.creativeworld.block.CreativiumBlockBlock;
import net.mcreator.creativeworld.block.CopperWireBlock;
import net.mcreator.creativeworld.block.CoalgeneratorBlock;
import net.mcreator.creativeworld.block.BronzeBlockBlock;
import net.mcreator.creativeworld.block.BatteryblockBlock;
import net.mcreator.creativeworld.block.BUGBlock;
import net.mcreator.creativeworld.block.AdvencedsolarpanelBlock;
import net.mcreator.creativeworld.block.AdvencedmachinecaseBlock;
import net.mcreator.creativeworld.block.AccumulatiumOreBlock;
import net.mcreator.creativeworld.block.AccumulatiumBlockBlock;
import net.mcreator.creativeworld.CreativeWorldMod;

public class CreativeWorldModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, CreativeWorldMod.MODID);
	public static final DeferredHolder<Block, Block> COALGENERATOR = REGISTRY.register("coalgenerator", () -> new CoalgeneratorBlock());
	public static final DeferredHolder<Block, Block> MACHINECASE = REGISTRY.register("machinecase", () -> new MachinecaseBlock());
	public static final DeferredHolder<Block, Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new TinOreBlock());
	public static final DeferredHolder<Block, Block> TIN_BLOCK = REGISTRY.register("tin_block", () -> new TinBlockBlock());
	public static final DeferredHolder<Block, Block> RESIN_WOOD = REGISTRY.register("resin_wood", () -> new ResinWoodBlock());
	public static final DeferredHolder<Block, Block> RESIN_LOG = REGISTRY.register("resin_log", () -> new ResinLogBlock());
	public static final DeferredHolder<Block, Block> RESIN_PLANKS = REGISTRY.register("resin_planks", () -> new ResinPlanksBlock());
	public static final DeferredHolder<Block, Block> RESIN_LEAVES = REGISTRY.register("resin_leaves", () -> new ResinLeavesBlock());
	public static final DeferredHolder<Block, Block> RESIN_STAIRS = REGISTRY.register("resin_stairs", () -> new ResinStairsBlock());
	public static final DeferredHolder<Block, Block> RESIN_SLAB = REGISTRY.register("resin_slab", () -> new ResinSlabBlock());
	public static final DeferredHolder<Block, Block> RESIN_FENCE = REGISTRY.register("resin_fence", () -> new ResinFenceBlock());
	public static final DeferredHolder<Block, Block> RESIN_FENCE_GATE = REGISTRY.register("resin_fence_gate", () -> new ResinFenceGateBlock());
	public static final DeferredHolder<Block, Block> CRUSHER = REGISTRY.register("crusher", () -> new CrusherBlock());
	public static final DeferredHolder<Block, Block> RSINLOGWITHRESIN = REGISTRY.register("rsinlogwithresin", () -> new RsinlogwithresinBlock());
	public static final DeferredHolder<Block, Block> SOLARPANEL = REGISTRY.register("solarpanel", () -> new SolarpanelBlock());
	public static final DeferredHolder<Block, Block> OIL = REGISTRY.register("oil", () -> new OilBlock());
	public static final DeferredHolder<Block, Block> GAS = REGISTRY.register("gas", () -> new GasBlock());
	public static final DeferredHolder<Block, Block> FAN = REGISTRY.register("fan", () -> new FanBlock());
	public static final DeferredHolder<Block, Block> BATTERYBLOCK = REGISTRY.register("batteryblock", () -> new BatteryblockBlock());
	public static final DeferredHolder<Block, Block> BRONZE_BLOCK = REGISTRY.register("bronze_block", () -> new BronzeBlockBlock());
	public static final DeferredHolder<Block, Block> INFINITYENERGY = REGISTRY.register("infinityenergy", () -> new InfinityenergyBlock());
	public static final DeferredHolder<Block, Block> ADVENCEDMACHINECASE = REGISTRY.register("advencedmachinecase", () -> new AdvencedmachinecaseBlock());
	public static final DeferredHolder<Block, Block> ADVENCEDSOLARPANEL = REGISTRY.register("advencedsolarpanel", () -> new AdvencedsolarpanelBlock());
	public static final DeferredHolder<Block, Block> CREATIVIUM_ORE = REGISTRY.register("creativium_ore", () -> new CreativiumOreBlock());
	public static final DeferredHolder<Block, Block> CREATIVIUM_BLOCK = REGISTRY.register("creativium_block", () -> new CreativiumBlockBlock());
	public static final DeferredHolder<Block, Block> ACCUMULATIUM_ORE = REGISTRY.register("accumulatium_ore", () -> new AccumulatiumOreBlock());
	public static final DeferredHolder<Block, Block> ACCUMULATIUM_BLOCK = REGISTRY.register("accumulatium_block", () -> new AccumulatiumBlockBlock());
	public static final DeferredHolder<Block, Block> TITAN_ORE = REGISTRY.register("titan_ore", () -> new TitanOreBlock());
	public static final DeferredHolder<Block, Block> TITAN_BLOCK = REGISTRY.register("titan_block", () -> new TitanBlockBlock());
	public static final DeferredHolder<Block, Block> STATIONARYPARTICLEBINDER = REGISTRY.register("stationaryparticlebinder", () -> new StationaryparticlebinderBlock());
	public static final DeferredHolder<Block, Block> QUANTUMTELEPORTERBLOCK = REGISTRY.register("quantumteleporterblock", () -> new QuantumteleporterblockBlock());
	public static final DeferredHolder<Block, Block> QUANTUMTELEPORTERBLOCK_2 = REGISTRY.register("quantumteleporterblock_2", () -> new Quantumteleporterblock2Block());
	public static final DeferredHolder<Block, Block> RESINTREESAPLING = REGISTRY.register("resintreesapling", () -> new ResintreesaplingBlock());
	public static final DeferredHolder<Block, Block> BUG = REGISTRY.register("bug", () -> new BUGBlock());
	public static final DeferredHolder<Block, Block> COPPER_WIRE = REGISTRY.register("copper_wire", () -> new CopperWireBlock());
	public static final DeferredHolder<Block, Block> INSULATED_COPPER_WIRE = REGISTRY.register("insulated_copper_wire", () -> new InsulatedCopperWireBlock());
	public static final DeferredHolder<Block, Block> NUCLEAR_REACTOR = REGISTRY.register("nuclear_reactor", () -> new NuclearReactorBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
