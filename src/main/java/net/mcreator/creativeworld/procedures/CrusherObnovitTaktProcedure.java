package net.mcreator.creativeworld.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.creativeworld.init.CreativeWorldModItems;

import java.util.function.Supplier;
import java.util.Map;

public class CrusherObnovitTaktProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() == Blocks.IRON_ORE.asItem()) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(CreativeWorldModItems.CRUSHEDIRONORE.get());
						_setstack.setCount(2);
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 100);
		}
	}
}
