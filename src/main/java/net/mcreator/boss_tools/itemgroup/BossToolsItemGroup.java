
package net.mcreator.boss_tools.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.boss_tools.block.RocketItemtir2Block;
import net.mcreator.boss_tools.BossToolsModElements;

@BossToolsModElements.ModElement.Tag
public class BossToolsItemGroup extends BossToolsModElements.ModElement {
	public BossToolsItemGroup(BossToolsModElements instance) {
		super(instance, 156);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabboss_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RocketItemtir2Block.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
