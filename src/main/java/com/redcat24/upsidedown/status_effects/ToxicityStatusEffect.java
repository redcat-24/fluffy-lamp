package com.redcat24.upsidedown.status_effects;

import com.redcat24.upsidedown.ModDamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ToxicityStatusEffect extends StatusEffect {


    public ToxicityStatusEffect() {
        super(StatusEffectCategory.HARMFUL, 0x710273);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity.isLiving() && this == StatusEffectInitializer.TOX) {
            entity.damage(ModDamageSource.TOX, 1.0F);
        }
    }

}
