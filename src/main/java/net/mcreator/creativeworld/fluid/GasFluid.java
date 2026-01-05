package net.mcreator.creativeworld.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.creativeworld.init.CreativeWorldModItems;
import net.mcreator.creativeworld.init.CreativeWorldModFluids;
import net.mcreator.creativeworld.init.CreativeWorldModFluidTypes;
import net.mcreator.creativeworld.init.CreativeWorldModBlocks;

public abstract class GasFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> CreativeWorldModFluidTypes.GAS_TYPE.get(), () -> CreativeWorldModFluids.GAS.get(), () -> CreativeWorldModFluids.FLOWING_GAS.get())
			.explosionResistance(100f).bucket(() -> CreativeWorldModItems.GAS_BUCKET.get()).block(() -> (LiquidBlock) CreativeWorldModBlocks.GAS.get());

	private GasFluid() {
		super(PROPERTIES);
	}

	public static class Source extends GasFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends GasFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}