package com.redcat24.upsidedown.item;

import com.redcat24.upsidedown.RedcatsUpsideDown;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item DART = registerItem("dart", new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item POISON_DART = registerItem("poison_dart", new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item ALUMINUM_INGOT = registerItem("aluminum_ingot", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ALUMINUM_NUGGET = registerItem("aluminum_nugget", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RedcatsUpsideDown.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RedcatsUpsideDown.LOGGER.info("Registering modded items for " + RedcatsUpsideDown.MOD_ID);
    }

}
