package net.mcreator.boss_tools.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.boss_tools.potion.DamageRemove2Potion;
import net.mcreator.boss_tools.potion.DamagePotionPotion;
import net.mcreator.boss_tools.BossToolsModElements;

import java.util.Map;
import java.util.Collection;

@BossToolsModElements.ModElement.Tag
public class SpaceArmorBodyTickEventProcedure extends BossToolsModElements.ModElement {
	public SpaceArmorBodyTickEventProcedure(BossToolsModElements instance) {
		super(instance, 170);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SpaceArmorBodyTickEvent!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				System.err.println("Failed to load dependency itemstack for procedure SpaceArmorBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
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
			if ((((itemstack).getOrCreateTag().getDouble("Energy")) > 0)) {
				(itemstack).getOrCreateTag().putDouble("Energy", (((itemstack).getOrCreateTag().getDouble("Energy")) - 1));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(DamageRemove2Potion.potion, (int) 2, (int) 1, (false), (false)));
			}
		}
		if ((((itemstack).getOrCreateTag().getDouble("Energy")) == 1000)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7cWARNING! \u00A761000 \u00A79Oxygen!"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7cWARNING! \u00A761000 \u00A79Oxygen!"), (true));
			}
		}
		if ((((itemstack).getOrCreateTag().getDouble("Energy")) == 1)) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7cWARNING! \u00A760 \u00A79Oxygen!"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7cWARNING! \u00A760 \u00A79Oxygen!"), (true));
			}
		}
	}
}
