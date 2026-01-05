/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.creativeworld.block.*;
import net.mcreator.creativeworld.CreativeWorldMod;

public class CreativeWorldModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CreativeWorldMod.MODID);
	public static final DeferredBlock<Block> MACHINECASE;
	public static final DeferredBlock<Block> TIN_ORE;
	public static final DeferredBlock<Block> TIN_BLOCK;
	public static final DeferredBlock<Block> RESIN_WOOD;
	public static final DeferredBlock<Block> RESIN_LOG;
	public static final DeferredBlock<Block> RESIN_PLANKS;
	public static final DeferredBlock<Block> RESIN_LEAVES;
	public static final DeferredBlock<Block> RESIN_STAIRS;
	public static final DeferredBlock<Block> RESIN_SLAB;
	public static final DeferredBlock<Block> RESIN_FENCE;
	public static final DeferredBlock<Block> RESIN_FENCE_GATE;
	public static final DeferredBlock<Block> RSINLOGWITHRESIN;
	public static final DeferredBlock<Block> OIL;
	public static final DeferredBlock<Block> GAS;
	public static final DeferredBlock<Block> BRONZE_BLOCK;
	public static final DeferredBlock<Block> ADVENCEDMACHINECASE;
	public static final DeferredBlock<Block> CREATIVIUM_ORE;
	public static final DeferredBlock<Block> CREATIVIUM_BLOCK;
	public static final DeferredBlock<Block> ACCUMULATIUM_ORE;
	public static final DeferredBlock<Block> ACCUMULATIUM_BLOCK;
	public static final DeferredBlock<Block> TITAN_ORE;
	public static final DeferredBlock<Block> TITAN_BLOCK;
	public static final DeferredBlock<Block> RESINTREESAPLING;
	public static final DeferredBlock<Block> COPPER_WIRE;
	public static final DeferredBlock<Block> INSULATED_COPPER_WIRE;
	static {
		MACHINECASE = REGISTRY.register("machinecase", MachinecaseBlock::new);
		TIN_ORE = REGISTRY.register("tin_ore", TinOreBlock::new);
		TIN_BLOCK = REGISTRY.register("tin_block", TinBlockBlock::new);
		RESIN_WOOD = REGISTRY.register("resin_wood", ResinWoodBlock::new);
		RESIN_LOG = REGISTRY.register("resin_log", ResinLogBlock::new);
		RESIN_PLANKS = REGISTRY.register("resin_planks", ResinPlanksBlock::new);
		RESIN_LEAVES = REGISTRY.register("resin_leaves", ResinLeavesBlock::new);
		RESIN_STAIRS = REGISTRY.register("resin_stairs", ResinStairsBlock::new);
		RESIN_SLAB = REGISTRY.register("resin_slab", ResinSlabBlock::new);
		RESIN_FENCE = REGISTRY.register("resin_fence", ResinFenceBlock::new);
		RESIN_FENCE_GATE = REGISTRY.register("resin_fence_gate", ResinFenceGateBlock::new);
		RSINLOGWITHRESIN = REGISTRY.register("rsinlogwithresin", RsinlogwithresinBlock::new);
		OIL = REGISTRY.register("oil", OilBlock::new);
		GAS = REGISTRY.register("gas", GasBlock::new);
		BRONZE_BLOCK = REGISTRY.register("bronze_block", BronzeBlockBlock::new);
		ADVENCEDMACHINECASE = REGISTRY.register("advencedmachinecase", AdvencedmachinecaseBlock::new);
		CREATIVIUM_ORE = REGISTRY.register("creativium_ore", CreativiumOreBlock::new);
		CREATIVIUM_BLOCK = REGISTRY.register("creativium_block", CreativiumBlockBlock::new);
		ACCUMULATIUM_ORE = REGISTRY.register("accumulatium_ore", AccumulatiumOreBlock::new);
		ACCUMULATIUM_BLOCK = REGISTRY.register("accumulatium_block", AccumulatiumBlockBlock::new);
		TITAN_ORE = REGISTRY.register("titan_ore", TitanOreBlock::new);
		TITAN_BLOCK = REGISTRY.register("titan_block", TitanBlockBlock::new);
		RESINTREESAPLING = REGISTRY.register("resintreesapling", ResintreesaplingBlock::new);
		COPPER_WIRE = REGISTRY.register("copper_wire", CopperWireBlock::new);
		INSULATED_COPPER_WIRE = REGISTRY.register("insulated_copper_wire", InsulatedCopperWireBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}