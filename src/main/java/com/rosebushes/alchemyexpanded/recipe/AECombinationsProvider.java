package com.rosebushes.alchemyexpanded.recipe;

import com.mraof.minestuck.api.alchemy.recipe.combination.CombinationRecipeBuilder;
import com.mraof.minestuck.item.MSItems;
import com.rosebushes.alchemyexpanded.item.AEItems;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;

public class AECombinationsProvider {
    public AECombinationsProvider() {

    }

    public static void buildRecipes(RecipeOutput consumer) {
        CombinationRecipeBuilder.of(AEItems.CURSED_TAPE).input(MSItems.CRYPTID_PHOTO).and().input(MSItems.CASSETTE_11).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.FLAY_DOH).input(Items.CLAY_BALL).and().input(MSItems.GRUB_SAUCE).buildFor(consumer, "alchemyexpanded");

        CombinationRecipeBuilder.of(AEItems.DITO).input(MSItems.GAMEBRO_MAGAZINE).or().input(Items.FLINT).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.DITO_DETRITUS).input(AEItems.DITO).and().input(MSItems.PHLEGM_GUSHERS).buildFor(consumer, "alchemyexpanded");

        CombinationRecipeBuilder.of(AEItems.GHOST_IN_THE_MACHINE).input(MSItems.KEY_TO_THE_MACHINE).or().input(AEItems.CURSED_TAPE).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.TILDEATH_DO_US_PART).input(MSItems.SCYTHE).or().input(MSItems.TILLDEATH_HANDBOOK).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.BELL_BAT).input(MSItems.METAL_BAT).or().input(Items.BELL).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.DEAD_RINGER).input(AEItems.BELL_BAT).or().input(Items.ROTTEN_FLESH).buildFor(consumer, "alchemyexpanded");
    }
}
