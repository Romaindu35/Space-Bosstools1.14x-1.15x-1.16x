package net.mcreator.boss_tools.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec2f;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.boss_tools.potion.RocketpotionPotion;
import net.mcreator.boss_tools.potion.FuelSyncSystemPotion;
import net.mcreator.boss_tools.item.FuelBuckedItem;
import net.mcreator.boss_tools.BossToolsModElements;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;
import java.util.Collection;

@BossToolsModElements.ModElement.Tag
public class RocketOnEntityTickUpdateProcedure extends BossToolsModElements.ModElement {
	public RocketOnEntityTickUpdateProcedure(BossToolsModElements instance) {
		super(instance, 81);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure RocketOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure RocketOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure RocketOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure RocketOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure RocketOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((entity.isBeingRidden())) {
			if (((entity.getPosY()) > 600)) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/stopsound @p neutral boss_tools:rocketfly");
				}
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/effect give @p boss_tools:rocketpotion_7 999999");
				}
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/effect give @p minecraft:levitation 999999 1 true");
				}
				if (!entity.world.isRemote)
					entity.remove();
			}
		}
		if ((new Object() {
			boolean check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == RocketpotionPotion.potion)
							return true;
					}
				}
				return false;
			}
		}.check((LivingEntity) entity))) {
			if (((entity.isBeingRidden()) == (true))) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/effect give @p boss_tools:rocket_paticle 1 1 true");
				}
			}
			if (((entity.isBeingRidden()) == (false))) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/particle minecraft:flame ~ ~-2 ~ 0.5 .1 0.5 .001 60 force");
				}
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/particle minecraft:smoke ~ ~-3 ~ 0.6 .1 0.6 .04 60 force");
				}
			}
		}
		if (((entity.getPosY()) > 615)) {
			if (!entity.world.isRemote)
				entity.remove();
		}
		if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
			world.getWorld().getServer().getCommandManager()
					.handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/team add SpaceBossToolsRo");
		}
		if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
			world.getWorld().getServer().getCommandManager()
					.handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/team modify SpaceBossToolsRo collisionRule never");
		}
		if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
			world.getWorld().getServer().getCommandManager()
					.handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/team join SpaceBossToolsRo @e[type=boss_tools:rocket,]");
		}
		if (((new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack((int) (0), entity)).getItem() == new ItemStack(FuelBuckedItem.block, (int) (1)).getItem())) {
			if (((entity.getPersistentData().getDouble("Rocketfuel")) == 0)) {
				{
					final ItemStack _setstack = new ItemStack(Items.BUCKET, (int) (1));
					final int _sltid = (int) (0);
					_setstack.setCount((int) 1);
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
				entity.getPersistentData().putDouble("Rocketfuel", 1);
			}
		}
		if (((entity.getPersistentData().getDouble("Rocketfuel")) == 1)) {
			if (((entity.getPersistentData().getDouble("fuel")) <= 399)) {
				entity.getPersistentData().putDouble("fuel", ((entity.getPersistentData().getDouble("fuel")) + 1));
			}
			if (((entity.getPersistentData().getDouble("loading")) <= 399)) {
				if (((entity.getPersistentData().getDouble("loadingArrow")) <= 399)) {
					entity.getPersistentData().putDouble("loading", ((entity.getPersistentData().getDouble("loading")) + 1));
				}
			}
			if (((entity.getPersistentData().getDouble("loading")) == 400)) {
				entity.getPersistentData().putDouble("loadingArrow", 500);
				entity.getPersistentData().putDouble("loading", 0);
			}
			if (((entity.getPersistentData().getDouble("fuel")) == 400)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(FuelSyncSystemPotion.potion, (int) 99999999, (int) 1, (false), (false)));
			}
		}
		if ((new Object() {
			boolean check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == FuelSyncSystemPotion.potion)
							return true;
					}
				}
				return false;
			}
		}.check((LivingEntity) entity))) {
			entity.getPersistentData().putDouble("fuel", 400);
		}
	}
}
