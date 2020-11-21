package net.mcreator.boss_tools.procedures;

import net.minecraftforge.fml.network.simple.SimpleChannel;
import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.util.ResourceLocation;
import net.minecraft.network.PacketBuffer;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import net.mcreator.boss_tools.BossToolsModElements;

import java.util.function.Supplier;
import java.util.Map;

@BossToolsModElements.ModElement.Tag
public class AnimationSyncEventProcedure extends BossToolsModElements.ModElement {
	public static SimpleChannel INSTANCE;
	private static int id = 1;
	public static int nextID() {
		return id++;
	}

	public static void registerMessages() {
		INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation("space3", "channel3"), () -> "1.0", s -> true, s -> true);//space2 und channal2 musst du wen zu zb. ein neues machst space3 also +1!
		INSTANCE.registerMessage(nextID(), PacketAnimationSync.class, PacketAnimationSync::encode, PacketAnimationSync::decode, PacketAnimationSync::handle);
	}

	public AnimationSyncEventProcedure(BossToolsModElements instance) {
		super(instance, 217);
		registerMessages();
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
	}

	@SubscribeEvent
	public void clickSync(PlayerInteractEvent.EntityInteract event) {
		event.getPlayer().getPersistentData().putDouble("animation", event.getTarget().getPersistentData().getDouble("animation"));
		event.getPlayer().getPersistentData().putInt("connectedanimationedentityid", event.getTarget().getEntityId());
	}

	@SubscribeEvent
	public void playerTraceCheckSync(TickEvent.PlayerTickEvent event) {
		PlayerEntity playerEntity = event.player;
		Entity entity = playerEntity.world.getEntityByID(playerEntity.getPersistentData().getInt("connectedanimationedentityid"));
		if (!playerEntity.world.isRemote) {
			if (entity != null) {
				playerEntity.getPersistentData().putDouble("animation", entity.getPersistentData().getDouble("animation"));
			}
			INSTANCE.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) playerEntity),
					new PacketAnimationSync(playerEntity.getEntityId(), playerEntity.getPersistentData().getDouble("animation")));
		}
	}
	private static class PacketAnimationSync {
		private int entityId;
		private double animation;
		public PacketAnimationSync(int entityId, double animation) {
			this.entityId = entityId;
			this.animation = animation;
		}

		public static void encode(PacketAnimationSync msg, PacketBuffer buf) {
			buf.writeInt(msg.entityId);
			buf.writeDouble(msg.animation);
		}

		public static PacketAnimationSync decode(PacketBuffer buf) {
			return new PacketAnimationSync(buf.readInt(), buf.readDouble());
		}

		public static void handle(PacketAnimationSync msg, Supplier<NetworkEvent.Context> ctx) {
			ctx.get().enqueueWork(() -> {
				Entity entity = Minecraft.getInstance().world.getEntityByID(msg.entityId);
				if (entity != null) {
					entity.getPersistentData().putDouble("animation", msg.animation);
				}
			});
			ctx.get().setPacketHandled(true);
		}
	}
}