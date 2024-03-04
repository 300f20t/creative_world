
package net.mcreator.creativeworld.block;

import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.creativeworld.procedures.ResintreesaplingPriDobavlieniiRastieniiaProcedure;
import net.mcreator.creativeworld.init.CreativeWorldModBlocks;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;
import java.util.Collections;

public class ResintreesaplingBlock extends FlowerBlock {
	public ResintreesaplingBlock() {
		super(MobEffects.UNLUCK, 100, BlockBehaviour.Properties.of().sound(SoundType.GRASS).instabreak().noCollission());
		FlammableBlockRegistry.getDefaultInstance().add(this, 100, 60);
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(Blocks.GRASS_BLOCK) || groundState.is(Blocks.DIRT);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		ResintreesaplingPriDobavlieniiRastieniiaProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(CreativeWorldModBlocks.RESINTREESAPLING, RenderType.cutoutMipped());
	}
}
