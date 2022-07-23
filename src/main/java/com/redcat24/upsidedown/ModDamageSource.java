package com.redcat24.upsidedown;

import net.minecraft.entity.damage.DamageSource;

public class ModDamageSource extends DamageSource {
    private boolean bypassesArmor;
    private boolean bypassesProtection;

    public static final ModDamageSource TOX = (ModDamageSource) ((ModDamageSource) new ModDamageSource("toxicity").setBypassesArmor()).setBypassesProtection();


    @Override
    public boolean bypassesArmor() {
        return this.bypassesArmor;
    }

    @Override
    public boolean bypassesProtection() {
        return this.bypassesProtection;
    }

    @Override
    protected DamageSource setBypassesArmor() {
        this.bypassesArmor = true;
        return this;
    }

    @Override
    protected DamageSource setBypassesProtection() {
        this.bypassesProtection = true;
        return this;
    }

    public ModDamageSource(String name) {
        super(name);
    }
}
