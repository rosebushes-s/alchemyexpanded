package com.rosebushes.alchemyexpanded.item.weapon;

import com.rosebushes.alchemyexpanded.entity.EffectProjectileEntity;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class EffectGunWeaponItem extends GunWeaponItem {
    protected MobEffect effect;
    protected int duration;
    protected MobEffectInstance effectInstance;

    public EffectGunWeaponItem(Properties properties, float damage, double speed, int amount, float spread, int rate, int ammoCap, int ammoConsumption, int reload, MobEffect eff, int dur, boolean infinite, boolean dualWield, Item ammo, @Nullable Item iDouble) {
        super(properties, damage, speed, amount, spread, rate, ammoCap, ammoConsumption, reload, infinite, dualWield, ammo, iDouble);
        this.effect = eff;
        this.duration = dur;
        effectInstance = new MobEffectInstance(effect, duration, 2);
    }

    @Override
    public void shoot(Level level, Player shooter, ItemStack stack) {
        for (int i = 0; i < getAmount(); i++) {
            EffectProjectileEntity effBullet = new EffectProjectileEntity(level, shooter);
            effBullet.setWeapon(stack);

            effBullet.shootFromRotation(shooter, shooter.getXRot(), shooter.getYRot(), 0, (float) getSpeed(), getSpread());
            effBullet.setDamage(getWeaponDamage());
            effBullet.setEffect(effectInstance);
            effBullet.setDuration(duration);

            level.addFreshEntity(effBullet);
        }
    }

    @Override
    public void shootDouble(Level level, Player shooter, ItemStack stack) {
        for (int i = 0; i < getAmount() + getAmount(); i++) {
            EffectProjectileEntity effBullet = new EffectProjectileEntity(level, shooter);
            effBullet.setWeapon(stack);
            double dualWieldBonus = Math.round((getWeaponDamage() / 4) * 2) / 2.0F;

            effBullet.shootFromRotation(shooter, shooter.getXRot(), shooter.getYRot(), 0, (float) getSpeed(), getSpread());
            effBullet.setDamage(getWeaponDamage() + dualWieldBonus);
            effBullet.setEffect(effectInstance);
            effBullet.setDuration(duration);

            level.addFreshEntity(effBullet);
        }
    }
}
