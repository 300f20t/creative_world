
package net.mcreator.creativeworld.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.creativeworld.procedures.DrillModeCustomProcedure;
import net.mcreator.creativeworld.procedures.DrillMode3x3Procedure;
import net.mcreator.creativeworld.procedures.DrillMode1x1Procedure;
import net.mcreator.creativeworld.procedures.DrillKazhdyiTikVRukieProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class DrillInHandOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (DrillKazhdyiTikVRukieProcedure.execute(entity)) {
			if (DrillMode1x1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("creative_world:textures/screens/drill_extraction_mode_1x1.png"), w / 2 + -135, h / 2 + 104, 0, 0, 16, 16, 16, 16);
			}
			event.getGuiGraphics().blit(new ResourceLocation("creative_world:textures/screens/battery_0.png"), w / 2 + -117, h / 2 + 104, 0, 0, 16, 16, 16, 16);

			if (DrillMode3x3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("creative_world:textures/screens/drill_extraction_mode_3x3.png"), w / 2 + -135, h / 2 + 104, 0, 0, 16, 16, 16, 16);
			}
			if (DrillModeCustomProcedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("creative_world:textures/screens/drill_extraction_mode_custom.png"), w / 2 + -135, h / 2 + 104, 0, 0, 16, 16, 16, 16);
			}
			event.getGuiGraphics().blit(new ResourceLocation("creative_world:textures/screens/battery_1.png"), w / 2 + -117, h / 2 + 104, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(new ResourceLocation("creative_world:textures/screens/battery_2.png"), w / 2 + -117, h / 2 + 104, 0, 0, 16, 16, 16, 16);

			event.getGuiGraphics().blit(new ResourceLocation("creative_world:textures/screens/battery_3.png"), w / 2 + -117, h / 2 + 104, 0, 0, 16, 16, 16, 16);

		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
