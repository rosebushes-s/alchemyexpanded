package com.rosebushes.alchemyexpanded.recipe;

import com.mraof.minestuck.api.alchemy.GristTypes;
import com.mraof.minestuck.api.alchemy.recipe.GristCostRecipeBuilder;
import com.mraof.minestuck.data.recipe.GeneratedGristCostBuilder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import com.rosebushes.alchemyexpanded.item.AEItems;

public final class AEGristCostProvider {
    public AEGristCostProvider() {

    }

    public static void buildRecipes(RecipeOutput recipeSaver) {
        GeneratedGristCostBuilder.create().build(recipeSaver, new ResourceLocation("alchemyexpanded", "generated"));
        GristCostRecipeBuilder.of((ItemLike)AEItems.GUN_PARTS.get()).grist(GristTypes.BUILD, 25L).grist(GristTypes.RUST, 10L).grist(GristTypes.CAULK, 12L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.AMMO.get()).grist(GristTypes.BUILD, 20L).grist(GristTypes.RUST, 6L).grist(GristTypes.SULFUR, 10L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.FLARE.get()).grist(GristTypes.BUILD, 15L).grist(GristTypes.TAR, 6L).grist(GristTypes.SULFUR, 10L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.CROCKERCORP_AMMO.get()).grist(GristTypes.RUBY, 30L).grist(GristTypes.RUST, 12L).grist(GristTypes.SULFUR, 16L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.LASER_AMMO.get()).grist(GristTypes.BUILD, 25L).grist(GristTypes.RUST, 10L).grist(GristTypes.URANIUM, 4L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.CURSED_TAPE.get()).grist(GristTypes.BUILD, 60L).grist(GristTypes.AMETHYST, 60L).grist(GristTypes.SHALE, 60L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.SADAKOS_MIXING_BOWL.get()).grist(GristTypes.AMETHYST, 444L).grist(GristTypes.TAR, 1444L).grist(GristTypes.SULFUR, 444L).grist(GristTypes.COBALT, 44L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.GREEN_SUN_BOOK.get()).grist(GristTypes.BUILD, 50L).grist(GristTypes.URANIUM, 30L).grist(GristTypes.CHALK, 30L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.FLAY_DOH.get()).grist(GristTypes.BUILD, 14L).grist(GristTypes.RUST, 1L).build(recipeSaver);

        GristCostRecipeBuilder.of((ItemLike)AEItems.DITO.get()).grist(GristTypes.BUILD, 3L).grist(GristTypes.IODINE, 1L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.DITO_DETRITUS.get()).grist(GristTypes.BUILD, 28L).grist(GristTypes.IODINE, 10L).grist(GristTypes.SHALE, 32L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.NUCLEAR_WARHEAD.get()).grist(GristTypes.BUILD, 3L).grist(GristTypes.IODINE, 2L).grist(GristTypes.URANIUM, 1L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.CHICKEN_CLUB_SALAD.get()).grist(GristTypes.BUILD, 26L).grist(GristTypes.IODINE, 16L).grist(GristTypes.RUST, 6L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.WIZARD_BERRIES.get()).grist(GristTypes.BUILD, 26L).grist(GristTypes.GOLD, 12L).grist(GristTypes.DIAMOND, 2L).build(recipeSaver);

        GristCostRecipeBuilder.of((ItemLike)AEItems.CHICKEN_CLUB_STAR.get()).grist(GristTypes.BUILD, 22L).grist(GristTypes.RUST, 3L).grist(GristTypes.CHALK, 4L).build(recipeSaver);

        GristCostRecipeBuilder.of((ItemLike)AEItems.COOKING_WITH_SADAKO.get()).grist(GristTypes.AMETHYST, 44L).grist(GristTypes.TAR, 444L).grist(GristTypes.SULFUR, 44L).grist(GristTypes.COBALT, 4L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.GHOST_IN_THE_MACHINE.get()).grist(GristTypes.BUILD, 666L).grist(GristTypes.AMETHYST, 66L).grist(GristTypes.RUBY, 6L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.TILDEATH_DO_US_PART.get()).grist(GristTypes.BUILD, 44L).grist(GristTypes.TAR, 4L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.BELL_BAT.get()).grist(GristTypes.BUILD, 16L).grist(GristTypes.GOLD, 6L).grist(GristTypes.COBALT, 1L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.DEAD_RINGER.get()).grist(GristTypes.BUILD, 244L).grist(GristTypes.TAR, 44L).grist(GristTypes.GOLD, 12L).grist(GristTypes.COBALT, 4L).build(recipeSaver);

        GristCostRecipeBuilder.of((ItemLike)AEItems.FLINTLOCK_PISTOL.get()).grist(GristTypes.BUILD, 12L).grist(GristTypes.RUST, 6L).grist(GristTypes.SULFUR, 3L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.FLARE_GUN.get()).grist(GristTypes.BUILD, 30L).grist(GristTypes.RUST, 12L).grist(GristTypes.SULFUR, 20L).grist(GristTypes.TAR, 12L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.GAMMA_BLASTER.get()).grist(GristTypes.BUILD, 55L).grist(GristTypes.URANIUM, 18L).grist(GristTypes.GOLD, 14L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.BREATH_BLASTER.get()).grist(GristTypes.BUILD, 56L).grist(GristTypes.AMETHYST, 24L).grist(GristTypes.URANIUM, 12L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.REVOLVER.get()).grist(GristTypes.BUILD, 50L).grist(GristTypes.RUST, 25L).grist(GristTypes.MERCURY, 10L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.SIXLET_SIXSHOOTER.get()).grist(GristTypes.BUILD, 55L).grist(GristTypes.CHALK, 30L).grist(GristTypes.IODINE, 16L).grist(GristTypes.MERCURY, 12L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.LASER_PISTOL.get()).grist(GristTypes.BUILD, 120L).grist(GristTypes.RUST, 44L).grist(GristTypes.URANIUM, 30L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.BERETTA.get()).grist(GristTypes.BUILD, 74L).grist(GristTypes.RUST, 30L).grist(GristTypes.TAR, 15L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.REGIPISTOL.get()).grist(GristTypes.AMETHYST, 34L).grist(GristTypes.TAR, 86L).grist(GristTypes.GOLD, 24L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.GOLDEN_GRIP.get()).grist(GristTypes.GOLD, 197L).grist(GristTypes.RUBY, 10L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.WHITE_MAGNUM.get()).grist(GristTypes.BUILD, 6120).grist(GristTypes.GOLD, 4612).grist(GristTypes.URANIUM, 3413).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.APPEARIFIER_PISTOL.get()).grist(GristTypes.RUBY, 630).grist(GristTypes.RUST, 240).grist(GristTypes.URANIUM, 334L).build(recipeSaver);

