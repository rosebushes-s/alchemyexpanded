package com.rosebushes.alchemyexpanded.item;

import net.minecraft.world.food.FoodProperties;

public class AEFoods {
    public static final FoodProperties FLAY_DOH = (new FoodProperties.Builder().nutrition(0).saturationMod(0.1F).build());
    public static final FoodProperties DITO = (new FoodProperties.Builder().nutrition(1).saturationMod(0.0F).fast().build());
    public static final FoodProperties DITO_DETRITUS = (new FoodProperties.Builder().nutrition(3).saturationMod(0.4F).alwaysEat().build());
    public static final FoodProperties WARHEAD = (new FoodProperties.Builder().nutrition(1).saturationMod(0.1F).fast().alwaysEat().build());
    public static final FoodProperties CHICKEN_CLUB_SALAD = (new FoodProperties.Builder().nutrition(10).saturationMod(0.5F).build());
    public static final FoodProperties WIZARD_BERRIES = (new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).fast().alwaysEat().build());
    public static final FoodProperties WIZARDBERRY_GUSHERS = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2F).fast().alwaysEat().build());
    public static final FoodProperties HONEY_GUSHERS = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2F).fast().alwaysEat().build());
    public static final FoodProperties MILK_GUSHERS = (new FoodProperties.Builder().nutrition(2).saturationMod(0.2F).fast().alwaysEat().build());

    public AEFoods() {

    }
}
