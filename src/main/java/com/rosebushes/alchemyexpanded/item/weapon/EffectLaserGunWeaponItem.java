package com.rosebushes.alchemyexpanded.item.weapon;

import com.mraof.minestuck.client.util.MagicEffect;
import com.mraof.minestuck.network.MagicRangedEffectPacket;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.network.PacketDistributor;
import org.jetbrains.annotations.Nullable;

public class EffectLaserGunWeaponItem extends LaserGunWeaponItem {
    protected MobEffectInstance effect;

    public EffectLaserGunWeaponItem(Properties properties, float damage, int distance, int rate, int ammoCap, int ammoConsumption, int reload, MobEffect eff, int dur, boolean infinite, boolean dualWield, Item ammo, @Nullable Item iDouble) {
        super(properties, damage, distance, rate, ammoCap, ammoConsumption, reload, infinite, dualWield, ammo, iDouble);
        this.effect = new MobEffectInstance(eff, dur, 2);
    }

    @Override
    public void onHitEntity(LivingEntity entity) {
        super.onHitEntity(entity);
        if(!entity.level().isClientSide()) {
            entity.addEffect(new MobEffectInstance(effect));
        }
    }

    @Override
    public int getBarColor(ItemStack stack) {
        return Mth.hsvToRgb(0.8F, 1.0F, 0.8F);
    }

    @Override
    protected void sendEffectPacket(Level level, Vec3 pos, Vec3 lookVec, int length, boolean collides) {
        PacketDistributor.NEAR.with(new PacketDistributor.TargetPoint(pos.x, pos.y, pos.z, (double)64.0F, level.dimension())).send(new CustomPacketPayload[]{new MagicRangedEffectPacket(MagicEffect.RangedType.GREEN, pos, lookVec, length, collides)});
    }
}
