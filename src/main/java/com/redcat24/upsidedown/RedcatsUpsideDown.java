package com.redcat24.upsidedown;

import com.redcat24.upsidedown.block.ModBlocks;
import com.redcat24.upsidedown.item.ModItemTags;
import com.redcat24.upsidedown.item.ModItems;
import com.redcat24.upsidedown.status_effects.StatusEffectInitializer;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedcatsUpsideDown implements ModInitializer {
	public static final String MOD_ID = "upsidedown";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemTags.defineTagObjects();
		StatusEffectInitializer.initializeModEffects();
	}
}
