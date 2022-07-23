package com.redcat24.upsidedown.item.custom;

import com.redcat24.upsidedown.item.ModItemTags;
import net.minecraft.item.*;

import java.util.function.Predicate;

public class DartGunCustomItem extends Item implements Vanishable {
    public DartGunCustomItem(Settings settings) {
        super(settings);
    }

    public void onUse() {

    }

    public static final Predicate<ItemStack> DART_GUN_PROJECTILES = (stack) -> {
        return stack.isIn(ModItemTags.DARTS);
    };

    public Predicate<ItemStack> getProjectiles() {
        return DART_GUN_PROJECTILES;
    }


    public int getEnchantability() {
        return 0;
    }

    public int getRange() {
        return 10;
    }
}
