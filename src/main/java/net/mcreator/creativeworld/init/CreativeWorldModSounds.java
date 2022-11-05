
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creativeworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.creativeworld.CreativeWorldMod;

public class CreativeWorldModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CreativeWorldMod.MODID);
	public static final RegistryObject<SoundEvent> QT_TELEPORT = REGISTRY.register("qt.teleport",
			() -> new SoundEvent(new ResourceLocation("creative_world", "qt.teleport")));
}
