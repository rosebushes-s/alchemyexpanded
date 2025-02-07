package com.rosebushes.alchemyexpanded.entity;

import com.mraof.minestuck.player.Echeladder;
import com.rosebushes.alchemyexpanded.item.GunWeaponItem;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.common.util.FakePlayer;
import net.neoforged.neoforge.entity.IEntityWithComplexSpawn;

public class ProjectileEntity extends Entity implements IEntityWithComplexSpawn {

    protected int ownerID;
    protected LivingEntity owner;
    private ItemStack gun = ItemStack.EMPTY;
    private ItemStack item = ItemStack.EMPTY;
    protected double gravity;
    protected int life = 10;

    public ProjectileEntity(EntityType<? extends Entity> entityType, Level level) {
        super(entityType, level);
    }

    public ProjectileEntity(EntityType<? extends Entity> entityType, Level world, LivingEntity shooter, ItemStack weapon, GunWeaponItem item) {
        this(entityType, world);
        this.ownerID = shooter.getId();
        this.owner = shooter;
        this.gravity = weapon.hasTag() && weapon.getTag().contains("gravity", CompoundTag.TAG_ANY_NUMERIC) ? weapon.getTag().getDouble("gravity") : 0;

        Vec3 dir = getDir(shooter, weapon);
        double speed = weapon.hasTag() && weapon.getTag().contains("speed", CompoundTag.TAG_ANY_NUMERIC) ? weapon.getTag().getDouble("speed") : 1.0F;
        this.setDeltaMovement(dir.x * speed, dir.y * speed, dir.z * speed);
        this.updateHeading();

        double posX = shooter.xOld + (shooter.getX() - shooter.xOld) / 2.0;
        double posY = shooter.yOld + (shooter.getY() - shooter.yOld) / 2.0 + shooter.getEyeHeight();
        double posZ = shooter.zOld + (shooter.getZ() - shooter.zOld) / 2.0;
        this.setPos(posX, posY, posZ);
    }

    @Override
    public EntityDimensions getDimensions(Pose pose) {
        return new EntityDimensions(0.1F, 0.1F, true);
    }

    private Vec3 getDir(LivingEntity shooter, ItemStack weapon) {
        float spread = 0.0F;
        if(weapon.hasTag() && weapon.getTag().contains("spread", CompoundTag.TAG_ANY_NUMERIC)) {
            spread = weapon.getTag().getFloat("spread");
        }
        return this.getVectorFromRotation(shooter.getXRot() - spread, shooter.getYRot() - spread);
    }

    public void updateHeading()
    {
        double horizontalDistance = this.getDeltaMovement().horizontalDistance();
        this.setYRot((float) (Mth.atan2(this.getDeltaMovement().x(), this.getDeltaMovement().z()) * (180D / Math.PI)));
        this.setXRot((float) (Mth.atan2(this.getDeltaMovement().y(), horizontalDistance) * (180D / Math.PI)));
        this.yRotO = this.getYRot();
        this.xRotO = this.getXRot();
    }

    public void setWeapon(ItemStack weapon) {
        this.item = weapon;
    }

    public ItemStack getWeapon() {
        return item;
    }

    public double getGravity() {
        return this.gravity;
    }

    public double getEcheladderBonus(LivingEntity shooter) {
        if(shooter instanceof ServerPlayer && !(shooter instanceof FakePlayer)) {
            ServerPlayer player = (ServerPlayer) shooter;
            return Echeladder.get(player).getUnderlingDamageModifier();
        }
        else return 0.0;
    }

    @Override
    public void writeSpawnData(FriendlyByteBuf friendlyByteBuf) {

    }

    @Override
    public void readSpawnData(FriendlyByteBuf friendlyByteBuf) {

    }

    @Override
    protected void defineSynchedData() {

    }

    @Override
    protected void readAdditionalSaveData(CompoundTag compoundTag) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundTag compoundTag) {

    }

    private Vec3 getVectorFromRotation(float pitch, float yaw)
    {
        float f = Mth.cos(-yaw * 0.017453292F - (float) Math.PI);
        float f1 = Mth.sin(-yaw * 0.017453292F - (float) Math.PI);
        float f2 = -Mth.cos(-pitch * 0.017453292F);
        float f3 = Mth.sin(-pitch * 0.017453292F);
        return new Vec3((double) (f1 * f2), (double) f3, (double) (f * f2));
    }
}
