/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.creativeworld.fluid.OilFluid;
import net.mcreator.creativeworld.fluid.GasFluid;
import net.mcreator.creativeworld.CreativeWorldMod;

public class CreativeWorldModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, CreativeWorldMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> OIL = REGISTRY.register("oil", () -> new OilFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_OIL = REGISTRY.register("flowing_oil", () -> new OilFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> GAS = REGISTRY.register("gas", () -> new GasFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_GAS = REGISTRY.register("flowing_gas", () -> new GasFluid.Flowing());

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(GAS.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_GAS.get(), RenderType.translucent());
		}
	}
}