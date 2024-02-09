package net.mcreator.creativeworld.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.creativeworld.init.CreativeWorldModItems;
import net.mcreator.creativeworld.CreativeWorldMod;

import java.util.function.Supplier;
import java.util.Map;

public class CrusherWorkProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Items.RAW_IRON == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(0)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			CreativeWorldMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(CreativeWorldModItems.CRUSHEDIRONORE.get());
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			});
		}
	}
}
