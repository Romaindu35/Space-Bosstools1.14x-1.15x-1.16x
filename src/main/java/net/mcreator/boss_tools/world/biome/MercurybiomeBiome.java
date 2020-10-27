
package net.mcreator.boss_tools.world.biome;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.biome.Biome;

import net.mcreator.boss_tools.block.MrrcuryCobblestoneBlock;
import net.mcreator.boss_tools.block.MercurystoneBlock;
import net.mcreator.boss_tools.BossToolsModElements;

@BossToolsModElements.ModElement.Tag
public class MercurybiomeBiome extends BossToolsModElements.ModElement {
	@ObjectHolder("boss_tools:mercurybiome")
	public static final CustomBiome biome = null;
	public MercurybiomeBiome(BossToolsModElements instance) {
		super(instance, 389);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}
	static class CustomBiome extends Biome {
		public CustomBiome() {
			super(new Biome.Builder().downfall(0f).depth(0.2f).scale(0.5f).temperature(0f).precipitation(Biome.RainType.NONE)
					.category(Biome.Category.NONE).waterColor(-16750900).waterFogColor(-16750900).parent("the_void")
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(MercurystoneBlock.block.getDefaultState(),
							MrrcuryCobblestoneBlock.block.getDefaultState(), MrrcuryCobblestoneBlock.block.getDefaultState())));
			setRegistryName("mercurybiome");
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getGrassColor(double posX, double posZ) {
			return -13395712;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getFoliageColor() {
			return -13395712;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getSkyColor() {
			return -16777216;
		}
	}
}
