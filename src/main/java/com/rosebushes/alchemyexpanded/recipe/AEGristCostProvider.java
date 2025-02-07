package com.rosebushes.alchemyexpanded.recipe;

import com.mraof.minestuck.api.alchemy.GristType;
import com.mraof.minestuck.api.alchemy.GristTypes;
import com.mraof.minestuck.api.alchemy.recipe.ContainerGristCostBuilder;
import com.mraof.minestuck.api.alchemy.recipe.GristCostRecipeBuilder;
import com.mraof.minestuck.api.alchemy.recipe.SourceGristCostBuilder;
import com.mraof.minestuck.api.alchemy.recipe.WildcardGristCostBuilder;
import com.mraof.minestuck.block.MSBlocks;
import com.mraof.minestuck.data.recipe.GeneratedGristCostBuilder;
import com.mraof.minestuck.item.MSItems;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags.Items;
import com.rosebushes.alchemyexpanded.item.AEItems;


public final class AEGristCostProvider {
    public AEGristCostProvider() {

    }

    public static void buildRecipes(RecipeOutput recipeSaver) {
        GeneratedGristCostBuilder.create().build(recipeSaver, new ResourceLocation("alchemyexpanded", "generated"));
        GristCostRecipeBuilder.of((ItemLike)AEItems.CURSED_TAPE.get()).grist(GristTypes.BUILD, 60L).grist(GristTypes.AMETHYST, 60L).grist(GristTypes.SHALE, 60L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.FLAY_DOH.get()).grist(GristTypes.BUILD, 14L).grist(GristTypes.RUST, 1L).build(recipeSaver);

        GristCostRecipeBuilder.of((ItemLike)AEItems.DITO.get()).grist(GristTypes.BUILD, 10L).grist(GristTypes.IODINE, 1L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.DITO_DETRITUS.get()).grist(GristTypes.BUILD, 28L).grist(GristTypes.IODINE, 10L).grist(GristTypes.SHALE, 32L).build(recipeSaver);

        GristCostRecipeBuilder.of((ItemLike)AEItems.GHOST_IN_THE_MACHINE.get()).grist(GristTypes.BUILD, 666L).grist(GristTypes.AMETHYST, 66L).grist(GristTypes.RUBY, 6L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.TILDEATH_DO_US_PART.get()).grist(GristTypes.BUILD, 44L).grist(GristTypes.TAR, 4L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.BELL_BAT.get()).grist(GristTypes.BUILD, 16L).grist(GristTypes.GOLD, 6L).grist(GristTypes.COBALT, 1L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.DEAD_RINGER.get()).grist(GristTypes.BUILD, 244L).grist(GristTypes.TAR, 44L).grist(GristTypes.GOLD, 12L).grist(GristTypes.COBALT, 4L).build(recipeSaver);

    }
}
