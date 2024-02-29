
package net.mcreator.creativeworld.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.creativeworld.init.CreativeWorldModJeiPlugin;
import net.mcreator.creativeworld.init.CreativeWorldModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class CrushingRecipeCategory implements IRecipeCategory<CrushingRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("creative_world", "crushing");
	public final static ResourceLocation TEXTURE = new ResourceLocation("creative_world", "textures/screens/crushing.png");
	private final IDrawable background;
	private final IDrawable icon;

	public CrushingRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 83);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(CreativeWorldModBlocks.CRUSHER.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<CrushingRecipe> getRecipeType() {
		return CreativeWorldModJeiPlugin.Crushing_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Crushing");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, CrushingRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 43, 35).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 115, 35).addItemStack(recipe.getResultItem(null));
	}
}
