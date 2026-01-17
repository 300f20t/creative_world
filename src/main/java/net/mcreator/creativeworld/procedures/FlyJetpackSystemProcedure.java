package net.mcreator.creativeworld.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.creativeworld.network.CreativeWorldModVariables;

public class FlyJetpackSystemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double currentTick = 0;
		if (entity.getData(CreativeWorldModVariables.PLAYER_VARIABLES).playerJetpackFly) {
			if (entity instanceof LivingEntity _entity) {
				AttributeModifier modifier = new AttributeModifier(ResourceLocation.parse("creative_world:disable_gravity"), 0, AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
				if (!_entity.getAttribute(Attributes.GRAVITY).hasModifier(modifier.id())) {
					_entity.getAttribute(Attributes.GRAVITY).addPermanentModifier(modifier);
				}
			}
			entity.setDeltaMovement(new Vec3(0, 0.2, 0));
		} else {
			if (entity instanceof LivingEntity _entity) {
				_entity.getAttribute(Attributes.GRAVITY).removeModifier(ResourceLocation.parse("creative_world:disable_gravity"));
			}
		}
	}
}