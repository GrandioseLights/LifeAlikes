
package net.zachsedit.lifealikes.item;

import net.zachsedit.lifealikes.init.LifealikesModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HyperstheneTESTItem extends Item {
	public HyperstheneTESTItem() {
		super(new Item.Properties().tab(LifealikesModTabs.TAB_TABGEMS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
