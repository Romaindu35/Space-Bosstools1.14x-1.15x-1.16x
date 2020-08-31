package net.mcreator.boss_tools.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.boss_tools.potion.DamageRemovePotion;
import net.mcreator.boss_tools.potion.DamageRemove4Potion;
import net.mcreator.boss_tools.potion.DamageRemove3Potion;
import net.mcreator.boss_tools.potion.DamageRemove2Potion;
import net.mcreator.boss_tools.potion.DamagePotionPotion;
import net.mcreator.boss_tools.BossToolsModElements;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

@BossToolsModElements.ModElement.Tag
public class AkivepotionProcedure extends BossToolsModElements.ModElement {
	public AkivepotionProcedure(BossToolsModElements instance) {
		super(instance, 167);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure Akivepotion!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double Damage = 0;
		if ((new Object() {
			boolean check(LivingEntity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = _entity.getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == DamagePotionPotion.potion)
							return true;
					}
				}
				return false;
			}
		}.check((LivingEntity) entity))) {
			if (((new Object() {
				boolean check(LivingEntity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = _entity.getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == DamageRemovePotion.potion)
								return true;
						}
					}
					return false;
				}
			}.check((LivingEntity) entity)) == (false))) {
				entity.attackEntityFrom(DamageSource.WITHER, (float) 1);
			}
			if (((new Object() {
				boolean check(LivingEntity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = _entity.getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == DamageRemove2Potion.potion)
								return true;
						}
					}
					return false;
				}
			}.check((LivingEntity) entity)) == (false))) {
				entity.attackEntityFrom(DamageSource.WITHER, (float) 1);
			}
			if (((new Object() {
				boolean check(LivingEntity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = _entity.getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == DamageRemove3Potion.potion)
								return true;
						}
					}
					return false;
				}
			}.check((LivingEntity) entity)) == (false))) {
				entity.attackEntityFrom(DamageSource.WITHER, (float) 1);
			}
			if (((new Object() {
				boolean check(LivingEntity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = _entity.getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == DamageRemove4Potion.potion)
								return true;
						}
					}
					return false;
				}
			}.check((LivingEntity) entity)) == (false))) {
				entity.attackEntityFrom(DamageSource.WITHER, (float) 1);
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
