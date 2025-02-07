package com.rosebushes.alchemyexpanded.item;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.util.INBTSerializable;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GunWeaponItem extends Item implements INBTSerializable<CompoundTag> {
    protected int projectileDamage;
    protected double projectileSpeed;
    protected double projectileGravity;
    protected int projectileAmount;
    protected float projectileSpread;
    protected int fireRate;
    protected int ammoMax;
    protected int ammoCurrent;
    protected int reloadSpeed;

    public GunWeaponItem(Properties properties) {
        super(properties);
    }

    public GunWeaponItem(Properties properties, int damage, double speed, double gravity, int amount, float spread, int rate, int ammoCap, int reload) {
        this(properties);
        this.projectileDamage = damage;
        this.projectileSpeed = speed;
        this.projectileGravity = gravity;
        this.projectileAmount = amount;
        this.projectileSpread = spread;
        this.fireRate = rate;
        this.ammoMax = ammoCap;
        this.ammoCurrent = ammoCap;
        this.reloadSpeed = reload;
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag tag = new CompoundTag();
        tag.putInt("damage", this.projectileDamage);
        tag.putDouble("speed", this.projectileSpeed);
        tag.putDouble("gravity", this.projectileGravity);
        tag.putInt("amount", this.projectileAmount);
        tag.putFloat("spread", this.projectileSpread);
        tag.putInt("rate", this.fireRate);
        tag.putInt("ammo", this.ammoMax);
        tag.putInt("current", this.ammoCurrent);
        tag.putInt("reload", this.reloadSpeed);
        return tag;
    }

    @Override
    public void deserializeNBT(CompoundTag tag) {
        if(tag.contains("damage", Tag.TAG_ANY_NUMERIC))
        {
            this.projectileDamage = tag.getInt("damage");
        }
        if(tag.contains("speed", Tag.TAG_ANY_NUMERIC))
        {
            this.projectileSpeed = tag.getDouble("speed");
        }
        if(tag.contains("gravity", Tag.TAG_ANY_NUMERIC))
        {
            this.projectileGravity = tag.getInt("gravity");
        }
        if(tag.contains("amount", Tag.TAG_ANY_NUMERIC))
        {
            this.projectileAmount = tag.getInt("amount");
        }
        if(tag.contains("spread", Tag.TAG_ANY_NUMERIC))
        {
            this.projectileSpread = tag.getInt("spread");
        }
        if(tag.contains("rate", Tag.TAG_ANY_NUMERIC))
        {
            this.fireRate = tag.getInt("rate");
        }
        if(tag.contains("ammo", Tag.TAG_ANY_NUMERIC))
        {
            this.ammoMax = tag.getInt("ammo");
        }
        if(tag.contains("current", Tag.TAG_ANY_NUMERIC))
        {
            this.ammoCurrent = tag.getInt("current");
        }
        if(tag.contains("reload", Tag.TAG_ANY_NUMERIC))
        {
            this.reloadSpeed = tag.getInt("reload");
        }
    }

    public int getDamage(ItemStack stack) {
        return stack.hasTag() && stack.getTag().contains("damage", Tag.TAG_ANY_NUMERIC) ? stack.getTag().getInt("damage") : 1;
    }

    public double getSpeed(ItemStack stack) {
        return stack.hasTag() && stack.getTag().contains("speed", Tag.TAG_ANY_NUMERIC) ? stack.getTag().getDouble("speed") : 1.0;
    }

    public double getGravity(ItemStack stack) {
        return stack.hasTag() && stack.getTag().contains("gravity", Tag.TAG_ANY_NUMERIC) ? stack.getTag().getDouble("gravity") : 1;
    }

    public float getSpread(ItemStack stack) {
        return stack.hasTag() && stack.getTag().contains("spread", Tag.TAG_ANY_NUMERIC) ? stack.getTag().getFloat("spread") : 0.0F;
    }

    public int getAmount(ItemStack stack) {
        return stack.hasTag() && stack.getTag().contains("amount", Tag.TAG_ANY_NUMERIC) ? stack.getTag().getInt("amount") : 1;
    }

    public int getRate(ItemStack stack) {
        return stack.hasTag() && stack.getTag().contains("rate", Tag.TAG_ANY_NUMERIC) ? stack.getTag().getInt("rate") : 1;
    }

    public int getAmmo(ItemStack stack) {
        return stack.hasTag() && stack.getTag().contains("ammo", Tag.TAG_ANY_NUMERIC) ? stack.getTag().getInt("ammo") : 1;
    }

    public int getAmmoCurrent(ItemStack stack) {
        return stack.hasTag() && stack.getTag().contains("current", Tag.TAG_ANY_NUMERIC) ? stack.getTag().getInt("current") : 1;
    }

    public int getReload(ItemStack stack) {
        return stack.hasTag() && stack.getTag().contains("reload", Tag.TAG_ANY_NUMERIC) ? stack.getTag().getInt("reload") : 1;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {

    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltipComponents, TooltipFlag isAdvanced) {
        int damage = getDamage(stack);
        float spread = getSpread(stack);
        int amount = getAmount(stack);
        int rate = getRate(stack);
        int ammoCap = getAmmo(stack);
        int ammoCurrent = getAmmoCurrent(stack);
        tooltipComponents.add(Component.translatable("info.alchemyexpanded.gun.damage", new Object[]{damage}));
        tooltipComponents.add(Component.translatable("info.alchemyexpanded.gun.spread", new Object[]{spread}));
        tooltipComponents.add(Component.translatable("info.alchemyexpanded.gun.amount", new Object[]{amount}));
        tooltipComponents.add(Component.translatable("info.alchemyexpanded.gun.rate", new Object[]{rate}));
        tooltipComponents.add(Component.translatable("info.alchemyexpanded.gun.ammo_current", new Object[]{ammoCurrent}));
        tooltipComponents.add(Component.translatable("info.alchemyexpanded.gun.ammo_max", new Object[]{ammoCap}));
    }
}
