
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

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
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreativeWorldMod.MODID);
	public static final RegistryObject<Block> GAS = REGISTRY.register("gas", () -> new GasBlock());
	public static final RegistryObject<Block> OIL = REGISTRY.register("oil", () -> new OilBlock());
	public static final RegistryObject<Block> COPPER_WIRE = REGISTRY.register("copper_wire", () -> new CopperWireBlock());
	public static final RegistryObject<Block> INSULATED_COPPER_WIRE = REGISTRY.register("insulated_copper_wire", () -> new InsulatedCopperWireBlock());
	public static final RegistryObject<Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new TinOreBlock());
	public static final RegistryObject<Block> TITAN_ORE = REGISTRY.register("titan_ore", () -> new TitanOreBlock());
	public static final RegistryObject<Block> ACCUMULATIUM_ORE = REGISTRY.register("accumulatium_ore", () -> new AccumulatiumOreBlock());
	public static final RegistryObject<Block> CREATIVIUM_ORE = REGISTRY.register("creativium_ore", () -> new CreativiumOreBlock());
	public static final RegistryObject<Block> TIN_BLOCK = REGISTRY.register("tin_block", () -> new TinBlockBlock());
	public static final RegistryObject<Block> BRONZE_BLOCK = REGISTRY.register("bronze_block", () -> new BronzeBlockBlock());
	public static final RegistryObject<Block> ACCUMULATIUM_BLOCK = REGISTRY.register("accumulatium_block", () -> new AccumulatiumBlockBlock());
	public static final RegistryObject<Block> CREATIVIUM_BLOCK = REGISTRY.register("creativium_block", () -> new CreativiumBlockBlock());
	public static final RegistryObject<Block> RESIN_LOG = REGISTRY.register("resin_log", () -> new ResinLogBlock());
	public static final RegistryObject<Block> RSINLOGWITHRESIN = REGISTRY.register("rsinlogwithresin", () -> new RsinlogwithresinBlock());
	public static final RegistryObject<Block> RESIN_WOOD = REGISTRY.register("resin_wood", () -> new ResinWoodBlock());
	public static final RegistryObject<Block> RESIN_PLANKS = REGISTRY.register("resin_planks", () -> new ResinPlanksBlock());
	public static final RegistryObject<Block> RESIN_STAIRS = REGISTRY.register("resin_stairs", () -> new ResinStairsBlock());
	public static final RegistryObject<Block> RESIN_SLAB = REGISTRY.register("resin_slab", () -> new ResinSlabBlock());
	public static final RegistryObject<Block> RESIN_LEAVES = REGISTRY.register("resin_leaves", () -> new ResinLeavesBlock());
	public static final RegistryObject<Block> RESIN_FENCE = REGISTRY.register("resin_fence", () -> new ResinFenceBlock());
	public static final RegistryObject<Block> RESIN_FENCE_GATE = REGISTRY.register("resin_fence_gate", () -> new ResinFenceGateBlock());
	public static final RegistryObject<Block> TITAN_BLOCK = REGISTRY.register("titan_block", () -> new TitanBlockBlock());
	public static final RegistryObject<Block> MACHINECASE = REGISTRY.register("machinecase", () -> new MachinecaseBlock());
	public static final RegistryObject<Block> COALGENERATOR = REGISTRY.register("coalgenerator", () -> new CoalgeneratorBlock());
	public static final RegistryObject<Block> CRUSHER = REGISTRY.register("crusher", () -> new CrusherBlock());
	public static final RegistryObject<Block> FAN = REGISTRY.register("fan", () -> new FanBlock());
	public static final RegistryObject<Block> BATTERYBLOCK = REGISTRY.register("batteryblock", () -> new BatteryblockBlock());
	public static final RegistryObject<Block> SOLARPANEL = REGISTRY.register("solarpanel", () -> new SolarpanelBlock());
	public static final RegistryObject<Block> ADVENCEDMACHINECASE = REGISTRY.register("advencedmachinecase", () -> new AdvencedmachinecaseBlock());
	public static final RegistryObject<Block> ADVENCEDSOLARPANEL = REGISTRY.register("advencedsolarpanel", () -> new AdvencedsolarpanelBlock());
	public static final RegistryObject<Block> INFINITYENERGY = REGISTRY.register("infinityenergy", () -> new InfinityenergyBlock());
	public static final RegistryObject<Block> QUANTUMTELEPORTERBLOCK = REGISTRY.register("quantumteleporterblock", () -> new QuantumteleporterblockBlock());
	public static final RegistryObject<Block> QUANTUMTELEPORTERBLOCK_2 = REGISTRY.register("quantumteleporterblock_2", () -> new Quantumteleporterblock2Block());
	public static final RegistryObject<Block> STATIONARYPARTICLEBINDER = REGISTRY.register("stationaryparticlebinder", () -> new StationaryparticlebinderBlock());
	public static final RegistryObject<Block> RESINTREESAPLING = REGISTRY.register("resintreesapling", () -> new ResintreesaplingBlock());
	public static final RegistryObject<Block> COALGENERATOR_1 = REGISTRY.register("coalgenerator_1", () -> new Coalgenerator1Block());
	public static final RegistryObject<Block> BUG = REGISTRY.register("bug", () -> new BUGBlock());
	public static final RegistryObject<Block> NUCLEAR_REACTOR = REGISTRY.register("nuclear_reactor", () -> new NuclearReactorBlock());
}