        GristCostRecipeBuilder.of((ItemLike)AEItems.FLINTLOCK_RIFLE.get()).grist(GristTypes.BUILD, 14L).grist(GristTypes.RUST, 8L).grist(GristTypes.SULFUR, 5L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.RIFLE.get()).grist(GristTypes.BUILD, 40L).grist(GristTypes.RUST, 20L).grist(GristTypes.AMBER, 10L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.CANDY_CARBINE.get()).grist(GristTypes.BUILD, 45L).grist(GristTypes.IODINE, 25L).grist(GristTypes.GOLD, 12L).grist(GristTypes.CHALK, 16L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.BLACK_ASSAULT_RIFLE.get()).grist(GristTypes.BUILD, 116L).grist(GristTypes.RUST, 58L).grist(GristTypes.TAR, 28L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.GOLD_ASSAULT_RIFLE.get()).grist(GristTypes.BUILD, 174L).grist(GristTypes.RUST, 86L).grist(GristTypes.RUBY, 42L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.ENGLISH_EXECUTIONER.get()).grist(GristTypes.GOLD, 3612L).grist(GristTypes.CHALK, 4612L).grist(GristTypes.URANIUM, 2160L).grist(GristTypes.ZILLIUM, 1L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.SNIPER_RIFLE.get()).grist(GristTypes.BUILD, 76L).grist(GristTypes.RUST, 54L).grist(GristTypes.CAULK, 46L).grist(GristTypes.DIAMOND, 1L);
        GristCostRecipeBuilder.of((ItemLike)AEItems.REGIRIFLE.get()).grist(GristTypes.AMETHYST, 57L).grist(GristTypes.TAR, 84L).grist(GristTypes.GOLD, 32L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.LASER_RIFLE.get()).grist(GristTypes.BUILD, 140L).grist(GristTypes.RUST, 66L).grist(GristTypes.URANIUM, 40L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.ANNIES_GOT_A_GUN.get()).grist(GristTypes.BUILD, 340L).grist(GristTypes.CHALK, 142L).grist(GristTypes.DIAMOND, 55L).grist(GristTypes.MARBLE, 73L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.MACHINE_GUN.get()).grist(GristTypes.BUILD, 120L).grist(GristTypes.RUST, 30L).grist(GristTypes.TAR, 50L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.GIRLS_BEST_FRIEND.get()).grist(GristTypes.DIAMOND, 550L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.GREEN_SUN_STREETSWEEPER.get()).grist(GristTypes.BUILD, 770L).grist(GristTypes.URANIUM, 350L).grist(GristTypes.CHALK, 260L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.APPEARIFIER_RIFLE.get()).grist(GristTypes.RUBY, 645L).grist(GristTypes.RUST, 256L).grist(GristTypes.URANIUM, 367L).build(recipeSaver);

        GristCostRecipeBuilder.of((ItemLike)AEItems.SHOTGUN.get()).grist(GristTypes.BUILD, 62L).grist(GristTypes.RUST, 43L).grist(GristTypes.SULFUR, 36L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.BLUNDERBUSS.get()).grist(GristTypes.BUILD, 220L).grist(GristTypes.RUST, 165L).grist(GristTypes.SULFUR, 73L).grist(GristTypes.GOLD, 15L).build(recipeSaver);
        GristCostRecipeBuilder.of((ItemLike)AEItems.BARBASOL_BOMB_LAUNCHER.get()).grist(GristTypes.BUILD, 120L).grist(GristTypes.RUST, 92L).grist(GristTypes.SHALE, 40L).build(recipeSaver);
    }
}
