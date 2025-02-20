package com.rosebushes.alchemyexpanded.event;

import com.rosebushes.alchemyexpanded.entity.CueballProjectileEntity;
import com.rosebushes.alchemyexpanded.entity.ProjectileEntity;
import com.rosebushes.alchemyexpanded.entity.TeleportProjectileEntity;
import net.minecraft.world.damagesource.DamageSource;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.living.LivingHurtEvent;
import net.neoforged.neoforge.event.entity.living.LivingKnockBackEvent;

@Mod.EventBusSubscriber(
        modid = "alchemyexpanded",
        bus = Mod.EventBusSubscriber.Bus.FORGE
)
public class AEServerEventHandler {
    private static boolean hitByGun;

    public AEServerEventHandler() {

    }

    @SubscribeEvent (
            priority = EventPriority.HIGHEST
    )
    public static void onEntityDamagedEvent (LivingHurtEvent event) {
        DamageSource source = event.getSource();

        if(source.getDirectEntity() instanceof ProjectileEntity || source.getDirectEntity() instanceof TeleportProjectileEntity || source.getDirectEntity() instanceof CueballProjectileEntity) {
            hitByGun = true;
        }
    }

    public static boolean wasHitByGun() {
        return hitByGun;
    }

    @SubscribeEvent (
            priority = EventPriority.LOWEST
    )
    public static void onEntityKnockbackEvent (LivingKnockBackEvent event) {
        if(wasHitByGun()) {
            event.setStrength(0.0F);
            hitByGun = false;
        }
    }
}
