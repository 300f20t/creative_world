package net.mcreator.creativeworld.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.creativeworld.world.inventory.FdgdfMenu;
import net.mcreator.creativeworld.init.CreativeWorldModScreens.WidgetScreen;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FdgdfScreen extends AbstractContainerScreen<FdgdfMenu> implements WidgetScreen {
	private final static HashMap<String, Object> guistate = FdgdfMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FdgdfScreen(FdgdfMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	public static HashMap<String, String> getEditBoxAndCheckBoxValues() {
		HashMap<String, String> textstate = new HashMap<>();
		if (Minecraft.getInstance().screen instanceof FdgdfScreen sc) {

		}
		return textstate;
	}

	public HashMap<String, Object> getWidgets() {
		return guistate;
	}

	@Override
	public void containerTick() {
		super.containerTick();
		PacketDistributor.sendToServer(new FdgdfMenu.FdgdfSyncMessage(0, x, y, z, getEditBoxAndCheckBoxValues()));
		FdgdfMenu.FdgdfSyncMessage.handleSyncAction(entity, 0, x, y, z, getEditBoxAndCheckBoxValues());
	}

	private static final ResourceLocation texture = ResourceLocation.parse("creative_world:textures/screens/fdgdf.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 11 && mouseX < leftPos + 35 && mouseY > topPos + 29 && mouseY < topPos + 53)
			guiGraphics.renderTooltip(font, Component.translatable("gui.creative_world.fdgdf.tooltip_999999_fe"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(ResourceLocation.parse("creative_world:textures/screens/crushing_icon.png"), this.leftPos + 78, this.topPos + 34, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(ResourceLocation.parse("creative_world:textures/screens/battery_3.png"), this.leftPos + 15, this.topPos + 34, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
	}
}
