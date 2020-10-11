package net.mcreator.boss_tools.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.boss_tools.item.OrbitPlacerItem;
import net.mcreator.boss_tools.BossToolsModElements;

import java.util.Map;

@BossToolsModElements.ModElement.Tag
public class OrbitPlacerRightClickedInAirProcedure extends BossToolsModElements.ModElement {
	public OrbitPlacerRightClickedInAirProcedure(BossToolsModElements instance) {
		super(instance, 168);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure OrbitPlacerRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure OrbitPlacerRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure OrbitPlacerRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure OrbitPlacerRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure OrbitPlacerRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("boss_tools:orbit_overworld_biom")))) {
			if ((world.isAirBlock(new BlockPos((int) (x - 1), (int) y, (int) z)))) {
				if ((world.isAirBlock(new BlockPos((int) (x - 2), (int) y, (int) z)))) {
					if ((world.isAirBlock(new BlockPos((int) (x - 3), (int) y, (int) z)))) {
						if ((world.isAirBlock(new BlockPos((int) (x - 4), (int) y, (int) z)))) {
							if ((world.isAirBlock(new BlockPos((int) (x - 5), (int) y, (int) z)))) {
								if ((world.isAirBlock(new BlockPos((int) (x - 6), (int) y, (int) z)))) {
									if ((world.isAirBlock(new BlockPos((int) (x - 7), (int) y, (int) z)))) {
										if ((world.isAirBlock(new BlockPos((int) (x - 8), (int) y, (int) z)))) {
											if ((world.isAirBlock(new BlockPos((int) (x - 9), (int) y, (int) z)))) {
												if ((world.isAirBlock(new BlockPos((int) (x - 10), (int) y, (int) z)))) {
													if ((world.isAirBlock(new BlockPos((int) (x - 11), (int) y, (int) z)))) {
														if ((world.isAirBlock(new BlockPos((int) (x - 12), (int) y, (int) z)))) {
															if ((world.isAirBlock(new BlockPos((int) (x - 13), (int) y, (int) z)))) {
																if ((world.isAirBlock(new BlockPos((int) (x - 14), (int) y, (int) z)))) {
																	if ((world.isAirBlock(new BlockPos((int) (x - 15), (int) y, (int) z)))) {
																		if ((world.isAirBlock(new BlockPos((int) (x - 16), (int) y, (int) z)))) {
																			if ((world.isAirBlock(new BlockPos((int) (x - 17), (int) y, (int) z)))) {
																				if ((world.isAirBlock(
																						new BlockPos((int) (x - 19), (int) y, (int) z)))) {
																					if ((world.isAirBlock(
																							new BlockPos((int) (x - 19), (int) y, (int) z)))) {
																						if ((world.isAirBlock(
																								new BlockPos((int) x, (int) (y - 1), (int) z)))) {
																							if ((world.isAirBlock(
																									new BlockPos((int) x, (int) (y - 2), (int) z)))) {
																								if ((world.isAirBlock(new BlockPos((int) x,
																										(int) (y - 3), (int) z)))) {
																									if ((world.isAirBlock(new BlockPos((int) x,
																											(int) (y - 4), (int) z)))) {
																										if ((world.isAirBlock(new BlockPos((int) x,
																												(int) (y - 5), (int) z)))) {
																											if ((world.isAirBlock(new BlockPos(
																													(int) x, (int) (y - 6),
																													(int) z)))) {
																												if ((world.isAirBlock(new BlockPos(
																														(int) x, (int) (y - 7),
																														(int) z)))) {
																													if ((world.isAirBlock(
																															new BlockPos((int) x,
																																	(int) (y - 8),
																																	(int) z)))) {
																														if ((world.isAirBlock(
																																new BlockPos((int) x,
																																		(int) (y - 9),
																																		(int) z)))) {
																															if ((world.isAirBlock(
																																	new BlockPos(
																																			(int) x,
																																			(int) (y - 10),
																																			(int) z)))) {
																																if ((world.isAirBlock(
																																		new BlockPos(
																																				(int) x,
																																				(int) (y - 11),
																																				(int) z)))) {
																																	if ((world
																																			.isAirBlock(
																																					new BlockPos(
																																							(int) x,
																																							(int) (y - 12),
																																							(int) z)))) {
																																		if ((world
																																				.isAirBlock(
																																						new BlockPos(
																																								(int) x,
																																								(int) (y - 13),
																																								(int) z)))) {
																																			if ((world
																																					.isAirBlock(
																																							new BlockPos(
																																									(int) x,
																																									(int) (y - 14),
																																									(int) z)))) {
																																				if ((world
																																						.isAirBlock(
																																								new BlockPos(
																																										(int) x,
																																										(int) (y - 15),
																																										(int) z)))) {
																																					if ((world
																																							.isAirBlock(
																																									new BlockPos(
																																											(int) x,
																																											(int) (y - 16),
																																											(int) z)))) {
																																						if ((world
																																								.isAirBlock(
																																										new BlockPos(
																																												(int) x,
																																												(int) (y - 17),
																																												(int) z)))) {
																																							if ((world
																																									.isAirBlock(
																																											new BlockPos(
																																													(int) x,
																																													(int) (y - 18),
																																													(int) z)))) {
																																								if ((world
																																										.isAirBlock(
																																												new BlockPos(
																																														(int) x,
																																														(int) (y - 19),
																																														(int) z)))) {
																																									if ((world
																																											.isAirBlock(
																																													new BlockPos(
																																															(int) x,
																																															(int) y,
																																															(int) (z - 1))))) {
																																										if ((world
																																												.isAirBlock(
																																														new BlockPos(
																																																(int) x,
																																																(int) y,
																																																(int) (z - 2))))) {
																																											if ((world
																																													.isAirBlock(
																																															new BlockPos(
																																																	(int) x,
																																																	(int) y,
																																																	(int) (z - 3))))) {
																																												if ((world
																																														.isAirBlock(
																																																new BlockPos(
																																																		(int) x,
																																																		(int) y,
																																																		(int) (z - 4))))) {
																																													if ((world
																																															.isAirBlock(
																																																	new BlockPos(
																																																			(int) x,
																																																			(int) y,
																																																			(int) (z - 5))))) {
																																														if ((world
																																																.isAirBlock(
																																																		new BlockPos(
																																																				(int) x,
																																																				(int) y,
																																																				(int) (z - 6))))) {
																																															if ((world
																																																	.isAirBlock(
																																																			new BlockPos(
																																																					(int) x,
																																																					(int) y,
																																																					(int) (z - 7))))) {
																																																if ((world
																																																		.isAirBlock(
																																																				new BlockPos(
																																																						(int) x,
																																																						(int) y,
																																																						(int) (z - 8))))) {
																																																	if ((world
																																																			.isAirBlock(
																																																					new BlockPos(
																																																							(int) x,
																																																							(int) y,
																																																							(int) (z - 9))))) {
																																																		if ((world
																																																				.isAirBlock(
																																																						new BlockPos(
																																																								(int) x,
																																																								(int) y,
																																																								(int) (z - 10))))) {
																																																			if ((world
																																																					.isAirBlock(
																																																							new BlockPos(
																																																									(int) x,
																																																									(int) y,
																																																									(int) (z - 11))))) {
																																																				if ((world
																																																						.isAirBlock(
																																																								new BlockPos(
																																																										(int) x,
																																																										(int) y,
																																																										(int) (z - 12))))) {
																																																					if ((world
																																																							.isAirBlock(
																																																									new BlockPos(
																																																											(int) x,
																																																											(int) y,
																																																											(int) (z - 13))))) {
																																																						if ((world
																																																								.isAirBlock(
																																																										new BlockPos(
																																																												(int) x,
																																																												(int) y,
																																																												(int) (z - 14))))) {
																																																							if ((world
																																																									.isAirBlock(
																																																											new BlockPos(
																																																													(int) x,
																																																													(int) y,
																																																													(int) (z - 15))))) {
																																																								if ((world
																																																										.isAirBlock(
																																																												new BlockPos(
																																																														(int) x,
																																																														(int) y,
																																																														(int) (z - 16))))) {
																																																									if ((world
																																																											.isAirBlock(
																																																													new BlockPos(
																																																															(int) x,
																																																															(int) y,
																																																															(int) (z - 17))))) {
																																																										if ((world
																																																												.isAirBlock(
																																																														new BlockPos(
																																																																(int) x,
																																																																(int) y,
																																																																(int) (z - 18))))) {
																																																											if ((world
																																																													.isAirBlock(
																																																															new BlockPos(
																																																																	(int) x,
																																																																	(int) y,
																																																																	(int) (z - 19))))) {
																																																												if ((world
																																																														.isAirBlock(
																																																																new BlockPos(
																																																																		(int) (x + 1),
																																																																		(int) y,
																																																																		(int) z)))) {
																																																													if ((world
																																																															.isAirBlock(
																																																																	new BlockPos(
																																																																			(int) (x + 2),
																																																																			(int) y,
																																																																			(int) z)))) {
																																																														if ((world
																																																																.isAirBlock(
																																																																		new BlockPos(
																																																																				(int) (x + 3),
																																																																				(int) y,
																																																																				(int) z)))) {
																																																															if ((world
																																																																	.isAirBlock(
																																																																			new BlockPos(
																																																																					(int) (x + 4),
																																																																					(int) y,
																																																																					(int) z)))) {
																																																																if ((world
																																																																		.isAirBlock(
																																																																				new BlockPos(
																																																																						(int) (x + 5),
																																																																						(int) y,
																																																																						(int) z)))) {
																																																																	if ((world
																																																																			.isAirBlock(
																																																																					new BlockPos(
																																																																							(int) (x + 6),
																																																																							(int) y,
																																																																							(int) z)))) {
																																																																		if ((world
																																																																				.isAirBlock(
																																																																						new BlockPos(
																																																																								(int) (x + 7),
																																																																								(int) y,
																																																																								(int) z)))) {
																																																																			if ((world
																																																																					.isAirBlock(
																																																																							new BlockPos(
																																																																									(int) (x + 8),
																																																																									(int) y,
																																																																									(int) z)))) {
																																																																				if ((world
																																																																						.isAirBlock(
																																																																								new BlockPos(
																																																																										(int) (x + 9),
																																																																										(int) y,
																																																																										(int) z)))) {
																																																																					if ((world
																																																																							.isAirBlock(
																																																																									new BlockPos(
																																																																											(int) (x + 10),
																																																																											(int) y,
																																																																											(int) z)))) {
																																																																						if ((world
																																																																								.isAirBlock(
																																																																										new BlockPos(
																																																																												(int) (x + 11),
																																																																												(int) y,
																																																																												(int) z)))) {
																																																																							if ((world
																																																																									.isAirBlock(
																																																																											new BlockPos(
																																																																													(int) (x + 12),
																																																																													(int) y,
																																																																													(int) z)))) {
																																																																								if ((world
																																																																										.isAirBlock(
																																																																												new BlockPos(
																																																																														(int) (x + 13),
																																																																														(int) y,
																																																																														(int) z)))) {
																																																																									if ((world
																																																																											.isAirBlock(
																																																																													new BlockPos(
																																																																															(int) (x + 14),
																																																																															(int) y,
																																																																															(int) z)))) {
																																																																										if ((world
																																																																												.isAirBlock(
																																																																														new BlockPos(
																																																																																(int) (x + 15),
																																																																																(int) y,
																																																																																(int) z)))) {
																																																																											if ((world
																																																																													.isAirBlock(
																																																																															new BlockPos(
																																																																																	(int) (x + 16),
																																																																																	(int) y,
																																																																																	(int) z)))) {
																																																																												if ((world
																																																																														.isAirBlock(
																																																																																new BlockPos(
																																																																																		(int) (x + 17),
																																																																																		(int) y,
																																																																																		(int) z)))) {
																																																																													if ((world
																																																																															.isAirBlock(
																																																																																	new BlockPos(
																																																																																			(int) (x + 19),
																																																																																			(int) y,
																																																																																			(int) z)))) {
																																																																														if ((world
																																																																																.isAirBlock(
																																																																																		new BlockPos(
																																																																																				(int) (x + 19),
																																																																																				(int) y,
																																																																																				(int) z)))) {
																																																																															if ((world
																																																																																	.isAirBlock(
																																																																																			new BlockPos(
																																																																																					(int) x,
																																																																																					(int) (y + 1),
																																																																																					(int) z)))) {
																																																																																if ((world
																																																																																		.isAirBlock(
																																																																																				new BlockPos(
																																																																																						(int) x,
																																																																																						(int) (y + 2),
																																																																																						(int) z)))) {
																																																																																	if ((world
																																																																																			.isAirBlock(
																																																																																					new BlockPos(
																																																																																							(int) x,
																																																																																							(int) (y + 3),
																																																																																							(int) z)))) {
																																																																																		if ((world
																																																																																				.isAirBlock(
																																																																																						new BlockPos(
																																																																																								(int) x,
																																																																																								(int) (y + 4),
																																																																																								(int) z)))) {
																																																																																			if ((world
																																																																																					.isAirBlock(
																																																																																							new BlockPos(
																																																																																									(int) x,
																																																																																									(int) (y + 5),
																																																																																									(int) z)))) {
																																																																																				if ((world
																																																																																						.isAirBlock(
																																																																																								new BlockPos(
																																																																																										(int) x,
																																																																																										(int) (y + 6),
																																																																																										(int) z)))) {
																																																																																					if ((world
																																																																																							.isAirBlock(
																																																																																									new BlockPos(
																																																																																											(int) x,
																																																																																											(int) (y + 7),
																																																																																											(int) z)))) {
																																																																																						if ((world
																																																																																								.isAirBlock(
																																																																																										new BlockPos(
																																																																																												(int) x,
																																																																																												(int) (y + 8),
																																																																																												(int) z)))) {
																																																																																							if ((world
																																																																																									.isAirBlock(
																																																																																											new BlockPos(
																																																																																													(int) x,
																																																																																													(int) (y + 9),
																																																																																													(int) z)))) {
																																																																																								if ((world
																																																																																										.isAirBlock(
																																																																																												new BlockPos(
																																																																																														(int) x,
																																																																																														(int) (y + 10),
																																																																																														(int) z)))) {
																																																																																									if ((world
																																																																																											.isAirBlock(
																																																																																													new BlockPos(
																																																																																															(int) x,
																																																																																															(int) (y + 11),
																																																																																															(int) z)))) {
																																																																																										if ((world
																																																																																												.isAirBlock(
																																																																																														new BlockPos(
																																																																																																(int) x,
																																																																																																(int) (y + 12),
																																																																																																(int) z)))) {
																																																																																											if ((world
																																																																																													.isAirBlock(
																																																																																															new BlockPos(
																																																																																																	(int) x,
																																																																																																	(int) (y + 13),
																																																																																																	(int) z)))) {
																																																																																												if ((world
																																																																																														.isAirBlock(
																																																																																																new BlockPos(
																																																																																																		(int) x,
																																																																																																		(int) (y + 14),
																																																																																																		(int) z)))) {
																																																																																													if ((world
																																																																																															.isAirBlock(
																																																																																																	new BlockPos(
																																																																																																			(int) x,
																																																																																																			(int) (y + 15),
																																																																																																			(int) z)))) {
																																																																																														if ((world
																																																																																																.isAirBlock(
																																																																																																		new BlockPos(
																																																																																																				(int) x,
																																																																																																				(int) (y + 16),
																																																																																																				(int) z)))) {
																																																																																															if ((world
																																																																																																	.isAirBlock(
																																																																																																			new BlockPos(
																																																																																																					(int) x,
																																																																																																					(int) (y + 17),
																																																																																																					(int) z)))) {
																																																																																																if ((world
																																																																																																		.isAirBlock(
																																																																																																				new BlockPos(
																																																																																																						(int) x,
																																																																																																						(int) (y + 18),
																																																																																																						(int) z)))) {
																																																																																																	if ((world
																																																																																																			.isAirBlock(
																																																																																																					new BlockPos(
																																																																																																							(int) x,
																																																																																																							(int) (y + 19),
																																																																																																							(int) z)))) {
																																																																																																		if ((world
																																																																																																				.isAirBlock(
																																																																																																						new BlockPos(
																																																																																																								(int) x,
																																																																																																								(int) y,
																																																																																																								(int) (z + 1))))) {
																																																																																																			if ((world
																																																																																																					.isAirBlock(
																																																																																																							new BlockPos(
																																																																																																									(int) x,
																																																																																																									(int) y,
																																																																																																									(int) (z + 2))))) {
																																																																																																				if ((world
																																																																																																						.isAirBlock(
																																																																																																								new BlockPos(
																																																																																																										(int) x,
																																																																																																										(int) y,
																																																																																																										(int) (z + 3))))) {
																																																																																																					if ((world
																																																																																																							.isAirBlock(
																																																																																																									new BlockPos(
																																																																																																											(int) x,
																																																																																																											(int) y,
																																																																																																											(int) (z + 4))))) {
																																																																																																						if ((world
																																																																																																								.isAirBlock(
																																																																																																										new BlockPos(
																																																																																																												(int) x,
																																																																																																												(int) y,
																																																																																																												(int) (z + 5))))) {
																																																																																																							if ((world
																																																																																																									.isAirBlock(
																																																																																																											new BlockPos(
																																																																																																													(int) x,
																																																																																																													(int) y,
																																																																																																													(int) (z + 6))))) {
																																																																																																								if ((world
																																																																																																										.isAirBlock(
																																																																																																												new BlockPos(
																																																																																																														(int) x,
																																																																																																														(int) y,
																																																																																																														(int) (z + 7))))) {
																																																																																																									if ((world
																																																																																																											.isAirBlock(
																																																																																																													new BlockPos(
																																																																																																															(int) x,
																																																																																																															(int) y,
																																																																																																															(int) (z + 8))))) {
																																																																																																										if ((world
																																																																																																												.isAirBlock(
																																																																																																														new BlockPos(
																																																																																																																(int) x,
																																																																																																																(int) y,
																																																																																																																(int) (z + 9))))) {
																																																																																																											if ((world
																																																																																																													.isAirBlock(
																																																																																																															new BlockPos(
																																																																																																																	(int) x,
																																																																																																																	(int) y,
																																																																																																																	(int) (z + 10))))) {
																																																																																																												if ((world
																																																																																																														.isAirBlock(
																																																																																																																new BlockPos(
																																																																																																																		(int) x,
																																																																																																																		(int) y,
																																																																																																																		(int) (z + 11))))) {
																																																																																																													if ((world
																																																																																																															.isAirBlock(
																																																																																																																	new BlockPos(
																																																																																																																			(int) x,
																																																																																																																			(int) y,
																																																																																																																			(int) (z + 12))))) {
																																																																																																														if ((world
																																																																																																																.isAirBlock(
																																																																																																																		new BlockPos(
																																																																																																																				(int) x,
																																																																																																																				(int) y,
																																																																																																																				(int) (z + 13))))) {
																																																																																																															if ((world
																																																																																																																	.isAirBlock(
																																																																																																																			new BlockPos(
																																																																																																																					(int) x,
																																																																																																																					(int) y,
																																																																																																																					(int) (z + 14))))) {
																																																																																																																if ((world
																																																																																																																		.isAirBlock(
																																																																																																																				new BlockPos(
																																																																																																																						(int) x,
																																																																																																																						(int) y,
																																																																																																																						(int) (z + 15))))) {
																																																																																																																	if ((world
																																																																																																																			.isAirBlock(
																																																																																																																					new BlockPos(
																																																																																																																							(int) x,
																																																																																																																							(int) y,
																																																																																																																							(int) (z + 16))))) {
																																																																																																																		if ((world
																																																																																																																				.isAirBlock(
																																																																																																																						new BlockPos(
																																																																																																																								(int) x,
																																																																																																																								(int) y,
																																																																																																																								(int) (z + 17))))) {
																																																																																																																			if ((world
																																																																																																																					.isAirBlock(
																																																																																																																							new BlockPos(
																																																																																																																									(int) x,
																																																																																																																									(int) y,
																																																																																																																									(int) (z + 18))))) {
																																																																																																																				if ((world
																																																																																																																						.isAirBlock(
																																																																																																																								new BlockPos(
																																																																																																																										(int) x,
																																																																																																																										(int) y,
																																																																																																																										(int) (z + 19))))) {
																																																																																																																					if (((entity
																																																																																																																							.getPosY()) < 220)) {
																																																																																																																						if (!world
																																																																																																																								.getWorld().isRemote) {
																																																																																																																							Template template = ((ServerWorld) world
																																																																																																																									.getWorld())
																																																																																																																											.getSaveHandler()
																																																																																																																											.getStructureTemplateManager()
																																																																																																																											.getTemplateDefaulted(
																																																																																																																													new ResourceLocation(
																																																																																																																															"boss_tools",
																																																																																																																															"orbit4"));
																																																																																																																							if (template != null) {
																																																																																																																								template.addBlocksToWorld(
																																																																																																																										world,
																																																																																																																										new BlockPos(
																																																																																																																												(int) (x - 8),
																																																																																																																												(int) (y - 4),
																																																																																																																												(int) (z - 4)),
																																																																																																																										new PlacementSettings()
																																																																																																																												.setRotation(
																																																																																																																														Rotation.NONE)
																																																																																																																												.setMirror(
																																																																																																																														Mirror.NONE)
																																																																																																																												.setChunk(
																																																																																																																														null)
																																																																																																																												.setIgnoreEntities(
																																																																																																																														false));
																																																																																																																							}
																																																																																																																						}
																																																																																																																						if (entity instanceof PlayerEntity)
																																																																																																																							((PlayerEntity) entity).inventory
																																																																																																																									.clearMatchingItems(
																																																																																																																											p -> new ItemStack(
																																																																																																																													OrbitPlacerItem.block,
																																																																																																																													(int) (1))
																																																																																																																															.getItem() == p
																																																																																																																																	.getItem(),
																																																																																																																											(int) 1);
																																																																																																																					} else {
																																																																																																																						if (entity instanceof PlayerEntity
																																																																																																																								&& !entity.world.isRemote) {
																																																																																																																							((PlayerEntity) entity)
																																																																																																																									.sendStatusMessage(
																																																																																																																											new StringTextComponent(
																																																																																																																													"You are too high or nearby is a structure!"),
																																																																																																																											(false));
																																																																																																																						}
																																																																																																																					}
																																																																																																																				} else {
																																																																																																																					if (entity instanceof PlayerEntity
																																																																																																																							&& !entity.world.isRemote) {
																																																																																																																						((PlayerEntity) entity)
																																																																																																																								.sendStatusMessage(
																																																																																																																										new StringTextComponent(
																																																																																																																												"You are too high or nearby is a structure!"),
																																																																																																																										(false));
																																																																																																																					}
																																																																																																																				}
																																																																																																																			} else {
																																																																																																																				if (entity instanceof PlayerEntity
																																																																																																																						&& !entity.world.isRemote) {
																																																																																																																					((PlayerEntity) entity)
																																																																																																																							.sendStatusMessage(
																																																																																																																									new StringTextComponent(
																																																																																																																											"You are too high or nearby is a structure!"),
																																																																																																																									(false));
																																																																																																																				}
																																																																																																																			}
																																																																																																																		} else {
																																																																																																																			if (entity instanceof PlayerEntity
																																																																																																																					&& !entity.world.isRemote) {
																																																																																																																				((PlayerEntity) entity)
																																																																																																																						.sendStatusMessage(
																																																																																																																								new StringTextComponent(
																																																																																																																										"You are too high or nearby is a structure!"),
																																																																																																																								(false));
																																																																																																																			}
																																																																																																																		}
																																																																																																																	} else {
																																																																																																																		if (entity instanceof PlayerEntity
																																																																																																																				&& !entity.world.isRemote) {
																																																																																																																			((PlayerEntity) entity)
																																																																																																																					.sendStatusMessage(
																																																																																																																							new StringTextComponent(
																																																																																																																									"You are too high or nearby is a structure!"),
																																																																																																																							(false));
																																																																																																																		}
																																																																																																																	}
																																																																																																																} else {
																																																																																																																	if (entity instanceof PlayerEntity
																																																																																																																			&& !entity.world.isRemote) {
																																																																																																																		((PlayerEntity) entity)
																																																																																																																				.sendStatusMessage(
																																																																																																																						new StringTextComponent(
																																																																																																																								"You are too high or nearby is a structure!"),
																																																																																																																						(false));
																																																																																																																	}
																																																																																																																}
																																																																																																															} else {
																																																																																																																if (entity instanceof PlayerEntity
																																																																																																																		&& !entity.world.isRemote) {
																																																																																																																	((PlayerEntity) entity)
																																																																																																																			.sendStatusMessage(
																																																																																																																					new StringTextComponent(
																																																																																																																							"You are too high or nearby is a structure!"),
																																																																																																																					(false));
																																																																																																																}
																																																																																																															}
																																																																																																														} else {
																																																																																																															if (entity instanceof PlayerEntity
																																																																																																																	&& !entity.world.isRemote) {
																																																																																																																((PlayerEntity) entity)
																																																																																																																		.sendStatusMessage(
																																																																																																																				new StringTextComponent(
																																																																																																																						"You are too high or nearby is a structure!"),
																																																																																																																				(false));
																																																																																																															}
																																																																																																														}
																																																																																																													} else {
																																																																																																														if (entity instanceof PlayerEntity
																																																																																																																&& !entity.world.isRemote) {
																																																																																																															((PlayerEntity) entity)
																																																																																																																	.sendStatusMessage(
																																																																																																																			new StringTextComponent(
																																																																																																																					"You are too high or nearby is a structure!"),
																																																																																																																			(false));
																																																																																																														}
																																																																																																													}
																																																																																																												} else {
																																																																																																													if (entity instanceof PlayerEntity
																																																																																																															&& !entity.world.isRemote) {
																																																																																																														((PlayerEntity) entity)
																																																																																																																.sendStatusMessage(
																																																																																																																		new StringTextComponent(
																																																																																																																				"You are too high or nearby is a structure!"),
																																																																																																																		(false));
																																																																																																													}
																																																																																																												}
																																																																																																											} else {
																																																																																																												if (entity instanceof PlayerEntity
																																																																																																														&& !entity.world.isRemote) {
																																																																																																													((PlayerEntity) entity)
																																																																																																															.sendStatusMessage(
																																																																																																																	new StringTextComponent(
																																																																																																																			"You are too high or nearby is a structure!"),
																																																																																																																	(false));
																																																																																																												}
																																																																																																											}
																																																																																																										} else {
																																																																																																											if (entity instanceof PlayerEntity
																																																																																																													&& !entity.world.isRemote) {
																																																																																																												((PlayerEntity) entity)
																																																																																																														.sendStatusMessage(
																																																																																																																new StringTextComponent(
																																																																																																																		"You are too high or nearby is a structure!"),
																																																																																																																(false));
																																																																																																											}
																																																																																																										}
																																																																																																									} else {
																																																																																																										if (entity instanceof PlayerEntity
																																																																																																												&& !entity.world.isRemote) {
																																																																																																											((PlayerEntity) entity)
																																																																																																													.sendStatusMessage(
																																																																																																															new StringTextComponent(
																																																																																																																	"You are too high or nearby is a structure!"),
																																																																																																															(false));
																																																																																																										}
																																																																																																									}
																																																																																																								} else {
																																																																																																									if (entity instanceof PlayerEntity
																																																																																																											&& !entity.world.isRemote) {
																																																																																																										((PlayerEntity) entity)
																																																																																																												.sendStatusMessage(
																																																																																																														new StringTextComponent(
																																																																																																																"You are too high or nearby is a structure!"),
																																																																																																														(false));
																																																																																																									}
																																																																																																								}
																																																																																																							} else {
																																																																																																								if (entity instanceof PlayerEntity
																																																																																																										&& !entity.world.isRemote) {
																																																																																																									((PlayerEntity) entity)
																																																																																																											.sendStatusMessage(
																																																																																																													new StringTextComponent(
																																																																																																															"You are too high or nearby is a structure!"),
																																																																																																													(false));
																																																																																																								}
																																																																																																							}
																																																																																																						} else {
																																																																																																							if (entity instanceof PlayerEntity
																																																																																																									&& !entity.world.isRemote) {
																																																																																																								((PlayerEntity) entity)
																																																																																																										.sendStatusMessage(
																																																																																																												new StringTextComponent(
																																																																																																														"You are too high or nearby is a structure!"),
																																																																																																												(false));
																																																																																																							}
																																																																																																						}
																																																																																																					} else {
																																																																																																						if (entity instanceof PlayerEntity
																																																																																																								&& !entity.world.isRemote) {
																																																																																																							((PlayerEntity) entity)
																																																																																																									.sendStatusMessage(
																																																																																																											new StringTextComponent(
																																																																																																													"You are too high or nearby is a structure!"),
																																																																																																											(false));
																																																																																																						}
																																																																																																					}
																																																																																																				} else {
																																																																																																					if (entity instanceof PlayerEntity
																																																																																																							&& !entity.world.isRemote) {
																																																																																																						((PlayerEntity) entity)
																																																																																																								.sendStatusMessage(
																																																																																																										new StringTextComponent(
																																																																																																												"You are too high or nearby is a structure!"),
																																																																																																										(false));
																																																																																																					}
																																																																																																				}
																																																																																																			} else {
																																																																																																				if (entity instanceof PlayerEntity
																																																																																																						&& !entity.world.isRemote) {
																																																																																																					((PlayerEntity) entity)
																																																																																																							.sendStatusMessage(
																																																																																																									new StringTextComponent(
																																																																																																											"You are too high or nearby is a structure!"),
																																																																																																									(false));
																																																																																																				}
																																																																																																			}
																																																																																																		} else {
																																																																																																			if (entity instanceof PlayerEntity
																																																																																																					&& !entity.world.isRemote) {
																																																																																																				((PlayerEntity) entity)
																																																																																																						.sendStatusMessage(
																																																																																																								new StringTextComponent(
																																																																																																										"You are too high or nearby is a structure!"),
																																																																																																								(false));
																																																																																																			}
																																																																																																		}
																																																																																																	} else {
																																																																																																		if (entity instanceof PlayerEntity
																																																																																																				&& !entity.world.isRemote) {
																																																																																																			((PlayerEntity) entity)
																																																																																																					.sendStatusMessage(
																																																																																																							new StringTextComponent(
																																																																																																									"You are too high or nearby is a structure!"),
																																																																																																							(false));
																																																																																																		}
																																																																																																	}
																																																																																																} else {
																																																																																																	if (entity instanceof PlayerEntity
																																																																																																			&& !entity.world.isRemote) {
																																																																																																		((PlayerEntity) entity)
																																																																																																				.sendStatusMessage(
																																																																																																						new StringTextComponent(
																																																																																																								"You are too high or nearby is a structure!"),
																																																																																																						(false));
																																																																																																	}
																																																																																																}
																																																																																															} else {
																																																																																																if (entity instanceof PlayerEntity
																																																																																																		&& !entity.world.isRemote) {
																																																																																																	((PlayerEntity) entity)
																																																																																																			.sendStatusMessage(
																																																																																																					new StringTextComponent(
																																																																																																							"You are too high or nearby is a structure!"),
																																																																																																					(false));
																																																																																																}
																																																																																															}
																																																																																														} else {
																																																																																															if (entity instanceof PlayerEntity
																																																																																																	&& !entity.world.isRemote) {
																																																																																																((PlayerEntity) entity)
																																																																																																		.sendStatusMessage(
																																																																																																				new StringTextComponent(
																																																																																																						"You are too high or nearby is a structure!"),
																																																																																																				(false));
																																																																																															}
																																																																																														}
																																																																																													} else {
																																																																																														if (entity instanceof PlayerEntity
																																																																																																&& !entity.world.isRemote) {
																																																																																															((PlayerEntity) entity)
																																																																																																	.sendStatusMessage(
																																																																																																			new StringTextComponent(
																																																																																																					"You are too high or nearby is a structure!"),
																																																																																																			(false));
																																																																																														}
																																																																																													}
																																																																																												} else {
																																																																																													if (entity instanceof PlayerEntity
																																																																																															&& !entity.world.isRemote) {
																																																																																														((PlayerEntity) entity)
																																																																																																.sendStatusMessage(
																																																																																																		new StringTextComponent(
																																																																																																				"You are too high or nearby is a structure!"),
																																																																																																		(false));
																																																																																													}
																																																																																												}
																																																																																											} else {
																																																																																												if (entity instanceof PlayerEntity
																																																																																														&& !entity.world.isRemote) {
																																																																																													((PlayerEntity) entity)
																																																																																															.sendStatusMessage(
																																																																																																	new StringTextComponent(
																																																																																																			"You are too high or nearby is a structure!"),
																																																																																																	(false));
																																																																																												}
																																																																																											}
																																																																																										} else {
																																																																																											if (entity instanceof PlayerEntity
																																																																																													&& !entity.world.isRemote) {
																																																																																												((PlayerEntity) entity)
																																																																																														.sendStatusMessage(
																																																																																																new StringTextComponent(
																																																																																																		"You are too high or nearby is a structure!"),
																																																																																																(false));
																																																																																											}
																																																																																										}
																																																																																									} else {
																																																																																										if (entity instanceof PlayerEntity
																																																																																												&& !entity.world.isRemote) {
																																																																																											((PlayerEntity) entity)
																																																																																													.sendStatusMessage(
																																																																																															new StringTextComponent(
																																																																																																	"You are too high or nearby is a structure!"),
																																																																																															(false));
																																																																																										}
																																																																																									}
																																																																																								} else {
																																																																																									if (entity instanceof PlayerEntity
																																																																																											&& !entity.world.isRemote) {
																																																																																										((PlayerEntity) entity)
																																																																																												.sendStatusMessage(
																																																																																														new StringTextComponent(
																																																																																																"You are too high or nearby is a structure!"),
																																																																																														(false));
																																																																																									}
																																																																																								}
																																																																																							} else {
																																																																																								if (entity instanceof PlayerEntity
																																																																																										&& !entity.world.isRemote) {
																																																																																									((PlayerEntity) entity)
																																																																																											.sendStatusMessage(
																																																																																													new StringTextComponent(
																																																																																															"You are too high or nearby is a structure!"),
																																																																																													(false));
																																																																																								}
																																																																																							}
																																																																																						} else {
																																																																																							if (entity instanceof PlayerEntity
																																																																																									&& !entity.world.isRemote) {
																																																																																								((PlayerEntity) entity)
																																																																																										.sendStatusMessage(
																																																																																												new StringTextComponent(
																																																																																														"You are too high or nearby is a structure!"),
																																																																																												(false));
																																																																																							}
																																																																																						}
																																																																																					} else {
																																																																																						if (entity instanceof PlayerEntity
																																																																																								&& !entity.world.isRemote) {
																																																																																							((PlayerEntity) entity)
																																																																																									.sendStatusMessage(
																																																																																											new StringTextComponent(
																																																																																													"You are too high or nearby is a structure!"),
																																																																																											(false));
																																																																																						}
																																																																																					}
																																																																																				} else {
																																																																																					if (entity instanceof PlayerEntity
																																																																																							&& !entity.world.isRemote) {
																																																																																						((PlayerEntity) entity)
																																																																																								.sendStatusMessage(
																																																																																										new StringTextComponent(
																																																																																												"You are too high or nearby is a structure!"),
																																																																																										(false));
																																																																																					}
																																																																																				}
																																																																																			} else {
																																																																																				if (entity instanceof PlayerEntity
																																																																																						&& !entity.world.isRemote) {
																																																																																					((PlayerEntity) entity)
																																																																																							.sendStatusMessage(
																																																																																									new StringTextComponent(
																																																																																											"You are too high or nearby is a structure!"),
																																																																																									(false));
																																																																																				}
																																																																																			}
																																																																																		} else {
																																																																																			if (entity instanceof PlayerEntity
																																																																																					&& !entity.world.isRemote) {
																																																																																				((PlayerEntity) entity)
																																																																																						.sendStatusMessage(
																																																																																								new StringTextComponent(
																																																																																										"You are too high or nearby is a structure!"),
																																																																																								(false));
																																																																																			}
																																																																																		}
																																																																																	} else {
																																																																																		if (entity instanceof PlayerEntity
																																																																																				&& !entity.world.isRemote) {
																																																																																			((PlayerEntity) entity)
																																																																																					.sendStatusMessage(
																																																																																							new StringTextComponent(
																																																																																									"You are too high or nearby is a structure!"),
																																																																																							(false));
																																																																																		}
																																																																																	}
																																																																																} else {
																																																																																	if (entity instanceof PlayerEntity
																																																																																			&& !entity.world.isRemote) {
																																																																																		((PlayerEntity) entity)
																																																																																				.sendStatusMessage(
																																																																																						new StringTextComponent(
																																																																																								"You are too high or nearby is a structure!"),
																																																																																						(false));
																																																																																	}
																																																																																}
																																																																															} else {
																																																																																if (entity instanceof PlayerEntity
																																																																																		&& !entity.world.isRemote) {
																																																																																	((PlayerEntity) entity)
																																																																																			.sendStatusMessage(
																																																																																					new StringTextComponent(
																																																																																							"You are too high or nearby is a structure!"),
																																																																																					(false));
																																																																																}
																																																																															}
																																																																														} else {
																																																																															if (entity instanceof PlayerEntity
																																																																																	&& !entity.world.isRemote) {
																																																																																((PlayerEntity) entity)
																																																																																		.sendStatusMessage(
																																																																																				new StringTextComponent(
																																																																																						"You are too high or nearby is a structure!"),
																																																																																				(false));
																																																																															}
																																																																														}
																																																																													} else {
																																																																														if (entity instanceof PlayerEntity
																																																																																&& !entity.world.isRemote) {
																																																																															((PlayerEntity) entity)
																																																																																	.sendStatusMessage(
																																																																																			new StringTextComponent(
																																																																																					"You are too high or nearby is a structure!"),
																																																																																			(false));
																																																																														}
																																																																													}
																																																																												} else {
																																																																													if (entity instanceof PlayerEntity
																																																																															&& !entity.world.isRemote) {
																																																																														((PlayerEntity) entity)
																																																																																.sendStatusMessage(
																																																																																		new StringTextComponent(
																																																																																				"You are too high or nearby is a structure!"),
																																																																																		(false));
																																																																													}
																																																																												}
																																																																											} else {
																																																																												if (entity instanceof PlayerEntity
																																																																														&& !entity.world.isRemote) {
																																																																													((PlayerEntity) entity)
																																																																															.sendStatusMessage(
																																																																																	new StringTextComponent(
																																																																																			"You are too high or nearby is a structure!"),
																																																																																	(false));
																																																																												}
																																																																											}
																																																																										} else {
																																																																											if (entity instanceof PlayerEntity
																																																																													&& !entity.world.isRemote) {
																																																																												((PlayerEntity) entity)
																																																																														.sendStatusMessage(
																																																																																new StringTextComponent(
																																																																																		"You are too high or nearby is a structure!"),
																																																																																(false));
																																																																											}
																																																																										}
																																																																									} else {
																																																																										if (entity instanceof PlayerEntity
																																																																												&& !entity.world.isRemote) {
																																																																											((PlayerEntity) entity)
																																																																													.sendStatusMessage(
																																																																															new StringTextComponent(
																																																																																	"You are too high or nearby is a structure!"),
																																																																															(false));
																																																																										}
																																																																									}
																																																																								} else {
																																																																									if (entity instanceof PlayerEntity
																																																																											&& !entity.world.isRemote) {
																																																																										((PlayerEntity) entity)
																																																																												.sendStatusMessage(
																																																																														new StringTextComponent(
																																																																																"You are too high or nearby is a structure!"),
																																																																														(false));
																																																																									}
																																																																								}
																																																																							} else {
																																																																								if (entity instanceof PlayerEntity
																																																																										&& !entity.world.isRemote) {
																																																																									((PlayerEntity) entity)
																																																																											.sendStatusMessage(
																																																																													new StringTextComponent(
																																																																															"You are too high or nearby is a structure!"),
																																																																													(false));
																																																																								}
																																																																							}
																																																																						} else {
																																																																							if (entity instanceof PlayerEntity
																																																																									&& !entity.world.isRemote) {
																																																																								((PlayerEntity) entity)
																																																																										.sendStatusMessage(
																																																																												new StringTextComponent(
																																																																														"You are too high or nearby is a structure!"),
																																																																												(false));
																																																																							}
																																																																						}
																																																																					} else {
																																																																						if (entity instanceof PlayerEntity
																																																																								&& !entity.world.isRemote) {
																																																																							((PlayerEntity) entity)
																																																																									.sendStatusMessage(
																																																																											new StringTextComponent(
																																																																													"You are too high or nearby is a structure!"),
																																																																											(false));
																																																																						}
																																																																					}
																																																																				} else {
																																																																					if (entity instanceof PlayerEntity
																																																																							&& !entity.world.isRemote) {
																																																																						((PlayerEntity) entity)
																																																																								.sendStatusMessage(
																																																																										new StringTextComponent(
																																																																												"You are too high or nearby is a structure!"),
																																																																										(false));
																																																																					}
																																																																				}
																																																																			} else {
																																																																				if (entity instanceof PlayerEntity
																																																																						&& !entity.world.isRemote) {
																																																																					((PlayerEntity) entity)
																																																																							.sendStatusMessage(
																																																																									new StringTextComponent(
																																																																											"You are too high or nearby is a structure!"),
																																																																									(false));
																																																																				}
																																																																			}
																																																																		} else {
																																																																			if (entity instanceof PlayerEntity
																																																																					&& !entity.world.isRemote) {
																																																																				((PlayerEntity) entity)
																																																																						.sendStatusMessage(
																																																																								new StringTextComponent(
																																																																										"You are too high or nearby is a structure!"),
																																																																								(false));
																																																																			}
																																																																		}
																																																																	} else {
																																																																		if (entity instanceof PlayerEntity
																																																																				&& !entity.world.isRemote) {
																																																																			((PlayerEntity) entity)
																																																																					.sendStatusMessage(
																																																																							new StringTextComponent(
																																																																									"You are too high or nearby is a structure!"),
																																																																							(false));
																																																																		}
																																																																	}
																																																																} else {
																																																																	if (entity instanceof PlayerEntity
																																																																			&& !entity.world.isRemote) {
																																																																		((PlayerEntity) entity)
																																																																				.sendStatusMessage(
																																																																						new StringTextComponent(
																																																																								"You are too high or nearby is a structure!"),
																																																																						(false));
																																																																	}
																																																																}
																																																															} else {
																																																																if (entity instanceof PlayerEntity
																																																																		&& !entity.world.isRemote) {
																																																																	((PlayerEntity) entity)
																																																																			.sendStatusMessage(
																																																																					new StringTextComponent(
																																																																							"You are too high or nearby is a structure!"),
																																																																					(false));
																																																																}
																																																															}
																																																														} else {
																																																															if (entity instanceof PlayerEntity
																																																																	&& !entity.world.isRemote) {
																																																																((PlayerEntity) entity)
																																																																		.sendStatusMessage(
																																																																				new StringTextComponent(
																																																																						"You are too high or nearby is a structure!"),
																																																																				(false));
																																																															}
																																																														}
																																																													} else {
																																																														if (entity instanceof PlayerEntity
																																																																&& !entity.world.isRemote) {
																																																															((PlayerEntity) entity)
																																																																	.sendStatusMessage(
																																																																			new StringTextComponent(
																																																																					"You are too high or nearby is a structure!"),
																																																																			(false));
																																																														}
																																																													}
																																																												} else {
																																																													if (entity instanceof PlayerEntity
																																																															&& !entity.world.isRemote) {
																																																														((PlayerEntity) entity)
																																																																.sendStatusMessage(
																																																																		new StringTextComponent(
																																																																				"You are too high or nearby is a structure!"),
																																																																		(false));
																																																													}
																																																												}
																																																											} else {
																																																												if (entity instanceof PlayerEntity
																																																														&& !entity.world.isRemote) {
																																																													((PlayerEntity) entity)
																																																															.sendStatusMessage(
																																																																	new StringTextComponent(
																																																																			"You are too high or nearby is a structure!"),
																																																																	(false));
																																																												}
																																																											}
																																																										} else {
																																																											if (entity instanceof PlayerEntity
																																																													&& !entity.world.isRemote) {
																																																												((PlayerEntity) entity)
																																																														.sendStatusMessage(
																																																																new StringTextComponent(
																																																																		"You are too high or nearby is a structure!"),
																																																																(false));
																																																											}
																																																										}
																																																									} else {
																																																										if (entity instanceof PlayerEntity
																																																												&& !entity.world.isRemote) {
																																																											((PlayerEntity) entity)
																																																													.sendStatusMessage(
																																																															new StringTextComponent(
																																																																	"You are too high or nearby is a structure!"),
																																																															(false));
																																																										}
																																																									}
																																																								} else {
																																																									if (entity instanceof PlayerEntity
																																																											&& !entity.world.isRemote) {
																																																										((PlayerEntity) entity)
																																																												.sendStatusMessage(
																																																														new StringTextComponent(
																																																																"You are too high or nearby is a structure!"),
																																																														(false));
																																																									}
																																																								}
																																																							} else {
																																																								if (entity instanceof PlayerEntity
																																																										&& !entity.world.isRemote) {
																																																									((PlayerEntity) entity)
																																																											.sendStatusMessage(
																																																													new StringTextComponent(
																																																															"You are too high or nearby is a structure!"),
																																																													(false));
																																																								}
																																																							}
																																																						} else {
																																																							if (entity instanceof PlayerEntity
																																																									&& !entity.world.isRemote) {
																																																								((PlayerEntity) entity)
																																																										.sendStatusMessage(
																																																												new StringTextComponent(
																																																														"You are too high or nearby is a structure!"),
																																																												(false));
																																																							}
																																																						}
																																																					} else {
																																																						if (entity instanceof PlayerEntity
																																																								&& !entity.world.isRemote) {
																																																							((PlayerEntity) entity)
																																																									.sendStatusMessage(
																																																											new StringTextComponent(
																																																													"You are too high or nearby is a structure!"),
																																																											(false));
																																																						}
																																																					}
																																																				} else {
																																																					if (entity instanceof PlayerEntity
																																																							&& !entity.world.isRemote) {
																																																						((PlayerEntity) entity)
																																																								.sendStatusMessage(
																																																										new StringTextComponent(
																																																												"You are too high or nearby is a structure!"),
																																																										(false));
																																																					}
																																																				}
																																																			} else {
																																																				if (entity instanceof PlayerEntity
																																																						&& !entity.world.isRemote) {
																																																					((PlayerEntity) entity)
																																																							.sendStatusMessage(
																																																									new StringTextComponent(
																																																											"You are too high or nearby is a structure!"),
																																																									(false));
																																																				}
																																																			}
																																																		} else {
																																																			if (entity instanceof PlayerEntity
																																																					&& !entity.world.isRemote) {
																																																				((PlayerEntity) entity)
																																																						.sendStatusMessage(
																																																								new StringTextComponent(
																																																										"You are too high or nearby is a structure!"),
																																																								(false));
																																																			}
																																																		}
																																																	} else {
																																																		if (entity instanceof PlayerEntity
																																																				&& !entity.world.isRemote) {
																																																			((PlayerEntity) entity)
																																																					.sendStatusMessage(
																																																							new StringTextComponent(
																																																									"You are too high or nearby is a structure!"),
																																																							(false));
																																																		}
																																																	}
																																																} else {
																																																	if (entity instanceof PlayerEntity
																																																			&& !entity.world.isRemote) {
																																																		((PlayerEntity) entity)
																																																				.sendStatusMessage(
																																																						new StringTextComponent(
																																																								"You are too high or nearby is a structure!"),
																																																						(false));
																																																	}
																																																}
																																															} else {
																																																if (entity instanceof PlayerEntity
																																																		&& !entity.world.isRemote) {
																																																	((PlayerEntity) entity)
																																																			.sendStatusMessage(
																																																					new StringTextComponent(
																																																							"You are too high or nearby is a structure!"),
																																																					(false));
																																																}
																																															}
																																														} else {
																																															if (entity instanceof PlayerEntity
																																																	&& !entity.world.isRemote) {
																																																((PlayerEntity) entity)
																																																		.sendStatusMessage(
																																																				new StringTextComponent(
																																																						"You are too high or nearby is a structure!"),
																																																				(false));
																																															}
																																														}
																																													} else {
																																														if (entity instanceof PlayerEntity
																																																&& !entity.world.isRemote) {
																																															((PlayerEntity) entity)
																																																	.sendStatusMessage(
																																																			new StringTextComponent(
																																																					"You are too high or nearby is a structure!"),
																																																			(false));
																																														}
																																													}
																																												} else {
																																													if (entity instanceof PlayerEntity
																																															&& !entity.world.isRemote) {
																																														((PlayerEntity) entity)
																																																.sendStatusMessage(
																																																		new StringTextComponent(
																																																				"You are too high or nearby is a structure!"),
																																																		(false));
																																													}
																																												}
																																											} else {
																																												if (entity instanceof PlayerEntity
																																														&& !entity.world.isRemote) {
																																													((PlayerEntity) entity)
																																															.sendStatusMessage(
																																																	new StringTextComponent(
																																																			"You are too high or nearby is a structure!"),
																																																	(false));
																																												}
																																											}
																																										} else {
																																											if (entity instanceof PlayerEntity
																																													&& !entity.world.isRemote) {
																																												((PlayerEntity) entity)
																																														.sendStatusMessage(
																																																new StringTextComponent(
																																																		"You are too high or nearby is a structure!"),
																																																(false));
																																											}
																																										}
																																									} else {
																																										if (entity instanceof PlayerEntity
																																												&& !entity.world.isRemote) {
																																											((PlayerEntity) entity)
																																													.sendStatusMessage(
																																															new StringTextComponent(
																																																	"You are too high or nearby is a structure!"),
																																															(false));
																																										}
																																									}
																																								} else {
																																									if (entity instanceof PlayerEntity
																																											&& !entity.world.isRemote) {
																																										((PlayerEntity) entity)
																																												.sendStatusMessage(
																																														new StringTextComponent(
																																																"You are too high or nearby is a structure!"),
																																														(false));
																																									}
																																								}
																																							} else {
																																								if (entity instanceof PlayerEntity
																																										&& !entity.world.isRemote) {
																																									((PlayerEntity) entity)
																																											.sendStatusMessage(
																																													new StringTextComponent(
																																															"You are too high or nearby is a structure!"),
																																													(false));
																																								}
																																							}
																																						} else {
																																							if (entity instanceof PlayerEntity
																																									&& !entity.world.isRemote) {
																																								((PlayerEntity) entity)
																																										.sendStatusMessage(
																																												new StringTextComponent(
																																														"You are too high or nearby is a structure!"),
																																												(false));
																																							}
																																						}
																																					} else {
																																						if (entity instanceof PlayerEntity
																																								&& !entity.world.isRemote) {
																																							((PlayerEntity) entity)
																																									.sendStatusMessage(
																																											new StringTextComponent(
																																													"You are too high or nearby is a structure!"),
																																											(false));
																																						}
																																					}
																																				} else {
																																					if (entity instanceof PlayerEntity
																																							&& !entity.world.isRemote) {
																																						((PlayerEntity) entity)
																																								.sendStatusMessage(
																																										new StringTextComponent(
																																												"You are too high or nearby is a structure!"),
																																										(false));
																																					}
																																				}
																																			} else {
																																				if (entity instanceof PlayerEntity
																																						&& !entity.world.isRemote) {
																																					((PlayerEntity) entity)
																																							.sendStatusMessage(
																																									new StringTextComponent(
																																											"You are too high or nearby is a structure!"),
																																									(false));
																																				}
																																			}
																																		} else {
																																			if (entity instanceof PlayerEntity
																																					&& !entity.world.isRemote) {
																																				((PlayerEntity) entity)
																																						.sendStatusMessage(
																																								new StringTextComponent(
																																										"You are too high or nearby is a structure!"),
																																								(false));
																																			}
																																		}
																																	} else {
																																		if (entity instanceof PlayerEntity
																																				&& !entity.world.isRemote) {
																																			((PlayerEntity) entity)
																																					.sendStatusMessage(
																																							new StringTextComponent(
																																									"You are too high or nearby is a structure!"),
																																							(false));
																																		}
																																	}
																																} else {
																																	if (entity instanceof PlayerEntity
																																			&& !entity.world.isRemote) {
																																		((PlayerEntity) entity)
																																				.sendStatusMessage(
																																						new StringTextComponent(
																																								"You are too high or nearby is a structure!"),
																																						(false));
																																	}
																																}
																															} else {
																																if (entity instanceof PlayerEntity
																																		&& !entity.world.isRemote) {
																																	((PlayerEntity) entity)
																																			.sendStatusMessage(
																																					new StringTextComponent(
																																							"You are too high or nearby is a structure!"),
																																					(false));
																																}
																															}
																														} else {
																															if (entity instanceof PlayerEntity
																																	&& !entity.world.isRemote) {
																																((PlayerEntity) entity)
																																		.sendStatusMessage(
																																				new StringTextComponent(
																																						"You are too high or nearby is a structure!"),
																																				(false));
																															}
																														}
																													} else {
																														if (entity instanceof PlayerEntity
																																&& !entity.world.isRemote) {
																															((PlayerEntity) entity)
																																	.sendStatusMessage(
																																			new StringTextComponent(
																																					"You are too high or nearby is a structure!"),
																																			(false));
																														}
																													}
																												} else {
																													if (entity instanceof PlayerEntity
																															&& !entity.world.isRemote) {
																														((PlayerEntity) entity)
																																.sendStatusMessage(
																																		new StringTextComponent(
																																				"You are too high or nearby is a structure!"),
																																		(false));
																													}
																												}
																											} else {
																												if (entity instanceof PlayerEntity
																														&& !entity.world.isRemote) {
																													((PlayerEntity) entity)
																															.sendStatusMessage(
																																	new StringTextComponent(
																																			"You are too high or nearby is a structure!"),
																																	(false));
																												}
																											}
																										} else {
																											if (entity instanceof PlayerEntity
																													&& !entity.world.isRemote) {
																												((PlayerEntity) entity)
																														.sendStatusMessage(
																																new StringTextComponent(
																																		"You are too high or nearby is a structure!"),
																																(false));
																											}
																										}
																									} else {
																										if (entity instanceof PlayerEntity
																												&& !entity.world.isRemote) {
																											((PlayerEntity) entity).sendStatusMessage(
																													new StringTextComponent(
																															"You are too high or nearby is a structure!"),
																													(false));
																										}
																									}
																								} else {
																									if (entity instanceof PlayerEntity
																											&& !entity.world.isRemote) {
																										((PlayerEntity) entity).sendStatusMessage(
																												new StringTextComponent(
																														"You are too high or nearby is a structure!"),
																												(false));
																									}
																								}
																							} else {
																								if (entity instanceof PlayerEntity
																										&& !entity.world.isRemote) {
																									((PlayerEntity) entity).sendStatusMessage(
																											new StringTextComponent(
																													"You are too high or nearby is a structure!"),
																											(false));
																								}
																							}
																						} else {
																							if (entity instanceof PlayerEntity
																									&& !entity.world.isRemote) {
																								((PlayerEntity) entity).sendStatusMessage(
																										new StringTextComponent(
																												"You are too high or nearby is a structure!"),
																										(false));
																							}
																						}
																					} else {
																						if (entity instanceof PlayerEntity
																								&& !entity.world.isRemote) {
																							((PlayerEntity) entity).sendStatusMessage(
																									new StringTextComponent(
																											"You are too high or nearby is a structure!"),
																									(false));
																						}
																					}
																				} else {
																					if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																						((PlayerEntity) entity).sendStatusMessage(
																								new StringTextComponent(
																										"You are too high or nearby is a structure!"),
																								(false));
																					}
																				}
																			} else {
																				if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																					((PlayerEntity) entity).sendStatusMessage(
																							new StringTextComponent(
																									"You are too high or nearby is a structure!"),
																							(false));
																				}
																			}
																		} else {
																			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																				((PlayerEntity) entity).sendStatusMessage(
																						new StringTextComponent(
																								"You are too high or nearby is a structure!"),
																						(false));
																			}
																		}
																	} else {
																		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
																					"You are too high or nearby is a structure!"), (false));
																		}
																	}
																} else {
																	if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																		((PlayerEntity) entity).sendStatusMessage(
																				new StringTextComponent("You are too high or nearby is a structure!"),
																				(false));
																	}
																}
															} else {
																if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																	((PlayerEntity) entity).sendStatusMessage(
																			new StringTextComponent("You are too high or nearby is a structure!"),
																			(false));
																}
															}
														} else {
															if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																((PlayerEntity) entity).sendStatusMessage(
																		new StringTextComponent("You are too high or nearby is a structure!"),
																		(false));
															}
														}
													} else {
														if (entity instanceof PlayerEntity && !entity.world.isRemote) {
															((PlayerEntity) entity).sendStatusMessage(
																	new StringTextComponent("You are too high or nearby is a structure!"), (false));
														}
													}
												} else {
													if (entity instanceof PlayerEntity && !entity.world.isRemote) {
														((PlayerEntity) entity).sendStatusMessage(
																new StringTextComponent("You are too high or nearby is a structure!"), (false));
													}
												}
											} else {
												if (entity instanceof PlayerEntity && !entity.world.isRemote) {
													((PlayerEntity) entity).sendStatusMessage(
															new StringTextComponent("You are too high or nearby is a structure!"), (false));
												}
											}
										} else {
											if (entity instanceof PlayerEntity && !entity.world.isRemote) {
												((PlayerEntity) entity).sendStatusMessage(
														new StringTextComponent("You are too high or nearby is a structure!"), (false));
											}
										}
									} else {
										if (entity instanceof PlayerEntity && !entity.world.isRemote) {
											((PlayerEntity) entity).sendStatusMessage(
													new StringTextComponent("You are too high or nearby is a structure!"), (false));
										}
									}
								} else {
									if (entity instanceof PlayerEntity && !entity.world.isRemote) {
										((PlayerEntity) entity)
												.sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"), (false));
									}
								}
							} else {
								if (entity instanceof PlayerEntity && !entity.world.isRemote) {
									((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"),
											(false));
								}
							}
						} else {
							if (entity instanceof PlayerEntity && !entity.world.isRemote) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"),
										(false));
							}
						}
					} else {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"), (false));
						}
					}
				} else {
					if (entity instanceof PlayerEntity && !entity.world.isRemote) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"), (false));
					}
				}
			} else {
				if (entity instanceof PlayerEntity && !entity.world.isRemote) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"), (false));
				}
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Works only in orbit!"), (false));
			}
		}
		if ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("boss_tools:orbit_moon_biom")))) {
			if ((world.isAirBlock(new BlockPos((int) (x - 1), (int) y, (int) z)))) {
				if ((world.isAirBlock(new BlockPos((int) (x - 2), (int) y, (int) z)))) {
					if ((world.isAirBlock(new BlockPos((int) (x - 3), (int) y, (int) z)))) {
						if ((world.isAirBlock(new BlockPos((int) (x - 4), (int) y, (int) z)))) {
							if ((world.isAirBlock(new BlockPos((int) (x - 5), (int) y, (int) z)))) {
								if ((world.isAirBlock(new BlockPos((int) (x - 6), (int) y, (int) z)))) {
									if ((world.isAirBlock(new BlockPos((int) (x - 7), (int) y, (int) z)))) {
										if ((world.isAirBlock(new BlockPos((int) (x - 8), (int) y, (int) z)))) {
											if ((world.isAirBlock(new BlockPos((int) (x - 9), (int) y, (int) z)))) {
												if ((world.isAirBlock(new BlockPos((int) (x - 10), (int) y, (int) z)))) {
													if ((world.isAirBlock(new BlockPos((int) (x - 11), (int) y, (int) z)))) {
														if ((world.isAirBlock(new BlockPos((int) (x - 12), (int) y, (int) z)))) {
															if ((world.isAirBlock(new BlockPos((int) (x - 13), (int) y, (int) z)))) {
																if ((world.isAirBlock(new BlockPos((int) (x - 14), (int) y, (int) z)))) {
																	if ((world.isAirBlock(new BlockPos((int) (x - 15), (int) y, (int) z)))) {
																		if ((world.isAirBlock(new BlockPos((int) (x - 16), (int) y, (int) z)))) {
																			if ((world.isAirBlock(new BlockPos((int) (x - 17), (int) y, (int) z)))) {
																				if ((world.isAirBlock(
																						new BlockPos((int) (x - 19), (int) y, (int) z)))) {
																					if ((world.isAirBlock(
																							new BlockPos((int) (x - 19), (int) y, (int) z)))) {
																						if ((world.isAirBlock(
																								new BlockPos((int) x, (int) (y - 1), (int) z)))) {
																							if ((world.isAirBlock(
																									new BlockPos((int) x, (int) (y - 2), (int) z)))) {
																								if ((world.isAirBlock(new BlockPos((int) x,
																										(int) (y - 3), (int) z)))) {
																									if ((world.isAirBlock(new BlockPos((int) x,
																											(int) (y - 4), (int) z)))) {
																										if ((world.isAirBlock(new BlockPos((int) x,
																												(int) (y - 5), (int) z)))) {
																											if ((world.isAirBlock(new BlockPos(
																													(int) x, (int) (y - 6),
																													(int) z)))) {
																												if ((world.isAirBlock(new BlockPos(
																														(int) x, (int) (y - 7),
																														(int) z)))) {
																													if ((world.isAirBlock(
																															new BlockPos((int) x,
																																	(int) (y - 8),
																																	(int) z)))) {
																														if ((world.isAirBlock(
																																new BlockPos((int) x,
																																		(int) (y - 9),
																																		(int) z)))) {
																															if ((world.isAirBlock(
																																	new BlockPos(
																																			(int) x,
																																			(int) (y - 10),
																																			(int) z)))) {
																																if ((world.isAirBlock(
																																		new BlockPos(
																																				(int) x,
																																				(int) (y - 11),
																																				(int) z)))) {
																																	if ((world
																																			.isAirBlock(
																																					new BlockPos(
																																							(int) x,
																																							(int) (y - 12),
																																							(int) z)))) {
																																		if ((world
																																				.isAirBlock(
																																						new BlockPos(
																																								(int) x,
																																								(int) (y - 13),
																																								(int) z)))) {
																																			if ((world
																																					.isAirBlock(
																																							new BlockPos(
																																									(int) x,
																																									(int) (y - 14),
																																									(int) z)))) {
																																				if ((world
																																						.isAirBlock(
																																								new BlockPos(
																																										(int) x,
																																										(int) (y - 15),
																																										(int) z)))) {
																																					if ((world
																																							.isAirBlock(
																																									new BlockPos(
																																											(int) x,
																																											(int) (y - 16),
																																											(int) z)))) {
																																						if ((world
																																								.isAirBlock(
																																										new BlockPos(
																																												(int) x,
																																												(int) (y - 17),
																																												(int) z)))) {
																																							if ((world
																																									.isAirBlock(
																																											new BlockPos(
																																													(int) x,
																																													(int) (y - 18),
																																													(int) z)))) {
																																								if ((world
																																										.isAirBlock(
																																												new BlockPos(
																																														(int) x,
																																														(int) (y - 19),
																																														(int) z)))) {
																																									if ((world
																																											.isAirBlock(
																																													new BlockPos(
																																															(int) x,
																																															(int) y,
																																															(int) (z - 1))))) {
																																										if ((world
																																												.isAirBlock(
																																														new BlockPos(
																																																(int) x,
																																																(int) y,
																																																(int) (z - 2))))) {
																																											if ((world
																																													.isAirBlock(
																																															new BlockPos(
																																																	(int) x,
																																																	(int) y,
																																																	(int) (z - 3))))) {
																																												if ((world
																																														.isAirBlock(
																																																new BlockPos(
																																																		(int) x,
																																																		(int) y,
																																																		(int) (z - 4))))) {
																																													if ((world
																																															.isAirBlock(
																																																	new BlockPos(
																																																			(int) x,
																																																			(int) y,
																																																			(int) (z - 5))))) {
																																														if ((world
																																																.isAirBlock(
																																																		new BlockPos(
																																																				(int) x,
																																																				(int) y,
																																																				(int) (z - 6))))) {
																																															if ((world
																																																	.isAirBlock(
																																																			new BlockPos(
																																																					(int) x,
																																																					(int) y,
																																																					(int) (z - 7))))) {
																																																if ((world
																																																		.isAirBlock(
																																																				new BlockPos(
																																																						(int) x,
																																																						(int) y,
																																																						(int) (z - 8))))) {
																																																	if ((world
																																																			.isAirBlock(
																																																					new BlockPos(
																																																							(int) x,
																																																							(int) y,
																																																							(int) (z - 9))))) {
																																																		if ((world
																																																				.isAirBlock(
																																																						new BlockPos(
																																																								(int) x,
																																																								(int) y,
																																																								(int) (z - 10))))) {
																																																			if ((world
																																																					.isAirBlock(
																																																							new BlockPos(
																																																									(int) x,
																																																									(int) y,
																																																									(int) (z - 11))))) {
																																																				if ((world
																																																						.isAirBlock(
																																																								new BlockPos(
																																																										(int) x,
																																																										(int) y,
																																																										(int) (z - 12))))) {
																																																					if ((world
																																																							.isAirBlock(
																																																									new BlockPos(
																																																											(int) x,
																																																											(int) y,
																																																											(int) (z - 13))))) {
																																																						if ((world
																																																								.isAirBlock(
																																																										new BlockPos(
																																																												(int) x,
																																																												(int) y,
																																																												(int) (z - 14))))) {
																																																							if ((world
																																																									.isAirBlock(
																																																											new BlockPos(
																																																													(int) x,
																																																													(int) y,
																																																													(int) (z - 15))))) {
																																																								if ((world
																																																										.isAirBlock(
																																																												new BlockPos(
																																																														(int) x,
																																																														(int) y,
																																																														(int) (z - 16))))) {
																																																									if ((world
																																																											.isAirBlock(
																																																													new BlockPos(
																																																															(int) x,
																																																															(int) y,
																																																															(int) (z - 17))))) {
																																																										if ((world
																																																												.isAirBlock(
																																																														new BlockPos(
																																																																(int) x,
																																																																(int) y,
																																																																(int) (z - 18))))) {
																																																											if ((world
																																																													.isAirBlock(
																																																															new BlockPos(
																																																																	(int) x,
																																																																	(int) y,
																																																																	(int) (z - 19))))) {
																																																												if ((world
																																																														.isAirBlock(
																																																																new BlockPos(
																																																																		(int) (x + 1),
																																																																		(int) y,
																																																																		(int) z)))) {
																																																													if ((world
																																																															.isAirBlock(
																																																																	new BlockPos(
																																																																			(int) (x + 2),
																																																																			(int) y,
																																																																			(int) z)))) {
																																																														if ((world
																																																																.isAirBlock(
																																																																		new BlockPos(
																																																																				(int) (x + 3),
																																																																				(int) y,
																																																																				(int) z)))) {
																																																															if ((world
																																																																	.isAirBlock(
																																																																			new BlockPos(
																																																																					(int) (x + 4),
																																																																					(int) y,
																																																																					(int) z)))) {
																																																																if ((world
																																																																		.isAirBlock(
																																																																				new BlockPos(
																																																																						(int) (x + 5),
																																																																						(int) y,
																																																																						(int) z)))) {
																																																																	if ((world
																																																																			.isAirBlock(
																																																																					new BlockPos(
																																																																							(int) (x + 6),
																																																																							(int) y,
																																																																							(int) z)))) {
																																																																		if ((world
																																																																				.isAirBlock(
																																																																						new BlockPos(
																																																																								(int) (x + 7),
																																																																								(int) y,
																																																																								(int) z)))) {
																																																																			if ((world
																																																																					.isAirBlock(
																																																																							new BlockPos(
																																																																									(int) (x + 8),
																																																																									(int) y,
																																																																									(int) z)))) {
																																																																				if ((world
																																																																						.isAirBlock(
																																																																								new BlockPos(
																																																																										(int) (x + 9),
																																																																										(int) y,
																																																																										(int) z)))) {
																																																																					if ((world
																																																																							.isAirBlock(
																																																																									new BlockPos(
																																																																											(int) (x + 10),
																																																																											(int) y,
																																																																											(int) z)))) {
																																																																						if ((world
																																																																								.isAirBlock(
																																																																										new BlockPos(
																																																																												(int) (x + 11),
																																																																												(int) y,
																																																																												(int) z)))) {
																																																																							if ((world
																																																																									.isAirBlock(
																																																																											new BlockPos(
																																																																													(int) (x + 12),
																																																																													(int) y,
																																																																													(int) z)))) {
																																																																								if ((world
																																																																										.isAirBlock(
																																																																												new BlockPos(
																																																																														(int) (x + 13),
																																																																														(int) y,
																																																																														(int) z)))) {
																																																																									if ((world
																																																																											.isAirBlock(
																																																																													new BlockPos(
																																																																															(int) (x + 14),
																																																																															(int) y,
																																																																															(int) z)))) {
																																																																										if ((world
																																																																												.isAirBlock(
																																																																														new BlockPos(
																																																																																(int) (x + 15),
																																																																																(int) y,
																																																																																(int) z)))) {
																																																																											if ((world
																																																																													.isAirBlock(
																																																																															new BlockPos(
																																																																																	(int) (x + 16),
																																																																																	(int) y,
																																																																																	(int) z)))) {
																																																																												if ((world
																																																																														.isAirBlock(
																																																																																new BlockPos(
																																																																																		(int) (x + 17),
																																																																																		(int) y,
																																																																																		(int) z)))) {
																																																																													if ((world
																																																																															.isAirBlock(
																																																																																	new BlockPos(
																																																																																			(int) (x + 19),
																																																																																			(int) y,
																																																																																			(int) z)))) {
																																																																														if ((world
																																																																																.isAirBlock(
																																																																																		new BlockPos(
																																																																																				(int) (x + 19),
																																																																																				(int) y,
																																																																																				(int) z)))) {
																																																																															if ((world
																																																																																	.isAirBlock(
																																																																																			new BlockPos(
																																																																																					(int) x,
																																																																																					(int) (y + 1),
																																																																																					(int) z)))) {
																																																																																if ((world
																																																																																		.isAirBlock(
																																																																																				new BlockPos(
																																																																																						(int) x,
																																																																																						(int) (y + 2),
																																																																																						(int) z)))) {
																																																																																	if ((world
																																																																																			.isAirBlock(
																																																																																					new BlockPos(
																																																																																							(int) x,
																																																																																							(int) (y + 3),
																																																																																							(int) z)))) {
																																																																																		if ((world
																																																																																				.isAirBlock(
																																																																																						new BlockPos(
																																																																																								(int) x,
																																																																																								(int) (y + 4),
																																																																																								(int) z)))) {
																																																																																			if ((world
																																																																																					.isAirBlock(
																																																																																							new BlockPos(
																																																																																									(int) x,
																																																																																									(int) (y + 5),
																																																																																									(int) z)))) {
																																																																																				if ((world
																																																																																						.isAirBlock(
																																																																																								new BlockPos(
																																																																																										(int) x,
																																																																																										(int) (y + 6),
																																																																																										(int) z)))) {
																																																																																					if ((world
																																																																																							.isAirBlock(
																																																																																									new BlockPos(
																																																																																											(int) x,
																																																																																											(int) (y + 7),
																																																																																											(int) z)))) {
																																																																																						if ((world
																																																																																								.isAirBlock(
																																																																																										new BlockPos(
																																																																																												(int) x,
																																																																																												(int) (y + 8),
																																																																																												(int) z)))) {
																																																																																							if ((world
																																																																																									.isAirBlock(
																																																																																											new BlockPos(
																																																																																													(int) x,
																																																																																													(int) (y + 9),
																																																																																													(int) z)))) {
																																																																																								if ((world
																																																																																										.isAirBlock(
																																																																																												new BlockPos(
																																																																																														(int) x,
																																																																																														(int) (y + 10),
																																																																																														(int) z)))) {
																																																																																									if ((world
																																																																																											.isAirBlock(
																																																																																													new BlockPos(
																																																																																															(int) x,
																																																																																															(int) (y + 11),
																																																																																															(int) z)))) {
																																																																																										if ((world
																																																																																												.isAirBlock(
																																																																																														new BlockPos(
																																																																																																(int) x,
																																																																																																(int) (y + 12),
																																																																																																(int) z)))) {
																																																																																											if ((world
																																																																																													.isAirBlock(
																																																																																															new BlockPos(
																																																																																																	(int) x,
																																																																																																	(int) (y + 13),
																																																																																																	(int) z)))) {
																																																																																												if ((world
																																																																																														.isAirBlock(
																																																																																																new BlockPos(
																																																																																																		(int) x,
																																																																																																		(int) (y + 14),
																																																																																																		(int) z)))) {
																																																																																													if ((world
																																																																																															.isAirBlock(
																																																																																																	new BlockPos(
																																																																																																			(int) x,
																																																																																																			(int) (y + 15),
																																																																																																			(int) z)))) {
																																																																																														if ((world
																																																																																																.isAirBlock(
																																																																																																		new BlockPos(
																																																																																																				(int) x,
																																																																																																				(int) (y + 16),
																																																																																																				(int) z)))) {
																																																																																															if ((world
																																																																																																	.isAirBlock(
																																																																																																			new BlockPos(
																																																																																																					(int) x,
																																																																																																					(int) (y + 17),
																																																																																																					(int) z)))) {
																																																																																																if ((world
																																																																																																		.isAirBlock(
																																																																																																				new BlockPos(
																																																																																																						(int) x,
																																																																																																						(int) (y + 18),
																																																																																																						(int) z)))) {
																																																																																																	if ((world
																																																																																																			.isAirBlock(
																																																																																																					new BlockPos(
																																																																																																							(int) x,
																																																																																																							(int) (y + 19),
																																																																																																							(int) z)))) {
																																																																																																		if ((world
																																																																																																				.isAirBlock(
																																																																																																						new BlockPos(
																																																																																																								(int) x,
																																																																																																								(int) y,
																																																																																																								(int) (z + 1))))) {
																																																																																																			if ((world
																																																																																																					.isAirBlock(
																																																																																																							new BlockPos(
																																																																																																									(int) x,
																																																																																																									(int) y,
																																																																																																									(int) (z + 2))))) {
																																																																																																				if ((world
																																																																																																						.isAirBlock(
																																																																																																								new BlockPos(
																																																																																																										(int) x,
																																																																																																										(int) y,
																																																																																																										(int) (z + 3))))) {
																																																																																																					if ((world
																																																																																																							.isAirBlock(
																																																																																																									new BlockPos(
																																																																																																											(int) x,
																																																																																																											(int) y,
																																																																																																											(int) (z + 4))))) {
																																																																																																						if ((world
																																																																																																								.isAirBlock(
																																																																																																										new BlockPos(
																																																																																																												(int) x,
																																																																																																												(int) y,
																																																																																																												(int) (z + 5))))) {
																																																																																																							if ((world
																																																																																																									.isAirBlock(
																																																																																																											new BlockPos(
																																																																																																													(int) x,
																																																																																																													(int) y,
																																																																																																													(int) (z + 6))))) {
																																																																																																								if ((world
																																																																																																										.isAirBlock(
																																																																																																												new BlockPos(
																																																																																																														(int) x,
																																																																																																														(int) y,
																																																																																																														(int) (z + 7))))) {
																																																																																																									if ((world
																																																																																																											.isAirBlock(
																																																																																																													new BlockPos(
																																																																																																															(int) x,
																																																																																																															(int) y,
																																																																																																															(int) (z + 8))))) {
																																																																																																										if ((world
																																																																																																												.isAirBlock(
																																																																																																														new BlockPos(
																																																																																																																(int) x,
																																																																																																																(int) y,
																																																																																																																(int) (z + 9))))) {
																																																																																																											if ((world
																																																																																																													.isAirBlock(
																																																																																																															new BlockPos(
																																																																																																																	(int) x,
																																																																																																																	(int) y,
																																																																																																																	(int) (z + 10))))) {
																																																																																																												if ((world
																																																																																																														.isAirBlock(
																																																																																																																new BlockPos(
																																																																																																																		(int) x,
																																																																																																																		(int) y,
																																																																																																																		(int) (z + 11))))) {
																																																																																																													if ((world
																																																																																																															.isAirBlock(
																																																																																																																	new BlockPos(
																																																																																																																			(int) x,
																																																																																																																			(int) y,
																																																																																																																			(int) (z + 12))))) {
																																																																																																														if ((world
																																																																																																																.isAirBlock(
																																																																																																																		new BlockPos(
																																																																																																																				(int) x,
																																																																																																																				(int) y,
																																																																																																																				(int) (z + 13))))) {
																																																																																																															if ((world
																																																																																																																	.isAirBlock(
																																																																																																																			new BlockPos(
																																																																																																																					(int) x,
																																																																																																																					(int) y,
																																																																																																																					(int) (z + 14))))) {
																																																																																																																if ((world
																																																																																																																		.isAirBlock(
																																																																																																																				new BlockPos(
																																																																																																																						(int) x,
																																																																																																																						(int) y,
																																																																																																																						(int) (z + 15))))) {
																																																																																																																	if ((world
																																																																																																																			.isAirBlock(
																																																																																																																					new BlockPos(
																																																																																																																							(int) x,
																																																																																																																							(int) y,
																																																																																																																							(int) (z + 16))))) {
																																																																																																																		if ((world
																																																																																																																				.isAirBlock(
																																																																																																																						new BlockPos(
																																																																																																																								(int) x,
																																																																																																																								(int) y,
																																																																																																																								(int) (z + 17))))) {
																																																																																																																			if ((world
																																																																																																																					.isAirBlock(
																																																																																																																							new BlockPos(
																																																																																																																									(int) x,
																																																																																																																									(int) y,
																																																																																																																									(int) (z + 18))))) {
																																																																																																																				if ((world
																																																																																																																						.isAirBlock(
																																																																																																																								new BlockPos(
																																																																																																																										(int) x,
																																																																																																																										(int) y,
																																																																																																																										(int) (z + 19))))) {
																																																																																																																					if (((entity
																																																																																																																							.getPosY()) < 220)) {
																																																																																																																						if (!world
																																																																																																																								.getWorld().isRemote) {
																																																																																																																							Template template = ((ServerWorld) world
																																																																																																																									.getWorld())
																																																																																																																											.getSaveHandler()
																																																																																																																											.getStructureTemplateManager()
																																																																																																																											.getTemplateDefaulted(
																																																																																																																													new ResourceLocation(
																																																																																																																															"boss_tools",
																																																																																																																															"orbit4"));
																																																																																																																							if (template != null) {
																																																																																																																								template.addBlocksToWorld(
																																																																																																																										world,
																																																																																																																										new BlockPos(
																																																																																																																												(int) (x - 8),
																																																																																																																												(int) (y - 4),
																																																																																																																												(int) (z - 4)),
																																																																																																																										new PlacementSettings()
																																																																																																																												.setRotation(
																																																																																																																														Rotation.NONE)
																																																																																																																												.setMirror(
																																																																																																																														Mirror.NONE)
																																																																																																																												.setChunk(
																																																																																																																														null)
																																																																																																																												.setIgnoreEntities(
																																																																																																																														false));
																																																																																																																							}
																																																																																																																						}
																																																																																																																						if (entity instanceof PlayerEntity)
																																																																																																																							((PlayerEntity) entity).inventory
																																																																																																																									.clearMatchingItems(
																																																																																																																											p -> new ItemStack(
																																																																																																																													OrbitPlacerItem.block,
																																																																																																																													(int) (1))
																																																																																																																															.getItem() == p
																																																																																																																																	.getItem(),
																																																																																																																											(int) 1);
																																																																																																																					} else {
																																																																																																																						if (entity instanceof PlayerEntity
																																																																																																																								&& !entity.world.isRemote) {
																																																																																																																							((PlayerEntity) entity)
																																																																																																																									.sendStatusMessage(
																																																																																																																											new StringTextComponent(
																																																																																																																													"You are too high or nearby is a structure!"),
																																																																																																																											(false));
																																																																																																																						}
																																																																																																																					}
																																																																																																																				} else {
																																																																																																																					if (entity instanceof PlayerEntity
																																																																																																																							&& !entity.world.isRemote) {
																																																																																																																						((PlayerEntity) entity)
																																																																																																																								.sendStatusMessage(
																																																																																																																										new StringTextComponent(
																																																																																																																												"You are too high or nearby is a structure!"),
																																																																																																																										(false));
																																																																																																																					}
																																																																																																																				}
																																																																																																																			} else {
																																																																																																																				if (entity instanceof PlayerEntity
																																																																																																																						&& !entity.world.isRemote) {
																																																																																																																					((PlayerEntity) entity)
																																																																																																																							.sendStatusMessage(
																																																																																																																									new StringTextComponent(
																																																																																																																											"You are too high or nearby is a structure!"),
																																																																																																																									(false));
																																																																																																																				}
																																																																																																																			}
																																																																																																																		} else {
																																																																																																																			if (entity instanceof PlayerEntity
																																																																																																																					&& !entity.world.isRemote) {
																																																																																																																				((PlayerEntity) entity)
																																																																																																																						.sendStatusMessage(
																																																																																																																								new StringTextComponent(
																																																																																																																										"You are too high or nearby is a structure!"),
																																																																																																																								(false));
																																																																																																																			}
																																																																																																																		}
																																																																																																																	} else {
																																																																																																																		if (entity instanceof PlayerEntity
																																																																																																																				&& !entity.world.isRemote) {
																																																																																																																			((PlayerEntity) entity)
																																																																																																																					.sendStatusMessage(
																																																																																																																							new StringTextComponent(
																																																																																																																									"You are too high or nearby is a structure!"),
																																																																																																																							(false));
																																																																																																																		}
																																																																																																																	}
																																																																																																																} else {
																																																																																																																	if (entity instanceof PlayerEntity
																																																																																																																			&& !entity.world.isRemote) {
																																																																																																																		((PlayerEntity) entity)
																																																																																																																				.sendStatusMessage(
																																																																																																																						new StringTextComponent(
																																																																																																																								"You are too high or nearby is a structure!"),
																																																																																																																						(false));
																																																																																																																	}
																																																																																																																}
																																																																																																															} else {
																																																																																																																if (entity instanceof PlayerEntity
																																																																																																																		&& !entity.world.isRemote) {
																																																																																																																	((PlayerEntity) entity)
																																																																																																																			.sendStatusMessage(
																																																																																																																					new StringTextComponent(
																																																																																																																							"You are too high or nearby is a structure!"),
																																																																																																																					(false));
																																																																																																																}
																																																																																																															}
																																																																																																														} else {
																																																																																																															if (entity instanceof PlayerEntity
																																																																																																																	&& !entity.world.isRemote) {
																																																																																																																((PlayerEntity) entity)
																																																																																																																		.sendStatusMessage(
																																																																																																																				new StringTextComponent(
																																																																																																																						"You are too high or nearby is a structure!"),
																																																																																																																				(false));
																																																																																																															}
																																																																																																														}
																																																																																																													} else {
																																																																																																														if (entity instanceof PlayerEntity
																																																																																																																&& !entity.world.isRemote) {
																																																																																																															((PlayerEntity) entity)
																																																																																																																	.sendStatusMessage(
																																																																																																																			new StringTextComponent(
																																																																																																																					"You are too high or nearby is a structure!"),
																																																																																																																			(false));
																																																																																																														}
																																																																																																													}
																																																																																																												} else {
																																																																																																													if (entity instanceof PlayerEntity
																																																																																																															&& !entity.world.isRemote) {
																																																																																																														((PlayerEntity) entity)
																																																																																																																.sendStatusMessage(
																																																																																																																		new StringTextComponent(
																																																																																																																				"You are too high or nearby is a structure!"),
																																																																																																																		(false));
																																																																																																													}
																																																																																																												}
																																																																																																											} else {
																																																																																																												if (entity instanceof PlayerEntity
																																																																																																														&& !entity.world.isRemote) {
																																																																																																													((PlayerEntity) entity)
																																																																																																															.sendStatusMessage(
																																																																																																																	new StringTextComponent(
																																																																																																																			"You are too high or nearby is a structure!"),
																																																																																																																	(false));
																																																																																																												}
																																																																																																											}
																																																																																																										} else {
																																																																																																											if (entity instanceof PlayerEntity
																																																																																																													&& !entity.world.isRemote) {
																																																																																																												((PlayerEntity) entity)
																																																																																																														.sendStatusMessage(
																																																																																																																new StringTextComponent(
																																																																																																																		"You are too high or nearby is a structure!"),
																																																																																																																(false));
																																																																																																											}
																																																																																																										}
																																																																																																									} else {
																																																																																																										if (entity instanceof PlayerEntity
																																																																																																												&& !entity.world.isRemote) {
																																																																																																											((PlayerEntity) entity)
																																																																																																													.sendStatusMessage(
																																																																																																															new StringTextComponent(
																																																																																																																	"You are too high or nearby is a structure!"),
																																																																																																															(false));
																																																																																																										}
																																																																																																									}
																																																																																																								} else {
																																																																																																									if (entity instanceof PlayerEntity
																																																																																																											&& !entity.world.isRemote) {
																																																																																																										((PlayerEntity) entity)
																																																																																																												.sendStatusMessage(
																																																																																																														new StringTextComponent(
																																																																																																																"You are too high or nearby is a structure!"),
																																																																																																														(false));
																																																																																																									}
																																																																																																								}
																																																																																																							} else {
																																																																																																								if (entity instanceof PlayerEntity
																																																																																																										&& !entity.world.isRemote) {
																																																																																																									((PlayerEntity) entity)
																																																																																																											.sendStatusMessage(
																																																																																																													new StringTextComponent(
																																																																																																															"You are too high or nearby is a structure!"),
																																																																																																													(false));
																																																																																																								}
																																																																																																							}
																																																																																																						} else {
																																																																																																							if (entity instanceof PlayerEntity
																																																																																																									&& !entity.world.isRemote) {
																																																																																																								((PlayerEntity) entity)
																																																																																																										.sendStatusMessage(
																																																																																																												new StringTextComponent(
																																																																																																														"You are too high or nearby is a structure!"),
																																																																																																												(false));
																																																																																																							}
																																																																																																						}
																																																																																																					} else {
																																																																																																						if (entity instanceof PlayerEntity
																																																																																																								&& !entity.world.isRemote) {
																																																																																																							((PlayerEntity) entity)
																																																																																																									.sendStatusMessage(
																																																																																																											new StringTextComponent(
																																																																																																													"You are too high or nearby is a structure!"),
																																																																																																											(false));
																																																																																																						}
																																																																																																					}
																																																																																																				} else {
																																																																																																					if (entity instanceof PlayerEntity
																																																																																																							&& !entity.world.isRemote) {
																																																																																																						((PlayerEntity) entity)
																																																																																																								.sendStatusMessage(
																																																																																																										new StringTextComponent(
																																																																																																												"You are too high or nearby is a structure!"),
																																																																																																										(false));
																																																																																																					}
																																																																																																				}
																																																																																																			} else {
																																																																																																				if (entity instanceof PlayerEntity
																																																																																																						&& !entity.world.isRemote) {
																																																																																																					((PlayerEntity) entity)
																																																																																																							.sendStatusMessage(
																																																																																																									new StringTextComponent(
																																																																																																											"You are too high or nearby is a structure!"),
																																																																																																									(false));
																																																																																																				}
																																																																																																			}
																																																																																																		} else {
																																																																																																			if (entity instanceof PlayerEntity
																																																																																																					&& !entity.world.isRemote) {
																																																																																																				((PlayerEntity) entity)
																																																																																																						.sendStatusMessage(
																																																																																																								new StringTextComponent(
																																																																																																										"You are too high or nearby is a structure!"),
																																																																																																								(false));
																																																																																																			}
																																																																																																		}
																																																																																																	} else {
																																																																																																		if (entity instanceof PlayerEntity
																																																																																																				&& !entity.world.isRemote) {
																																																																																																			((PlayerEntity) entity)
																																																																																																					.sendStatusMessage(
																																																																																																							new StringTextComponent(
																																																																																																									"You are too high or nearby is a structure!"),
																																																																																																							(false));
																																																																																																		}
																																																																																																	}
																																																																																																} else {
																																																																																																	if (entity instanceof PlayerEntity
																																																																																																			&& !entity.world.isRemote) {
																																																																																																		((PlayerEntity) entity)
																																																																																																				.sendStatusMessage(
																																																																																																						new StringTextComponent(
																																																																																																								"You are too high or nearby is a structure!"),
																																																																																																						(false));
																																																																																																	}
																																																																																																}
																																																																																															} else {
																																																																																																if (entity instanceof PlayerEntity
																																																																																																		&& !entity.world.isRemote) {
																																																																																																	((PlayerEntity) entity)
																																																																																																			.sendStatusMessage(
																																																																																																					new StringTextComponent(
																																																																																																							"You are too high or nearby is a structure!"),
																																																																																																					(false));
																																																																																																}
																																																																																															}
																																																																																														} else {
																																																																																															if (entity instanceof PlayerEntity
																																																																																																	&& !entity.world.isRemote) {
																																																																																																((PlayerEntity) entity)
																																																																																																		.sendStatusMessage(
																																																																																																				new StringTextComponent(
																																																																																																						"You are too high or nearby is a structure!"),
																																																																																																				(false));
																																																																																															}
																																																																																														}
																																																																																													} else {
																																																																																														if (entity instanceof PlayerEntity
																																																																																																&& !entity.world.isRemote) {
																																																																																															((PlayerEntity) entity)
																																																																																																	.sendStatusMessage(
																																																																																																			new StringTextComponent(
																																																																																																					"You are too high or nearby is a structure!"),
																																																																																																			(false));
																																																																																														}
																																																																																													}
																																																																																												} else {
																																																																																													if (entity instanceof PlayerEntity
																																																																																															&& !entity.world.isRemote) {
																																																																																														((PlayerEntity) entity)
																																																																																																.sendStatusMessage(
																																																																																																		new StringTextComponent(
																																																																																																				"You are too high or nearby is a structure!"),
																																																																																																		(false));
																																																																																													}
																																																																																												}
																																																																																											} else {
																																																																																												if (entity instanceof PlayerEntity
																																																																																														&& !entity.world.isRemote) {
																																																																																													((PlayerEntity) entity)
																																																																																															.sendStatusMessage(
																																																																																																	new StringTextComponent(
																																																																																																			"You are too high or nearby is a structure!"),
																																																																																																	(false));
																																																																																												}
																																																																																											}
																																																																																										} else {
																																																																																											if (entity instanceof PlayerEntity
																																																																																													&& !entity.world.isRemote) {
																																																																																												((PlayerEntity) entity)
																																																																																														.sendStatusMessage(
																																																																																																new StringTextComponent(
																																																																																																		"You are too high or nearby is a structure!"),
																																																																																																(false));
																																																																																											}
																																																																																										}
																																																																																									} else {
																																																																																										if (entity instanceof PlayerEntity
																																																																																												&& !entity.world.isRemote) {
																																																																																											((PlayerEntity) entity)
																																																																																													.sendStatusMessage(
																																																																																															new StringTextComponent(
																																																																																																	"You are too high or nearby is a structure!"),
																																																																																															(false));
																																																																																										}
																																																																																									}
																																																																																								} else {
																																																																																									if (entity instanceof PlayerEntity
																																																																																											&& !entity.world.isRemote) {
																																																																																										((PlayerEntity) entity)
																																																																																												.sendStatusMessage(
																																																																																														new StringTextComponent(
																																																																																																"You are too high or nearby is a structure!"),
																																																																																														(false));
																																																																																									}
																																																																																								}
																																																																																							} else {
																																																																																								if (entity instanceof PlayerEntity
																																																																																										&& !entity.world.isRemote) {
																																																																																									((PlayerEntity) entity)
																																																																																											.sendStatusMessage(
																																																																																													new StringTextComponent(
																																																																																															"You are too high or nearby is a structure!"),
																																																																																													(false));
																																																																																								}
																																																																																							}
																																																																																						} else {
																																																																																							if (entity instanceof PlayerEntity
																																																																																									&& !entity.world.isRemote) {
																																																																																								((PlayerEntity) entity)
																																																																																										.sendStatusMessage(
																																																																																												new StringTextComponent(
																																																																																														"You are too high or nearby is a structure!"),
																																																																																												(false));
																																																																																							}
																																																																																						}
																																																																																					} else {
																																																																																						if (entity instanceof PlayerEntity
																																																																																								&& !entity.world.isRemote) {
																																																																																							((PlayerEntity) entity)
																																																																																									.sendStatusMessage(
																																																																																											new StringTextComponent(
																																																																																													"You are too high or nearby is a structure!"),
																																																																																											(false));
																																																																																						}
																																																																																					}
																																																																																				} else {
																																																																																					if (entity instanceof PlayerEntity
																																																																																							&& !entity.world.isRemote) {
																																																																																						((PlayerEntity) entity)
																																																																																								.sendStatusMessage(
																																																																																										new StringTextComponent(
																																																																																												"You are too high or nearby is a structure!"),
																																																																																										(false));
																																																																																					}
																																																																																				}
																																																																																			} else {
																																																																																				if (entity instanceof PlayerEntity
																																																																																						&& !entity.world.isRemote) {
																																																																																					((PlayerEntity) entity)
																																																																																							.sendStatusMessage(
																																																																																									new StringTextComponent(
																																																																																											"You are too high or nearby is a structure!"),
																																																																																									(false));
																																																																																				}
																																																																																			}
																																																																																		} else {
																																																																																			if (entity instanceof PlayerEntity
																																																																																					&& !entity.world.isRemote) {
																																																																																				((PlayerEntity) entity)
																																																																																						.sendStatusMessage(
																																																																																								new StringTextComponent(
																																																																																										"You are too high or nearby is a structure!"),
																																																																																								(false));
																																																																																			}
																																																																																		}
																																																																																	} else {
																																																																																		if (entity instanceof PlayerEntity
																																																																																				&& !entity.world.isRemote) {
																																																																																			((PlayerEntity) entity)
																																																																																					.sendStatusMessage(
																																																																																							new StringTextComponent(
																																																																																									"You are too high or nearby is a structure!"),
																																																																																							(false));
																																																																																		}
																																																																																	}
																																																																																} else {
																																																																																	if (entity instanceof PlayerEntity
																																																																																			&& !entity.world.isRemote) {
																																																																																		((PlayerEntity) entity)
																																																																																				.sendStatusMessage(
																																																																																						new StringTextComponent(
																																																																																								"You are too high or nearby is a structure!"),
																																																																																						(false));
																																																																																	}
																																																																																}
																																																																															} else {
																																																																																if (entity instanceof PlayerEntity
																																																																																		&& !entity.world.isRemote) {
																																																																																	((PlayerEntity) entity)
																																																																																			.sendStatusMessage(
																																																																																					new StringTextComponent(
																																																																																							"You are too high or nearby is a structure!"),
																																																																																					(false));
																																																																																}
																																																																															}
																																																																														} else {
																																																																															if (entity instanceof PlayerEntity
																																																																																	&& !entity.world.isRemote) {
																																																																																((PlayerEntity) entity)
																																																																																		.sendStatusMessage(
																																																																																				new StringTextComponent(
																																																																																						"You are too high or nearby is a structure!"),
																																																																																				(false));
																																																																															}
																																																																														}
																																																																													} else {
																																																																														if (entity instanceof PlayerEntity
																																																																																&& !entity.world.isRemote) {
																																																																															((PlayerEntity) entity)
																																																																																	.sendStatusMessage(
																																																																																			new StringTextComponent(
																																																																																					"You are too high or nearby is a structure!"),
																																																																																			(false));
																																																																														}
																																																																													}
																																																																												} else {
																																																																													if (entity instanceof PlayerEntity
																																																																															&& !entity.world.isRemote) {
																																																																														((PlayerEntity) entity)
																																																																																.sendStatusMessage(
																																																																																		new StringTextComponent(
																																																																																				"You are too high or nearby is a structure!"),
																																																																																		(false));
																																																																													}
																																																																												}
																																																																											} else {
																																																																												if (entity instanceof PlayerEntity
																																																																														&& !entity.world.isRemote) {
																																																																													((PlayerEntity) entity)
																																																																															.sendStatusMessage(
																																																																																	new StringTextComponent(
																																																																																			"You are too high or nearby is a structure!"),
																																																																																	(false));
																																																																												}
																																																																											}
																																																																										} else {
																																																																											if (entity instanceof PlayerEntity
																																																																													&& !entity.world.isRemote) {
																																																																												((PlayerEntity) entity)
																																																																														.sendStatusMessage(
																																																																																new StringTextComponent(
																																																																																		"You are too high or nearby is a structure!"),
																																																																																(false));
																																																																											}
																																																																										}
																																																																									} else {
																																																																										if (entity instanceof PlayerEntity
																																																																												&& !entity.world.isRemote) {
																																																																											((PlayerEntity) entity)
																																																																													.sendStatusMessage(
																																																																															new StringTextComponent(
																																																																																	"You are too high or nearby is a structure!"),
																																																																															(false));
																																																																										}
																																																																									}
																																																																								} else {
																																																																									if (entity instanceof PlayerEntity
																																																																											&& !entity.world.isRemote) {
																																																																										((PlayerEntity) entity)
																																																																												.sendStatusMessage(
																																																																														new StringTextComponent(
																																																																																"You are too high or nearby is a structure!"),
																																																																														(false));
																																																																									}
																																																																								}
																																																																							} else {
																																																																								if (entity instanceof PlayerEntity
																																																																										&& !entity.world.isRemote) {
																																																																									((PlayerEntity) entity)
																																																																											.sendStatusMessage(
																																																																													new StringTextComponent(
																																																																															"You are too high or nearby is a structure!"),
																																																																													(false));
																																																																								}
																																																																							}
																																																																						} else {
																																																																							if (entity instanceof PlayerEntity
																																																																									&& !entity.world.isRemote) {
																																																																								((PlayerEntity) entity)
																																																																										.sendStatusMessage(
																																																																												new StringTextComponent(
																																																																														"You are too high or nearby is a structure!"),
																																																																												(false));
																																																																							}
																																																																						}
																																																																					} else {
																																																																						if (entity instanceof PlayerEntity
																																																																								&& !entity.world.isRemote) {
																																																																							((PlayerEntity) entity)
																																																																									.sendStatusMessage(
																																																																											new StringTextComponent(
																																																																													"You are too high or nearby is a structure!"),
																																																																											(false));
																																																																						}
																																																																					}
																																																																				} else {
																																																																					if (entity instanceof PlayerEntity
																																																																							&& !entity.world.isRemote) {
																																																																						((PlayerEntity) entity)
																																																																								.sendStatusMessage(
																																																																										new StringTextComponent(
																																																																												"You are too high or nearby is a structure!"),
																																																																										(false));
																																																																					}
																																																																				}
																																																																			} else {
																																																																				if (entity instanceof PlayerEntity
																																																																						&& !entity.world.isRemote) {
																																																																					((PlayerEntity) entity)
																																																																							.sendStatusMessage(
																																																																									new StringTextComponent(
																																																																											"You are too high or nearby is a structure!"),
																																																																									(false));
																																																																				}
																																																																			}
																																																																		} else {
																																																																			if (entity instanceof PlayerEntity
																																																																					&& !entity.world.isRemote) {
																																																																				((PlayerEntity) entity)
																																																																						.sendStatusMessage(
																																																																								new StringTextComponent(
																																																																										"You are too high or nearby is a structure!"),
																																																																								(false));
																																																																			}
																																																																		}
																																																																	} else {
																																																																		if (entity instanceof PlayerEntity
																																																																				&& !entity.world.isRemote) {
																																																																			((PlayerEntity) entity)
																																																																					.sendStatusMessage(
																																																																							new StringTextComponent(
																																																																									"You are too high or nearby is a structure!"),
																																																																							(false));
																																																																		}
																																																																	}
																																																																} else {
																																																																	if (entity instanceof PlayerEntity
																																																																			&& !entity.world.isRemote) {
																																																																		((PlayerEntity) entity)
																																																																				.sendStatusMessage(
																																																																						new StringTextComponent(
																																																																								"You are too high or nearby is a structure!"),
																																																																						(false));
																																																																	}
																																																																}
																																																															} else {
																																																																if (entity instanceof PlayerEntity
																																																																		&& !entity.world.isRemote) {
																																																																	((PlayerEntity) entity)
																																																																			.sendStatusMessage(
																																																																					new StringTextComponent(
																																																																							"You are too high or nearby is a structure!"),
																																																																					(false));
																																																																}
																																																															}
																																																														} else {
																																																															if (entity instanceof PlayerEntity
																																																																	&& !entity.world.isRemote) {
																																																																((PlayerEntity) entity)
																																																																		.sendStatusMessage(
																																																																				new StringTextComponent(
																																																																						"You are too high or nearby is a structure!"),
																																																																				(false));
																																																															}
																																																														}
																																																													} else {
																																																														if (entity instanceof PlayerEntity
																																																																&& !entity.world.isRemote) {
																																																															((PlayerEntity) entity)
																																																																	.sendStatusMessage(
																																																																			new StringTextComponent(
																																																																					"You are too high or nearby is a structure!"),
																																																																			(false));
																																																														}
																																																													}
																																																												} else {
																																																													if (entity instanceof PlayerEntity
																																																															&& !entity.world.isRemote) {
																																																														((PlayerEntity) entity)
																																																																.sendStatusMessage(
																																																																		new StringTextComponent(
																																																																				"You are too high or nearby is a structure!"),
																																																																		(false));
																																																													}
																																																												}
																																																											} else {
																																																												if (entity instanceof PlayerEntity
																																																														&& !entity.world.isRemote) {
																																																													((PlayerEntity) entity)
																																																															.sendStatusMessage(
																																																																	new StringTextComponent(
																																																																			"You are too high or nearby is a structure!"),
																																																																	(false));
																																																												}
																																																											}
																																																										} else {
																																																											if (entity instanceof PlayerEntity
																																																													&& !entity.world.isRemote) {
																																																												((PlayerEntity) entity)
																																																														.sendStatusMessage(
																																																																new StringTextComponent(
																																																																		"You are too high or nearby is a structure!"),
																																																																(false));
																																																											}
																																																										}
																																																									} else {
																																																										if (entity instanceof PlayerEntity
																																																												&& !entity.world.isRemote) {
																																																											((PlayerEntity) entity)
																																																													.sendStatusMessage(
																																																															new StringTextComponent(
																																																																	"You are too high or nearby is a structure!"),
																																																															(false));
																																																										}
																																																									}
																																																								} else {
																																																									if (entity instanceof PlayerEntity
																																																											&& !entity.world.isRemote) {
																																																										((PlayerEntity) entity)
																																																												.sendStatusMessage(
																																																														new StringTextComponent(
																																																																"You are too high or nearby is a structure!"),
																																																														(false));
																																																									}
																																																								}
																																																							} else {
																																																								if (entity instanceof PlayerEntity
																																																										&& !entity.world.isRemote) {
																																																									((PlayerEntity) entity)
																																																											.sendStatusMessage(
																																																													new StringTextComponent(
																																																															"You are too high or nearby is a structure!"),
																																																													(false));
																																																								}
																																																							}
																																																						} else {
																																																							if (entity instanceof PlayerEntity
																																																									&& !entity.world.isRemote) {
																																																								((PlayerEntity) entity)
																																																										.sendStatusMessage(
																																																												new StringTextComponent(
																																																														"You are too high or nearby is a structure!"),
																																																												(false));
																																																							}
																																																						}
																																																					} else {
																																																						if (entity instanceof PlayerEntity
																																																								&& !entity.world.isRemote) {
																																																							((PlayerEntity) entity)
																																																									.sendStatusMessage(
																																																											new StringTextComponent(
																																																													"You are too high or nearby is a structure!"),
																																																											(false));
																																																						}
																																																					}
																																																				} else {
																																																					if (entity instanceof PlayerEntity
																																																							&& !entity.world.isRemote) {
																																																						((PlayerEntity) entity)
																																																								.sendStatusMessage(
																																																										new StringTextComponent(
																																																												"You are too high or nearby is a structure!"),
																																																										(false));
																																																					}
																																																				}
																																																			} else {
																																																				if (entity instanceof PlayerEntity
																																																						&& !entity.world.isRemote) {
																																																					((PlayerEntity) entity)
																																																							.sendStatusMessage(
																																																									new StringTextComponent(
																																																											"You are too high or nearby is a structure!"),
																																																									(false));
																																																				}
																																																			}
																																																		} else {
																																																			if (entity instanceof PlayerEntity
																																																					&& !entity.world.isRemote) {
																																																				((PlayerEntity) entity)
																																																						.sendStatusMessage(
																																																								new StringTextComponent(
																																																										"You are too high or nearby is a structure!"),
																																																								(false));
																																																			}
																																																		}
																																																	} else {
																																																		if (entity instanceof PlayerEntity
																																																				&& !entity.world.isRemote) {
																																																			((PlayerEntity) entity)
																																																					.sendStatusMessage(
																																																							new StringTextComponent(
																																																									"You are too high or nearby is a structure!"),
																																																							(false));
																																																		}
																																																	}
																																																} else {
																																																	if (entity instanceof PlayerEntity
																																																			&& !entity.world.isRemote) {
																																																		((PlayerEntity) entity)
																																																				.sendStatusMessage(
																																																						new StringTextComponent(
																																																								"You are too high or nearby is a structure!"),
																																																						(false));
																																																	}
																																																}
																																															} else {
																																																if (entity instanceof PlayerEntity
																																																		&& !entity.world.isRemote) {
																																																	((PlayerEntity) entity)
																																																			.sendStatusMessage(
																																																					new StringTextComponent(
																																																							"You are too high or nearby is a structure!"),
																																																					(false));
																																																}
																																															}
																																														} else {
																																															if (entity instanceof PlayerEntity
																																																	&& !entity.world.isRemote) {
																																																((PlayerEntity) entity)
																																																		.sendStatusMessage(
																																																				new StringTextComponent(
																																																						"You are too high or nearby is a structure!"),
																																																				(false));
																																															}
																																														}
																																													} else {
																																														if (entity instanceof PlayerEntity
																																																&& !entity.world.isRemote) {
																																															((PlayerEntity) entity)
																																																	.sendStatusMessage(
																																																			new StringTextComponent(
																																																					"You are too high or nearby is a structure!"),
																																																			(false));
																																														}
																																													}
																																												} else {
																																													if (entity instanceof PlayerEntity
																																															&& !entity.world.isRemote) {
																																														((PlayerEntity) entity)
																																																.sendStatusMessage(
																																																		new StringTextComponent(
																																																				"You are too high or nearby is a structure!"),
																																																		(false));
																																													}
																																												}
																																											} else {
																																												if (entity instanceof PlayerEntity
																																														&& !entity.world.isRemote) {
																																													((PlayerEntity) entity)
																																															.sendStatusMessage(
																																																	new StringTextComponent(
																																																			"You are too high or nearby is a structure!"),
																																																	(false));
																																												}
																																											}
																																										} else {
																																											if (entity instanceof PlayerEntity
																																													&& !entity.world.isRemote) {
																																												((PlayerEntity) entity)
																																														.sendStatusMessage(
																																																new StringTextComponent(
																																																		"You are too high or nearby is a structure!"),
																																																(false));
																																											}
																																										}
																																									} else {
																																										if (entity instanceof PlayerEntity
																																												&& !entity.world.isRemote) {
																																											((PlayerEntity) entity)
																																													.sendStatusMessage(
																																															new StringTextComponent(
																																																	"You are too high or nearby is a structure!"),
																																															(false));
																																										}
																																									}
																																								} else {
																																									if (entity instanceof PlayerEntity
																																											&& !entity.world.isRemote) {
																																										((PlayerEntity) entity)
																																												.sendStatusMessage(
																																														new StringTextComponent(
																																																"You are too high or nearby is a structure!"),
																																														(false));
																																									}
																																								}
																																							} else {
																																								if (entity instanceof PlayerEntity
																																										&& !entity.world.isRemote) {
																																									((PlayerEntity) entity)
																																											.sendStatusMessage(
																																													new StringTextComponent(
																																															"You are too high or nearby is a structure!"),
																																													(false));
																																								}
																																							}
																																						} else {
																																							if (entity instanceof PlayerEntity
																																									&& !entity.world.isRemote) {
																																								((PlayerEntity) entity)
																																										.sendStatusMessage(
																																												new StringTextComponent(
																																														"You are too high or nearby is a structure!"),
																																												(false));
																																							}
																																						}
																																					} else {
																																						if (entity instanceof PlayerEntity
																																								&& !entity.world.isRemote) {
																																							((PlayerEntity) entity)
																																									.sendStatusMessage(
																																											new StringTextComponent(
																																													"You are too high or nearby is a structure!"),
																																											(false));
																																						}
																																					}
																																				} else {
																																					if (entity instanceof PlayerEntity
																																							&& !entity.world.isRemote) {
																																						((PlayerEntity) entity)
																																								.sendStatusMessage(
																																										new StringTextComponent(
																																												"You are too high or nearby is a structure!"),
																																										(false));
																																					}
																																				}
																																			} else {
																																				if (entity instanceof PlayerEntity
																																						&& !entity.world.isRemote) {
																																					((PlayerEntity) entity)
																																							.sendStatusMessage(
																																									new StringTextComponent(
																																											"You are too high or nearby is a structure!"),
																																									(false));
																																				}
																																			}
																																		} else {
																																			if (entity instanceof PlayerEntity
																																					&& !entity.world.isRemote) {
																																				((PlayerEntity) entity)
																																						.sendStatusMessage(
																																								new StringTextComponent(
																																										"You are too high or nearby is a structure!"),
																																								(false));
																																			}
																																		}
																																	} else {
																																		if (entity instanceof PlayerEntity
																																				&& !entity.world.isRemote) {
																																			((PlayerEntity) entity)
																																					.sendStatusMessage(
																																							new StringTextComponent(
																																									"You are too high or nearby is a structure!"),
																																							(false));
																																		}
																																	}
																																} else {
																																	if (entity instanceof PlayerEntity
																																			&& !entity.world.isRemote) {
																																		((PlayerEntity) entity)
																																				.sendStatusMessage(
																																						new StringTextComponent(
																																								"You are too high or nearby is a structure!"),
																																						(false));
																																	}
																																}
																															} else {
																																if (entity instanceof PlayerEntity
																																		&& !entity.world.isRemote) {
																																	((PlayerEntity) entity)
																																			.sendStatusMessage(
																																					new StringTextComponent(
																																							"You are too high or nearby is a structure!"),
																																					(false));
																																}
																															}
																														} else {
																															if (entity instanceof PlayerEntity
																																	&& !entity.world.isRemote) {
																																((PlayerEntity) entity)
																																		.sendStatusMessage(
																																				new StringTextComponent(
																																						"You are too high or nearby is a structure!"),
																																				(false));
																															}
																														}
																													} else {
																														if (entity instanceof PlayerEntity
																																&& !entity.world.isRemote) {
																															((PlayerEntity) entity)
																																	.sendStatusMessage(
																																			new StringTextComponent(
																																					"You are too high or nearby is a structure!"),
																																			(false));
																														}
																													}
																												} else {
																													if (entity instanceof PlayerEntity
																															&& !entity.world.isRemote) {
																														((PlayerEntity) entity)
																																.sendStatusMessage(
																																		new StringTextComponent(
																																				"You are too high or nearby is a structure!"),
																																		(false));
																													}
																												}
																											} else {
																												if (entity instanceof PlayerEntity
																														&& !entity.world.isRemote) {
																													((PlayerEntity) entity)
																															.sendStatusMessage(
																																	new StringTextComponent(
																																			"You are too high or nearby is a structure!"),
																																	(false));
																												}
																											}
																										} else {
																											if (entity instanceof PlayerEntity
																													&& !entity.world.isRemote) {
																												((PlayerEntity) entity)
																														.sendStatusMessage(
																																new StringTextComponent(
																																		"You are too high or nearby is a structure!"),
																																(false));
																											}
																										}
																									} else {
																										if (entity instanceof PlayerEntity
																												&& !entity.world.isRemote) {
																											((PlayerEntity) entity).sendStatusMessage(
																													new StringTextComponent(
																															"You are too high or nearby is a structure!"),
																													(false));
																										}
																									}
																								} else {
																									if (entity instanceof PlayerEntity
																											&& !entity.world.isRemote) {
																										((PlayerEntity) entity).sendStatusMessage(
																												new StringTextComponent(
																														"You are too high or nearby is a structure!"),
																												(false));
																									}
																								}
																							} else {
																								if (entity instanceof PlayerEntity
																										&& !entity.world.isRemote) {
																									((PlayerEntity) entity).sendStatusMessage(
																											new StringTextComponent(
																													"You are too high or nearby is a structure!"),
																											(false));
																								}
																							}
																						} else {
																							if (entity instanceof PlayerEntity
																									&& !entity.world.isRemote) {
																								((PlayerEntity) entity).sendStatusMessage(
																										new StringTextComponent(
																												"You are too high or nearby is a structure!"),
																										(false));
																							}
																						}
																					} else {
																						if (entity instanceof PlayerEntity
																								&& !entity.world.isRemote) {
																							((PlayerEntity) entity).sendStatusMessage(
																									new StringTextComponent(
																											"You are too high or nearby is a structure!"),
																									(false));
																						}
																					}
																				} else {
																					if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																						((PlayerEntity) entity).sendStatusMessage(
																								new StringTextComponent(
																										"You are too high or nearby is a structure!"),
																								(false));
																					}
																				}
																			} else {
																				if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																					((PlayerEntity) entity).sendStatusMessage(
																							new StringTextComponent(
																									"You are too high or nearby is a structure!"),
																							(false));
																				}
																			}
																		} else {
																			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																				((PlayerEntity) entity).sendStatusMessage(
																						new StringTextComponent(
																								"You are too high or nearby is a structure!"),
																						(false));
																			}
																		}
																	} else {
																		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
																					"You are too high or nearby is a structure!"), (false));
																		}
																	}
																} else {
																	if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																		((PlayerEntity) entity).sendStatusMessage(
																				new StringTextComponent("You are too high or nearby is a structure!"),
																				(false));
																	}
																}
															} else {
																if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																	((PlayerEntity) entity).sendStatusMessage(
																			new StringTextComponent("You are too high or nearby is a structure!"),
																			(false));
																}
															}
														} else {
															if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																((PlayerEntity) entity).sendStatusMessage(
																		new StringTextComponent("You are too high or nearby is a structure!"),
																		(false));
															}
														}
													} else {
														if (entity instanceof PlayerEntity && !entity.world.isRemote) {
															((PlayerEntity) entity).sendStatusMessage(
																	new StringTextComponent("You are too high or nearby is a structure!"), (false));
														}
													}
												} else {
													if (entity instanceof PlayerEntity && !entity.world.isRemote) {
														((PlayerEntity) entity).sendStatusMessage(
																new StringTextComponent("You are too high or nearby is a structure!"), (false));
													}
												}
											} else {
												if (entity instanceof PlayerEntity && !entity.world.isRemote) {
													((PlayerEntity) entity).sendStatusMessage(
															new StringTextComponent("You are too high or nearby is a structure!"), (false));
												}
											}
										} else {
											if (entity instanceof PlayerEntity && !entity.world.isRemote) {
												((PlayerEntity) entity).sendStatusMessage(
														new StringTextComponent("You are too high or nearby is a structure!"), (false));
											}
										}
									} else {
										if (entity instanceof PlayerEntity && !entity.world.isRemote) {
											((PlayerEntity) entity).sendStatusMessage(
													new StringTextComponent("You are too high or nearby is a structure!"), (false));
										}
									}
								} else {
									if (entity instanceof PlayerEntity && !entity.world.isRemote) {
										((PlayerEntity) entity)
												.sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"), (false));
									}
								}
							} else {
								if (entity instanceof PlayerEntity && !entity.world.isRemote) {
									((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"),
											(false));
								}
							}
						} else {
							if (entity instanceof PlayerEntity && !entity.world.isRemote) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"),
										(false));
							}
						}
					} else {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"), (false));
						}
					}
				} else {
					if (entity instanceof PlayerEntity && !entity.world.isRemote) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"), (false));
					}
				}
			} else {
				if (entity instanceof PlayerEntity && !entity.world.isRemote) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"), (false));
				}
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Works only in orbit!"), (false));
			}
		}
		if ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("boss_tools:orbit_mars_biom")))) {
			if ((world.isAirBlock(new BlockPos((int) (x - 1), (int) y, (int) z)))) {
				if ((world.isAirBlock(new BlockPos((int) (x - 2), (int) y, (int) z)))) {
					if ((world.isAirBlock(new BlockPos((int) (x - 3), (int) y, (int) z)))) {
						if ((world.isAirBlock(new BlockPos((int) (x - 4), (int) y, (int) z)))) {
							if ((world.isAirBlock(new BlockPos((int) (x - 5), (int) y, (int) z)))) {
								if ((world.isAirBlock(new BlockPos((int) (x - 6), (int) y, (int) z)))) {
									if ((world.isAirBlock(new BlockPos((int) (x - 7), (int) y, (int) z)))) {
										if ((world.isAirBlock(new BlockPos((int) (x - 8), (int) y, (int) z)))) {
											if ((world.isAirBlock(new BlockPos((int) (x - 9), (int) y, (int) z)))) {
												if ((world.isAirBlock(new BlockPos((int) (x - 10), (int) y, (int) z)))) {
													if ((world.isAirBlock(new BlockPos((int) (x - 11), (int) y, (int) z)))) {
														if ((world.isAirBlock(new BlockPos((int) (x - 12), (int) y, (int) z)))) {
															if ((world.isAirBlock(new BlockPos((int) (x - 13), (int) y, (int) z)))) {
																if ((world.isAirBlock(new BlockPos((int) (x - 14), (int) y, (int) z)))) {
																	if ((world.isAirBlock(new BlockPos((int) (x - 15), (int) y, (int) z)))) {
																		if ((world.isAirBlock(new BlockPos((int) (x - 16), (int) y, (int) z)))) {
																			if ((world.isAirBlock(new BlockPos((int) (x - 17), (int) y, (int) z)))) {
																				if ((world.isAirBlock(
																						new BlockPos((int) (x - 19), (int) y, (int) z)))) {
																					if ((world.isAirBlock(
																							new BlockPos((int) (x - 19), (int) y, (int) z)))) {
																						if ((world.isAirBlock(
																								new BlockPos((int) x, (int) (y - 1), (int) z)))) {
																							if ((world.isAirBlock(
																									new BlockPos((int) x, (int) (y - 2), (int) z)))) {
																								if ((world.isAirBlock(new BlockPos((int) x,
																										(int) (y - 3), (int) z)))) {
																									if ((world.isAirBlock(new BlockPos((int) x,
																											(int) (y - 4), (int) z)))) {
																										if ((world.isAirBlock(new BlockPos((int) x,
																												(int) (y - 5), (int) z)))) {
																											if ((world.isAirBlock(new BlockPos(
																													(int) x, (int) (y - 6),
																													(int) z)))) {
																												if ((world.isAirBlock(new BlockPos(
																														(int) x, (int) (y - 7),
																														(int) z)))) {
																													if ((world.isAirBlock(
																															new BlockPos((int) x,
																																	(int) (y - 8),
																																	(int) z)))) {
																														if ((world.isAirBlock(
																																new BlockPos((int) x,
																																		(int) (y - 9),
																																		(int) z)))) {
																															if ((world.isAirBlock(
																																	new BlockPos(
																																			(int) x,
																																			(int) (y - 10),
																																			(int) z)))) {
																																if ((world.isAirBlock(
																																		new BlockPos(
																																				(int) x,
																																				(int) (y - 11),
																																				(int) z)))) {
																																	if ((world
																																			.isAirBlock(
																																					new BlockPos(
																																							(int) x,
																																							(int) (y - 12),
																																							(int) z)))) {
																																		if ((world
																																				.isAirBlock(
																																						new BlockPos(
																																								(int) x,
																																								(int) (y - 13),
																																								(int) z)))) {
																																			if ((world
																																					.isAirBlock(
																																							new BlockPos(
																																									(int) x,
																																									(int) (y - 14),
																																									(int) z)))) {
																																				if ((world
																																						.isAirBlock(
																																								new BlockPos(
																																										(int) x,
																																										(int) (y - 15),
																																										(int) z)))) {
																																					if ((world
																																							.isAirBlock(
																																									new BlockPos(
																																											(int) x,
																																											(int) (y - 16),
																																											(int) z)))) {
																																						if ((world
																																								.isAirBlock(
																																										new BlockPos(
																																												(int) x,
																																												(int) (y - 17),
																																												(int) z)))) {
																																							if ((world
																																									.isAirBlock(
																																											new BlockPos(
																																													(int) x,
																																													(int) (y - 18),
																																													(int) z)))) {
																																								if ((world
																																										.isAirBlock(
																																												new BlockPos(
																																														(int) x,
																																														(int) (y - 19),
																																														(int) z)))) {
																																									if ((world
																																											.isAirBlock(
																																													new BlockPos(
																																															(int) x,
																																															(int) y,
																																															(int) (z - 1))))) {
																																										if ((world
																																												.isAirBlock(
																																														new BlockPos(
																																																(int) x,
																																																(int) y,
																																																(int) (z - 2))))) {
																																											if ((world
																																													.isAirBlock(
																																															new BlockPos(
																																																	(int) x,
																																																	(int) y,
																																																	(int) (z - 3))))) {
																																												if ((world
																																														.isAirBlock(
																																																new BlockPos(
																																																		(int) x,
																																																		(int) y,
																																																		(int) (z - 4))))) {
																																													if ((world
																																															.isAirBlock(
																																																	new BlockPos(
																																																			(int) x,
																																																			(int) y,
																																																			(int) (z - 5))))) {
																																														if ((world
																																																.isAirBlock(
																																																		new BlockPos(
																																																				(int) x,
																																																				(int) y,
																																																				(int) (z - 6))))) {
																																															if ((world
																																																	.isAirBlock(
																																																			new BlockPos(
																																																					(int) x,
																																																					(int) y,
																																																					(int) (z - 7))))) {
																																																if ((world
																																																		.isAirBlock(
																																																				new BlockPos(
																																																						(int) x,
																																																						(int) y,
																																																						(int) (z - 8))))) {
																																																	if ((world
																																																			.isAirBlock(
																																																					new BlockPos(
																																																							(int) x,
																																																							(int) y,
																																																							(int) (z - 9))))) {
																																																		if ((world
																																																				.isAirBlock(
																																																						new BlockPos(
																																																								(int) x,
																																																								(int) y,
																																																								(int) (z - 10))))) {
																																																			if ((world
																																																					.isAirBlock(
																																																							new BlockPos(
																																																									(int) x,
																																																									(int) y,
																																																									(int) (z - 11))))) {
																																																				if ((world
																																																						.isAirBlock(
																																																								new BlockPos(
																																																										(int) x,
																																																										(int) y,
																																																										(int) (z - 12))))) {
																																																					if ((world
																																																							.isAirBlock(
																																																									new BlockPos(
																																																											(int) x,
																																																											(int) y,
																																																											(int) (z - 13))))) {
																																																						if ((world
																																																								.isAirBlock(
																																																										new BlockPos(
																																																												(int) x,
																																																												(int) y,
																																																												(int) (z - 14))))) {
																																																							if ((world
																																																									.isAirBlock(
																																																											new BlockPos(
																																																													(int) x,
																																																													(int) y,
																																																													(int) (z - 15))))) {
																																																								if ((world
																																																										.isAirBlock(
																																																												new BlockPos(
																																																														(int) x,
																																																														(int) y,
																																																														(int) (z - 16))))) {
																																																									if ((world
																																																											.isAirBlock(
																																																													new BlockPos(
																																																															(int) x,
																																																															(int) y,
																																																															(int) (z - 17))))) {
																																																										if ((world
																																																												.isAirBlock(
																																																														new BlockPos(
																																																																(int) x,
																																																																(int) y,
																																																																(int) (z - 18))))) {
																																																											if ((world
																																																													.isAirBlock(
																																																															new BlockPos(
																																																																	(int) x,
																																																																	(int) y,
																																																																	(int) (z - 19))))) {
																																																												if ((world
																																																														.isAirBlock(
																																																																new BlockPos(
																																																																		(int) (x + 1),
																																																																		(int) y,
																																																																		(int) z)))) {
																																																													if ((world
																																																															.isAirBlock(
																																																																	new BlockPos(
																																																																			(int) (x + 2),
																																																																			(int) y,
																																																																			(int) z)))) {
																																																														if ((world
																																																																.isAirBlock(
																																																																		new BlockPos(
																																																																				(int) (x + 3),
																																																																				(int) y,
																																																																				(int) z)))) {
																																																															if ((world
																																																																	.isAirBlock(
																																																																			new BlockPos(
																																																																					(int) (x + 4),
																																																																					(int) y,
																																																																					(int) z)))) {
																																																																if ((world
																																																																		.isAirBlock(
																																																																				new BlockPos(
																																																																						(int) (x + 5),
																																																																						(int) y,
																																																																						(int) z)))) {
																																																																	if ((world
																																																																			.isAirBlock(
																																																																					new BlockPos(
																																																																							(int) (x + 6),
																																																																							(int) y,
																																																																							(int) z)))) {
																																																																		if ((world
																																																																				.isAirBlock(
																																																																						new BlockPos(
																																																																								(int) (x + 7),
																																																																								(int) y,
																																																																								(int) z)))) {
																																																																			if ((world
																																																																					.isAirBlock(
																																																																							new BlockPos(
																																																																									(int) (x + 8),
																																																																									(int) y,
																																																																									(int) z)))) {
																																																																				if ((world
																																																																						.isAirBlock(
																																																																								new BlockPos(
																																																																										(int) (x + 9),
																																																																										(int) y,
																																																																										(int) z)))) {
																																																																					if ((world
																																																																							.isAirBlock(
																																																																									new BlockPos(
																																																																											(int) (x + 10),
																																																																											(int) y,
																																																																											(int) z)))) {
																																																																						if ((world
																																																																								.isAirBlock(
																																																																										new BlockPos(
																																																																												(int) (x + 11),
																																																																												(int) y,
																																																																												(int) z)))) {
																																																																							if ((world
																																																																									.isAirBlock(
																																																																											new BlockPos(
																																																																													(int) (x + 12),
																																																																													(int) y,
																																																																													(int) z)))) {
																																																																								if ((world
																																																																										.isAirBlock(
																																																																												new BlockPos(
																																																																														(int) (x + 13),
																																																																														(int) y,
																																																																														(int) z)))) {
																																																																									if ((world
																																																																											.isAirBlock(
																																																																													new BlockPos(
																																																																															(int) (x + 14),
																																																																															(int) y,
																																																																															(int) z)))) {
																																																																										if ((world
																																																																												.isAirBlock(
																																																																														new BlockPos(
																																																																																(int) (x + 15),
																																																																																(int) y,
																																																																																(int) z)))) {
																																																																											if ((world
																																																																													.isAirBlock(
																																																																															new BlockPos(
																																																																																	(int) (x + 16),
																																																																																	(int) y,
																																																																																	(int) z)))) {
																																																																												if ((world
																																																																														.isAirBlock(
																																																																																new BlockPos(
																																																																																		(int) (x + 17),
																																																																																		(int) y,
																																																																																		(int) z)))) {
																																																																													if ((world
																																																																															.isAirBlock(
																																																																																	new BlockPos(
																																																																																			(int) (x + 19),
																																																																																			(int) y,
																																																																																			(int) z)))) {
																																																																														if ((world
																																																																																.isAirBlock(
																																																																																		new BlockPos(
																																																																																				(int) (x + 19),
																																																																																				(int) y,
																																																																																				(int) z)))) {
																																																																															if ((world
																																																																																	.isAirBlock(
																																																																																			new BlockPos(
																																																																																					(int) x,
																																																																																					(int) (y + 1),
																																																																																					(int) z)))) {
																																																																																if ((world
																																																																																		.isAirBlock(
																																																																																				new BlockPos(
																																																																																						(int) x,
																																																																																						(int) (y + 2),
																																																																																						(int) z)))) {
																																																																																	if ((world
																																																																																			.isAirBlock(
																																																																																					new BlockPos(
																																																																																							(int) x,
																																																																																							(int) (y + 3),
																																																																																							(int) z)))) {
																																																																																		if ((world
																																																																																				.isAirBlock(
																																																																																						new BlockPos(
																																																																																								(int) x,
																																																																																								(int) (y + 4),
																																																																																								(int) z)))) {
																																																																																			if ((world
																																																																																					.isAirBlock(
																																																																																							new BlockPos(
																																																																																									(int) x,
																																																																																									(int) (y + 5),
																																																																																									(int) z)))) {
																																																																																				if ((world
																																																																																						.isAirBlock(
																																																																																								new BlockPos(
																																																																																										(int) x,
																																																																																										(int) (y + 6),
																																																																																										(int) z)))) {
																																																																																					if ((world
																																																																																							.isAirBlock(
																																																																																									new BlockPos(
																																																																																											(int) x,
																																																																																											(int) (y + 7),
																																																																																											(int) z)))) {
																																																																																						if ((world
																																																																																								.isAirBlock(
																																																																																										new BlockPos(
																																																																																												(int) x,
																																																																																												(int) (y + 8),
																																																																																												(int) z)))) {
																																																																																							if ((world
																																																																																									.isAirBlock(
																																																																																											new BlockPos(
																																																																																													(int) x,
																																																																																													(int) (y + 9),
																																																																																													(int) z)))) {
																																																																																								if ((world
																																																																																										.isAirBlock(
																																																																																												new BlockPos(
																																																																																														(int) x,
																																																																																														(int) (y + 10),
																																																																																														(int) z)))) {
																																																																																									if ((world
																																																																																											.isAirBlock(
																																																																																													new BlockPos(
																																																																																															(int) x,
																																																																																															(int) (y + 11),
																																																																																															(int) z)))) {
																																																																																										if ((world
																																																																																												.isAirBlock(
																																																																																														new BlockPos(
																																																																																																(int) x,
																																																																																																(int) (y + 12),
																																																																																																(int) z)))) {
																																																																																											if ((world
																																																																																													.isAirBlock(
																																																																																															new BlockPos(
																																																																																																	(int) x,
																																																																																																	(int) (y + 13),
																																																																																																	(int) z)))) {
																																																																																												if ((world
																																																																																														.isAirBlock(
																																																																																																new BlockPos(
																																																																																																		(int) x,
																																																																																																		(int) (y + 14),
																																																																																																		(int) z)))) {
																																																																																													if ((world
																																																																																															.isAirBlock(
																																																																																																	new BlockPos(
																																																																																																			(int) x,
																																																																																																			(int) (y + 15),
																																																																																																			(int) z)))) {
																																																																																														if ((world
																																																																																																.isAirBlock(
																																																																																																		new BlockPos(
																																																																																																				(int) x,
																																																																																																				(int) (y + 16),
																																																																																																				(int) z)))) {
																																																																																															if ((world
																																																																																																	.isAirBlock(
																																																																																																			new BlockPos(
																																																																																																					(int) x,
																																																																																																					(int) (y + 17),
																																																																																																					(int) z)))) {
																																																																																																if ((world
																																																																																																		.isAirBlock(
																																																																																																				new BlockPos(
																																																																																																						(int) x,
																																																																																																						(int) (y + 18),
																																																																																																						(int) z)))) {
																																																																																																	if ((world
																																																																																																			.isAirBlock(
																																																																																																					new BlockPos(
																																																																																																							(int) x,
																																																																																																							(int) (y + 19),
																																																																																																							(int) z)))) {
																																																																																																		if ((world
																																																																																																				.isAirBlock(
																																																																																																						new BlockPos(
																																																																																																								(int) x,
																																																																																																								(int) y,
																																																																																																								(int) (z + 1))))) {
																																																																																																			if ((world
																																																																																																					.isAirBlock(
																																																																																																							new BlockPos(
																																																																																																									(int) x,
																																																																																																									(int) y,
																																																																																																									(int) (z + 2))))) {
																																																																																																				if ((world
																																																																																																						.isAirBlock(
																																																																																																								new BlockPos(
																																																																																																										(int) x,
																																																																																																										(int) y,
																																																																																																										(int) (z + 3))))) {
																																																																																																					if ((world
																																																																																																							.isAirBlock(
																																																																																																									new BlockPos(
																																																																																																											(int) x,
																																																																																																											(int) y,
																																																																																																											(int) (z + 4))))) {
																																																																																																						if ((world
																																																																																																								.isAirBlock(
																																																																																																										new BlockPos(
																																																																																																												(int) x,
																																																																																																												(int) y,
																																																																																																												(int) (z + 5))))) {
																																																																																																							if ((world
																																																																																																									.isAirBlock(
																																																																																																											new BlockPos(
																																																																																																													(int) x,
																																																																																																													(int) y,
																																																																																																													(int) (z + 6))))) {
																																																																																																								if ((world
																																																																																																										.isAirBlock(
																																																																																																												new BlockPos(
																																																																																																														(int) x,
																																																																																																														(int) y,
																																																																																																														(int) (z + 7))))) {
																																																																																																									if ((world
																																																																																																											.isAirBlock(
																																																																																																													new BlockPos(
																																																																																																															(int) x,
																																																																																																															(int) y,
																																																																																																															(int) (z + 8))))) {
																																																																																																										if ((world
																																																																																																												.isAirBlock(
																																																																																																														new BlockPos(
																																																																																																																(int) x,
																																																																																																																(int) y,
																																																																																																																(int) (z + 9))))) {
																																																																																																											if ((world
																																																																																																													.isAirBlock(
																																																																																																															new BlockPos(
																																																																																																																	(int) x,
																																																																																																																	(int) y,
																																																																																																																	(int) (z + 10))))) {
																																																																																																												if ((world
																																																																																																														.isAirBlock(
																																																																																																																new BlockPos(
																																																																																																																		(int) x,
																																																																																																																		(int) y,
																																																																																																																		(int) (z + 11))))) {
																																																																																																													if ((world
																																																																																																															.isAirBlock(
																																																																																																																	new BlockPos(
																																																																																																																			(int) x,
																																																																																																																			(int) y,
																																																																																																																			(int) (z + 12))))) {
																																																																																																														if ((world
																																																																																																																.isAirBlock(
																																																																																																																		new BlockPos(
																																																																																																																				(int) x,
																																																																																																																				(int) y,
																																																																																																																				(int) (z + 13))))) {
																																																																																																															if ((world
																																																																																																																	.isAirBlock(
																																																																																																																			new BlockPos(
																																																																																																																					(int) x,
																																																																																																																					(int) y,
																																																																																																																					(int) (z + 14))))) {
																																																																																																																if ((world
																																																																																																																		.isAirBlock(
																																																																																																																				new BlockPos(
																																																																																																																						(int) x,
																																																																																																																						(int) y,
																																																																																																																						(int) (z + 15))))) {
																																																																																																																	if ((world
																																																																																																																			.isAirBlock(
																																																																																																																					new BlockPos(
																																																																																																																							(int) x,
																																																																																																																							(int) y,
																																																																																																																							(int) (z + 16))))) {
																																																																																																																		if ((world
																																																																																																																				.isAirBlock(
																																																																																																																						new BlockPos(
																																																																																																																								(int) x,
																																																																																																																								(int) y,
																																																																																																																								(int) (z + 17))))) {
																																																																																																																			if ((world
																																																																																																																					.isAirBlock(
																																																																																																																							new BlockPos(
																																																																																																																									(int) x,
																																																																																																																									(int) y,
																																																																																																																									(int) (z + 18))))) {
																																																																																																																				if ((world
																																																																																																																						.isAirBlock(
																																																																																																																								new BlockPos(
																																																																																																																										(int) x,
																																																																																																																										(int) y,
																																																																																																																										(int) (z + 19))))) {
																																																																																																																					if (((entity
																																																																																																																							.getPosY()) < 220)) {
																																																																																																																						if (!world
																																																																																																																								.getWorld().isRemote) {
																																																																																																																							Template template = ((ServerWorld) world
																																																																																																																									.getWorld())
																																																																																																																											.getSaveHandler()
																																																																																																																											.getStructureTemplateManager()
																																																																																																																											.getTemplateDefaulted(
																																																																																																																													new ResourceLocation(
																																																																																																																															"boss_tools",
																																																																																																																															"orbit4"));
																																																																																																																							if (template != null) {
																																																																																																																								template.addBlocksToWorld(
																																																																																																																										world,
																																																																																																																										new BlockPos(
																																																																																																																												(int) (x - 8),
																																																																																																																												(int) (y - 4),
																																																																																																																												(int) (z - 4)),
																																																																																																																										new PlacementSettings()
																																																																																																																												.setRotation(
																																																																																																																														Rotation.NONE)
																																																																																																																												.setMirror(
																																																																																																																														Mirror.NONE)
																																																																																																																												.setChunk(
																																																																																																																														null)
																																																																																																																												.setIgnoreEntities(
																																																																																																																														false));
																																																																																																																							}
																																																																																																																						}
																																																																																																																						if (entity instanceof PlayerEntity)
																																																																																																																							((PlayerEntity) entity).inventory
																																																																																																																									.clearMatchingItems(
																																																																																																																											p -> new ItemStack(
																																																																																																																													OrbitPlacerItem.block,
																																																																																																																													(int) (1))
																																																																																																																															.getItem() == p
																																																																																																																																	.getItem(),
																																																																																																																											(int) 1);
																																																																																																																					} else {
																																																																																																																						if (entity instanceof PlayerEntity
																																																																																																																								&& !entity.world.isRemote) {
																																																																																																																							((PlayerEntity) entity)
																																																																																																																									.sendStatusMessage(
																																																																																																																											new StringTextComponent(
																																																																																																																													"You are too high or nearby is a structure!"),
																																																																																																																											(false));
																																																																																																																						}
																																																																																																																					}
																																																																																																																				} else {
																																																																																																																					if (entity instanceof PlayerEntity
																																																																																																																							&& !entity.world.isRemote) {
																																																																																																																						((PlayerEntity) entity)
																																																																																																																								.sendStatusMessage(
																																																																																																																										new StringTextComponent(
																																																																																																																												"You are too high or nearby is a structure!"),
																																																																																																																										(false));
																																																																																																																					}
																																																																																																																				}
																																																																																																																			} else {
																																																																																																																				if (entity instanceof PlayerEntity
																																																																																																																						&& !entity.world.isRemote) {
																																																																																																																					((PlayerEntity) entity)
																																																																																																																							.sendStatusMessage(
																																																																																																																									new StringTextComponent(
																																																																																																																											"You are too high or nearby is a structure!"),
																																																																																																																									(false));
																																																																																																																				}
																																																																																																																			}
																																																																																																																		} else {
																																																																																																																			if (entity instanceof PlayerEntity
																																																																																																																					&& !entity.world.isRemote) {
																																																																																																																				((PlayerEntity) entity)
																																																																																																																						.sendStatusMessage(
																																																																																																																								new StringTextComponent(
																																																																																																																										"You are too high or nearby is a structure!"),
																																																																																																																								(false));
																																																																																																																			}
																																																																																																																		}
																																																																																																																	} else {
																																																																																																																		if (entity instanceof PlayerEntity
																																																																																																																				&& !entity.world.isRemote) {
																																																																																																																			((PlayerEntity) entity)
																																																																																																																					.sendStatusMessage(
																																																																																																																							new StringTextComponent(
																																																																																																																									"You are too high or nearby is a structure!"),
																																																																																																																							(false));
																																																																																																																		}
																																																																																																																	}
																																																																																																																} else {
																																																																																																																	if (entity instanceof PlayerEntity
																																																																																																																			&& !entity.world.isRemote) {
																																																																																																																		((PlayerEntity) entity)
																																																																																																																				.sendStatusMessage(
																																																																																																																						new StringTextComponent(
																																																																																																																								"You are too high or nearby is a structure!"),
																																																																																																																						(false));
																																																																																																																	}
																																																																																																																}
																																																																																																															} else {
																																																																																																																if (entity instanceof PlayerEntity
																																																																																																																		&& !entity.world.isRemote) {
																																																																																																																	((PlayerEntity) entity)
																																																																																																																			.sendStatusMessage(
																																																																																																																					new StringTextComponent(
																																																																																																																							"You are too high or nearby is a structure!"),
																																																																																																																					(false));
																																																																																																																}
																																																																																																															}
																																																																																																														} else {
																																																																																																															if (entity instanceof PlayerEntity
																																																																																																																	&& !entity.world.isRemote) {
																																																																																																																((PlayerEntity) entity)
																																																																																																																		.sendStatusMessage(
																																																																																																																				new StringTextComponent(
																																																																																																																						"You are too high or nearby is a structure!"),
																																																																																																																				(false));
																																																																																																															}
																																																																																																														}
																																																																																																													} else {
																																																																																																														if (entity instanceof PlayerEntity
																																																																																																																&& !entity.world.isRemote) {
																																																																																																															((PlayerEntity) entity)
																																																																																																																	.sendStatusMessage(
																																																																																																																			new StringTextComponent(
																																																																																																																					"You are too high or nearby is a structure!"),
																																																																																																																			(false));
																																																																																																														}
																																																																																																													}
																																																																																																												} else {
																																																																																																													if (entity instanceof PlayerEntity
																																																																																																															&& !entity.world.isRemote) {
																																																																																																														((PlayerEntity) entity)
																																																																																																																.sendStatusMessage(
																																																																																																																		new StringTextComponent(
																																																																																																																				"You are too high or nearby is a structure!"),
																																																																																																																		(false));
																																																																																																													}
																																																																																																												}
																																																																																																											} else {
																																																																																																												if (entity instanceof PlayerEntity
																																																																																																														&& !entity.world.isRemote) {
																																																																																																													((PlayerEntity) entity)
																																																																																																															.sendStatusMessage(
																																																																																																																	new StringTextComponent(
																																																																																																																			"You are too high or nearby is a structure!"),
																																																																																																																	(false));
																																																																																																												}
																																																																																																											}
																																																																																																										} else {
																																																																																																											if (entity instanceof PlayerEntity
																																																																																																													&& !entity.world.isRemote) {
																																																																																																												((PlayerEntity) entity)
																																																																																																														.sendStatusMessage(
																																																																																																																new StringTextComponent(
																																																																																																																		"You are too high or nearby is a structure!"),
																																																																																																																(false));
																																																																																																											}
																																																																																																										}
																																																																																																									} else {
																																																																																																										if (entity instanceof PlayerEntity
																																																																																																												&& !entity.world.isRemote) {
																																																																																																											((PlayerEntity) entity)
																																																																																																													.sendStatusMessage(
																																																																																																															new StringTextComponent(
																																																																																																																	"You are too high or nearby is a structure!"),
																																																																																																															(false));
																																																																																																										}
																																																																																																									}
																																																																																																								} else {
																																																																																																									if (entity instanceof PlayerEntity
																																																																																																											&& !entity.world.isRemote) {
																																																																																																										((PlayerEntity) entity)
																																																																																																												.sendStatusMessage(
																																																																																																														new StringTextComponent(
																																																																																																																"You are too high or nearby is a structure!"),
																																																																																																														(false));
																																																																																																									}
																																																																																																								}
																																																																																																							} else {
																																																																																																								if (entity instanceof PlayerEntity
																																																																																																										&& !entity.world.isRemote) {
																																																																																																									((PlayerEntity) entity)
																																																																																																											.sendStatusMessage(
																																																																																																													new StringTextComponent(
																																																																																																															"You are too high or nearby is a structure!"),
																																																																																																													(false));
																																																																																																								}
																																																																																																							}
																																																																																																						} else {
																																																																																																							if (entity instanceof PlayerEntity
																																																																																																									&& !entity.world.isRemote) {
																																																																																																								((PlayerEntity) entity)
																																																																																																										.sendStatusMessage(
																																																																																																												new StringTextComponent(
																																																																																																														"You are too high or nearby is a structure!"),
																																																																																																												(false));
																																																																																																							}
																																																																																																						}
																																																																																																					} else {
																																																																																																						if (entity instanceof PlayerEntity
																																																																																																								&& !entity.world.isRemote) {
																																																																																																							((PlayerEntity) entity)
																																																																																																									.sendStatusMessage(
																																																																																																											new StringTextComponent(
																																																																																																													"You are too high or nearby is a structure!"),
																																																																																																											(false));
																																																																																																						}
																																																																																																					}
																																																																																																				} else {
																																																																																																					if (entity instanceof PlayerEntity
																																																																																																							&& !entity.world.isRemote) {
																																																																																																						((PlayerEntity) entity)
																																																																																																								.sendStatusMessage(
																																																																																																										new StringTextComponent(
																																																																																																												"You are too high or nearby is a structure!"),
																																																																																																										(false));
																																																																																																					}
																																																																																																				}
																																																																																																			} else {
																																																																																																				if (entity instanceof PlayerEntity
																																																																																																						&& !entity.world.isRemote) {
																																																																																																					((PlayerEntity) entity)
																																																																																																							.sendStatusMessage(
																																																																																																									new StringTextComponent(
																																																																																																											"You are too high or nearby is a structure!"),
																																																																																																									(false));
																																																																																																				}
																																																																																																			}
																																																																																																		} else {
																																																																																																			if (entity instanceof PlayerEntity
																																																																																																					&& !entity.world.isRemote) {
																																																																																																				((PlayerEntity) entity)
																																																																																																						.sendStatusMessage(
																																																																																																								new StringTextComponent(
																																																																																																										"You are too high or nearby is a structure!"),
																																																																																																								(false));
																																																																																																			}
																																																																																																		}
																																																																																																	} else {
																																																																																																		if (entity instanceof PlayerEntity
																																																																																																				&& !entity.world.isRemote) {
																																																																																																			((PlayerEntity) entity)
																																																																																																					.sendStatusMessage(
																																																																																																							new StringTextComponent(
																																																																																																									"You are too high or nearby is a structure!"),
																																																																																																							(false));
																																																																																																		}
																																																																																																	}
																																																																																																} else {
																																																																																																	if (entity instanceof PlayerEntity
																																																																																																			&& !entity.world.isRemote) {
																																																																																																		((PlayerEntity) entity)
																																																																																																				.sendStatusMessage(
																																																																																																						new StringTextComponent(
																																																																																																								"You are too high or nearby is a structure!"),
																																																																																																						(false));
																																																																																																	}
																																																																																																}
																																																																																															} else {
																																																																																																if (entity instanceof PlayerEntity
																																																																																																		&& !entity.world.isRemote) {
																																																																																																	((PlayerEntity) entity)
																																																																																																			.sendStatusMessage(
																																																																																																					new StringTextComponent(
																																																																																																							"You are too high or nearby is a structure!"),
																																																																																																					(false));
																																																																																																}
																																																																																															}
																																																																																														} else {
																																																																																															if (entity instanceof PlayerEntity
																																																																																																	&& !entity.world.isRemote) {
																																																																																																((PlayerEntity) entity)
																																																																																																		.sendStatusMessage(
																																																																																																				new StringTextComponent(
																																																																																																						"You are too high or nearby is a structure!"),
																																																																																																				(false));
																																																																																															}
																																																																																														}
																																																																																													} else {
																																																																																														if (entity instanceof PlayerEntity
																																																																																																&& !entity.world.isRemote) {
																																																																																															((PlayerEntity) entity)
																																																																																																	.sendStatusMessage(
																																																																																																			new StringTextComponent(
																																																																																																					"You are too high or nearby is a structure!"),
																																																																																																			(false));
																																																																																														}
																																																																																													}
																																																																																												} else {
																																																																																													if (entity instanceof PlayerEntity
																																																																																															&& !entity.world.isRemote) {
																																																																																														((PlayerEntity) entity)
																																																																																																.sendStatusMessage(
																																																																																																		new StringTextComponent(
																																																																																																				"You are too high or nearby is a structure!"),
																																																																																																		(false));
																																																																																													}
																																																																																												}
																																																																																											} else {
																																																																																												if (entity instanceof PlayerEntity
																																																																																														&& !entity.world.isRemote) {
																																																																																													((PlayerEntity) entity)
																																																																																															.sendStatusMessage(
																																																																																																	new StringTextComponent(
																																																																																																			"You are too high or nearby is a structure!"),
																																																																																																	(false));
																																																																																												}
																																																																																											}
																																																																																										} else {
																																																																																											if (entity instanceof PlayerEntity
																																																																																													&& !entity.world.isRemote) {
																																																																																												((PlayerEntity) entity)
																																																																																														.sendStatusMessage(
																																																																																																new StringTextComponent(
																																																																																																		"You are too high or nearby is a structure!"),
																																																																																																(false));
																																																																																											}
																																																																																										}
																																																																																									} else {
																																																																																										if (entity instanceof PlayerEntity
																																																																																												&& !entity.world.isRemote) {
																																																																																											((PlayerEntity) entity)
																																																																																													.sendStatusMessage(
																																																																																															new StringTextComponent(
																																																																																																	"You are too high or nearby is a structure!"),
																																																																																															(false));
																																																																																										}
																																																																																									}
																																																																																								} else {
																																																																																									if (entity instanceof PlayerEntity
																																																																																											&& !entity.world.isRemote) {
																																																																																										((PlayerEntity) entity)
																																																																																												.sendStatusMessage(
																																																																																														new StringTextComponent(
																																																																																																"You are too high or nearby is a structure!"),
																																																																																														(false));
																																																																																									}
																																																																																								}
																																																																																							} else {
																																																																																								if (entity instanceof PlayerEntity
																																																																																										&& !entity.world.isRemote) {
																																																																																									((PlayerEntity) entity)
																																																																																											.sendStatusMessage(
																																																																																													new StringTextComponent(
																																																																																															"You are too high or nearby is a structure!"),
																																																																																													(false));
																																																																																								}
																																																																																							}
																																																																																						} else {
																																																																																							if (entity instanceof PlayerEntity
																																																																																									&& !entity.world.isRemote) {
																																																																																								((PlayerEntity) entity)
																																																																																										.sendStatusMessage(
																																																																																												new StringTextComponent(
																																																																																														"You are too high or nearby is a structure!"),
																																																																																												(false));
																																																																																							}
																																																																																						}
																																																																																					} else {
																																																																																						if (entity instanceof PlayerEntity
																																																																																								&& !entity.world.isRemote) {
																																																																																							((PlayerEntity) entity)
																																																																																									.sendStatusMessage(
																																																																																											new StringTextComponent(
																																																																																													"You are too high or nearby is a structure!"),
																																																																																											(false));
																																																																																						}
																																																																																					}
																																																																																				} else {
																																																																																					if (entity instanceof PlayerEntity
																																																																																							&& !entity.world.isRemote) {
																																																																																						((PlayerEntity) entity)
																																																																																								.sendStatusMessage(
																																																																																										new StringTextComponent(
																																																																																												"You are too high or nearby is a structure!"),
																																																																																										(false));
																																																																																					}
																																																																																				}
																																																																																			} else {
																																																																																				if (entity instanceof PlayerEntity
																																																																																						&& !entity.world.isRemote) {
																																																																																					((PlayerEntity) entity)
																																																																																							.sendStatusMessage(
																																																																																									new StringTextComponent(
																																																																																											"You are too high or nearby is a structure!"),
																																																																																									(false));
																																																																																				}
																																																																																			}
																																																																																		} else {
																																																																																			if (entity instanceof PlayerEntity
																																																																																					&& !entity.world.isRemote) {
																																																																																				((PlayerEntity) entity)
																																																																																						.sendStatusMessage(
																																																																																								new StringTextComponent(
																																																																																										"You are too high or nearby is a structure!"),
																																																																																								(false));
																																																																																			}
																																																																																		}
																																																																																	} else {
																																																																																		if (entity instanceof PlayerEntity
																																																																																				&& !entity.world.isRemote) {
																																																																																			((PlayerEntity) entity)
																																																																																					.sendStatusMessage(
																																																																																							new StringTextComponent(
																																																																																									"You are too high or nearby is a structure!"),
																																																																																							(false));
																																																																																		}
																																																																																	}
																																																																																} else {
																																																																																	if (entity instanceof PlayerEntity
																																																																																			&& !entity.world.isRemote) {
																																																																																		((PlayerEntity) entity)
																																																																																				.sendStatusMessage(
																																																																																						new StringTextComponent(
																																																																																								"You are too high or nearby is a structure!"),
																																																																																						(false));
																																																																																	}
																																																																																}
																																																																															} else {
																																																																																if (entity instanceof PlayerEntity
																																																																																		&& !entity.world.isRemote) {
																																																																																	((PlayerEntity) entity)
																																																																																			.sendStatusMessage(
																																																																																					new StringTextComponent(
																																																																																							"You are too high or nearby is a structure!"),
																																																																																					(false));
																																																																																}
																																																																															}
																																																																														} else {
																																																																															if (entity instanceof PlayerEntity
																																																																																	&& !entity.world.isRemote) {
																																																																																((PlayerEntity) entity)
																																																																																		.sendStatusMessage(
																																																																																				new StringTextComponent(
																																																																																						"You are too high or nearby is a structure!"),
																																																																																				(false));
																																																																															}
																																																																														}
																																																																													} else {
																																																																														if (entity instanceof PlayerEntity
																																																																																&& !entity.world.isRemote) {
																																																																															((PlayerEntity) entity)
																																																																																	.sendStatusMessage(
																																																																																			new StringTextComponent(
																																																																																					"You are too high or nearby is a structure!"),
																																																																																			(false));
																																																																														}
																																																																													}
																																																																												} else {
																																																																													if (entity instanceof PlayerEntity
																																																																															&& !entity.world.isRemote) {
																																																																														((PlayerEntity) entity)
																																																																																.sendStatusMessage(
																																																																																		new StringTextComponent(
																																																																																				"You are too high or nearby is a structure!"),
																																																																																		(false));
																																																																													}
																																																																												}
																																																																											} else {
																																																																												if (entity instanceof PlayerEntity
																																																																														&& !entity.world.isRemote) {
																																																																													((PlayerEntity) entity)
																																																																															.sendStatusMessage(
																																																																																	new StringTextComponent(
																																																																																			"You are too high or nearby is a structure!"),
																																																																																	(false));
																																																																												}
																																																																											}
																																																																										} else {
																																																																											if (entity instanceof PlayerEntity
																																																																													&& !entity.world.isRemote) {
																																																																												((PlayerEntity) entity)
																																																																														.sendStatusMessage(
																																																																																new StringTextComponent(
																																																																																		"You are too high or nearby is a structure!"),
																																																																																(false));
																																																																											}
																																																																										}
																																																																									} else {
																																																																										if (entity instanceof PlayerEntity
																																																																												&& !entity.world.isRemote) {
																																																																											((PlayerEntity) entity)
																																																																													.sendStatusMessage(
																																																																															new StringTextComponent(
																																																																																	"You are too high or nearby is a structure!"),
																																																																															(false));
																																																																										}
																																																																									}
																																																																								} else {
																																																																									if (entity instanceof PlayerEntity
																																																																											&& !entity.world.isRemote) {
																																																																										((PlayerEntity) entity)
																																																																												.sendStatusMessage(
																																																																														new StringTextComponent(
																																																																																"You are too high or nearby is a structure!"),
																																																																														(false));
																																																																									}
																																																																								}
																																																																							} else {
																																																																								if (entity instanceof PlayerEntity
																																																																										&& !entity.world.isRemote) {
																																																																									((PlayerEntity) entity)
																																																																											.sendStatusMessage(
																																																																													new StringTextComponent(
																																																																															"You are too high or nearby is a structure!"),
																																																																													(false));
																																																																								}
																																																																							}
																																																																						} else {
																																																																							if (entity instanceof PlayerEntity
																																																																									&& !entity.world.isRemote) {
																																																																								((PlayerEntity) entity)
																																																																										.sendStatusMessage(
																																																																												new StringTextComponent(
																																																																														"You are too high or nearby is a structure!"),
																																																																												(false));
																																																																							}
																																																																						}
																																																																					} else {
																																																																						if (entity instanceof PlayerEntity
																																																																								&& !entity.world.isRemote) {
																																																																							((PlayerEntity) entity)
																																																																									.sendStatusMessage(
																																																																											new StringTextComponent(
																																																																													"You are too high or nearby is a structure!"),
																																																																											(false));
																																																																						}
																																																																					}
																																																																				} else {
																																																																					if (entity instanceof PlayerEntity
																																																																							&& !entity.world.isRemote) {
																																																																						((PlayerEntity) entity)
																																																																								.sendStatusMessage(
																																																																										new StringTextComponent(
																																																																												"You are too high or nearby is a structure!"),
																																																																										(false));
																																																																					}
																																																																				}
																																																																			} else {
																																																																				if (entity instanceof PlayerEntity
																																																																						&& !entity.world.isRemote) {
																																																																					((PlayerEntity) entity)
																																																																							.sendStatusMessage(
																																																																									new StringTextComponent(
																																																																											"You are too high or nearby is a structure!"),
																																																																									(false));
																																																																				}
																																																																			}
																																																																		} else {
																																																																			if (entity instanceof PlayerEntity
																																																																					&& !entity.world.isRemote) {
																																																																				((PlayerEntity) entity)
																																																																						.sendStatusMessage(
																																																																								new StringTextComponent(
																																																																										"You are too high or nearby is a structure!"),
																																																																								(false));
																																																																			}
																																																																		}
																																																																	} else {
																																																																		if (entity instanceof PlayerEntity
																																																																				&& !entity.world.isRemote) {
																																																																			((PlayerEntity) entity)
																																																																					.sendStatusMessage(
																																																																							new StringTextComponent(
																																																																									"You are too high or nearby is a structure!"),
																																																																							(false));
																																																																		}
																																																																	}
																																																																} else {
																																																																	if (entity instanceof PlayerEntity
																																																																			&& !entity.world.isRemote) {
																																																																		((PlayerEntity) entity)
																																																																				.sendStatusMessage(
																																																																						new StringTextComponent(
																																																																								"You are too high or nearby is a structure!"),
																																																																						(false));
																																																																	}
																																																																}
																																																															} else {
																																																																if (entity instanceof PlayerEntity
																																																																		&& !entity.world.isRemote) {
																																																																	((PlayerEntity) entity)
																																																																			.sendStatusMessage(
																																																																					new StringTextComponent(
																																																																							"You are too high or nearby is a structure!"),
																																																																					(false));
																																																																}
																																																															}
																																																														} else {
																																																															if (entity instanceof PlayerEntity
																																																																	&& !entity.world.isRemote) {
																																																																((PlayerEntity) entity)
																																																																		.sendStatusMessage(
																																																																				new StringTextComponent(
																																																																						"You are too high or nearby is a structure!"),
																																																																				(false));
																																																															}
																																																														}
																																																													} else {
																																																														if (entity instanceof PlayerEntity
																																																																&& !entity.world.isRemote) {
																																																															((PlayerEntity) entity)
																																																																	.sendStatusMessage(
																																																																			new StringTextComponent(
																																																																					"You are too high or nearby is a structure!"),
																																																																			(false));
																																																														}
																																																													}
																																																												} else {
																																																													if (entity instanceof PlayerEntity
																																																															&& !entity.world.isRemote) {
																																																														((PlayerEntity) entity)
																																																																.sendStatusMessage(
																																																																		new StringTextComponent(
																																																																				"You are too high or nearby is a structure!"),
																																																																		(false));
																																																													}
																																																												}
																																																											} else {
																																																												if (entity instanceof PlayerEntity
																																																														&& !entity.world.isRemote) {
																																																													((PlayerEntity) entity)
																																																															.sendStatusMessage(
																																																																	new StringTextComponent(
																																																																			"You are too high or nearby is a structure!"),
																																																																	(false));
																																																												}
																																																											}
																																																										} else {
																																																											if (entity instanceof PlayerEntity
																																																													&& !entity.world.isRemote) {
																																																												((PlayerEntity) entity)
																																																														.sendStatusMessage(
																																																																new StringTextComponent(
																																																																		"You are too high or nearby is a structure!"),
																																																																(false));
																																																											}
																																																										}
																																																									} else {
																																																										if (entity instanceof PlayerEntity
																																																												&& !entity.world.isRemote) {
																																																											((PlayerEntity) entity)
																																																													.sendStatusMessage(
																																																															new StringTextComponent(
																																																																	"You are too high or nearby is a structure!"),
																																																															(false));
																																																										}
																																																									}
																																																								} else {
																																																									if (entity instanceof PlayerEntity
																																																											&& !entity.world.isRemote) {
																																																										((PlayerEntity) entity)
																																																												.sendStatusMessage(
																																																														new StringTextComponent(
																																																																"You are too high or nearby is a structure!"),
																																																														(false));
																																																									}
																																																								}
																																																							} else {
																																																								if (entity instanceof PlayerEntity
																																																										&& !entity.world.isRemote) {
																																																									((PlayerEntity) entity)
																																																											.sendStatusMessage(
																																																													new StringTextComponent(
																																																															"You are too high or nearby is a structure!"),
																																																													(false));
																																																								}
																																																							}
																																																						} else {
																																																							if (entity instanceof PlayerEntity
																																																									&& !entity.world.isRemote) {
																																																								((PlayerEntity) entity)
																																																										.sendStatusMessage(
																																																												new StringTextComponent(
																																																														"You are too high or nearby is a structure!"),
																																																												(false));
																																																							}
																																																						}
																																																					} else {
																																																						if (entity instanceof PlayerEntity
																																																								&& !entity.world.isRemote) {
																																																							((PlayerEntity) entity)
																																																									.sendStatusMessage(
																																																											new StringTextComponent(
																																																													"You are too high or nearby is a structure!"),
																																																											(false));
																																																						}
																																																					}
																																																				} else {
																																																					if (entity instanceof PlayerEntity
																																																							&& !entity.world.isRemote) {
																																																						((PlayerEntity) entity)
																																																								.sendStatusMessage(
																																																										new StringTextComponent(
																																																												"You are too high or nearby is a structure!"),
																																																										(false));
																																																					}
																																																				}
																																																			} else {
																																																				if (entity instanceof PlayerEntity
																																																						&& !entity.world.isRemote) {
																																																					((PlayerEntity) entity)
																																																							.sendStatusMessage(
																																																									new StringTextComponent(
																																																											"You are too high or nearby is a structure!"),
																																																									(false));
																																																				}
																																																			}
																																																		} else {
																																																			if (entity instanceof PlayerEntity
																																																					&& !entity.world.isRemote) {
																																																				((PlayerEntity) entity)
																																																						.sendStatusMessage(
																																																								new StringTextComponent(
																																																										"You are too high or nearby is a structure!"),
																																																								(false));
																																																			}
																																																		}
																																																	} else {
																																																		if (entity instanceof PlayerEntity
																																																				&& !entity.world.isRemote) {
																																																			((PlayerEntity) entity)
																																																					.sendStatusMessage(
																																																							new StringTextComponent(
																																																									"You are too high or nearby is a structure!"),
																																																							(false));
																																																		}
																																																	}
																																																} else {
																																																	if (entity instanceof PlayerEntity
																																																			&& !entity.world.isRemote) {
																																																		((PlayerEntity) entity)
																																																				.sendStatusMessage(
																																																						new StringTextComponent(
																																																								"You are too high or nearby is a structure!"),
																																																						(false));
																																																	}
																																																}
																																															} else {
																																																if (entity instanceof PlayerEntity
																																																		&& !entity.world.isRemote) {
																																																	((PlayerEntity) entity)
																																																			.sendStatusMessage(
																																																					new StringTextComponent(
																																																							"You are too high or nearby is a structure!"),
																																																					(false));
																																																}
																																															}
																																														} else {
																																															if (entity instanceof PlayerEntity
																																																	&& !entity.world.isRemote) {
																																																((PlayerEntity) entity)
																																																		.sendStatusMessage(
																																																				new StringTextComponent(
																																																						"You are too high or nearby is a structure!"),
																																																				(false));
																																															}
																																														}
																																													} else {
																																														if (entity instanceof PlayerEntity
																																																&& !entity.world.isRemote) {
																																															((PlayerEntity) entity)
																																																	.sendStatusMessage(
																																																			new StringTextComponent(
																																																					"You are too high or nearby is a structure!"),
																																																			(false));
																																														}
																																													}
																																												} else {
																																													if (entity instanceof PlayerEntity
																																															&& !entity.world.isRemote) {
																																														((PlayerEntity) entity)
																																																.sendStatusMessage(
																																																		new StringTextComponent(
																																																				"You are too high or nearby is a structure!"),
																																																		(false));
																																													}
																																												}
																																											} else {
																																												if (entity instanceof PlayerEntity
																																														&& !entity.world.isRemote) {
																																													((PlayerEntity) entity)
																																															.sendStatusMessage(
																																																	new StringTextComponent(
																																																			"You are too high or nearby is a structure!"),
																																																	(false));
																																												}
																																											}
																																										} else {
																																											if (entity instanceof PlayerEntity
																																													&& !entity.world.isRemote) {
																																												((PlayerEntity) entity)
																																														.sendStatusMessage(
																																																new StringTextComponent(
																																																		"You are too high or nearby is a structure!"),
																																																(false));
																																											}
																																										}
																																									} else {
																																										if (entity instanceof PlayerEntity
																																												&& !entity.world.isRemote) {
																																											((PlayerEntity) entity)
																																													.sendStatusMessage(
																																															new StringTextComponent(
																																																	"You are too high or nearby is a structure!"),
																																															(false));
																																										}
																																									}
																																								} else {
																																									if (entity instanceof PlayerEntity
																																											&& !entity.world.isRemote) {
																																										((PlayerEntity) entity)
																																												.sendStatusMessage(
																																														new StringTextComponent(
																																																"You are too high or nearby is a structure!"),
																																														(false));
																																									}
																																								}
																																							} else {
																																								if (entity instanceof PlayerEntity
																																										&& !entity.world.isRemote) {
																																									((PlayerEntity) entity)
																																											.sendStatusMessage(
																																													new StringTextComponent(
																																															"You are too high or nearby is a structure!"),
																																													(false));
																																								}
																																							}
																																						} else {
																																							if (entity instanceof PlayerEntity
																																									&& !entity.world.isRemote) {
																																								((PlayerEntity) entity)
																																										.sendStatusMessage(
																																												new StringTextComponent(
																																														"You are too high or nearby is a structure!"),
																																												(false));
																																							}
																																						}
																																					} else {
																																						if (entity instanceof PlayerEntity
																																								&& !entity.world.isRemote) {
																																							((PlayerEntity) entity)
																																									.sendStatusMessage(
																																											new StringTextComponent(
																																													"You are too high or nearby is a structure!"),
																																											(false));
																																						}
																																					}
																																				} else {
																																					if (entity instanceof PlayerEntity
																																							&& !entity.world.isRemote) {
																																						((PlayerEntity) entity)
																																								.sendStatusMessage(
																																										new StringTextComponent(
																																												"You are too high or nearby is a structure!"),
																																										(false));
																																					}
																																				}
																																			} else {
																																				if (entity instanceof PlayerEntity
																																						&& !entity.world.isRemote) {
																																					((PlayerEntity) entity)
																																							.sendStatusMessage(
																																									new StringTextComponent(
																																											"You are too high or nearby is a structure!"),
																																									(false));
																																				}
																																			}
																																		} else {
																																			if (entity instanceof PlayerEntity
																																					&& !entity.world.isRemote) {
																																				((PlayerEntity) entity)
																																						.sendStatusMessage(
																																								new StringTextComponent(
																																										"You are too high or nearby is a structure!"),
																																								(false));
																																			}
																																		}
																																	} else {
																																		if (entity instanceof PlayerEntity
																																				&& !entity.world.isRemote) {
																																			((PlayerEntity) entity)
																																					.sendStatusMessage(
																																							new StringTextComponent(
																																									"You are too high or nearby is a structure!"),
																																							(false));
																																		}
																																	}
																																} else {
																																	if (entity instanceof PlayerEntity
																																			&& !entity.world.isRemote) {
																																		((PlayerEntity) entity)
																																				.sendStatusMessage(
																																						new StringTextComponent(
																																								"You are too high or nearby is a structure!"),
																																						(false));
																																	}
																																}
																															} else {
																																if (entity instanceof PlayerEntity
																																		&& !entity.world.isRemote) {
																																	((PlayerEntity) entity)
																																			.sendStatusMessage(
																																					new StringTextComponent(
																																							"You are too high or nearby is a structure!"),
																																					(false));
																																}
																															}
																														} else {
																															if (entity instanceof PlayerEntity
																																	&& !entity.world.isRemote) {
																																((PlayerEntity) entity)
																																		.sendStatusMessage(
																																				new StringTextComponent(
																																						"You are too high or nearby is a structure!"),
																																				(false));
																															}
																														}
																													} else {
																														if (entity instanceof PlayerEntity
																																&& !entity.world.isRemote) {
																															((PlayerEntity) entity)
																																	.sendStatusMessage(
																																			new StringTextComponent(
																																					"You are too high or nearby is a structure!"),
																																			(false));
																														}
																													}
																												} else {
																													if (entity instanceof PlayerEntity
																															&& !entity.world.isRemote) {
																														((PlayerEntity) entity)
																																.sendStatusMessage(
																																		new StringTextComponent(
																																				"You are too high or nearby is a structure!"),
																																		(false));
																													}
																												}
																											} else {
																												if (entity instanceof PlayerEntity
																														&& !entity.world.isRemote) {
																													((PlayerEntity) entity)
																															.sendStatusMessage(
																																	new StringTextComponent(
																																			"You are too high or nearby is a structure!"),
																																	(false));
																												}
																											}
																										} else {
																											if (entity instanceof PlayerEntity
																													&& !entity.world.isRemote) {
																												((PlayerEntity) entity)
																														.sendStatusMessage(
																																new StringTextComponent(
																																		"You are too high or nearby is a structure!"),
																																(false));
																											}
																										}
																									} else {
																										if (entity instanceof PlayerEntity
																												&& !entity.world.isRemote) {
																											((PlayerEntity) entity).sendStatusMessage(
																													new StringTextComponent(
																															"You are too high or nearby is a structure!"),
																													(false));
																										}
																									}
																								} else {
																									if (entity instanceof PlayerEntity
																											&& !entity.world.isRemote) {
																										((PlayerEntity) entity).sendStatusMessage(
																												new StringTextComponent(
																														"You are too high or nearby is a structure!"),
																												(false));
																									}
																								}
																							} else {
																								if (entity instanceof PlayerEntity
																										&& !entity.world.isRemote) {
																									((PlayerEntity) entity).sendStatusMessage(
																											new StringTextComponent(
																													"You are too high or nearby is a structure!"),
																											(false));
																								}
																							}
																						} else {
																							if (entity instanceof PlayerEntity
																									&& !entity.world.isRemote) {
																								((PlayerEntity) entity).sendStatusMessage(
																										new StringTextComponent(
																												"You are too high or nearby is a structure!"),
																										(false));
																							}
																						}
																					} else {
																						if (entity instanceof PlayerEntity
																								&& !entity.world.isRemote) {
																							((PlayerEntity) entity).sendStatusMessage(
																									new StringTextComponent(
																											"You are too high or nearby is a structure!"),
																									(false));
																						}
																					}
																				} else {
																					if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																						((PlayerEntity) entity).sendStatusMessage(
																								new StringTextComponent(
																										"You are too high or nearby is a structure!"),
																								(false));
																					}
																				}
																			} else {
																				if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																					((PlayerEntity) entity).sendStatusMessage(
																							new StringTextComponent(
																									"You are too high or nearby is a structure!"),
																							(false));
																				}
																			}
																		} else {
																			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																				((PlayerEntity) entity).sendStatusMessage(
																						new StringTextComponent(
																								"You are too high or nearby is a structure!"),
																						(false));
																			}
																		}
																	} else {
																		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
																					"You are too high or nearby is a structure!"), (false));
																		}
																	}
																} else {
																	if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																		((PlayerEntity) entity).sendStatusMessage(
																				new StringTextComponent("You are too high or nearby is a structure!"),
																				(false));
																	}
																}
															} else {
																if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																	((PlayerEntity) entity).sendStatusMessage(
																			new StringTextComponent("You are too high or nearby is a structure!"),
																			(false));
																}
															}
														} else {
															if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																((PlayerEntity) entity).sendStatusMessage(
																		new StringTextComponent("You are too high or nearby is a structure!"),
																		(false));
															}
														}
													} else {
														if (entity instanceof PlayerEntity && !entity.world.isRemote) {
															((PlayerEntity) entity).sendStatusMessage(
																	new StringTextComponent("You are too high or nearby is a structure!"), (false));
														}
													}
												} else {
													if (entity instanceof PlayerEntity && !entity.world.isRemote) {
														((PlayerEntity) entity).sendStatusMessage(
																new StringTextComponent("You are too high or nearby is a structure!"), (false));
													}
												}
											} else {
												if (entity instanceof PlayerEntity && !entity.world.isRemote) {
													((PlayerEntity) entity).sendStatusMessage(
															new StringTextComponent("You are too high or nearby is a structure!"), (false));
												}
											}
										} else {
											if (entity instanceof PlayerEntity && !entity.world.isRemote) {
												((PlayerEntity) entity).sendStatusMessage(
														new StringTextComponent("You are too high or nearby is a structure!"), (false));
											}
										}
									} else {
										if (entity instanceof PlayerEntity && !entity.world.isRemote) {
											((PlayerEntity) entity).sendStatusMessage(
													new StringTextComponent("You are too high or nearby is a structure!"), (false));
										}
									}
								} else {
									if (entity instanceof PlayerEntity && !entity.world.isRemote) {
										((PlayerEntity) entity)
												.sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"), (false));
									}
								}
							} else {
								if (entity instanceof PlayerEntity && !entity.world.isRemote) {
									((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"),
											(false));
								}
							}
						} else {
							if (entity instanceof PlayerEntity && !entity.world.isRemote) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"),
										(false));
							}
						}
					} else {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"), (false));
						}
					}
				} else {
					if (entity instanceof PlayerEntity && !entity.world.isRemote) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"), (false));
					}
				}
			} else {
				if (entity instanceof PlayerEntity && !entity.world.isRemote) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"), (false));
				}
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Works only in orbit!"), (false));
			}
		}
		if ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("boss_tools:orbit_mercury_biom")))) {
			if ((world.isAirBlock(new BlockPos((int) (x - 1), (int) y, (int) z)))) {
				if ((world.isAirBlock(new BlockPos((int) (x - 2), (int) y, (int) z)))) {
					if ((world.isAirBlock(new BlockPos((int) (x - 3), (int) y, (int) z)))) {
						if ((world.isAirBlock(new BlockPos((int) (x - 4), (int) y, (int) z)))) {
							if ((world.isAirBlock(new BlockPos((int) (x - 5), (int) y, (int) z)))) {
								if ((world.isAirBlock(new BlockPos((int) (x - 6), (int) y, (int) z)))) {
									if ((world.isAirBlock(new BlockPos((int) (x - 7), (int) y, (int) z)))) {
										if ((world.isAirBlock(new BlockPos((int) (x - 8), (int) y, (int) z)))) {
											if ((world.isAirBlock(new BlockPos((int) (x - 9), (int) y, (int) z)))) {
												if ((world.isAirBlock(new BlockPos((int) (x - 10), (int) y, (int) z)))) {
													if ((world.isAirBlock(new BlockPos((int) (x - 11), (int) y, (int) z)))) {
														if ((world.isAirBlock(new BlockPos((int) (x - 12), (int) y, (int) z)))) {
															if ((world.isAirBlock(new BlockPos((int) (x - 13), (int) y, (int) z)))) {
																if ((world.isAirBlock(new BlockPos((int) (x - 14), (int) y, (int) z)))) {
																	if ((world.isAirBlock(new BlockPos((int) (x - 15), (int) y, (int) z)))) {
																		if ((world.isAirBlock(new BlockPos((int) (x - 16), (int) y, (int) z)))) {
																			if ((world.isAirBlock(new BlockPos((int) (x - 17), (int) y, (int) z)))) {
																				if ((world.isAirBlock(
																						new BlockPos((int) (x - 19), (int) y, (int) z)))) {
																					if ((world.isAirBlock(
																							new BlockPos((int) (x - 19), (int) y, (int) z)))) {
																						if ((world.isAirBlock(
																								new BlockPos((int) x, (int) (y - 1), (int) z)))) {
																							if ((world.isAirBlock(
																									new BlockPos((int) x, (int) (y - 2), (int) z)))) {
																								if ((world.isAirBlock(new BlockPos((int) x,
																										(int) (y - 3), (int) z)))) {
																									if ((world.isAirBlock(new BlockPos((int) x,
																											(int) (y - 4), (int) z)))) {
																										if ((world.isAirBlock(new BlockPos((int) x,
																												(int) (y - 5), (int) z)))) {
																											if ((world.isAirBlock(new BlockPos(
																													(int) x, (int) (y - 6),
																													(int) z)))) {
																												if ((world.isAirBlock(new BlockPos(
																														(int) x, (int) (y - 7),
																														(int) z)))) {
																													if ((world.isAirBlock(
																															new BlockPos((int) x,
																																	(int) (y - 8),
																																	(int) z)))) {
																														if ((world.isAirBlock(
																																new BlockPos((int) x,
																																		(int) (y - 9),
																																		(int) z)))) {
																															if ((world.isAirBlock(
																																	new BlockPos(
																																			(int) x,
																																			(int) (y - 10),
																																			(int) z)))) {
																																if ((world.isAirBlock(
																																		new BlockPos(
																																				(int) x,
																																				(int) (y - 11),
																																				(int) z)))) {
																																	if ((world
																																			.isAirBlock(
																																					new BlockPos(
																																							(int) x,
																																							(int) (y - 12),
																																							(int) z)))) {
																																		if ((world
																																				.isAirBlock(
																																						new BlockPos(
																																								(int) x,
																																								(int) (y - 13),
																																								(int) z)))) {
																																			if ((world
																																					.isAirBlock(
																																							new BlockPos(
																																									(int) x,
																																									(int) (y - 14),
																																									(int) z)))) {
																																				if ((world
																																						.isAirBlock(
																																								new BlockPos(
																																										(int) x,
																																										(int) (y - 15),
																																										(int) z)))) {
																																					if ((world
																																							.isAirBlock(
																																									new BlockPos(
																																											(int) x,
																																											(int) (y - 16),
																																											(int) z)))) {
																																						if ((world
																																								.isAirBlock(
																																										new BlockPos(
																																												(int) x,
																																												(int) (y - 17),
																																												(int) z)))) {
																																							if ((world
																																									.isAirBlock(
																																											new BlockPos(
																																													(int) x,
																																													(int) (y - 18),
																																													(int) z)))) {
																																								if ((world
																																										.isAirBlock(
																																												new BlockPos(
																																														(int) x,
																																														(int) (y - 19),
																																														(int) z)))) {
																																									if ((world
																																											.isAirBlock(
																																													new BlockPos(
																																															(int) x,
																																															(int) y,
																																															(int) (z - 1))))) {
																																										if ((world
																																												.isAirBlock(
																																														new BlockPos(
																																																(int) x,
																																																(int) y,
																																																(int) (z - 2))))) {
																																											if ((world
																																													.isAirBlock(
																																															new BlockPos(
																																																	(int) x,
																																																	(int) y,
																																																	(int) (z - 3))))) {
																																												if ((world
																																														.isAirBlock(
																																																new BlockPos(
																																																		(int) x,
																																																		(int) y,
																																																		(int) (z - 4))))) {
																																													if ((world
																																															.isAirBlock(
																																																	new BlockPos(
																																																			(int) x,
																																																			(int) y,
																																																			(int) (z - 5))))) {
																																														if ((world
																																																.isAirBlock(
																																																		new BlockPos(
																																																				(int) x,
																																																				(int) y,
																																																				(int) (z - 6))))) {
																																															if ((world
																																																	.isAirBlock(
																																																			new BlockPos(
																																																					(int) x,
																																																					(int) y,
																																																					(int) (z - 7))))) {
																																																if ((world
																																																		.isAirBlock(
																																																				new BlockPos(
																																																						(int) x,
																																																						(int) y,
																																																						(int) (z - 8))))) {
																																																	if ((world
																																																			.isAirBlock(
																																																					new BlockPos(
																																																							(int) x,
																																																							(int) y,
																																																							(int) (z - 9))))) {
																																																		if ((world
																																																				.isAirBlock(
																																																						new BlockPos(
																																																								(int) x,
																																																								(int) y,
																																																								(int) (z - 10))))) {
																																																			if ((world
																																																					.isAirBlock(
																																																							new BlockPos(
																																																									(int) x,
																																																									(int) y,
																																																									(int) (z - 11))))) {
																																																				if ((world
																																																						.isAirBlock(
																																																								new BlockPos(
																																																										(int) x,
																																																										(int) y,
																																																										(int) (z - 12))))) {
																																																					if ((world
																																																							.isAirBlock(
																																																									new BlockPos(
																																																											(int) x,
																																																											(int) y,
																																																											(int) (z - 13))))) {
																																																						if ((world
																																																								.isAirBlock(
																																																										new BlockPos(
																																																												(int) x,
																																																												(int) y,
																																																												(int) (z - 14))))) {
																																																							if ((world
																																																									.isAirBlock(
																																																											new BlockPos(
																																																													(int) x,
																																																													(int) y,
																																																													(int) (z - 15))))) {
																																																								if ((world
																																																										.isAirBlock(
																																																												new BlockPos(
																																																														(int) x,
																																																														(int) y,
																																																														(int) (z - 16))))) {
																																																									if ((world
																																																											.isAirBlock(
																																																													new BlockPos(
																																																															(int) x,
																																																															(int) y,
																																																															(int) (z - 17))))) {
																																																										if ((world
																																																												.isAirBlock(
																																																														new BlockPos(
																																																																(int) x,
																																																																(int) y,
																																																																(int) (z - 18))))) {
																																																											if ((world
																																																													.isAirBlock(
																																																															new BlockPos(
																																																																	(int) x,
																																																																	(int) y,
																																																																	(int) (z - 19))))) {
																																																												if ((world
																																																														.isAirBlock(
																																																																new BlockPos(
																																																																		(int) (x + 1),
																																																																		(int) y,
																																																																		(int) z)))) {
																																																													if ((world
																																																															.isAirBlock(
																																																																	new BlockPos(
																																																																			(int) (x + 2),
																																																																			(int) y,
																																																																			(int) z)))) {
																																																														if ((world
																																																																.isAirBlock(
																																																																		new BlockPos(
																																																																				(int) (x + 3),
																																																																				(int) y,
																																																																				(int) z)))) {
																																																															if ((world
																																																																	.isAirBlock(
																																																																			new BlockPos(
																																																																					(int) (x + 4),
																																																																					(int) y,
																																																																					(int) z)))) {
																																																																if ((world
																																																																		.isAirBlock(
																																																																				new BlockPos(
																																																																						(int) (x + 5),
																																																																						(int) y,
																																																																						(int) z)))) {
																																																																	if ((world
																																																																			.isAirBlock(
																																																																					new BlockPos(
																																																																							(int) (x + 6),
																																																																							(int) y,
																																																																							(int) z)))) {
																																																																		if ((world
																																																																				.isAirBlock(
																																																																						new BlockPos(
																																																																								(int) (x + 7),
																																																																								(int) y,
																																																																								(int) z)))) {
																																																																			if ((world
																																																																					.isAirBlock(
																																																																							new BlockPos(
																																																																									(int) (x + 8),
																																																																									(int) y,
																																																																									(int) z)))) {
																																																																				if ((world
																																																																						.isAirBlock(
																																																																								new BlockPos(
																																																																										(int) (x + 9),
																																																																										(int) y,
																																																																										(int) z)))) {
																																																																					if ((world
																																																																							.isAirBlock(
																																																																									new BlockPos(
																																																																											(int) (x + 10),
																																																																											(int) y,
																																																																											(int) z)))) {
																																																																						if ((world
																																																																								.isAirBlock(
																																																																										new BlockPos(
																																																																												(int) (x + 11),
																																																																												(int) y,
																																																																												(int) z)))) {
																																																																							if ((world
																																																																									.isAirBlock(
																																																																											new BlockPos(
																																																																													(int) (x + 12),
																																																																													(int) y,
																																																																													(int) z)))) {
																																																																								if ((world
																																																																										.isAirBlock(
																																																																												new BlockPos(
																																																																														(int) (x + 13),
																																																																														(int) y,
																																																																														(int) z)))) {
																																																																									if ((world
																																																																											.isAirBlock(
																																																																													new BlockPos(
																																																																															(int) (x + 14),
																																																																															(int) y,
																																																																															(int) z)))) {
																																																																										if ((world
																																																																												.isAirBlock(
																																																																														new BlockPos(
																																																																																(int) (x + 15),
																																																																																(int) y,
																																																																																(int) z)))) {
																																																																											if ((world
																																																																													.isAirBlock(
																																																																															new BlockPos(
																																																																																	(int) (x + 16),
																																																																																	(int) y,
																																																																																	(int) z)))) {
																																																																												if ((world
																																																																														.isAirBlock(
																																																																																new BlockPos(
																																																																																		(int) (x + 17),
																																																																																		(int) y,
																																																																																		(int) z)))) {
																																																																													if ((world
																																																																															.isAirBlock(
																																																																																	new BlockPos(
																																																																																			(int) (x + 19),
																																																																																			(int) y,
																																																																																			(int) z)))) {
																																																																														if ((world
																																																																																.isAirBlock(
																																																																																		new BlockPos(
																																																																																				(int) (x + 19),
																																																																																				(int) y,
																																																																																				(int) z)))) {
																																																																															if ((world
																																																																																	.isAirBlock(
																																																																																			new BlockPos(
																																																																																					(int) x,
																																																																																					(int) (y + 1),
																																																																																					(int) z)))) {
																																																																																if ((world
																																																																																		.isAirBlock(
																																																																																				new BlockPos(
																																																																																						(int) x,
																																																																																						(int) (y + 2),
																																																																																						(int) z)))) {
																																																																																	if ((world
																																																																																			.isAirBlock(
																																																																																					new BlockPos(
																																																																																							(int) x,
																																																																																							(int) (y + 3),
																																																																																							(int) z)))) {
																																																																																		if ((world
																																																																																				.isAirBlock(
																																																																																						new BlockPos(
																																																																																								(int) x,
																																																																																								(int) (y + 4),
																																																																																								(int) z)))) {
																																																																																			if ((world
																																																																																					.isAirBlock(
																																																																																							new BlockPos(
																																																																																									(int) x,
																																																																																									(int) (y + 5),
																																																																																									(int) z)))) {
																																																																																				if ((world
																																																																																						.isAirBlock(
																																																																																								new BlockPos(
																																																																																										(int) x,
																																																																																										(int) (y + 6),
																																																																																										(int) z)))) {
																																																																																					if ((world
																																																																																							.isAirBlock(
																																																																																									new BlockPos(
																																																																																											(int) x,
																																																																																											(int) (y + 7),
																																																																																											(int) z)))) {
																																																																																						if ((world
																																																																																								.isAirBlock(
																																																																																										new BlockPos(
																																																																																												(int) x,
																																																																																												(int) (y + 8),
																																																																																												(int) z)))) {
																																																																																							if ((world
																																																																																									.isAirBlock(
																																																																																											new BlockPos(
																																																																																													(int) x,
																																																																																													(int) (y + 9),
																																																																																													(int) z)))) {
																																																																																								if ((world
																																																																																										.isAirBlock(
																																																																																												new BlockPos(
																																																																																														(int) x,
																																																																																														(int) (y + 10),
																																																																																														(int) z)))) {
																																																																																									if ((world
																																																																																											.isAirBlock(
																																																																																													new BlockPos(
																																																																																															(int) x,
																																																																																															(int) (y + 11),
																																																																																															(int) z)))) {
																																																																																										if ((world
																																																																																												.isAirBlock(
																																																																																														new BlockPos(
																																																																																																(int) x,
																																																																																																(int) (y + 12),
																																																																																																(int) z)))) {
																																																																																											if ((world
																																																																																													.isAirBlock(
																																																																																															new BlockPos(
																																																																																																	(int) x,
																																																																																																	(int) (y + 13),
																																																																																																	(int) z)))) {
																																																																																												if ((world
																																																																																														.isAirBlock(
																																																																																																new BlockPos(
																																																																																																		(int) x,
																																																																																																		(int) (y + 14),
																																																																																																		(int) z)))) {
																																																																																													if ((world
																																																																																															.isAirBlock(
																																																																																																	new BlockPos(
																																																																																																			(int) x,
																																																																																																			(int) (y + 15),
																																																																																																			(int) z)))) {
																																																																																														if ((world
																																																																																																.isAirBlock(
																																																																																																		new BlockPos(
																																																																																																				(int) x,
																																																																																																				(int) (y + 16),
																																																																																																				(int) z)))) {
																																																																																															if ((world
																																																																																																	.isAirBlock(
																																																																																																			new BlockPos(
																																																																																																					(int) x,
																																																																																																					(int) (y + 17),
																																																																																																					(int) z)))) {
																																																																																																if ((world
																																																																																																		.isAirBlock(
																																																																																																				new BlockPos(
																																																																																																						(int) x,
																																																																																																						(int) (y + 18),
																																																																																																						(int) z)))) {
																																																																																																	if ((world
																																																																																																			.isAirBlock(
																																																																																																					new BlockPos(
																																																																																																							(int) x,
																																																																																																							(int) (y + 19),
																																																																																																							(int) z)))) {
																																																																																																		if ((world
																																																																																																				.isAirBlock(
																																																																																																						new BlockPos(
																																																																																																								(int) x,
																																																																																																								(int) y,
																																																																																																								(int) (z + 1))))) {
																																																																																																			if ((world
																																																																																																					.isAirBlock(
																																																																																																							new BlockPos(
																																																																																																									(int) x,
																																																																																																									(int) y,
																																																																																																									(int) (z + 2))))) {
																																																																																																				if ((world
																																																																																																						.isAirBlock(
																																																																																																								new BlockPos(
																																																																																																										(int) x,
																																																																																																										(int) y,
																																																																																																										(int) (z + 3))))) {
																																																																																																					if ((world
																																																																																																							.isAirBlock(
																																																																																																									new BlockPos(
																																																																																																											(int) x,
																																																																																																											(int) y,
																																																																																																											(int) (z + 4))))) {
																																																																																																						if ((world
																																																																																																								.isAirBlock(
																																																																																																										new BlockPos(
																																																																																																												(int) x,
																																																																																																												(int) y,
																																																																																																												(int) (z + 5))))) {
																																																																																																							if ((world
																																																																																																									.isAirBlock(
																																																																																																											new BlockPos(
																																																																																																													(int) x,
																																																																																																													(int) y,
																																																																																																													(int) (z + 6))))) {
																																																																																																								if ((world
																																																																																																										.isAirBlock(
																																																																																																												new BlockPos(
																																																																																																														(int) x,
																																																																																																														(int) y,
																																																																																																														(int) (z + 7))))) {
																																																																																																									if ((world
																																																																																																											.isAirBlock(
																																																																																																													new BlockPos(
																																																																																																															(int) x,
																																																																																																															(int) y,
																																																																																																															(int) (z + 8))))) {
																																																																																																										if ((world
																																																																																																												.isAirBlock(
																																																																																																														new BlockPos(
																																																																																																																(int) x,
																																																																																																																(int) y,
																																																																																																																(int) (z + 9))))) {
																																																																																																											if ((world
																																																																																																													.isAirBlock(
																																																																																																															new BlockPos(
																																																																																																																	(int) x,
																																																																																																																	(int) y,
																																																																																																																	(int) (z + 10))))) {
																																																																																																												if ((world
																																																																																																														.isAirBlock(
																																																																																																																new BlockPos(
																																																																																																																		(int) x,
																																																																																																																		(int) y,
																																																																																																																		(int) (z + 11))))) {
																																																																																																													if ((world
																																																																																																															.isAirBlock(
																																																																																																																	new BlockPos(
																																																																																																																			(int) x,
																																																																																																																			(int) y,
																																																																																																																			(int) (z + 12))))) {
																																																																																																														if ((world
																																																																																																																.isAirBlock(
																																																																																																																		new BlockPos(
																																																																																																																				(int) x,
																																																																																																																				(int) y,
																																																																																																																				(int) (z + 13))))) {
																																																																																																															if ((world
																																																																																																																	.isAirBlock(
																																																																																																																			new BlockPos(
																																																																																																																					(int) x,
																																																																																																																					(int) y,
																																																																																																																					(int) (z + 14))))) {
																																																																																																																if ((world
																																																																																																																		.isAirBlock(
																																																																																																																				new BlockPos(
																																																																																																																						(int) x,
																																																																																																																						(int) y,
																																																																																																																						(int) (z + 15))))) {
																																																																																																																	if ((world
																																																																																																																			.isAirBlock(
																																																																																																																					new BlockPos(
																																																																																																																							(int) x,
																																																																																																																							(int) y,
																																																																																																																							(int) (z + 16))))) {
																																																																																																																		if ((world
																																																																																																																				.isAirBlock(
																																																																																																																						new BlockPos(
																																																																																																																								(int) x,
																																																																																																																								(int) y,
																																																																																																																								(int) (z + 17))))) {
																																																																																																																			if ((world
																																																																																																																					.isAirBlock(
																																																																																																																							new BlockPos(
																																																																																																																									(int) x,
																																																																																																																									(int) y,
																																																																																																																									(int) (z + 18))))) {
																																																																																																																				if ((world
																																																																																																																						.isAirBlock(
																																																																																																																								new BlockPos(
																																																																																																																										(int) x,
																																																																																																																										(int) y,
																																																																																																																										(int) (z + 19))))) {
																																																																																																																					if (((entity
																																																																																																																							.getPosY()) < 220)) {
																																																																																																																						if (!world
																																																																																																																								.getWorld().isRemote) {
																																																																																																																							Template template = ((ServerWorld) world
																																																																																																																									.getWorld())
																																																																																																																											.getSaveHandler()
																																																																																																																											.getStructureTemplateManager()
																																																																																																																											.getTemplateDefaulted(
																																																																																																																													new ResourceLocation(
																																																																																																																															"boss_tools",
																																																																																																																															"orbit4"));
																																																																																																																							if (template != null) {
																																																																																																																								template.addBlocksToWorld(
																																																																																																																										world,
																																																																																																																										new BlockPos(
																																																																																																																												(int) (x - 8),
																																																																																																																												(int) (y - 4),
																																																																																																																												(int) (z - 4)),
																																																																																																																										new PlacementSettings()
																																																																																																																												.setRotation(
																																																																																																																														Rotation.NONE)
																																																																																																																												.setMirror(
																																																																																																																														Mirror.NONE)
																																																																																																																												.setChunk(
																																																																																																																														null)
																																																																																																																												.setIgnoreEntities(
																																																																																																																														false));
																																																																																																																							}
																																																																																																																						}
																																																																																																																						if (entity instanceof PlayerEntity)
																																																																																																																							((PlayerEntity) entity).inventory
																																																																																																																									.clearMatchingItems(
																																																																																																																											p -> new ItemStack(
																																																																																																																													OrbitPlacerItem.block,
																																																																																																																													(int) (1))
																																																																																																																															.getItem() == p
																																																																																																																																	.getItem(),
																																																																																																																											(int) 1);
																																																																																																																					} else {
																																																																																																																						if (entity instanceof PlayerEntity
																																																																																																																								&& !entity.world.isRemote) {
																																																																																																																							((PlayerEntity) entity)
																																																																																																																									.sendStatusMessage(
																																																																																																																											new StringTextComponent(
																																																																																																																													"You are too high or nearby is a structure!"),
																																																																																																																											(false));
																																																																																																																						}
																																																																																																																					}
																																																																																																																				} else {
																																																																																																																					if (entity instanceof PlayerEntity
																																																																																																																							&& !entity.world.isRemote) {
																																																																																																																						((PlayerEntity) entity)
																																																																																																																								.sendStatusMessage(
																																																																																																																										new StringTextComponent(
																																																																																																																												"You are too high or nearby is a structure!"),
																																																																																																																										(false));
																																																																																																																					}
																																																																																																																				}
																																																																																																																			} else {
																																																																																																																				if (entity instanceof PlayerEntity
																																																																																																																						&& !entity.world.isRemote) {
																																																																																																																					((PlayerEntity) entity)
																																																																																																																							.sendStatusMessage(
																																																																																																																									new StringTextComponent(
																																																																																																																											"You are too high or nearby is a structure!"),
																																																																																																																									(false));
																																																																																																																				}
																																																																																																																			}
																																																																																																																		} else {
																																																																																																																			if (entity instanceof PlayerEntity
																																																																																																																					&& !entity.world.isRemote) {
																																																																																																																				((PlayerEntity) entity)
																																																																																																																						.sendStatusMessage(
																																																																																																																								new StringTextComponent(
																																																																																																																										"You are too high or nearby is a structure!"),
																																																																																																																								(false));
																																																																																																																			}
																																																																																																																		}
																																																																																																																	} else {
																																																																																																																		if (entity instanceof PlayerEntity
																																																																																																																				&& !entity.world.isRemote) {
																																																																																																																			((PlayerEntity) entity)
																																																																																																																					.sendStatusMessage(
																																																																																																																							new StringTextComponent(
																																																																																																																									"You are too high or nearby is a structure!"),
																																																																																																																							(false));
																																																																																																																		}
																																																																																																																	}
																																																																																																																} else {
																																																																																																																	if (entity instanceof PlayerEntity
																																																																																																																			&& !entity.world.isRemote) {
																																																																																																																		((PlayerEntity) entity)
																																																																																																																				.sendStatusMessage(
																																																																																																																						new StringTextComponent(
																																																																																																																								"You are too high or nearby is a structure!"),
																																																																																																																						(false));
																																																																																																																	}
																																																																																																																}
																																																																																																															} else {
																																																																																																																if (entity instanceof PlayerEntity
																																																																																																																		&& !entity.world.isRemote) {
																																																																																																																	((PlayerEntity) entity)
																																																																																																																			.sendStatusMessage(
																																																																																																																					new StringTextComponent(
																																																																																																																							"You are too high or nearby is a structure!"),
																																																																																																																					(false));
																																																																																																																}
																																																																																																															}
																																																																																																														} else {
																																																																																																															if (entity instanceof PlayerEntity
																																																																																																																	&& !entity.world.isRemote) {
																																																																																																																((PlayerEntity) entity)
																																																																																																																		.sendStatusMessage(
																																																																																																																				new StringTextComponent(
																																																																																																																						"You are too high or nearby is a structure!"),
																																																																																																																				(false));
																																																																																																															}
																																																																																																														}
																																																																																																													} else {
																																																																																																														if (entity instanceof PlayerEntity
																																																																																																																&& !entity.world.isRemote) {
																																																																																																															((PlayerEntity) entity)
																																																																																																																	.sendStatusMessage(
																																																																																																																			new StringTextComponent(
																																																																																																																					"You are too high or nearby is a structure!"),
																																																																																																																			(false));
																																																																																																														}
																																																																																																													}
																																																																																																												} else {
																																																																																																													if (entity instanceof PlayerEntity
																																																																																																															&& !entity.world.isRemote) {
																																																																																																														((PlayerEntity) entity)
																																																																																																																.sendStatusMessage(
																																																																																																																		new StringTextComponent(
																																																																																																																				"You are too high or nearby is a structure!"),
																																																																																																																		(false));
																																																																																																													}
																																																																																																												}
																																																																																																											} else {
																																																																																																												if (entity instanceof PlayerEntity
																																																																																																														&& !entity.world.isRemote) {
																																																																																																													((PlayerEntity) entity)
																																																																																																															.sendStatusMessage(
																																																																																																																	new StringTextComponent(
																																																																																																																			"You are too high or nearby is a structure!"),
																																																																																																																	(false));
																																																																																																												}
																																																																																																											}
																																																																																																										} else {
																																																																																																											if (entity instanceof PlayerEntity
																																																																																																													&& !entity.world.isRemote) {
																																																																																																												((PlayerEntity) entity)
																																																																																																														.sendStatusMessage(
																																																																																																																new StringTextComponent(
																																																																																																																		"You are too high or nearby is a structure!"),
																																																																																																																(false));
																																																																																																											}
																																																																																																										}
																																																																																																									} else {
																																																																																																										if (entity instanceof PlayerEntity
																																																																																																												&& !entity.world.isRemote) {
																																																																																																											((PlayerEntity) entity)
																																																																																																													.sendStatusMessage(
																																																																																																															new StringTextComponent(
																																																																																																																	"You are too high or nearby is a structure!"),
																																																																																																															(false));
																																																																																																										}
																																																																																																									}
																																																																																																								} else {
																																																																																																									if (entity instanceof PlayerEntity
																																																																																																											&& !entity.world.isRemote) {
																																																																																																										((PlayerEntity) entity)
																																																																																																												.sendStatusMessage(
																																																																																																														new StringTextComponent(
																																																																																																																"You are too high or nearby is a structure!"),
																																																																																																														(false));
																																																																																																									}
																																																																																																								}
																																																																																																							} else {
																																																																																																								if (entity instanceof PlayerEntity
																																																																																																										&& !entity.world.isRemote) {
																																																																																																									((PlayerEntity) entity)
																																																																																																											.sendStatusMessage(
																																																																																																													new StringTextComponent(
																																																																																																															"You are too high or nearby is a structure!"),
																																																																																																													(false));
																																																																																																								}
																																																																																																							}
																																																																																																						} else {
																																																																																																							if (entity instanceof PlayerEntity
																																																																																																									&& !entity.world.isRemote) {
																																																																																																								((PlayerEntity) entity)
																																																																																																										.sendStatusMessage(
																																																																																																												new StringTextComponent(
																																																																																																														"You are too high or nearby is a structure!"),
																																																																																																												(false));
																																																																																																							}
																																																																																																						}
																																																																																																					} else {
																																																																																																						if (entity instanceof PlayerEntity
																																																																																																								&& !entity.world.isRemote) {
																																																																																																							((PlayerEntity) entity)
																																																																																																									.sendStatusMessage(
																																																																																																											new StringTextComponent(
																																																																																																													"You are too high or nearby is a structure!"),
																																																																																																											(false));
																																																																																																						}
																																																																																																					}
																																																																																																				} else {
																																																																																																					if (entity instanceof PlayerEntity
																																																																																																							&& !entity.world.isRemote) {
																																																																																																						((PlayerEntity) entity)
																																																																																																								.sendStatusMessage(
																																																																																																										new StringTextComponent(
																																																																																																												"You are too high or nearby is a structure!"),
																																																																																																										(false));
																																																																																																					}
																																																																																																				}
																																																																																																			} else {
																																																																																																				if (entity instanceof PlayerEntity
																																																																																																						&& !entity.world.isRemote) {
																																																																																																					((PlayerEntity) entity)
																																																																																																							.sendStatusMessage(
																																																																																																									new StringTextComponent(
																																																																																																											"You are too high or nearby is a structure!"),
																																																																																																									(false));
																																																																																																				}
																																																																																																			}
																																																																																																		} else {
																																																																																																			if (entity instanceof PlayerEntity
																																																																																																					&& !entity.world.isRemote) {
																																																																																																				((PlayerEntity) entity)
																																																																																																						.sendStatusMessage(
																																																																																																								new StringTextComponent(
																																																																																																										"You are too high or nearby is a structure!"),
																																																																																																								(false));
																																																																																																			}
																																																																																																		}
																																																																																																	} else {
																																																																																																		if (entity instanceof PlayerEntity
																																																																																																				&& !entity.world.isRemote) {
																																																																																																			((PlayerEntity) entity)
																																																																																																					.sendStatusMessage(
																																																																																																							new StringTextComponent(
																																																																																																									"You are too high or nearby is a structure!"),
																																																																																																							(false));
																																																																																																		}
																																																																																																	}
																																																																																																} else {
																																																																																																	if (entity instanceof PlayerEntity
																																																																																																			&& !entity.world.isRemote) {
																																																																																																		((PlayerEntity) entity)
																																																																																																				.sendStatusMessage(
																																																																																																						new StringTextComponent(
																																																																																																								"You are too high or nearby is a structure!"),
																																																																																																						(false));
																																																																																																	}
																																																																																																}
																																																																																															} else {
																																																																																																if (entity instanceof PlayerEntity
																																																																																																		&& !entity.world.isRemote) {
																																																																																																	((PlayerEntity) entity)
																																																																																																			.sendStatusMessage(
																																																																																																					new StringTextComponent(
																																																																																																							"You are too high or nearby is a structure!"),
																																																																																																					(false));
																																																																																																}
																																																																																															}
																																																																																														} else {
																																																																																															if (entity instanceof PlayerEntity
																																																																																																	&& !entity.world.isRemote) {
																																																																																																((PlayerEntity) entity)
																																																																																																		.sendStatusMessage(
																																																																																																				new StringTextComponent(
																																																																																																						"You are too high or nearby is a structure!"),
																																																																																																				(false));
																																																																																															}
																																																																																														}
																																																																																													} else {
																																																																																														if (entity instanceof PlayerEntity
																																																																																																&& !entity.world.isRemote) {
																																																																																															((PlayerEntity) entity)
																																																																																																	.sendStatusMessage(
																																																																																																			new StringTextComponent(
																																																																																																					"You are too high or nearby is a structure!"),
																																																																																																			(false));
																																																																																														}
																																																																																													}
																																																																																												} else {
																																																																																													if (entity instanceof PlayerEntity
																																																																																															&& !entity.world.isRemote) {
																																																																																														((PlayerEntity) entity)
																																																																																																.sendStatusMessage(
																																																																																																		new StringTextComponent(
																																																																																																				"You are too high or nearby is a structure!"),
																																																																																																		(false));
																																																																																													}
																																																																																												}
																																																																																											} else {
																																																																																												if (entity instanceof PlayerEntity
																																																																																														&& !entity.world.isRemote) {
																																																																																													((PlayerEntity) entity)
																																																																																															.sendStatusMessage(
																																																																																																	new StringTextComponent(
																																																																																																			"You are too high or nearby is a structure!"),
																																																																																																	(false));
																																																																																												}
																																																																																											}
																																																																																										} else {
																																																																																											if (entity instanceof PlayerEntity
																																																																																													&& !entity.world.isRemote) {
																																																																																												((PlayerEntity) entity)
																																																																																														.sendStatusMessage(
																																																																																																new StringTextComponent(
																																																																																																		"You are too high or nearby is a structure!"),
																																																																																																(false));
																																																																																											}
																																																																																										}
																																																																																									} else {
																																																																																										if (entity instanceof PlayerEntity
																																																																																												&& !entity.world.isRemote) {
																																																																																											((PlayerEntity) entity)
																																																																																													.sendStatusMessage(
																																																																																															new StringTextComponent(
																																																																																																	"You are too high or nearby is a structure!"),
																																																																																															(false));
																																																																																										}
																																																																																									}
																																																																																								} else {
																																																																																									if (entity instanceof PlayerEntity
																																																																																											&& !entity.world.isRemote) {
																																																																																										((PlayerEntity) entity)
																																																																																												.sendStatusMessage(
																																																																																														new StringTextComponent(
																																																																																																"You are too high or nearby is a structure!"),
																																																																																														(false));
																																																																																									}
																																																																																								}
																																																																																							} else {
																																																																																								if (entity instanceof PlayerEntity
																																																																																										&& !entity.world.isRemote) {
																																																																																									((PlayerEntity) entity)
																																																																																											.sendStatusMessage(
																																																																																													new StringTextComponent(
																																																																																															"You are too high or nearby is a structure!"),
																																																																																													(false));
																																																																																								}
																																																																																							}
																																																																																						} else {
																																																																																							if (entity instanceof PlayerEntity
																																																																																									&& !entity.world.isRemote) {
																																																																																								((PlayerEntity) entity)
																																																																																										.sendStatusMessage(
																																																																																												new StringTextComponent(
																																																																																														"You are too high or nearby is a structure!"),
																																																																																												(false));
																																																																																							}
																																																																																						}
																																																																																					} else {
																																																																																						if (entity instanceof PlayerEntity
																																																																																								&& !entity.world.isRemote) {
																																																																																							((PlayerEntity) entity)
																																																																																									.sendStatusMessage(
																																																																																											new StringTextComponent(
																																																																																													"You are too high or nearby is a structure!"),
																																																																																											(false));
																																																																																						}
																																																																																					}
																																																																																				} else {
																																																																																					if (entity instanceof PlayerEntity
																																																																																							&& !entity.world.isRemote) {
																																																																																						((PlayerEntity) entity)
																																																																																								.sendStatusMessage(
																																																																																										new StringTextComponent(
																																																																																												"You are too high or nearby is a structure!"),
																																																																																										(false));
																																																																																					}
																																																																																				}
																																																																																			} else {
																																																																																				if (entity instanceof PlayerEntity
																																																																																						&& !entity.world.isRemote) {
																																																																																					((PlayerEntity) entity)
																																																																																							.sendStatusMessage(
																																																																																									new StringTextComponent(
																																																																																											"You are too high or nearby is a structure!"),
																																																																																									(false));
																																																																																				}
																																																																																			}
																																																																																		} else {
																																																																																			if (entity instanceof PlayerEntity
																																																																																					&& !entity.world.isRemote) {
																																																																																				((PlayerEntity) entity)
																																																																																						.sendStatusMessage(
																																																																																								new StringTextComponent(
																																																																																										"You are too high or nearby is a structure!"),
																																																																																								(false));
																																																																																			}
																																																																																		}
																																																																																	} else {
																																																																																		if (entity instanceof PlayerEntity
																																																																																				&& !entity.world.isRemote) {
																																																																																			((PlayerEntity) entity)
																																																																																					.sendStatusMessage(
																																																																																							new StringTextComponent(
																																																																																									"You are too high or nearby is a structure!"),
																																																																																							(false));
																																																																																		}
																																																																																	}
																																																																																} else {
																																																																																	if (entity instanceof PlayerEntity
																																																																																			&& !entity.world.isRemote) {
																																																																																		((PlayerEntity) entity)
																																																																																				.sendStatusMessage(
																																																																																						new StringTextComponent(
																																																																																								"You are too high or nearby is a structure!"),
																																																																																						(false));
																																																																																	}
																																																																																}
																																																																															} else {
																																																																																if (entity instanceof PlayerEntity
																																																																																		&& !entity.world.isRemote) {
																																																																																	((PlayerEntity) entity)
																																																																																			.sendStatusMessage(
																																																																																					new StringTextComponent(
																																																																																							"You are too high or nearby is a structure!"),
																																																																																					(false));
																																																																																}
																																																																															}
																																																																														} else {
																																																																															if (entity instanceof PlayerEntity
																																																																																	&& !entity.world.isRemote) {
																																																																																((PlayerEntity) entity)
																																																																																		.sendStatusMessage(
																																																																																				new StringTextComponent(
																																																																																						"You are too high or nearby is a structure!"),
																																																																																				(false));
																																																																															}
																																																																														}
																																																																													} else {
																																																																														if (entity instanceof PlayerEntity
																																																																																&& !entity.world.isRemote) {
																																																																															((PlayerEntity) entity)
																																																																																	.sendStatusMessage(
																																																																																			new StringTextComponent(
																																																																																					"You are too high or nearby is a structure!"),
																																																																																			(false));
																																																																														}
																																																																													}
																																																																												} else {
																																																																													if (entity instanceof PlayerEntity
																																																																															&& !entity.world.isRemote) {
																																																																														((PlayerEntity) entity)
																																																																																.sendStatusMessage(
																																																																																		new StringTextComponent(
																																																																																				"You are too high or nearby is a structure!"),
																																																																																		(false));
																																																																													}
																																																																												}
																																																																											} else {
																																																																												if (entity instanceof PlayerEntity
																																																																														&& !entity.world.isRemote) {
																																																																													((PlayerEntity) entity)
																																																																															.sendStatusMessage(
																																																																																	new StringTextComponent(
																																																																																			"You are too high or nearby is a structure!"),
																																																																																	(false));
																																																																												}
																																																																											}
																																																																										} else {
																																																																											if (entity instanceof PlayerEntity
																																																																													&& !entity.world.isRemote) {
																																																																												((PlayerEntity) entity)
																																																																														.sendStatusMessage(
																																																																																new StringTextComponent(
																																																																																		"You are too high or nearby is a structure!"),
																																																																																(false));
																																																																											}
																																																																										}
																																																																									} else {
																																																																										if (entity instanceof PlayerEntity
																																																																												&& !entity.world.isRemote) {
																																																																											((PlayerEntity) entity)
																																																																													.sendStatusMessage(
																																																																															new StringTextComponent(
																																																																																	"You are too high or nearby is a structure!"),
																																																																															(false));
																																																																										}
																																																																									}
																																																																								} else {
																																																																									if (entity instanceof PlayerEntity
																																																																											&& !entity.world.isRemote) {
																																																																										((PlayerEntity) entity)
																																																																												.sendStatusMessage(
																																																																														new StringTextComponent(
																																																																																"You are too high or nearby is a structure!"),
																																																																														(false));
																																																																									}
																																																																								}
																																																																							} else {
																																																																								if (entity instanceof PlayerEntity
																																																																										&& !entity.world.isRemote) {
																																																																									((PlayerEntity) entity)
																																																																											.sendStatusMessage(
																																																																													new StringTextComponent(
																																																																															"You are too high or nearby is a structure!"),
																																																																													(false));
																																																																								}
																																																																							}
																																																																						} else {
																																																																							if (entity instanceof PlayerEntity
																																																																									&& !entity.world.isRemote) {
																																																																								((PlayerEntity) entity)
																																																																										.sendStatusMessage(
																																																																												new StringTextComponent(
																																																																														"You are too high or nearby is a structure!"),
																																																																												(false));
																																																																							}
																																																																						}
																																																																					} else {
																																																																						if (entity instanceof PlayerEntity
																																																																								&& !entity.world.isRemote) {
																																																																							((PlayerEntity) entity)
																																																																									.sendStatusMessage(
																																																																											new StringTextComponent(
																																																																													"You are too high or nearby is a structure!"),
																																																																											(false));
																																																																						}
																																																																					}
																																																																				} else {
																																																																					if (entity instanceof PlayerEntity
																																																																							&& !entity.world.isRemote) {
																																																																						((PlayerEntity) entity)
																																																																								.sendStatusMessage(
																																																																										new StringTextComponent(
																																																																												"You are too high or nearby is a structure!"),
																																																																										(false));
																																																																					}
																																																																				}
																																																																			} else {
																																																																				if (entity instanceof PlayerEntity
																																																																						&& !entity.world.isRemote) {
																																																																					((PlayerEntity) entity)
																																																																							.sendStatusMessage(
																																																																									new StringTextComponent(
																																																																											"You are too high or nearby is a structure!"),
																																																																									(false));
																																																																				}
																																																																			}
																																																																		} else {
																																																																			if (entity instanceof PlayerEntity
																																																																					&& !entity.world.isRemote) {
																																																																				((PlayerEntity) entity)
																																																																						.sendStatusMessage(
																																																																								new StringTextComponent(
																																																																										"You are too high or nearby is a structure!"),
																																																																								(false));
																																																																			}
																																																																		}
																																																																	} else {
																																																																		if (entity instanceof PlayerEntity
																																																																				&& !entity.world.isRemote) {
																																																																			((PlayerEntity) entity)
																																																																					.sendStatusMessage(
																																																																							new StringTextComponent(
																																																																									"You are too high or nearby is a structure!"),
																																																																							(false));
																																																																		}
																																																																	}
																																																																} else {
																																																																	if (entity instanceof PlayerEntity
																																																																			&& !entity.world.isRemote) {
																																																																		((PlayerEntity) entity)
																																																																				.sendStatusMessage(
																																																																						new StringTextComponent(
																																																																								"You are too high or nearby is a structure!"),
																																																																						(false));
																																																																	}
																																																																}
																																																															} else {
																																																																if (entity instanceof PlayerEntity
																																																																		&& !entity.world.isRemote) {
																																																																	((PlayerEntity) entity)
																																																																			.sendStatusMessage(
																																																																					new StringTextComponent(
																																																																							"You are too high or nearby is a structure!"),
																																																																					(false));
																																																																}
																																																															}
																																																														} else {
																																																															if (entity instanceof PlayerEntity
																																																																	&& !entity.world.isRemote) {
																																																																((PlayerEntity) entity)
																																																																		.sendStatusMessage(
																																																																				new StringTextComponent(
																																																																						"You are too high or nearby is a structure!"),
																																																																				(false));
																																																															}
																																																														}
																																																													} else {
																																																														if (entity instanceof PlayerEntity
																																																																&& !entity.world.isRemote) {
																																																															((PlayerEntity) entity)
																																																																	.sendStatusMessage(
																																																																			new StringTextComponent(
																																																																					"You are too high or nearby is a structure!"),
																																																																			(false));
																																																														}
																																																													}
																																																												} else {
																																																													if (entity instanceof PlayerEntity
																																																															&& !entity.world.isRemote) {
																																																														((PlayerEntity) entity)
																																																																.sendStatusMessage(
																																																																		new StringTextComponent(
																																																																				"You are too high or nearby is a structure!"),
																																																																		(false));
																																																													}
																																																												}
																																																											} else {
																																																												if (entity instanceof PlayerEntity
																																																														&& !entity.world.isRemote) {
																																																													((PlayerEntity) entity)
																																																															.sendStatusMessage(
																																																																	new StringTextComponent(
																																																																			"You are too high or nearby is a structure!"),
																																																																	(false));
																																																												}
																																																											}
																																																										} else {
																																																											if (entity instanceof PlayerEntity
																																																													&& !entity.world.isRemote) {
																																																												((PlayerEntity) entity)
																																																														.sendStatusMessage(
																																																																new StringTextComponent(
																																																																		"You are too high or nearby is a structure!"),
																																																																(false));
																																																											}
																																																										}
																																																									} else {
																																																										if (entity instanceof PlayerEntity
																																																												&& !entity.world.isRemote) {
																																																											((PlayerEntity) entity)
																																																													.sendStatusMessage(
																																																															new StringTextComponent(
																																																																	"You are too high or nearby is a structure!"),
																																																															(false));
																																																										}
																																																									}
																																																								} else {
																																																									if (entity instanceof PlayerEntity
																																																											&& !entity.world.isRemote) {
																																																										((PlayerEntity) entity)
																																																												.sendStatusMessage(
																																																														new StringTextComponent(
																																																																"You are too high or nearby is a structure!"),
																																																														(false));
																																																									}
																																																								}
																																																							} else {
																																																								if (entity instanceof PlayerEntity
																																																										&& !entity.world.isRemote) {
																																																									((PlayerEntity) entity)
																																																											.sendStatusMessage(
																																																													new StringTextComponent(
																																																															"You are too high or nearby is a structure!"),
																																																													(false));
																																																								}
																																																							}
																																																						} else {
																																																							if (entity instanceof PlayerEntity
																																																									&& !entity.world.isRemote) {
																																																								((PlayerEntity) entity)
																																																										.sendStatusMessage(
																																																												new StringTextComponent(
																																																														"You are too high or nearby is a structure!"),
																																																												(false));
																																																							}
																																																						}
																																																					} else {
																																																						if (entity instanceof PlayerEntity
																																																								&& !entity.world.isRemote) {
																																																							((PlayerEntity) entity)
																																																									.sendStatusMessage(
																																																											new StringTextComponent(
																																																													"You are too high or nearby is a structure!"),
																																																											(false));
																																																						}
																																																					}
																																																				} else {
																																																					if (entity instanceof PlayerEntity
																																																							&& !entity.world.isRemote) {
																																																						((PlayerEntity) entity)
																																																								.sendStatusMessage(
																																																										new StringTextComponent(
																																																												"You are too high or nearby is a structure!"),
																																																										(false));
																																																					}
																																																				}
																																																			} else {
																																																				if (entity instanceof PlayerEntity
																																																						&& !entity.world.isRemote) {
																																																					((PlayerEntity) entity)
																																																							.sendStatusMessage(
																																																									new StringTextComponent(
																																																											"You are too high or nearby is a structure!"),
																																																									(false));
																																																				}
																																																			}
																																																		} else {
																																																			if (entity instanceof PlayerEntity
																																																					&& !entity.world.isRemote) {
																																																				((PlayerEntity) entity)
																																																						.sendStatusMessage(
																																																								new StringTextComponent(
																																																										"You are too high or nearby is a structure!"),
																																																								(false));
																																																			}
																																																		}
																																																	} else {
																																																		if (entity instanceof PlayerEntity
																																																				&& !entity.world.isRemote) {
																																																			((PlayerEntity) entity)
																																																					.sendStatusMessage(
																																																							new StringTextComponent(
																																																									"You are too high or nearby is a structure!"),
																																																							(false));
																																																		}
																																																	}
																																																} else {
																																																	if (entity instanceof PlayerEntity
																																																			&& !entity.world.isRemote) {
																																																		((PlayerEntity) entity)
																																																				.sendStatusMessage(
																																																						new StringTextComponent(
																																																								"You are too high or nearby is a structure!"),
																																																						(false));
																																																	}
																																																}
																																															} else {
																																																if (entity instanceof PlayerEntity
																																																		&& !entity.world.isRemote) {
																																																	((PlayerEntity) entity)
																																																			.sendStatusMessage(
																																																					new StringTextComponent(
																																																							"You are too high or nearby is a structure!"),
																																																					(false));
																																																}
																																															}
																																														} else {
																																															if (entity instanceof PlayerEntity
																																																	&& !entity.world.isRemote) {
																																																((PlayerEntity) entity)
																																																		.sendStatusMessage(
																																																				new StringTextComponent(
																																																						"You are too high or nearby is a structure!"),
																																																				(false));
																																															}
																																														}
																																													} else {
																																														if (entity instanceof PlayerEntity
																																																&& !entity.world.isRemote) {
																																															((PlayerEntity) entity)
																																																	.sendStatusMessage(
																																																			new StringTextComponent(
																																																					"You are too high or nearby is a structure!"),
																																																			(false));
																																														}
																																													}
																																												} else {
																																													if (entity instanceof PlayerEntity
																																															&& !entity.world.isRemote) {
																																														((PlayerEntity) entity)
																																																.sendStatusMessage(
																																																		new StringTextComponent(
																																																				"You are too high or nearby is a structure!"),
																																																		(false));
																																													}
																																												}
																																											} else {
																																												if (entity instanceof PlayerEntity
																																														&& !entity.world.isRemote) {
																																													((PlayerEntity) entity)
																																															.sendStatusMessage(
																																																	new StringTextComponent(
																																																			"You are too high or nearby is a structure!"),
																																																	(false));
																																												}
																																											}
																																										} else {
																																											if (entity instanceof PlayerEntity
																																													&& !entity.world.isRemote) {
																																												((PlayerEntity) entity)
																																														.sendStatusMessage(
																																																new StringTextComponent(
																																																		"You are too high or nearby is a structure!"),
																																																(false));
																																											}
																																										}
																																									} else {
																																										if (entity instanceof PlayerEntity
																																												&& !entity.world.isRemote) {
																																											((PlayerEntity) entity)
																																													.sendStatusMessage(
																																															new StringTextComponent(
																																																	"You are too high or nearby is a structure!"),
																																															(false));
																																										}
																																									}
																																								} else {
																																									if (entity instanceof PlayerEntity
																																											&& !entity.world.isRemote) {
																																										((PlayerEntity) entity)
																																												.sendStatusMessage(
																																														new StringTextComponent(
																																																"You are too high or nearby is a structure!"),
																																														(false));
																																									}
																																								}
																																							} else {
																																								if (entity instanceof PlayerEntity
																																										&& !entity.world.isRemote) {
																																									((PlayerEntity) entity)
																																											.sendStatusMessage(
																																													new StringTextComponent(
																																															"You are too high or nearby is a structure!"),
																																													(false));
																																								}
																																							}
																																						} else {
																																							if (entity instanceof PlayerEntity
																																									&& !entity.world.isRemote) {
																																								((PlayerEntity) entity)
																																										.sendStatusMessage(
																																												new StringTextComponent(
																																														"You are too high or nearby is a structure!"),
																																												(false));
																																							}
																																						}
																																					} else {
																																						if (entity instanceof PlayerEntity
																																								&& !entity.world.isRemote) {
																																							((PlayerEntity) entity)
																																									.sendStatusMessage(
																																											new StringTextComponent(
																																													"You are too high or nearby is a structure!"),
																																											(false));
																																						}
																																					}
																																				} else {
																																					if (entity instanceof PlayerEntity
																																							&& !entity.world.isRemote) {
																																						((PlayerEntity) entity)
																																								.sendStatusMessage(
																																										new StringTextComponent(
																																												"You are too high or nearby is a structure!"),
																																										(false));
																																					}
																																				}
																																			} else {
																																				if (entity instanceof PlayerEntity
																																						&& !entity.world.isRemote) {
																																					((PlayerEntity) entity)
																																							.sendStatusMessage(
																																									new StringTextComponent(
																																											"You are too high or nearby is a structure!"),
																																									(false));
																																				}
																																			}
																																		} else {
																																			if (entity instanceof PlayerEntity
																																					&& !entity.world.isRemote) {
																																				((PlayerEntity) entity)
																																						.sendStatusMessage(
																																								new StringTextComponent(
																																										"You are too high or nearby is a structure!"),
																																								(false));
																																			}
																																		}
																																	} else {
																																		if (entity instanceof PlayerEntity
																																				&& !entity.world.isRemote) {
																																			((PlayerEntity) entity)
																																					.sendStatusMessage(
																																							new StringTextComponent(
																																									"You are too high or nearby is a structure!"),
																																							(false));
																																		}
																																	}
																																} else {
																																	if (entity instanceof PlayerEntity
																																			&& !entity.world.isRemote) {
																																		((PlayerEntity) entity)
																																				.sendStatusMessage(
																																						new StringTextComponent(
																																								"You are too high or nearby is a structure!"),
																																						(false));
																																	}
																																}
																															} else {
																																if (entity instanceof PlayerEntity
																																		&& !entity.world.isRemote) {
																																	((PlayerEntity) entity)
																																			.sendStatusMessage(
																																					new StringTextComponent(
																																							"You are too high or nearby is a structure!"),
																																					(false));
																																}
																															}
																														} else {
																															if (entity instanceof PlayerEntity
																																	&& !entity.world.isRemote) {
																																((PlayerEntity) entity)
																																		.sendStatusMessage(
																																				new StringTextComponent(
																																						"You are too high or nearby is a structure!"),
																																				(false));
																															}
																														}
																													} else {
																														if (entity instanceof PlayerEntity
																																&& !entity.world.isRemote) {
																															((PlayerEntity) entity)
																																	.sendStatusMessage(
																																			new StringTextComponent(
																																					"You are too high or nearby is a structure!"),
																																			(false));
																														}
																													}
																												} else {
																													if (entity instanceof PlayerEntity
																															&& !entity.world.isRemote) {
																														((PlayerEntity) entity)
																																.sendStatusMessage(
																																		new StringTextComponent(
																																				"You are too high or nearby is a structure!"),
																																		(false));
																													}
																												}
																											} else {
																												if (entity instanceof PlayerEntity
																														&& !entity.world.isRemote) {
																													((PlayerEntity) entity)
																															.sendStatusMessage(
																																	new StringTextComponent(
																																			"You are too high or nearby is a structure!"),
																																	(false));
																												}
																											}
																										} else {
																											if (entity instanceof PlayerEntity
																													&& !entity.world.isRemote) {
																												((PlayerEntity) entity)
																														.sendStatusMessage(
																																new StringTextComponent(
																																		"You are too high or nearby is a structure!"),
																																(false));
																											}
																										}
																									} else {
																										if (entity instanceof PlayerEntity
																												&& !entity.world.isRemote) {
																											((PlayerEntity) entity).sendStatusMessage(
																													new StringTextComponent(
																															"You are too high or nearby is a structure!"),
																													(false));
																										}
																									}
																								} else {
																									if (entity instanceof PlayerEntity
																											&& !entity.world.isRemote) {
																										((PlayerEntity) entity).sendStatusMessage(
																												new StringTextComponent(
																														"You are too high or nearby is a structure!"),
																												(false));
																									}
																								}
																							} else {
																								if (entity instanceof PlayerEntity
																										&& !entity.world.isRemote) {
																									((PlayerEntity) entity).sendStatusMessage(
																											new StringTextComponent(
																													"You are too high or nearby is a structure!"),
																											(false));
																								}
																							}
																						} else {
																							if (entity instanceof PlayerEntity
																									&& !entity.world.isRemote) {
																								((PlayerEntity) entity).sendStatusMessage(
																										new StringTextComponent(
																												"You are too high or nearby is a structure!"),
																										(false));
																							}
																						}
																					} else {
																						if (entity instanceof PlayerEntity
																								&& !entity.world.isRemote) {
																							((PlayerEntity) entity).sendStatusMessage(
																									new StringTextComponent(
																											"You are too high or nearby is a structure!"),
																									(false));
																						}
																					}
																				} else {
																					if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																						((PlayerEntity) entity).sendStatusMessage(
																								new StringTextComponent(
																										"You are too high or nearby is a structure!"),
																								(false));
																					}
																				}
																			} else {
																				if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																					((PlayerEntity) entity).sendStatusMessage(
																							new StringTextComponent(
																									"You are too high or nearby is a structure!"),
																							(false));
																				}
																			}
																		} else {
																			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																				((PlayerEntity) entity).sendStatusMessage(
																						new StringTextComponent(
																								"You are too high or nearby is a structure!"),
																						(false));
																			}
																		}
																	} else {
																		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(
																					"You are too high or nearby is a structure!"), (false));
																		}
																	}
																} else {
																	if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																		((PlayerEntity) entity).sendStatusMessage(
																				new StringTextComponent("You are too high or nearby is a structure!"),
																				(false));
																	}
																}
															} else {
																if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																	((PlayerEntity) entity).sendStatusMessage(
																			new StringTextComponent("You are too high or nearby is a structure!"),
																			(false));
																}
															}
														} else {
															if (entity instanceof PlayerEntity && !entity.world.isRemote) {
																((PlayerEntity) entity).sendStatusMessage(
																		new StringTextComponent("You are too high or nearby is a structure!"),
																		(false));
															}
														}
													} else {
														if (entity instanceof PlayerEntity && !entity.world.isRemote) {
															((PlayerEntity) entity).sendStatusMessage(
																	new StringTextComponent("You are too high or nearby is a structure!"), (false));
														}
													}
												} else {
													if (entity instanceof PlayerEntity && !entity.world.isRemote) {
														((PlayerEntity) entity).sendStatusMessage(
																new StringTextComponent("You are too high or nearby is a structure!"), (false));
													}
												}
											} else {
												if (entity instanceof PlayerEntity && !entity.world.isRemote) {
													((PlayerEntity) entity).sendStatusMessage(
															new StringTextComponent("You are too high or nearby is a structure!"), (false));
												}
											}
										} else {
											if (entity instanceof PlayerEntity && !entity.world.isRemote) {
												((PlayerEntity) entity).sendStatusMessage(
														new StringTextComponent("You are too high or nearby is a structure!"), (false));
											}
										}
									} else {
										if (entity instanceof PlayerEntity && !entity.world.isRemote) {
											((PlayerEntity) entity).sendStatusMessage(
													new StringTextComponent("You are too high or nearby is a structure!"), (false));
										}
									}
								} else {
									if (entity instanceof PlayerEntity && !entity.world.isRemote) {
										((PlayerEntity) entity)
												.sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"), (false));
									}
								}
							} else {
								if (entity instanceof PlayerEntity && !entity.world.isRemote) {
									((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"),
											(false));
								}
							}
						} else {
							if (entity instanceof PlayerEntity && !entity.world.isRemote) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"),
										(false));
							}
						}
					} else {
						if (entity instanceof PlayerEntity && !entity.world.isRemote) {
							((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"), (false));
						}
					}
				} else {
					if (entity instanceof PlayerEntity && !entity.world.isRemote) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"), (false));
					}
				}
			} else {
				if (entity instanceof PlayerEntity && !entity.world.isRemote) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You are too high or nearby is a structure!"), (false));
				}
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Works only in orbit!"), (false));
			}
		}
	}
}
