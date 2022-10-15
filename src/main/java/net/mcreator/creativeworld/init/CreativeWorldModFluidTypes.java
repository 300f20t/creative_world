
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.creativeworld.fluid.types.OilFluidType;
import net.mcreator.creativeworld.fluid.types.GasFluidType;
import net.mcreator.creativeworld.CreativeWorldMod;

public class CreativeWorldModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreativeWorldMod.MODID);
	public static final RegistryObject<FluidType> OIL_TYPE = REGISTRY.register("oil", () -> new OilFluidType());
	public static final RegistryObject<FluidType> GAS_TYPE = REGISTRY.register("gas", () -> new GasFluidType());
}
