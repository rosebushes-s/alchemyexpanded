package com.rosebushes.alchemyexpanded.item;

import com.mraof.minestuck.item.MSItemTypes;
import com.mraof.minestuck.item.weapon.WeaponItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AEItems {
    public static final DeferredRegister.Items REGISTER = DeferredRegister.createItems("alchemyexpanded");
    public static final DeferredItem<Item> CURSED_TAPE;
    public static final DeferredItem<Item> FLAY_DOH;
    public static final DeferredItem<Item> DITO;
    public static final DeferredItem<Item> DITO_DETRITUS;
    public static final DeferredItem<Item> GHOST_IN_THE_MACHINE;
    public static final DeferredItem<Item> TILDEATH_DO_US_PART;
    public static final DeferredItem<Item> BELL_BAT;
    public static final DeferredItem<Item> DEAD_RINGER;
    public static final DeferredItem<Item> REVOLVER;

    public AEItems() {
    }

    static {
        CURSED_TAPE = REGISTER.register("cursed_tape", () -> new Item((new Item.Properties()).stacksTo(1)));
        FLAY_DOH = REGISTER.register("flay_doh", () -> new Item((new Item.Properties()).food(AEFoods.FLAY_DOH)));

        DITO = REGISTER.register("dito", () -> new Item((new Item.Properties()).food(AEFoods.DITO)));
        DITO_DETRITUS = REGISTER.register("dito_detritus", () -> new Item((new Item.Properties()).food(AEFoods.DITO_DETRITUS)));

        GHOST_IN_THE_MACHINE = REGISTER.register("ghost_in_the_machine", () -> new WeaponItem((new WeaponItem.Builder(MSItemTypes.HORRORTERROR_TIER, 2, -1.0F)).efficiency(1.0F).set(MSItemTypes.KEY_TOOL), new Item.Properties()));
        TILDEATH_DO_US_PART = REGISTER.register("tildeath_do_us_part", () -> new WeaponItem((new WeaponItem.Builder(MSItemTypes.EMERALD_TIER, 1, -2.6F)).efficiency(1.0F).set(MSItemTypes.SCYTHE_TOOL), new Item.Properties()));
        BELL_BAT = REGISTER.register("bell_bat", () -> new WeaponItem((new WeaponItem.Builder(Tiers.IRON, 1, -2.8F)).efficiency(1.0F), new Item.Properties()));
        DEAD_RINGER = REGISTER.register("dead_ringer", () -> new WeaponItem((new WeaponItem.Builder(MSItemTypes.REGI_TIER, 2, -2.8F)).efficiency(1.0F), new Item.Properties()));

        REVOLVER = REGISTER.register("revolver", () -> new GunWeaponItem((new Item.Properties().stacksTo(1)), 4, 6, 0.4, 1, 0, 4, 6, 4));
    }
}
