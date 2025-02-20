package com.rosebushes.alchemyexpanded.client;

import com.rosebushes.alchemyexpanded.AlchemyExpanded;
import com.rosebushes.alchemyexpanded.entity.*;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = AlchemyExpanded.MODID, value = Dist.CLIENT)
public class AEClient {
    @SubscribeEvent
    public static void registerEntityRenders(EntityRenderersEvent.RegisterRenderers event) {
        //Same renderer as potions
        event.registerEntityRenderer(AEEntities.BASIC_BULLET.get(), (context) -> new ThrownItemRenderer<ProjectileEntity>(context));
        event.registerEntityRenderer(AEEntities.CANDY_BULLET.get(), (context) -> new ThrownItemRenderer<CandyProjectileEntity>(context));
        event.registerEntityRenderer(AEEntities.GREEN_SUN_BULLET.get(), (context) -> new ThrownItemRenderer<TeleportProjectileEntity>(context));
        event.registerEntityRenderer(AEEntities.FLARE_PROJECTILE.get(), (context) -> new ThrownItemRenderer<FlareProjectileEntity>(context));
        event.registerEntityRenderer(AEEntities.EFFECT_BULLET.get(), (context) -> new ThrownItemRenderer<EffectProjectileEntity>(context));
        event.registerEntityRenderer(AEEntities.EFFECT_FLARE_PROJECTILE.get(), (context) -> new ThrownItemRenderer<EffectCloudProjectileEntity>(context));
        event.registerEntityRenderer(AEEntities.BARBASOL_BOMB_PROJECTILE.get(), (context) -> new ThrownItemRenderer<BarbasolBombProjectileEntity>(context));
        event.registerEntityRenderer(AEEntities.APPEARIFIER_PROJECTILE.get(), (context) -> new ThrownItemRenderer<AppearifierProjectileEntity>(context));
        event.registerEntityRenderer(AEEntities.CUEBALL_BULLET.get(), (context) -> new ThrownItemRenderer<CueballProjectileEntity>(context));
    }
}
