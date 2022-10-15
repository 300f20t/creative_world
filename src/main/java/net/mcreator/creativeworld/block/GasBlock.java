
package net.mcreator.creativeworld.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.creativeworld.init.CreativeWorldModFluids;

public class GasBlock extends LiquidBlock {
	public GasBlock() {
		super(() -> CreativeWorldModFluids.GAS.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 50;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 50;
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
