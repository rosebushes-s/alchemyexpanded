package com.rosebushes.alchemyexpanded.event;

import com.rosebushes.alchemyexpanded.entity.CueballProjectileEntity;
import com.rosebushes.alchemyexpanded.entity.ProjectileEntity;
import com.rosebushes.alchemyexpanded.entity.TeleportProjectileEntity;
import com.rosebushes.alchemyexpanded.item.armor.SkaianetSneakersArmorItem;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.neoforge.event.ItemAttributeModifierEvent;
import net.neoforged.neoforge.event.entity.living.LivingHurtEvent;
import net.neoforged.neoforge.event.entity.living.LivingKnockBackEvent;

import java.util.UUID;

@Mod.EventBusSubscriber(
        modid = "alchemyexpanded",
        bus = Mod.EventBusSubscriber.Bus.FORGE
)
public class AEServerEventHandler {
    private static boolean hitByGun;
    private static final AttributeModifier STEP_MODIFIER = new AttributeModifier(UUID.fromString("6269204f-5f1b-4c57-9df7-5702e5fa5a8a"), "step_height_increase", 1.0, AttributeModifier.Operation.ADDITION);
    private static final AttributeModifier SPEED_MODIFIER = new AttributeModifier(UUID.fromString("cce82d31-b9a9-431a-9394-d1a64303eaa5"), "walk_speed_increase", 0.05, AttributeModifier.Operation.ADDITION);

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

    @SubscribeEvent
    public static void onItemAttributeModifierEvent(ItemAttributeModifierEvent event) {
        if(event.getSlotType().equals(EquipmentSlot.FEET)) {
            if(event.getItemStack().getItem() instanceof SkaianetSneakersArmorItem) {
                event.addModifier(NeoForgeMod.STEP_HEIGHT.value(), STEP_MODIFIER);
                event.addModifier(Attributes.MOVEMENT_SPEED, SPEED_MODIFIER);
            }
        }
    }
}
