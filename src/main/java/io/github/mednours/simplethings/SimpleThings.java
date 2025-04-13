package io.github.mednours.simplethings;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.util.ActionResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleThings implements ModInitializer {
	public static final String MOD_ID = "simplethings";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
			LOGGER.info("Player {} attacked entity {}", player.getName().getString(), entity.getName().getString());
			return ActionResult.PASS;
		});
	}
}