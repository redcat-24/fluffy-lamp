package com.redcat24.upsidedown.item;

import com.redcat24.upsidedown.RedcatsUpsideDown;
import com.redcat24.upsidedown.item.custom.DartGunCustomItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item DART = registerItem("dart", new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item POISON_DART = registerItem("poison_dart", new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item DART_TUBE = registerItem("dart_tube", new DartGunCustomItem(new FabricItemSettings().group(ItemGroup.COMBAT).maxDamage(4)));
    public static final Item ALUMINUM_INGOT = registerItem("aluminum_ingot", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ALUMINUM_NUGGET = registerItem("aluminum_nugget", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RedcatsUpsideDown.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RedcatsUpsideDown.LOGGER.info("Registering modded items for " + RedcatsUpsideDown.MOD_ID);
    }

}
