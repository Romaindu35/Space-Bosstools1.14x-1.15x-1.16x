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
public class FlySyncEventProcedure extends BossToolsModElements.ModElement {
	public FlySyncEventProcedure(BossToolsModElements instance) {
		super(instance, 417);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
	}

	//fly System
    @SubscribeEvent
    public void clickSync(PlayerInteractEvent.EntityInteract event) {
        event.getPlayer().getPersistentData().putDouble("fly", event.getTarget().getPersistentData().getDouble("fly"));
        event.getPlayer().getPersistentData().putInt("connectedflyedentityid", event.getTarget().getEntityId());
    }
    //Fly system
    @SubscribeEvent
    public void playerTraceCheckSync(TickEvent.PlayerTickEvent event) {
        PlayerEntity playerEntity = event.player;
        Entity entity = playerEntity.world.getEntityByID(playerEntity.getPersistentData().getInt("connectedflyedentityid"));
        if (entity != null) {
            playerEntity.getPersistentData().putDouble("fly", entity.getPersistentData().getDouble("fly"));
		}
	}
}
