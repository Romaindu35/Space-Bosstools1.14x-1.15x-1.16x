package net.mcreator.boss_tools.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.boss_tools.potion.DamageRemove4Potion;
import net.mcreator.boss_tools.BossToolsModElements;

import java.util.Map;

@BossToolsModElements.ModElement.Tag
public class SpaceArmorBootsTickEventProcedure extends BossToolsModElements.ModElement {
	public SpaceArmorBootsTickEventProcedure(BossToolsModElements instance) {
		super(instance, 185);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SpaceArmorBootsTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(DamageRemove4Potion.potion, (int) 2, (int) 1, (false), (false)));
	}
}
