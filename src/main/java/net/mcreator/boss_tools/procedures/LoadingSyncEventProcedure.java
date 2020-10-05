package net.mcreator.boss_tools.procedures;

import net.mcreator.boss_tools.BossToolsModElements;

import java.util.Map;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraftforge.event.entity.living.LivingDamageEvent;

@BossToolsModElements.ModElement.Tag
public class LoadingSyncEventProcedure extends BossToolsModElements.ModElement {
	public LoadingSyncEventProcedure(BossToolsModElements instance) {
		super(instance, 339);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
	}
	@SubscribeEvent
    public void clickSync(PlayerInteractEvent.EntityInteract event) {
        event.getPlayer().getPersistentData().putDouble("loading", event.getTarget().getPersistentData().getDouble("loading"));
        event.getPlayer().getPersistentData().putInt("connectedloadingedentityid", event.getTarget().getEntityId());
    }
    @SubscribeEvent
    public void playerTraceCheckSync(TickEvent.PlayerTickEvent event) {
        PlayerEntity playerEntity = event.player;
        Entity entity = playerEntity.world.getEntityByID(playerEntity.getPersistentData().getInt("connectedloadingedentityid"));
        if (entity != null) {
            playerEntity.getPersistentData().putDouble("loading", entity.getPersistentData().getDouble("loading"));
        }
    }
}
