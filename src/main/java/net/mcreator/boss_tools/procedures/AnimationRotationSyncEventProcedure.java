package net.mcreator.boss_tools.procedures;

import net.minecraftforge.fml.network.simple.SimpleChannel;
import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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
public class AnimationRotationSyncEventProcedure extends BossToolsModElements.ModElement {
	public static SimpleChannel INSTANCE;
	private static int id = 1;
	public static int nextID() {
		return id++;
	}

	public static void registerMessages() {
		INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation("space5", "channel5"), () -> "1.0", s -> true, s -> true);// space2 und channal2 musst du wen zu zb. ein neues machst space3 also +1!
		INSTANCE.registerMessage(nextID(), PacketAnimationRotationSync.class, PacketAnimationRotationSync::encode,
				PacketAnimationRotationSync::decode, PacketAnimationRotationSync::handle);
	}

	public AnimationRotationSyncEventProcedure(BossToolsModElements instance) {
		super(instance, 217);
		registerMessages();
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
	}

	@SubscribeEvent
	public void playerTraceCheckSync(TickEvent.PlayerTickEvent event) {
		PlayerEntity playerEntity = event.player;
		Entity entity = playerEntity.world.getEntityByID(playerEntity.getPersistentData().getInt("connectedanimationrotationedentityid"));
		if (!playerEntity.world.isRemote) {
			if (entity != null) {
				playerEntity.getPersistentData().putDouble("animationrotation", entity.getPersistentData().getDouble("animationrotation"));
			}
			INSTANCE.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) playerEntity),
					new PacketAnimationRotationSync(playerEntity.getEntityId(), playerEntity.getPersistentData().getDouble("animationrotation")));
		}
	}
	private static class PacketAnimationRotationSync {
		private int rocket;
		private double animationrotation;
		public PacketAnimationRotationSync(int entityId, double animationrotation) {
			this.rocket = rocket;
			this.animationrotation = animationrotation;
		}

		public static void encode(PacketAnimationRotationSync msg, PacketBuffer buf) {
			buf.writeInt(msg.rocket);
			buf.writeDouble(msg.animationrotation);
		}

		public static PacketAnimationRotationSync decode(PacketBuffer buf) {
			return new PacketAnimationRotationSync(buf.readInt(), buf.readDouble());
		}

		public static void handle(PacketAnimationRotationSync msg, Supplier<NetworkEvent.Context> ctx) {
			ctx.get().enqueueWork(() -> {
				Entity rocket = Minecraft.getInstance().world.getEntityByID(msg.rocket);
				if (rocket != null) {
					rocket.getPersistentData().putDouble("animationrotation", msg.animationrotation);
				}
			});
			ctx.get().setPacketHandled(true);
		}
	}
}
