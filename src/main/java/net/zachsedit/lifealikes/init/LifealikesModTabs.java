
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.zachsedit.lifealikes.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LifealikesModTabs {
	public static CreativeModeTab TAB_PURE_ELEMENTS;
	public static CreativeModeTab TAB_MORE_STONES;
	public static CreativeModeTab TAB_MORE_DIRTS;
	public static CreativeModeTab TAB_MORE_GEMS;
	public static CreativeModeTab TAB_MORE_FLOWERS;

	public static void load() {
		TAB_PURE_ELEMENTS = new CreativeModeTab("tabpure_elements") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.BARRIER);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MORE_STONES = new CreativeModeTab("tabmore_stones") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.STONE);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MORE_DIRTS = new CreativeModeTab("tabmore_dirts") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.DIRT);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_MORE_GEMS = new CreativeModeTab("tabmore_gems") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LifealikesModItems.RUBY.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MORE_FLOWERS = new CreativeModeTab("tabmore_flowers") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LifealikesModItems.H.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
