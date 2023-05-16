
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.zachsedit.lifealikes.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LifealikesModTabs {
	public static CreativeModeTab TAB_TABELEMENTS;
	public static CreativeModeTab TAB_TABSTONES;
	public static CreativeModeTab TAB_TABSOILS;
	public static CreativeModeTab TAB_TABGEMS;

	public static void load() {
		TAB_TABELEMENTS = new CreativeModeTab("tabtabelements") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.BARRIER);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TABSTONES = new CreativeModeTab("tabtabstones") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.STONE);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TABSOILS = new CreativeModeTab("tabtabsoils") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.DIRT);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_TABGEMS = new CreativeModeTab("tabtabgems") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.DIAMOND);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
