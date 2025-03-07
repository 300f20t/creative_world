
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

public abstract class OilFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> CreativeWorldModFluidTypes.OIL_TYPE.get(), () -> CreativeWorldModFluids.OIL.get(), () -> CreativeWorldModFluids.FLOWING_OIL.get())
			.explosionResistance(100f).tickRate(50).slopeFindDistance(3).bucket(() -> CreativeWorldModItems.OIL_BUCKET.get()).block(() -> (LiquidBlock) CreativeWorldModBlocks.OIL.get());

	private OilFluid() {
		super(PROPERTIES);
	}

	public static class Source extends OilFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends OilFluid {
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
