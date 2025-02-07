package com.rosebushes.alchemyexpanded.item;

import com.mraof.minestuck.item.MSCreativeTabs;
import com.mraof.minestuck.item.MSItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
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
        output.accept((ItemLike) AEItems.CURSED_TAPE.get());
        output.accept((ItemLike) AEItems.FLAY_DOH.get());
    }

    private static void buildFoodTab(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output) {
        output.accept((ItemLike) AEItems.DITO.get());
        output.accept((ItemLike) AEItems.DITO_DETRITUS.get());
    }

    private static void buildWeaponsTab(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output) {
        output.accept((ItemLike) AEItems.GHOST_IN_THE_MACHINE.get());
        output.accept((ItemLike) AEItems.TILDEATH_DO_US_PART.get());
        output.accept((ItemLike) AEItems.BELL_BAT.get());
        output.accept((ItemLike) AEItems.DEAD_RINGER.get());
        output.accept((ItemLike) AEItems.REVOLVER.get());
    }

    static {
        REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "alchemyexpanded");
        MAIN = REGISTER.register("main", () -> CreativeModeTab.builder().title(Component.translatable("alchemyexpanded.item_group.main")).icon(() -> new ItemStack((ItemLike)AEItems.CURSED_TAPE.get())).displayItems(AECreativeTabs::buildMainTab).build());
        FOOD = REGISTER.register("food", () -> CreativeModeTab.builder().title(Component.translatable("alchemyexpanded.item_group.food")).icon(() -> new ItemStack((ItemLike)AEItems.DITO.get())).displayItems(AECreativeTabs::buildFoodTab).build());
        WEAPONS = REGISTER.register("weapons", () -> CreativeModeTab.builder().title(Component.translatable("alchemyexpanded.item_group.weapons")).icon(() -> new ItemStack((ItemLike)AEItems.GHOST_IN_THE_MACHINE.get())).displayItems(AECreativeTabs::buildWeaponsTab).build());
    }
}
