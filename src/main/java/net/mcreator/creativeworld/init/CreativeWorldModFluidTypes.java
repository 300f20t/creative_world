/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.creativeworld.fluid.types.OilFluidType;
import net.mcreator.creativeworld.fluid.types.GasFluidType;
import net.mcreator.creativeworld.CreativeWorldMod;

public class CreativeWorldModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, CreativeWorldMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> OIL_TYPE = REGISTRY.register("oil", () -> new OilFluidType());
	public static final DeferredHolder<FluidType, FluidType> GAS_TYPE = REGISTRY.register("gas", () -> new GasFluidType());
}