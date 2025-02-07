package com.rosebushes.alchemyexpanded.item;

import net.minecraft.world.food.FoodProperties;

public class AEFoods {
    public static final FoodProperties FLAY_DOH = (new FoodProperties.Builder().nutrition(0).saturationMod(0.1F).build());
    public static final FoodProperties DITO = (new FoodProperties.Builder().nutrition(1).saturationMod(0.0F).build());
    public static final FoodProperties DITO_DETRITUS = (new FoodProperties.Builder().nutrition(3).saturationMod(0.4F).alwaysEat().build());

    public AEFoods() {

    }
}
