package com.rosebushes.alchemyexpanded.network;

import com.mraof.minestuck.network.MSPacket;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlerEvent;

@Mod.EventBusSubscriber(
        modid = "alchemyexpanded",
        bus = Mod.EventBusSubscriber.Bus.MOD
)
public final class AEPayloads {

    @SubscribeEvent
    private static void register(RegisterPayloadHandlerEvent event) {
        event.registrar("alchemyexpanded").versioned("1").play(BulletEffectPacket.ID, BulletEffectPacket::read, MSPacket.PlayToClient::handler);
    }
}
