
package net.zachsedit.lifealikes.item;

import net.zachsedit.lifealikes.init.LifealikesModTabs;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class PolluciteItem extends Item {
	public PolluciteItem() {
		super(new Item.Properties().tab(LifealikesModTabs.TAB_MORE_GEMS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 1;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}
}
