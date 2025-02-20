package com.rosebushes.alchemyexpanded.network;

import com.mraof.minestuck.Minestuck;
import com.mraof.minestuck.client.util.MagicEffect;
import com.mraof.minestuck.network.MSPacket;
import com.mraof.minestuck.network.MagicRangedEffectPacket;
import com.rosebushes.alchemyexpanded.AlchemyExpanded;
import com.rosebushes.alchemyexpanded.client.util.BulletEffect;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.phys.Vec3;

public record BulletEffectPacket(Vec3 pos, Vec3 lookVec) implements MSPacket.PlayToClient{
    public static final ResourceLocation ID = AlchemyExpanded.id("bullet_effect");

    public BulletEffectPacket(Vec3 pos, Vec3 lookVec) {
        this.pos = pos;
        this.lookVec = lookVec;
    }

    @Override
    public void execute() {
        BulletEffect.rangedCollisionEffect(ParticleTypes.CRIT, false, Minecraft.getInstance().level, this.pos);
    }

    public static BulletEffectPacket read(FriendlyByteBuf buffer) {
        Vec3 pos = buffer.readVec3();
        Vec3 lookVec = buffer.readVec3();
        return new BulletEffectPacket(pos, lookVec);
    }

    @Override
    public void write(FriendlyByteBuf buffer) {
        buffer.writeVec3(this.pos);
        buffer.writeVec3(this.lookVec);
    }

    @Override
    public ResourceLocation id() {
        return ID;
    }

    public Vec3 pos() {
        return this.pos;
    }

    public Vec3 lookVec() {
        return this.lookVec;
    }
}
