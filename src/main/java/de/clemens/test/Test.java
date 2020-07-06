package de.clemens.test;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

public class Test implements ClientModInitializer, HudRenderCallback {
	@Override
	public void onInitializeClient() {
		HudRenderCallback.EVENT.register(this);
	}

	@Override
	public void onHudRender(MatrixStack matrixStack, float tickDelta) {
		MinecraftClient.getInstance().textRenderer.drawWithShadow(matrixStack, "Test", 1, 1, 0xFFFFFFFF);
	}
}
