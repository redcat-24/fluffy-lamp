package com.redcat24.upsidedown.block;

import com.redcat24.upsidedown.RedcatsUpsideDown;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block ALUMINUM_BLOCK = registerBlock("aluminum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(RedcatsUpsideDown.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(RedcatsUpsideDown.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        RedcatsUpsideDown.LOGGER.info("Registering Mod Blocks for " + RedcatsUpsideDown.MOD_ID);
    }
}
