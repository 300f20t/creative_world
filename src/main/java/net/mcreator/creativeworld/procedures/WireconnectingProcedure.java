package net.mcreator.creativeworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.creativeworld.init.CreativeWorldModBlocks;

public class WireconnectingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get()) {
			world.setBlock(new BlockPos(x - 1, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
				|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
				|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get()) {
			world.setBlock(new BlockPos(x + 1, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get()) {
			world.setBlock(new BlockPos(x, y, z - 1), CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get()) {
			world.setBlock(new BlockPos(x, y, z + 1), CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get()) {
			world.setBlock(new BlockPos(x, y - 1, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get()) {
			world.setBlock(new BlockPos(x, y + 1, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get().defaultBlockState(), 3);
		}
		if (((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get())
				&& ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
						|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
						|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get())) {
			world.setBlock(new BlockPos(x, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_4.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get().defaultBlockState(), 3);
		} else if (((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
				|| (world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
				|| (world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get())
				&& ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
						|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
						|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get())
				&& ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
						|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
						|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get())) {
			world.setBlock(new BlockPos(x - 1, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_4.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 1, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get().defaultBlockState(), 3);
		} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get())
				&& ((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
						|| (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
						|| (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get())
				&& ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
						|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
						|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get())) {
			world.setBlock(new BlockPos(x, y + 1, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_4.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y + 1, z), CreativeWorldModBlocks.TINWIREWITHRUBBER.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get().defaultBlockState(), 3);
		}
		if (((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get())
				&& ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
						|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
						|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get())) {
			world.setBlock(new BlockPos(x, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_5.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get().defaultBlockState(), 3);
		} else if (((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
				|| (world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
				|| (world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get())
				&& ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
						|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
						|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get())
				&& ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
						|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
						|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get())) {
			world.setBlock(new BlockPos(x + 1, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_5.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 1, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get().defaultBlockState(), 3);
		} else if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get())
				&& ((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
						|| (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
						|| (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get())
				&& ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER.get()
						|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_2.get()
						|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get())) {
			world.setBlock(new BlockPos(x, y + 1, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_5.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y + 1, z), CreativeWorldModBlocks.TINWIREWITHRUBBER.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), CreativeWorldModBlocks.TINWIREWITHRUBBER_3.get().defaultBlockState(), 3);
		}
	}
}
