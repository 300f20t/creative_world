package net.mcreator.creativeworld.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.creativeworld.network.CreativeWorldModVariables;
import net.mcreator.creativeworld.init.CreativeWorldModItems;
import net.mcreator.creativeworld.init.CreativeWorldModBlocks;

public class Quantumteleporterblock2NaBlokieNazhataPravaiaKnopkaMyshiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreativeWorldModItems.PARTICLEBINDER.get()) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK_2.get() && (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x + 2, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x + 3, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x + 4, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x - 2, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x - 3, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x - 4, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y, z + 2))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y, z + 3))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y, z + 4))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y, z - 2))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y, z - 3))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y, z - 4))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x + 4, y + 1, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x - 4, y + 1, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y + 1, z + 4))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y + 1, z - 4))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x + 4, y + 2, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x - 4, y + 2, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y + 2, z + 4))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y + 2, z - 4))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y + 2, z - 3))).getBlock() == CreativeWorldModBlocks.STATIONARYPARTICLEBINDER.get()
					&& (world.getBlockState(new BlockPos(x, y + 2, z + 3))).getBlock() == CreativeWorldModBlocks.STATIONARYPARTICLEBINDER.get()
					&& (world.getBlockState(new BlockPos(x + 3, y + 2, z))).getBlock() == CreativeWorldModBlocks.STATIONARYPARTICLEBINDER.get()
					&& (world.getBlockState(new BlockPos(x - 3, y + 2, z))).getBlock() == CreativeWorldModBlocks.STATIONARYPARTICLEBINDER.get()) {
				if (!(entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).QT_2) {
					{
						double _setval = x;
						entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.first_QT_ID_x = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = y;
						entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.first_QT_ID_y = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = z;
						entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.first_QT_ID_z = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QT_1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("QT 1 conected"), (false));
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK_2.get() && (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x + 2, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x + 3, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x + 4, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x - 2, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x - 3, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x - 4, y, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y, z + 2))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y, z + 3))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y, z + 4))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y, z - 2))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y, z - 3))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y, z - 4))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x + 4, y + 1, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x - 4, y + 1, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y + 1, z + 4))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y + 1, z - 4))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x + 4, y + 2, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x - 4, y + 2, z))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y + 2, z + 4))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y + 2, z - 4))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == CreativeWorldModBlocks.QUANTUMTELEPORTERBLOCK.get()
					&& (world.getBlockState(new BlockPos(x, y + 2, z - 3))).getBlock() == CreativeWorldModBlocks.STATIONARYPARTICLEBINDER.get()
					&& (world.getBlockState(new BlockPos(x, y + 2, z + 3))).getBlock() == CreativeWorldModBlocks.STATIONARYPARTICLEBINDER.get()
					&& (world.getBlockState(new BlockPos(x + 3, y + 2, z))).getBlock() == CreativeWorldModBlocks.STATIONARYPARTICLEBINDER.get()
					&& (world.getBlockState(new BlockPos(x - 3, y + 2, z))).getBlock() == CreativeWorldModBlocks.STATIONARYPARTICLEBINDER.get()) {
				if ((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).QT_1) {
					{
						double _setval = x;
						entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.seckond_QT_ID_x = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = y;
						entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.seckond_QT_ID_y = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = z;
						entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.seckond_QT_ID_z = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.QT_2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("QT 2 conected"), (false));
				}
			}
		}
		if ((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).QT_1
				&& (entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).QT_2) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CreativeWorldModItems.KEYCARD.get()) {
				if ((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_x == x
						&& (entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_y == y
						&& (entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_z == z) {
					{
						Entity _ent = entity;
						_ent.teleportTo(((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_x),
								((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_y + 1),
								((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_z));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_x),
									((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_y + 1),
									((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_z), _ent.getYRot(), _ent.getXRot());
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, ((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_x),
								((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_y + 1),
								((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_z), 10, 1, 1, 1, 2);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null,
									new BlockPos((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_x,
											(entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_y + 1,
											(entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("creative_world:qt.teleport")), SoundSource.VOICE, 3, 1);
						} else {
							_level.playLocalSound(((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_x),
									((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_y + 1),
									((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("creative_world:qt.teleport")), SoundSource.VOICE, 3, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 1));
				} else if ((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_x == x
						&& (entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_y == y
						&& (entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).first_QT_ID_z == z) {
					{
						Entity _ent = entity;
						_ent.teleportTo(((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_x),
								((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_y + 1),
								((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_z));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_x),
									((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_y + 1),
									((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_z), _ent.getYRot(), _ent.getXRot());
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION, ((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_x),
								((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_y + 1),
								((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_z), 10, 1, 1, 1, 2);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null,
									new BlockPos((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_x,
											(entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_y + 1,
											(entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("creative_world:qt.teleport")), SoundSource.VOICE, 3, 1);
						} else {
							_level.playLocalSound(((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_x),
									((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_y + 1),
									((entity.getCapability(CreativeWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CreativeWorldModVariables.PlayerVariables())).seckond_QT_ID_z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("creative_world:qt.teleport")), SoundSource.VOICE, 3, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 1));
				}
			}
		}
	}
}
