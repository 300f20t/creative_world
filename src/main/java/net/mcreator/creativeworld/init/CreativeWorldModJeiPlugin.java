
package net.mcreator.creativeworld.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.creativeworld.jei_recipes.CrushingRecipeCategory;
import net.mcreator.creativeworld.jei_recipes.CrushingRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.stream.Collectors;
import java.util.Objects;
import java.util.List;

@JeiPlugin
public class CreativeWorldModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<CrushingRecipe> Crushing_Type = new mezz.jei.api.recipe.RecipeType<>(CrushingRecipeCategory.UID, CrushingRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return ResourceLocation.parse("creative_world:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new CrushingRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<CrushingRecipe> CrushingRecipes = recipeManager.getAllRecipesFor(CrushingRecipe.Type.INSTANCE).stream().map(RecipeHolder::value).collect(Collectors.toList());
		registration.addRecipes(Crushing_Type, CrushingRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(CreativeWorldModBlocks.MACHINECASE.get().asItem()), Crushing_Type);
	}
}
