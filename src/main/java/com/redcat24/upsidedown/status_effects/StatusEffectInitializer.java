package com.redcat24.upsidedown.status_effects;

import com.redcat24.upsidedown.RedcatsUpsideDown;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class StatusEffectInitializer extends RedcatsUpsideDown {

    public static final StatusEffect TOX = new ToxicityStatusEffect();

    public static void initializeModEffects() {
        RedcatsUpsideDown.LOGGER.info("Registering effects for " + RedcatsUpsideDown.MOD_ID);
        Registry.register(Registry.STATUS_EFFECT, new Identifier("upsidedown", "toxicity"), TOX);
    }
}
