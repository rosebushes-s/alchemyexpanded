package com.rosebushes.alchemyexpanded.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public final class AECreativeTabs {
    public static final String MAIN_KEY = "alchemyexpanded.item_group.main";
    public static final String WEAPONS_KEY = "alchemyexpanded.item_group.weapons";
    public static final DeferredRegister<CreativeModeTab> REGISTER;
    public static final Supplier<CreativeModeTab> MAIN;
    public static final Supplier<CreativeModeTab> FOOD;
    public static final Supplier<CreativeModeTab> WEAPONS;

    public AECreativeTabs() {
    }

    private static void buildMainTab(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output) {
        output.accept((ItemLike) AEItems.GUN_PARTS.get());
        output.accept((ItemLike) AEItems.CURSED_TAPE.get());
        output.accept((ItemLike) AEItems.SADAKOS_MIXING_BOWL.get());
        output.accept((ItemLike) AEItems.GREEN_SUN_BOOK.get());
        output.accept((ItemLike) AEItems.FLAY_DOH.get());
    }

    private static void buildFoodTab(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output) {
        output.accept((ItemLike) AEItems.DITO.get());
        output.accept((ItemLike) AEItems.DITO_DETRITUS.get());
        output.accept((ItemLike) AEItems.NUCLEAR_WARHEAD.get());
        output.accept((ItemLike) AEItems.CHICKEN_CLUB_SALAD.get());
        output.accept((ItemLike) AEItems.WIZARD_BERRIES.get());
    }

    private static void buildWeaponsTab(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output) {
        output.accept((ItemLike) AEItems.AMMO.get());
        output.accept((ItemLike) AEItems.FLARE.get());
        output.accept((ItemLike) AEItems.CROCKERCORP_AMMO.get());
        output.accept((ItemLike) AEItems.LASER_AMMO.get());
        output.accept((ItemLike) AEItems.CHICKEN_CLUB_STAR.get());
        output.accept((ItemLike) AEItems.COOKING_WITH_SADAKO.get());
        output.accept((ItemLike) AEItems.GHOST_IN_THE_MACHINE.get());
        output.accept((ItemLike) AEItems.TILDEATH_DO_US_PART.get());
        output.accept((ItemLike) AEItems.BELL_BAT.get());
        output.accept((ItemLike) AEItems.DEAD_RINGER.get());
        output.accept((ItemLike) AEItems.DEULING_BLADE.get());
        output.accept((ItemLike) AEItems.FRONTIER_AXE.get());
        output.accept((ItemLike) AEItems.BLACK_SCEPTER.get());
        output.accept((ItemLike) AEItems.GOLD_SCEPTER.get());
        output.accept((ItemLike) AEItems.GREEN_SUN_CUESTAFF.get());

        //output.accept((ItemLike) AEItems.TOPAZ_QUARTET.get());
        //output.accept((ItemLike) AEItems.OPAL_DECATET.get());

        output.accept((ItemLike) AEItems.FLINTLOCK_PISTOL.get());
        output.accept((ItemLike) AEItems.FLARE_GUN.get());
        output.accept((ItemLike) AEItems.GAMMA_BLASTER.get());
        output.accept((ItemLike) AEItems.BREATH_BLASTER.get());
        output.accept((ItemLike) AEItems.REVOLVER.get());
        output.accept((ItemLike) AEItems.SIXLET_SIXSHOOTER.get());
        output.accept((ItemLike) AEItems.DAPPLE_DEULY.get());
        output.accept((ItemLike) AEItems.LASER_PISTOL.get());
        output.accept((ItemLike) AEItems.BERETTA.get());
        output.accept((ItemLike) AEItems.REGIPISTOL.get());
        output.accept((ItemLike) AEItems.GOLDEN_GRIP.get());
        output.accept((ItemLike) AEItems.APPEARIFIER_PISTOL.get());
        output.accept((ItemLike) AEItems.WHITE_MAGNUM.get());

        output.accept((ItemLike) AEItems.FLINTLOCK_RIFLE.get());
        output.accept((ItemLike) AEItems.RIFLE.get());
        output.accept((ItemLike) AEItems.CANDY_CARBINE.get());
        output.accept((ItemLike) AEItems.BLACK_ASSAULT_RIFLE.get());
        output.accept((ItemLike) AEItems.GOLD_ASSAULT_RIFLE.get());
        output.accept((ItemLike) AEItems.ENGLISH_EXECUTIONER.get());
        output.accept((ItemLike) AEItems.SNIPER_RIFLE.get());
        output.accept((ItemLike) AEItems.REGIRIFLE.get());
        output.accept((ItemLike) AEItems.LASER_RIFLE.get());
        output.accept((ItemLike) AEItems.ANNIES_GOT_A_GUN.get());
        output.accept((ItemLike) AEItems.MACHINE_GUN.get());
        output.accept((ItemLike) AEItems.GIRLS_BEST_FRIEND.get());
        output.accept((ItemLike) AEItems.GREEN_SUN_STREETSWEEPER.get());
        output.accept((ItemLike) AEItems.APPEARIFIER_RIFLE.get());

        output.accept((ItemLike) AEItems.SHOTGUN.get());
        output.accept((ItemLike) AEItems.BLUNDERBUSS.get());
        output.accept((ItemLike) AEItems.BARBASOL_BOMB_LAUNCHER.get());
    }

    static {
        REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "alchemyexpanded");
        MAIN = REGISTER.register("main", () -> CreativeModeTab.builder().title(Component.translatable("alchemyexpanded.item_group.main")).icon(() -> new ItemStack((ItemLike)AEItems.GREEN_SUN_BOOK.get())).displayItems(AECreativeTabs::buildMainTab).build());
        FOOD = REGISTER.register("food", () -> CreativeModeTab.builder().title(Component.translatable("alchemyexpanded.item_group.food")).icon(() -> new ItemStack((ItemLike)AEItems.DITO.get())).displayItems(AECreativeTabs::buildFoodTab).build());
        WEAPONS = REGISTER.register("weapons", () -> CreativeModeTab.builder().title(Component.translatable("alchemyexpanded.item_group.weapons")).icon(() -> new ItemStack((ItemLike)AEItems.ENGLISH_EXECUTIONER.get())).displayItems(AECreativeTabs::buildWeaponsTab).build());
    }
}
