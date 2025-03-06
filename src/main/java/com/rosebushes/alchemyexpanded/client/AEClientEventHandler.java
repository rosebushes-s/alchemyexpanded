package com.rosebushes.alchemyexpanded.client;

import com.mraof.minestuck.item.armor.MSArmorItem;
import com.rosebushes.alchemyexpanded.item.armor.AEArmorItem;
import com.rosebushes.alchemyexpanded.item.weapon.gun.GunWeaponItem;
import net.minecraft.ChatFormatting;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RenderPlayerEvent;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

@Mod.EventBusSubscriber(
        modid = "alchemyexpanded",
        bus = Mod.EventBusSubscriber.Bus.FORGE,
        value = {Dist.CLIENT}
)
public class AEClientEventHandler {
    public AEClientEventHandler() {
    }

    @SubscribeEvent
    public static void modifySkinLayer(RenderPlayerEvent.Pre event) {
        Player player = event.getEntity();
        ItemStack headSlot = player.getItemBySlot(EquipmentSlot.HEAD);
        ItemStack chestSlot = player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack legsSlot = player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack feetSlot = player.getItemBySlot(EquipmentSlot.FEET);

        if((headSlot.getItem() instanceof AEArmorItem || headSlot.getItem() instanceof MSArmorItem) || (chestSlot.getItem() instanceof AEArmorItem || chestSlot.getItem() instanceof MSArmorItem) || (legsSlot.getItem() instanceof AEArmorItem || legsSlot.getItem() instanceof MSArmorItem) || (feetSlot.getItem() instanceof AEArmorItem || feetSlot.getItem() instanceof MSArmorItem)) {
            event.getRenderer().getModel().hat.visible = false;
            event.getRenderer().getModel().jacket.visible = false;
            event.getRenderer().getModel().leftSleeve.visible = false;
            event.getRenderer().getModel().rightSleeve.visible = false;
            event.getRenderer().getModel().leftPants.visible = false;
            event.getRenderer().getModel().rightPants.visible = false;
        }
    }

    @SubscribeEvent(
            priority = EventPriority.HIGHEST
    )
    public static void addCustomTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        int index = 1;

        ResourceLocation itemId = BuiltInRegistries.ITEM.getKey(stack.getItem());
        if (itemId != null && itemId.getNamespace().equals("alchemyexpanded")) {
            String name = stack.getDescriptionId() + ".tooltip";
            if (I18n.exists(name)) {
                if(stack.getItem() instanceof GunWeaponItem) {
                    event.getToolTip().add(1, Component.translatable(name).withStyle(ChatFormatting.GRAY));
                    event.getToolTip().add(2, Component.literal(""));
                }
                else {
                    event.getToolTip().add(1, Component.translatable(name).withStyle(ChatFormatting.GRAY));
                }
            }
        }
    }
}
