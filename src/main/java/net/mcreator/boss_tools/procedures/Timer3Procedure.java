package net.mcreator.boss_tools.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;

import net.mcreator.boss_tools.BossToolsModVariables;
import net.mcreator.boss_tools.BossToolsModElements;

import java.util.Map;
import java.util.HashMap;

@BossToolsModElements.ModElement.Tag
public class Timer3Procedure extends BossToolsModElements.ModElement {
	public Timer3Procedure(BossToolsModElements instance) {
		super(instance, 127);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (((BossToolsModVariables.Timer3) >= 4)) {
			BossToolsModVariables.Timer3 = (double) 0;
		}
	}

	@SubscribeEvent
	public void onWorldTick(TickEvent.WorldTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			World world = event.world;
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("world", world);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
