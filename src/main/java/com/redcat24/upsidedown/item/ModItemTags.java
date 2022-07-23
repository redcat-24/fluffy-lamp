package com.redcat24.upsidedown.item;

import com.redcat24.upsidedown.RedcatsUpsideDown;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItemTags {
    public static final TagKey<Item> DARTS = registerItemTag(RedcatsUpsideDown.MOD_ID, "darts");

    private static TagKey<Item> registerItemTag(String name, String path) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier(name, path));
    }

    public static void defineTagObjects() {
        RedcatsUpsideDown.LOGGER.info("Defining Tag Objects for " + RedcatsUpsideDown.MOD_ID);
    }
}
