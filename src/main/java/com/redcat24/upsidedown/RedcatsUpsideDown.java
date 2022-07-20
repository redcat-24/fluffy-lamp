package com.redcat24.upsidedown;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedcatsUpsideDown implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("upsidedown");
	public static final Item POISON_DART = new Item(new FabricItemSettings().group(ItemGroup.COMBAT));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("upsidedown", "poison_dart"), POISON_DART);
	}
}
