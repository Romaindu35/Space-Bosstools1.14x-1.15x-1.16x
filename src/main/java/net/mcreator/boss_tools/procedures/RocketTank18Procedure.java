package net.mcreator.boss_tools.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.boss_tools.BossToolsModElements;

import java.util.Map;

@BossToolsModElements.ModElement.Tag
public class RocketTank18Procedure extends BossToolsModElements.ModElement {
	public RocketTank18Procedure(BossToolsModElements instance) {
		super(instance, 320);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure RocketTank18!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return ((entity.getPersistentData().getDouble("fuel")) >= 306);
	}
}
