package com.rosebushes.alchemyexpanded.recipe;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class AERecipeProvider extends RecipeProvider {

    public AERecipeProvider(PackOutput output) {
        super(output);
    }

    protected void buildRecipes(RecipeOutput recipeBuilder) {
        AEGristCostProvider.buildRecipes(recipeBuilder);
        AECombinationsProvider.buildRecipes(recipeBuilder);
    }

}
