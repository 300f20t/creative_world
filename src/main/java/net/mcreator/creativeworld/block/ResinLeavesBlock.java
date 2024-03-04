
package net.mcreator.creativeworld.block;

import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.creativeworld.procedures.ResinLeavesPriRazrushieniiBlokaIghrokomProcedure;
import net.mcreator.creativeworld.init.CreativeWorldModBlocks;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;
import java.util.Collections;

public class ResinLeavesBlock extends LeavesBlock {
	public static BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.GRASS).strength(0.2f).noOcclusion();

	public ResinLeavesBlock() {
		super(PROPERTIES);
		FlammableBlockRegistry.getDefaultInstance().add(this, 30, 0);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(Blocks.AIR));
	}

	@Override
	public void playerDestroy(Level world, Player entity, BlockPos pos, BlockState blockstate, BlockEntity blockEntity, ItemStack itemStack) {
		super.playerDestroy(world, entity, pos, blockstate, blockEntity, itemStack);
		ResinLeavesPriRazrushieniiBlokaIghrokomProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(CreativeWorldModBlocks.RESIN_LEAVES, RenderType.solid());
	}
}
