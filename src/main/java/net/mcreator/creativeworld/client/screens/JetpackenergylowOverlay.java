
package net.mcreator.creativeworld.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.creativeworld.procedures.HklklhProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class JetpackenergylowOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiOverlayEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level _world = null;
		double _x = 0;
		double _y = 0;
		double _z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			_world = entity.level;
			_x = entity.getX();
			_y = entity.getY();
			_z = entity.getZ();
		}
		Level world = _world;
		double x = _x;
		double y = _y;
		double z = _z;
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
				GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (HklklhProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("creative_world:textures/screens/jetpack_e_l.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -153, posY + 113, 0, 0, 16, 16, 16, 16);

			RenderSystem.setShaderTexture(0, new ResourceLocation("creative_world:textures/screens/l_energy_jp.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -135, posY + 104, 0, 0, 32, 32, 32, 32);

		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
