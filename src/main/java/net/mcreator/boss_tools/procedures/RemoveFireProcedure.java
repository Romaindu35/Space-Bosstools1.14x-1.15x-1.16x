package net.mcreator.boss_tools.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.state.IProperty;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.boss_tools.block.TorchBlock;
import net.mcreator.boss_tools.BossToolsModElements;

import java.util.Map;
import java.util.HashMap;

@BossToolsModElements.ModElement.Tag
public class RemoveFireProcedure extends BossToolsModElements.ModElement {
	public RemoveFireProcedure(BossToolsModElements instance) {
		super(instance, 187);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure RemoveFire!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure RemoveFire!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure RemoveFire!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure RemoveFire!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("boss_tools:moon_biom")))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.FIRE.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			}
		}
		if ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("boss_tools:mars_biom")))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.FIRE.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			}
		}
		if ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("boss_tools:orbit_overworld_biom")))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.FIRE.getDefaultState().getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			}
		}
		if ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("boss_tools:moon_biom")))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.TORCH.getDefaultState().getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TorchBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
		}
		if ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("boss_tools:mars_biom")))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.TORCH.getDefaultState().getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TorchBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
		}
		if ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("boss_tools:orbit_overworld_biom")))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.TORCH.getDefaultState().getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TorchBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
		}
		if ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("boss_tools:moon_biom")))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.WALL_TORCH.getDefaultState().getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TorchBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
		}
		if ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("boss_tools:mars_biom")))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.WALL_TORCH.getDefaultState().getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TorchBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
		}
		if ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("boss_tools:orbit_overworld_biom")))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.WALL_TORCH.getDefaultState().getBlock())) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = TorchBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						IProperty _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_bs.has(_property))
							_bs = _bs.with(_property, (Comparable) entry.getValue());
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
		}
		if ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("boss_tools:moon_biom")))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CAMPFIRE.getDefaultState().getBlock())) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/setblock ~ ~ ~ minecraft:campfire[lit=false]");
				}
			}
		}
		if ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("boss_tools:mars_biom")))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CAMPFIRE.getDefaultState().getBlock())) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/setblock ~ ~ ~ minecraft:campfire[lit=false]");
				}
			}
		}
		if ((ForgeRegistries.BIOMES.getKey(world.getBiome(new BlockPos((int) x, (int) y, (int) z)))
				.equals(new ResourceLocation("boss_tools:orbit_overworld_biom")))) {
			if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.CAMPFIRE.getDefaultState().getBlock())) {
				if (!world.getWorld().isRemote && world.getWorld().getServer() != null) {
					world.getWorld().getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), world.getWorld().getServer(), null).withFeedbackDisabled(),
							"/setblock ~ ~ ~ minecraft:campfire[lit=false]");
				}
			}
		}
	}

	@SubscribeEvent
	public void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		Entity entity = event.getEntity();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", (int) event.getPos().getX());
		dependencies.put("y", (int) event.getPos().getY());
		dependencies.put("z", (int) event.getPos().getZ());
		dependencies.put("px", entity.getPosX());
		dependencies.put("py", entity.getPosY());
		dependencies.put("pz", entity.getPosZ());
		dependencies.put("world", event.getWorld().getWorld());
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
