package com.rosebushes.alchemyexpanded.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class AEItemTypes {
    public static final ArmorMaterial CLOTHES_ARMOR;
    public static final ArmorMaterial SUIT_ARMOR;
    public static final ArmorMaterial SLIME_SUIT_ARMOR;
    public static final ArmorMaterial WISE_GUY_SLIME_SUIT_ARMOR;
    public static final ArmorMaterial SHADES_ARMOR;
    public static final ArmorMaterial MAGNET_ARMOR;
    public static final ArmorMaterial ROCKET_ARMOR;
    public static final ArmorMaterial MAGMATIC_ARMOR;

    public AEItemTypes() {
    }

    static {
        CLOTHES_ARMOR = new ModArmorMaterial("alchemyexpanded:clothes", 12, Map.of(ArmorItem.Type.BOOTS, 1, ArmorItem.Type.LEGGINGS, 2, ArmorItem.Type.CHESTPLATE, 3, ArmorItem.Type.HELMET, 1), 4, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> Ingredient.of(new ItemLike[]{Items.WHITE_WOOL}));
        SUIT_ARMOR = new ModArmorMaterial("alchemyexpanded:suit", 12, Map.of(ArmorItem.Type.BOOTS, 1, ArmorItem.Type.LEGGINGS, 2, ArmorItem.Type.CHESTPLATE, 3, ArmorItem.Type.HELMET, 1), 10, SoundEvents.ARMOR_EQUIP_LEATHER, 0.0F, 0.0F, () -> Ingredient.of(new ItemLike[]{Items.BLACK_WOOL}));
        SLIME_SUIT_ARMOR = new ModArmorMaterial("alchemyexpanded:slime_suit", 13, Map.of(ArmorItem.Type.BOOTS, 2, ArmorItem.Type.LEGGINGS, 3, ArmorItem.Type.CHESTPLATE, 4, ArmorItem.Type.HELMET, 2), 12, SoundEvents.ARMOR_EQUIP_LEATHER, 0.5F, 0.0F, () -> Ingredient.of(new ItemLike[]{Items.SLIME_BALL}));
        WISE_GUY_SLIME_SUIT_ARMOR = new ModArmorMaterial("alchemyexpanded:wise_guy_slime_suit", 14, Map.of(ArmorItem.Type.BOOTS, 3, ArmorItem.Type.LEGGINGS, 4, ArmorItem.Type.CHESTPLATE, 5, ArmorItem.Type.HELMET, 3), 14, SoundEvents.ARMOR_EQUIP_LEATHER, 1.0F, 0.1F, () -> Ingredient.of(new ItemLike[]{Items.SLIME_BALL}));
        SHADES_ARMOR = new ModArmorMaterial("alchemyexpanded:shades", 20, Map.of(ArmorItem.Type.BOOTS, 1, ArmorItem.Type.LEGGINGS, 1, ArmorItem.Type.CHESTPLATE, 1, ArmorItem.Type.HELMET, 2), 20, SoundEvents.ARMOR_EQUIP_GENERIC, 0.5F, 0.0F, () -> Ingredient.of(new ItemLike[]{Items.BLACK_STAINED_GLASS}));
        MAGNET_ARMOR = new ModArmorMaterial("alchemyexpanded:magnet", 30, Map.of(ArmorItem.Type.BOOTS, 2, ArmorItem.Type.LEGGINGS, 3, ArmorItem.Type.CHESTPLATE, 4, ArmorItem.Type.HELMET, 2), 5, SoundEvents.ARMOR_EQUIP_IRON, 0.5F, 0.0F, () -> Ingredient.of(new ItemLike[]{Items.IRON_INGOT}));
        ROCKET_ARMOR = new ModArmorMaterial("alchemyexpanded:rocket", 50, Map.of(ArmorItem.Type.BOOTS, 2, ArmorItem.Type.LEGGINGS, 3, ArmorItem.Type.CHESTPLATE, 4, ArmorItem.Type.HELMET, 2), 15, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> Ingredient.of(new ItemLike[]{Items.FIREWORK_ROCKET}));
        MAGMATIC_ARMOR = new ModArmorMaterial("alchemyexpanded:magmatic", 65, Map.of(ArmorItem.Type.BOOTS, 4, ArmorItem.Type.LEGGINGS, 5, ArmorItem.Type.CHESTPLATE, 6, ArmorItem.Type.HELMET, 5), 24, SoundEvents.ARMOR_EQUIP_NETHERITE, 2.5F, 0.0F, () -> Ingredient.of(new ItemLike[]{Items.MAGMA_CREAM}));
    }

    private static class ModArmorMaterial implements ArmorMaterial {
        private static final Map<ArmorItem.Type, Integer> DURABILITY_MOD_BY_TYPE;
        private final String name;
        private final int maxDamageFactor;
        private final Map<ArmorItem.Type, Integer> damageReductionByType;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final float toughness;
        private final float knockbackResistance;
        private final LazyLoadedValue<Ingredient> repairMaterial;

        public ModArmorMaterial(String name, int maxDamageFactor, Map<ArmorItem.Type, Integer> damageReductionByType, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) {
            this.name = name;
            this.maxDamageFactor = maxDamageFactor;
            this.damageReductionByType = new EnumMap(damageReductionByType);
            this.enchantability = enchantability;
            this.soundEvent = soundEvent;
            this.toughness = toughness;
            this.knockbackResistance = knockbackResistance;
            this.repairMaterial = new LazyLoadedValue(repairMaterial);
        }

        public String getName() {
            return this.name;
        }

        public int getDurabilityForType(ArmorItem.Type type) {
            return (Integer) DURABILITY_MOD_BY_TYPE.get(type) * this.maxDamageFactor;
        }

        public int getDefenseForType(ArmorItem.Type type) {
            return (Integer) this.damageReductionByType.get(type);
        }

        public int getEnchantmentValue() {
            return this.enchantability;
        }

        public SoundEvent getEquipSound() {
            return this.soundEvent;
        }

        public float getToughness() {
            return this.toughness;
        }

        public float getKnockbackResistance() {
            return this.knockbackResistance;
        }

        public Ingredient getRepairIngredient() {
            return (Ingredient) this.repairMaterial.get();
        }

        static {
            DURABILITY_MOD_BY_TYPE = new EnumMap(Map.of(ArmorItem.Type.BOOTS, 13, ArmorItem.Type.LEGGINGS, 15, ArmorItem.Type.CHESTPLATE, 16, ArmorItem.Type.HELMET, 11));
        }
    }
}
