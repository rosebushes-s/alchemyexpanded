package com.rosebushes.alchemyexpanded.item.weapon;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GloveWeaponItem extends Item {
    private final int meleeDamage;
    private final float attackSpeed;
    private final MobEffectInstance knockoutEffect;
    private final Multimap<Attribute, AttributeModifier> defaultModifiers;

    public GloveWeaponItem(Properties properties, int atkDamage, float atkSpeed, MobEffect effect) {
        super(properties);
        this.meleeDamage = atkDamage;
        this.attackSpeed = atkSpeed;
        this.knockoutEffect = new MobEffectInstance(effect, 80, 2);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(
                Attributes.ATTACK_DAMAGE,
                new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Weapon modifier", (double)this.meleeDamage, AttributeModifier.Operation.ADDITION)
        );
        builder.put(
                Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Weapon modifier", (double)attackSpeed, AttributeModifier.Operation.ADDITION)
        );
        this.defaultModifiers = builder.build();
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if(!stack.hasTag()) {
            setHitCount(stack, 0);
            setComboTimer(stack, 0);
        }

        if(getComboTimer(stack) >= 80) {
            setComboTimer(stack, 0);
            setHitCount(stack, 0);
        }

        if(getComboTimer(stack) > 0) {
            setComboTimer(stack, (getComboTimer(stack) + 1));
        }
        super.inventoryTick(stack, level, entity, slotId, isSelected);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if(getComboTimer(stack) < 80 && getComboTimer(stack) > 0) {
            if(getHitCount(stack) >= 5) {
                boolean playerDamage = attacker instanceof Player ? target.hurt(attacker.damageSources().playerAttack((Player)attacker), this.meleeDamage * 2.0F) : target.hurt(attacker.damageSources().mobAttack(attacker), this.meleeDamage * 1.5F);
                doKnockoutExtras(stack, target, attacker);
                if(playerDamage) {
                    Player player = (Player)attacker;
                    target.addEffect(new MobEffectInstance(knockoutEffect));
                    player.displayClientMessage(Component.translatable("message.alchemyexpanded.glove.combo_max"), true);
                    player.level().playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ANVIL_LAND, SoundSource.PLAYERS, 1.0F, 0.8F);
                }
                setHitCount(stack, 0);
                setComboTimer(stack, 0);
            }
            else {
                setHitCount(stack, getHitCount(stack) + 1);
            }
        }
        else {
            setComboTimer(stack, 1);
            setHitCount(stack, getHitCount(stack) + 1);
        }

        if(attacker instanceof Player player) {
            stack.hurtAndBreak(1, player, (playerEntity) -> playerEntity.broadcastBreakEvent(InteractionHand.MAIN_HAND));
        }
        return super.hurtEnemy(stack, target, attacker);
    }

    public void doKnockoutExtras(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if(!target.level().isClientSide) {
            target.level().explode(attacker, target.getX(), target.getY(), target.getZ(), 2, Level.ExplosionInteraction.NONE);
        }
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack) {
        return slot == EquipmentSlot.MAINHAND ? this.defaultModifiers : super.getAttributeModifiers(slot, stack);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }

    private void setHitCount(ItemStack stack, int amount) {
        CompoundTag tag = stack.getOrCreateTag();
        tag.putInt("hit_count", amount);
    }

    private int getHitCount(ItemStack stack) {
        if(stack.hasTag() && stack.getTag().contains("hit_count")) {
            return stack.getTag().getInt("hit_count");
        }
        else return 0;
    }

    private void setComboTimer(ItemStack stack, int amount) {
        CompoundTag tag = stack.getOrCreateTag();
        tag.putInt("combo_timer", amount);
    }

    private int getComboTimer(ItemStack stack) {
        if(stack.hasTag() && stack.getTag().contains("combo_timer")) {
            return stack.getTag().getInt("combo_timer");
        }
        else return 0;
    }

    public int getMeleeDamage() {
        return meleeDamage;
    }

    public float getAttackSpeed() {
        return attackSpeed;
    }
}
