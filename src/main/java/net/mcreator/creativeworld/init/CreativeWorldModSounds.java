
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.creativeworld.CreativeWorldMod;

public class CreativeWorldModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, CreativeWorldMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> QT_TELEPORT = REGISTRY.register("qt.teleport", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("creative_world", "qt.teleport")));
}
