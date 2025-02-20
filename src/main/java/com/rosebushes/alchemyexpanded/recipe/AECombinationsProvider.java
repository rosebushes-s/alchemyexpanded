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
        CombinationRecipeBuilder.of(AEItems.AMMO).input(Items.IRON_INGOT).or().input(Items.GUNPOWDER).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.FLARE).input(AEItems.AMMO).or().input(Items.FIRE_CHARGE).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.CROCKERCORP_AMMO).input(AEItems.AMMO).or().input(MSItems.CAKE_MIX).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.LASER_AMMO).input(AEItems.AMMO).or().input(MSItems.BATTERY).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.GUN_PARTS).input(AEItems.AMMO).and().input(Items.ANVIL).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.CURSED_TAPE).input(MSItems.CRYPTID_PHOTO).and().input(MSItems.CASSETTE_11).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.SADAKOS_MIXING_BOWL).input(AEItems.COOKING_WITH_SADAKO).and().input(Items.BOWL).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.FLAY_DOH).input(Items.CLAY_BALL).and().input(MSItems.GRUB_SAUCE).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.GREEN_SUN_BOOK).input(Items.BOOK).or().input(MSItems.RAW_URANIUM).buildFor(consumer, "alchemyexpanded");

        CombinationRecipeBuilder.of(AEItems.DITO).input(MSItems.GAMEBRO_MAGAZINE).or().input(Items.FLINT).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.DITO_DETRITUS).input(AEItems.DITO).and().input(MSItems.PHLEGM_GUSHERS).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.NUCLEAR_WARHEAD).input(MSItems.CANDY_CORN).and().input(MSItems.RAW_URANIUM).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.CHICKEN_CLUB_SALAD).input(Items.COOKED_CHICKEN).and().input(MSItems.CLUBS_SUITARANG).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.WIZARD_BERRIES).input(Items.SWEET_BERRIES).or().input(MSItems.MINI_WIZARD_STATUE).buildFor(consumer, "alchemyexpanded");

        CombinationRecipeBuilder.of(AEItems.CHICKEN_CLUB_STAR).input(Items.COOKED_CHICKEN).or().input(MSItems.CLUBS_SUITARANG).buildFor(consumer, "alchemyexpanded");

        CombinationRecipeBuilder.of(AEItems.COOKING_WITH_SADAKO).input(MSItems.SILVER_SPOON).and().input(AEItems.CURSED_TAPE).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.GHOST_IN_THE_MACHINE).input(MSItems.KEY_TO_THE_MACHINE).or().input(AEItems.CURSED_TAPE).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.TILDEATH_DO_US_PART).input(MSItems.SCYTHE).and().input(MSItems.TILLDEATH_HANDBOOK).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.BELL_BAT).input(MSItems.METAL_BAT).and().input(Items.BELL).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.DEAD_RINGER).input(AEItems.BELL_BAT).or().input(Items.ROTTEN_FLESH).buildFor(consumer, "alchemyexpanded");

        CombinationRecipeBuilder.of(AEItems.FLINTLOCK_PISTOL).input(AEItems.FLINTLOCK_RIFLE).or().input(MSItems.MIRROR).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.FLARE_GUN).input(AEItems.FLINTLOCK_PISTOL).and().input(AEItems.FLARE).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.GAMMA_BLASTER).input(AEItems.FLARE_GUN).and().input(MSItems.RAW_URANIUM).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.BREATH_BLASTER).input(AEItems.FLARE_GUN).and().input(Items.DRAGON_BREATH).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.REVOLVER).input(AEItems.FLINTLOCK_PISTOL).and().input(MSItems.HOUSE_KEY).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.SIXLET_SIXSHOOTER).input(AEItems.REVOLVER).or().input(MSItems.MERCURY_SIXLETS).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.LASER_PISTOL).input(AEItems.REVOLVER).and().input(AEItems.LASER_AMMO).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.BERETTA).input(AEItems.REVOLVER).or().input(Items.BLACK_DYE).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.REGIPISTOL).input(AEItems.BERETTA).or().input(MSItems.CHESSBOARD).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.GOLDEN_GRIP).input(AEItems.BERETTA).and().input(Items.GOLD_INGOT).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.WHITE_MAGNUM).input(AEItems.REVOLVER).and().input(MSItems.CUEBALL).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.APPEARIFIER_PISTOL).input(AEItems.LASER_PISTOL).or().input(MSItems.TRANSPORTALIZER).buildFor(consumer, "alchemyexpanded");

        CombinationRecipeBuilder.of(AEItems.FLINTLOCK_RIFLE).input(AEItems.GUN_PARTS).and().input(Items.FLINT).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.RIFLE).input(AEItems.FLINTLOCK_RIFLE).and().input(Items.LEATHER).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.CANDY_CARBINE).input(AEItems.RIFLE).or().input(MSItems.CANDY_CORN).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.BLACK_ASSAULT_RIFLE).input(AEItems.RIFLE).and().input(Items.BLACK_DYE).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.GOLD_ASSAULT_RIFLE).input(AEItems.BLACK_ASSAULT_RIFLE).or().input(Items.GOLD_INGOT).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.ENGLISH_EXECUTIONER).input(AEItems.GOLD_ASSAULT_RIFLE).and().input(AEItems.GREEN_SUN_BOOK).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.SNIPER_RIFLE).input(AEItems.RIFLE).and().input(Items.SPYGLASS).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.REGIRIFLE).input(AEItems.SNIPER_RIFLE).or().input(MSItems.CHESSBOARD).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.LASER_RIFLE).input(AEItems.RIFLE).and().input(AEItems.LASER_AMMO).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.ANNIES_GOT_A_GUN).input(AEItems.RIFLE).or().input(MSItems.GAMEGRL_MAGAZINE).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.MACHINE_GUN).input(AEItems.RIFLE).or().input(Items.REPEATER).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.GIRLS_BEST_FRIEND).input(AEItems.MACHINE_GUN).or().input(MSItems.CREW_POSTER).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.GREEN_SUN_STREETSWEEPER).input(AEItems.GIRLS_BEST_FRIEND).or().input(AEItems.GREEN_SUN_BOOK).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.APPEARIFIER_RIFLE).input(AEItems.LASER_RIFLE).or().input(MSItems.TRANSPORTALIZER).buildFor(consumer, "alchemyexpanded");

        CombinationRecipeBuilder.of(AEItems.BARBASOL_BOMB_LAUNCHER).input(AEItems.RIFLE).or().input(MSItems.BARBASOL_BOMB).buildFor(consumer, "alchemyexpanded");

        CombinationRecipeBuilder.of(AEItems.SHOTGUN).input(AEItems.GUN_PARTS).and().input(Items.BLAZE_POWDER).buildFor(consumer, "alchemyexpanded");
        CombinationRecipeBuilder.of(AEItems.BLUNDERBUSS).input(AEItems.SHOTGUN).or().input(AEItems.FLINTLOCK_RIFLE).buildFor(consumer, "alchemyexpanded");
    }
}
