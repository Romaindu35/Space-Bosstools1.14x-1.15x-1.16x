package net.mcreator.boss_tools.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec2f;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.boss_tools.potion.RocketpotionPotion;
import net.mcreator.boss_tools.potion.Rocketpotion5Potion;
import net.mcreator.boss_tools.potion.Rocketpotion4Potion;
import net.mcreator.boss_tools.potion.Rocketpotion3Potion;
import net.mcreator.boss_tools.potion.Rocketpotion2Potion;
import net.mcreator.boss_tools.BossToolsModVariables;
import net.mcreator.boss_tools.BossToolsModElements;

import java.util.Map;

@BossToolsModElements.ModElement.Tag
public class RocketonEntitytickUpdate2Procedure extends BossToolsModElements.ModElement {
	public RocketonEntitytickUpdate2Procedure(BossToolsModElements instance) {
		super(instance, 130);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure RocketonEntitytickUpdate2!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure RocketonEntitytickUpdate2!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure RocketonEntitytickUpdate2!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure RocketonEntitytickUpdate2!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure RocketonEntitytickUpdate2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double test = 0;
		if ((entity.isBeingRidden())) {
			if (((BossToolsModVariables.Timer7) >= 80)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/give @p boss_tools:rocket_tier_2_itemno_fuel");
				}
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/stopsound @p neutral boss_tools:rocket");
				}
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/effect give @p boss_tools:rocket_potion_8 999999");
				}
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/effect give @p minecraft:levitation 9999");
				}
				if (!entity.world.isRemote)
					entity.remove();
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(RocketpotionPotion.potion, (int) 60, (int) 13, (false), (true)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Rocketpotion2Potion.potion, (int) 60, (int) 13, (false), (true)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Rocketpotion3Potion.potion, (int) 60, (int) 13, (false), (true)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Rocketpotion4Potion.potion, (int) 60, (int) 13, (false), (true)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Rocketpotion5Potion.potion, (int) 60, (int) 13, (false), (true)));
			if (((BossToolsModVariables.Timer7) >= 21)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/particle minecraft:campfire_cosy_smoke ~ ~-3 ~ -1 1 -1 0.01 50");
				}
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/particle minecraft:flame ~ ~-3 ~ -1 1 -1 0.01 50");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 1)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 10");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 2)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 10");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 3)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 9");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 4)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 9");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 5)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 8");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 6)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 8");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 7)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 7");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 8)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 7");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 9)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 6");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 10)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 6");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 11)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 5");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 12)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 5");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 13)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 4");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 14)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 4");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 15)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 3");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 16)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 3");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 17)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 2");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 18)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 2");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 19)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 1");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 20)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p title 1");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 20)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p times 0 0 0");
				}
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager()
							.handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
											new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
									"/title @p clear");
				}
			}
			if (((BossToolsModVariables.Timer7) >= 21)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 60, (int) 13, (false), (false)));
			}
			if (((BossToolsModVariables.Timer7) <= 20)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/particle minecraft:campfire_cosy_smoke ~ ~-2 ~ -1 1 -1 0.01 20");
				}
			}
		}
	}
}
