package com.olyx.mod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class OlyxEntity extends Monster {
    public OlyxEntity(EntityType<? extends Monster> type, Level level) {
        super(type, level);
    }

    @Override
    public void tick() {
        super.tick();
        long dayTime = this.level().getDayTime();
        if (dayTime == 0) {
            this.discard();
        }
    }
}
