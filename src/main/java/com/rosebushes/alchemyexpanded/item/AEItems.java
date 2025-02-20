package com.rosebushes.alchemyexpanded.item;

import com.mraof.minestuck.item.MSItemTypes;
import com.mraof.minestuck.item.MSItems;
import com.mraof.minestuck.item.weapon.ItemRightClickEffect;
import com.mraof.minestuck.item.weapon.OnHitEffect;
import com.mraof.minestuck.item.weapon.WeaponItem;
import com.mraof.minestuck.item.weapon.projectiles.ConsumableProjectileWeaponItem;
import com.mraof.minestuck.player.EnumAspect;
import com.rosebushes.alchemyexpanded.item.weapon.*;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.alchemy.Potions;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AEItems {
    public static final DeferredRegister.Items REGISTER = DeferredRegister.createItems("alchemyexpanded");
    public static final DeferredItem<Item> AMMO;
    public static final DeferredItem<Item> FLARE;
    public static final DeferredItem<Item> CROCKERCORP_AMMO;
    public static final DeferredItem<Item> LASER_AMMO;
    public static final DeferredItem<Item> CHICKEN_CLUB_STAR;
    public static final DeferredItem<Item> GUN_PARTS;
    public static final DeferredItem<Item> DUMMY_BULLET;
    public static final DeferredItem<Item> DUMMY_CANDY_BULLET;
    public static final DeferredItem<Item> DUMMY_GREEN_SUN_BULLET;
    public static final DeferredItem<Item> DUMMY_FLARE_BULLET;
    public static final DeferredItem<Item> DUMMY_CROCKERCORP_BULLET;
    public static final DeferredItem<Item> CURSED_TAPE;
    public static final DeferredItem<Item> SADAKOS_MIXING_BOWL;
    public static final DeferredItem<Item> GREEN_SUN_BOOK;
    public static final DeferredItem<Item> FLAY_DOH;
    public static final DeferredItem<Item> DITO;
    public static final DeferredItem<Item> DITO_DETRITUS;
    public static final DeferredItem<Item> NUCLEAR_WARHEAD;
    public static final DeferredItem<Item> CHICKEN_CLUB_SALAD;
    public static final DeferredItem<Item> WIZARD_BERRIES;
    public static final DeferredItem<Item> COOKING_WITH_SADAKO;
    public static final DeferredItem<Item> GHOST_IN_THE_MACHINE;
    public static final DeferredItem<Item> TILDEATH_DO_US_PART;
    public static final DeferredItem<Item> BELL_BAT;
    public static final DeferredItem<Item> DEAD_RINGER;
    public static final DeferredItem<Item> DEULING_BLADE;
    public static final DeferredItem<Item> FRONTIER_AXE;
    public static final DeferredItem<Item> BLACK_SCEPTER;
    public static final DeferredItem<Item> GOLD_SCEPTER;
    public static final DeferredItem<Item> GREEN_SUN_CUESTAFF;
    //public static final DeferredItem<Item> TOPAZ_QUARTET;
    //public static final DeferredItem<Item> OPAL_DECATET;
    public static final DeferredItem<Item> FLINTLOCK_PISTOL;
    public static final DeferredItem<Item> FLARE_GUN;
    public static final DeferredItem<Item> GAMMA_BLASTER;
    public static final DeferredItem<Item> BREATH_BLASTER;
    public static final DeferredItem<Item> REVOLVER;
    public static final DeferredItem<Item> SIXLET_SIXSHOOTER;
    public static final DeferredItem<Item> DAPPLE_DEULY;
    public static final DeferredItem<Item> LASER_PISTOL;
    public static final DeferredItem<Item> BERETTA;
    public static final DeferredItem<Item> REGIPISTOL;
    public static final DeferredItem<Item> GOLDEN_GRIP;
    public static final DeferredItem<Item> APPEARIFIER_PISTOL;
    public static final DeferredItem<Item> WHITE_MAGNUM;
    public static final DeferredItem<Item> MACHINE_GUN;
    public static final DeferredItem<Item> GIRLS_BEST_FRIEND;
    public static final DeferredItem<Item> GREEN_SUN_STREETSWEEPER;
    public static final DeferredItem<Item> FLINTLOCK_RIFLE;
    public static final DeferredItem<Item> RIFLE;
    public static final DeferredItem<Item> CANDY_CARBINE;
    public static final DeferredItem<Item> BLACK_ASSAULT_RIFLE;
    public static final DeferredItem<Item> GOLD_ASSAULT_RIFLE;
    public static final DeferredItem<Item> ENGLISH_EXECUTIONER;
    public static final DeferredItem<Item> SNIPER_RIFLE;
    public static final DeferredItem<Item> REGIRIFLE;
    public static final DeferredItem<Item> LASER_RIFLE;
    public static final DeferredItem<Item> ANNIES_GOT_A_GUN;
    public static final DeferredItem<Item> SHOTGUN;
    public static final DeferredItem<Item> BLUNDERBUSS;
    public static final DeferredItem<Item> BARBASOL_BOMB_LAUNCHER;
    public static final DeferredItem<Item> APPEARIFIER_RIFLE;

    public AEItems() {
    }

    static {
        AMMO = REGISTER.register("ammo", () -> new Item(new Item.Properties()));
        FLARE = REGISTER.register("flare", () -> new Item(new Item.Properties()));
        CROCKERCORP_AMMO = REGISTER.register("crockercorp_ammo", () -> new Item(new Item.Properties()));
        LASER_AMMO = REGISTER.register("laser_ammo", () -> new Item(new Item.Properties()));
        GUN_PARTS = REGISTER.register("gun_parts", () -> new Item(new Item.Properties()));

        CHICKEN_CLUB_STAR = REGISTER.register("chicken_club_star", () -> new ConsumableProjectileWeaponItem((new Item.Properties()), 1.5F, 2.4F, 2));

        DUMMY_BULLET = REGISTER.register("bullet", () -> new Item(new Item.Properties()));
        DUMMY_CANDY_BULLET = REGISTER.register("candy_bullet", () -> new Item(new Item.Properties()));
        DUMMY_GREEN_SUN_BULLET = REGISTER.register("green_sun_bullet", () -> new Item(new Item.Properties()));
        DUMMY_FLARE_BULLET = REGISTER.register("flare_bullet", () -> new Item(new Item.Properties()));
        DUMMY_CROCKERCORP_BULLET = REGISTER.register("crockercorp_bullet", () -> new Item(new Item.Properties()));

        CURSED_TAPE = REGISTER.register("cursed_tape", () -> new Item(new Item.Properties()));
        SADAKOS_MIXING_BOWL = REGISTER.register("sadakos_mixing_bowl", () -> new MixingBowlItem(new Item.Properties().rarity(Rarity.EPIC)));
        GREEN_SUN_BOOK = REGISTER.register("green_sun_book", () -> new Item(new Item.Properties()));
        FLAY_DOH = REGISTER.register("flay_doh", () -> new Item(new Item.Properties().food(AEFoods.FLAY_DOH)));

        DITO = REGISTER.register("dito", () -> new Item(new Item.Properties().food(AEFoods.DITO)));
        DITO_DETRITUS = REGISTER.register("dito_detritus", () -> new Item(new Item.Properties().food(AEFoods.DITO_DETRITUS)));
        NUCLEAR_WARHEAD = REGISTER.register("nuclear_warhead", () -> new EffectFoodItem((new Item.Properties().food(AEFoods.WARHEAD)), MobEffects.WITHER, 60, 1));
        CHICKEN_CLUB_SALAD = REGISTER.register("chicken_club_salad", () -> new Item(new Item.Properties().food(AEFoods.CHICKEN_CLUB_SALAD).stacksTo(1)));
        WIZARD_BERRIES = REGISTER.register("wizard_berries", () -> new EffectFoodItem((new Item.Properties().stacksTo(16).food(AEFoods.WIZARD_BERRIES).rarity(Rarity.UNCOMMON)), MobEffects.SLOW_FALLING, 100, 1));

        COOKING_WITH_SADAKO = REGISTER.register("cooking_with_sadako", () -> new WeaponItem((new WeaponItem.Builder(MSItemTypes.HORRORTERROR_TIER, 1, -2.4F)).efficiency(2.0F).set(MSItemTypes.SHOVEL_TOOL), new Item.Properties().rarity(Rarity.RARE)));
        GHOST_IN_THE_MACHINE = REGISTER.register("ghost_in_the_machine", () -> new WeaponItem((new WeaponItem.Builder(MSItemTypes.HORRORTERROR_TIER, 2, -1.0F)).efficiency(1.0F).set(MSItemTypes.KEY_TOOL), new Item.Properties().rarity(Rarity.RARE)));
        TILDEATH_DO_US_PART = REGISTER.register("tildeath_do_us_part", () -> new WeaponItem((new WeaponItem.Builder(MSItemTypes.EMERALD_TIER, 1, -2.6F)).efficiency(1.0F).set(MSItemTypes.SCYTHE_TOOL), new Item.Properties().rarity(Rarity.UNCOMMON)));
        BELL_BAT = REGISTER.register("bell_bat", () -> new WeaponItem((new WeaponItem.Builder(Tiers.IRON, 1, -2.8F)).efficiency(1.0F).add(OnHitEffect.playSound((() -> SoundEvents.BELL_BLOCK), 1.0F, 1.0F)), new Item.Properties()));
        DEAD_RINGER = REGISTER.register("dead_ringer", () -> new WeaponItem((new WeaponItem.Builder(MSItemTypes.REGI_TIER, 2, -2.8F)).efficiency(1.0F).add(OnHitEffect.playSound((() -> SoundEvents.BELL_BLOCK), 1.0F, 0.6F)), new Item.Properties().rarity(Rarity.RARE)));
        FRONTIER_AXE = REGISTER.register("frontier_axe", () -> new WeaponItem((new WeaponItem.Builder(Tiers.DIAMOND, 7, -3.0F)).efficiency(5.0F).set(MSItemTypes.AXE_TOOL).set(ItemRightClickEffect.switchTo(AEItems.ANNIES_GOT_A_GUN)), new Item.Properties().rarity(Rarity.RARE)));
        DEULING_BLADE = REGISTER.register("deuling_blade", () -> new WeaponItem((new WeaponItem.Builder(Tiers.DIAMOND, 5, -2.4F)).efficiency(1.0F).set(MSItemTypes.SWORD_TOOL).set(ItemRightClickEffect.switchTo(AEItems.DAPPLE_DEULY)), new Item.Properties().rarity(Rarity.RARE)));
        BLACK_SCEPTER = REGISTER.register("black_scepter", () -> new WeaponItem((new WeaponItem.Builder(Tiers.IRON, 2, -2.0F)).efficiency(1.0F).set(ItemRightClickEffect.switchTo(AEItems.BLACK_ASSAULT_RIFLE)), new Item.Properties()));
        GOLD_SCEPTER = REGISTER.register("gold_scepter", () -> new WeaponItem((new WeaponItem.Builder(Tiers.DIAMOND, 3, -2.0F)).efficiency(1.0F).set(ItemRightClickEffect.switchTo(AEItems.GOLD_ASSAULT_RIFLE)), new Item.Properties().rarity(Rarity.UNCOMMON)));
        GREEN_SUN_CUESTAFF = REGISTER.register("green_sun_cuestaff", () -> new WeaponItem((new WeaponItem.Builder(Tiers.NETHERITE, 7, -2.0F)).efficiency(1.0F).set(ItemRightClickEffect.switchTo(AEItems.ENGLISH_EXECUTIONER)).add(OnHitEffect.requireAspect(EnumAspect.TIME, OnHitEffect.TIME_SLOWNESS_AOE)), new Item.Properties().rarity(Rarity.EPIC)));

        //TOPAZ_QUARTET = REGISTER.register("topaz_quartet", () -> new DiceWeaponItem((new Item.Properties().rarity(Rarity.RARE).durability(444)), 4, 4, 1, true));
        //OPAL_DECATET = REGISTER.register("opal_decatet", () -> new DiceWeaponItem((new Item.Properties().rarity(Rarity.RARE).durability(1010)), 10, 10, 1, true));

        FLINTLOCK_PISTOL = REGISTER.register("flintlock_pistol", () -> new GunWeaponItem((new Item.Properties()), 3.5F, 2.0F, 1, 3.0F, 10, 1, 1, 80, false, true, AEItems.AMMO.get(), null));
        FLARE_GUN = REGISTER.register("flare_gun", () -> new FlareGunWeaponItem((new Item.Properties()), 5.0F, 1.5, 1, 0.5F, 10, 1, 1, 80, false, true, AEItems.FLARE.get(), null));
        GAMMA_BLASTER = REGISTER.register("gamma_blaster", () -> new EffectLaserGunWeaponItem((new Item.Properties()), 6.5F, 20, 10, 10, 1, 80, MobEffects.WITHER, 80, false, true, AEItems.LASER_AMMO.get(), null));
        BREATH_BLASTER = REGISTER.register("breath_blaster", () -> new EffectCloudGunWeaponItem((new Item.Properties().rarity(Rarity.UNCOMMON)), 8.0F, 2.0F, 1, 0.5F, 10, 4, 1, 100, 60, 2, Mth.hsvToRgb(0.8F, 1.0F, 0.6F), Potions.HARMING, false, true, AEItems.FLARE.get(), null));
        REVOLVER = REGISTER.register("revolver", () -> new GunWeaponItem((new Item.Properties()), 4.0F, 3.0, 1, 0.1F, 10, 6, 2, 70, false, true, AEItems.AMMO.get(), null));
        SIXLET_SIXSHOOTER = REGISTER.register("sixlet_sixshooter", () -> new CandyGunWeaponItem((new Item.Properties()), 3.5F, 3.0, 1, 0.1F, 10, 6, 1, 70, false, true, MSItems.CANDY_CORN.get(), null));
        DAPPLE_DEULY = REGISTER.register("dapple_deuly", () -> new GunWeaponItem((new Item.Properties().rarity(Rarity.RARE)), 7.0F, 3.0, 1, 0.1F, 8, 18, 3, 60, false, true, AEItems.AMMO.get(), AEItems.DEULING_BLADE.get()));
        LASER_PISTOL = REGISTER.register("laser_pistol", () -> new LaserGunWeaponItem((new Item.Properties().rarity(Rarity.UNCOMMON)), 6.5F, 16, 10, 12, 2, 70, false, true, AEItems.LASER_AMMO.get(), null));
        BERETTA = REGISTER.register("beretta", () -> new GunWeaponItem((new Item.Properties()), 4.5F, 3.0, 1, 0.1F, 8, 15, 2, 70, false, true, AEItems.AMMO.get(), null));
        REGIPISTOL = REGISTER.register("regipistol", () -> new GunWeaponItem((new Item.Properties()), 5.5F, 3.0, 1, 0.1F, 8, 24, 2, 70, false, true, AEItems.AMMO.get(), null));
        GOLDEN_GRIP = REGISTER.register("golden_grip", () -> new GunWeaponItem((new Item.Properties().rarity(Rarity.UNCOMMON)), 6.5F, 3.0, 1, 0.1F, 8, 30, 3, 70, false, true, AEItems.AMMO.get(), null));
        APPEARIFIER_PISTOL = REGISTER.register("appearifier_pistol", () -> new AppearifierGunWeaponItem((new Item.Properties().rarity(Rarity.RARE)), 4.0F, 0.0F, 10, 1, 1, 60, false, AEItems.CROCKERCORP_AMMO.get(), null));
        WHITE_MAGNUM = REGISTER.register("white_magnum", () -> new CueballGunWeaponItem((new Item.Properties()), 3.0F, 0.0F, 10, 80));

        FLINTLOCK_RIFLE = REGISTER.register("flintlock_rifle", () -> new GunWeaponItem((new Item.Properties()), 5.5F, 2.0F, 1, 3.0F, 10, 1, 1, 80, false, false, AEItems.AMMO.get(), null));
        RIFLE = REGISTER.register("rifle", () -> new GunWeaponItem((new Item.Properties()), 10.0F, 3.0, 1, 0.1F, 10, 1, 1, 50, false, false, AEItems.AMMO.get(), null));
        CANDY_CARBINE = REGISTER.register("candy_carbine", () -> new CandyGunWeaponItem((new Item.Properties()), 8.0F, 3.0, 1, 0.1F, 10, 1, 1, 50, false, false, MSItems.CANDY_CORN.get(), null));
        BLACK_ASSAULT_RIFLE = REGISTER.register("black_assault_rifle", () -> new GunWeaponItem((new Item.Properties()), 2.5F, 3.5, 1, 2.0F, 4, 20, 2, 80, false, false, AEItems.AMMO.get(), AEItems.BLACK_SCEPTER.get()));
        GOLD_ASSAULT_RIFLE = REGISTER.register("gold_assault_rifle", () -> new GunWeaponItem((new Item.Properties().rarity(Rarity.UNCOMMON)), 4.5F, 3.0, 1, 2.0F, 4, 40, 2, 80, false, false, AEItems.AMMO.get(), AEItems.GOLD_SCEPTER.get()));
        ENGLISH_EXECUTIONER = REGISTER.register("english_executioner", () -> new ScopedGunWeaponItem((new Item.Properties().rarity(Rarity.EPIC)), 7.0F, 3.0, 1, 2.0F, 4, 100, 0, 0, true, false, AEItems.AMMO.get(), AEItems.GREEN_SUN_CUESTAFF.get()));
        SNIPER_RIFLE = REGISTER.register("sniper_rifle", () -> new ScopedGunWeaponItem((new Item.Properties()), 16.0F, 4.0, 1, 0.0F, 10, 1, 1, 80, false, false, AEItems.AMMO.get(), null));
        REGIRIFLE = REGISTER.register("regirifle", () -> new ScopedGunWeaponItem((new Item.Properties()), 20.0F, 4.0, 1, 0.0F, 20, 2, 1, 80, false, false, AEItems.AMMO.get(), null));
        LASER_RIFLE = REGISTER.register("laser_rifle", () -> new LaserGunWeaponItem((new Item.Properties().rarity(Rarity.UNCOMMON)), 14.0F, 20, 10, 6, 2, 60, false, false, AEItems.LASER_AMMO.get(), null));
        ANNIES_GOT_A_GUN = REGISTER.register("annies_got_a_gun", () -> new GunWeaponItem((new Item.Properties().rarity(Rarity.RARE)), 12.0F, 3.0F, 1, 0.1F, 10, 12, 2, 60, false, false, AEItems.AMMO.get(), AEItems.FRONTIER_AXE.get()));
        MACHINE_GUN = REGISTER.register("machine_gun", () -> new GunWeaponItem((new Item.Properties()), 2.0F, 3.0, 1, 5.0F, 4, 40, 2, 80, false, false, AEItems.AMMO.get(), null));
        GIRLS_BEST_FRIEND = REGISTER.register("girls_best_friend", () -> new GunWeaponItem((new Item.Properties().rarity(Rarity.RARE)), 4.0F, 3.0, 2, 3.0F, 4, 80, 3, 70, false, false, AEItems.AMMO.get(), null));
        GREEN_SUN_STREETSWEEPER = REGISTER.register("green_sun_streetsweeper", () -> new TeleportGunWeaponItem((new Item.Properties().rarity(Rarity.EPIC)), 5.5F, 3.0, 3, 3.0F, 4, 120, 4, 50, false, false, AEItems.AMMO.get(), null, 1, 3, 0, 1, 3));
        BARBASOL_BOMB_LAUNCHER = REGISTER.register("barbasol_bomb_launcher", () -> new BarbasolLauncherGunWeaponItem((new Item.Properties().rarity(Rarity.UNCOMMON)), 20.0F, 2.0F, 1, 0.0F, 10, 1, 1, 80, false, false, MSItems.BARBASOL_BOMB.get(), null));
        APPEARIFIER_RIFLE = REGISTER.register("appearifier_rifle", () -> new AppearifierGunWeaponItem((new Item.Properties().rarity(Rarity.RARE)), 4.0F, 0.0F, 10, 1, 1, 40, false, AEItems.CROCKERCORP_AMMO.get(), null));

        SHOTGUN = REGISTER.register("shotgun", () -> new GunWeaponItem((new Item.Properties()), 3.0F, 1.0F, 8, 20.0F, 10, 1, 4, 60, false, false, AEItems.AMMO.get(), null));
        BLUNDERBUSS = REGISTER.register("blunderbuss", () -> new GunWeaponItem((new Item.Properties()), 4.5F, 1.0F, 10, 20.0F, 10, 1, 4, 40, false, false, AEItems.AMMO.get(), null));
    }
}
