package net.mcreator.boss_tools.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec2f;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.boss_tools.item.Tier3RocketItemItem;
import net.mcreator.boss_tools.item.FuelBucketBigItem;
import net.mcreator.boss_tools.item.BucketBigItem;
import net.mcreator.boss_tools.entity.LandingGearEntity;
import net.mcreator.boss_tools.BossToolsModElements;

import java.util.Map;

@BossToolsModElements.ModElement.Tag
public class RocketTier3MerkurTpProcedure extends BossToolsModElements.ModElement {
	public RocketTier3MerkurTpProcedure(BossToolsModElements instance) {
		super(instance, 398);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure RocketTier3MerkurTp!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure RocketTier3MerkurTp!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure RocketTier3MerkurTp!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure RocketTier3MerkurTp!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure RocketTier3MerkurTp!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
			world.getWorld().getServer().getCommandManager().handleCommand(new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO,
					(ServerWorld) world, 4, "", new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
					"/effect clear @p");
		}
		if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
			world.getWorld().getServer().getCommandManager()
					.handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/title @p times 20 60 5");
		}
		if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
			world.getWorld().getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "", new StringTextComponent(""),
							world.getWorld().getServer(), null).withFeedbackDisabled(),
					"/title @p title {\"text\":\"Press\",\"color\":\"red\",\"bold\":\"false\"}");
		}
		if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
			world.getWorld().getServer().getCommandManager()
					.handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/title @p subtitle {\"text\":\"Space\",\"color\":\"blue\"}");
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7cWARNING! \u00A77Press \u00A7cSPACE\u00A77."), (false));
		}
		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7cWARNING! \u00A77Press \u00A7cSPACE\u00A77."), (true));
		}
		if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
			world.getWorld().getServer().getCommandManager()
					.handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/execute in boss_tools:mercury run teleport @p ~ 500 ~");
		}
		if (((world.getWorld().isRemote) == (false))) {
			Entity entity2 = new LandingGearEntity.CustomEntity(LandingGearEntity.entity, entity.world);
			entity2.setPositionAndUpdate(entity.getPosX(), entity.getPosY(), entity.getPosZ());
			entity.world.addEntity(entity2);
			entity.startRiding(entity2);
			if (((entity.getRidingEntity()) instanceof LandingGearEntity.CustomEntity)) {
				{
					final ItemStack _setstack = new ItemStack(Tier3RocketItemItem.block, (int) (1));
					final int _sltid = (int) (0);
					_setstack.setCount((int) 1);
					(entity.getRidingEntity()).getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			if (((entity.getRidingEntity()) instanceof LandingGearEntity.CustomEntity)) {
				if (((entity.getPersistentData().getDouble("Bucket")) == 1)) {
					{
						final ItemStack _setstack = new ItemStack(BucketBigItem.block, (int) (1));
						final int _sltid = (int) (1);
						_setstack.setCount((int) 1);
						(entity.getRidingEntity()).getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
			if (((entity.getRidingEntity()) instanceof LandingGearEntity.CustomEntity)) {
				if (((entity.getPersistentData().getDouble("Bucket")) == 2)) {
					{
						final ItemStack _setstack = new ItemStack(FuelBucketBigItem.block, (int) (1));
						final int _sltid = (int) (1);
						_setstack.setCount((int) 1);
						(entity.getRidingEntity()).getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
							}
						});
					}
				}
			}
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}
