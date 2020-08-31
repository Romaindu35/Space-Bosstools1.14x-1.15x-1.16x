
package net.mcreator.boss_tools.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.wrapper.EntityHandsInvWrapper;
import net.minecraftforge.items.wrapper.EntityArmorInvWrapper;
import net.minecraftforge.items.wrapper.CombinedInvWrapper;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.Direction;
import net.minecraft.util.DamageSource;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.IPacket;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.boss_tools.procedures.Rocketrightclicktir2Procedure;
import net.mcreator.boss_tools.procedures.Rockethurtentity2Procedure;
import net.mcreator.boss_tools.procedures.RocketOnEntityTicktier2Procedure;
import net.mcreator.boss_tools.gui.RocketTier2GuiFuelGui;
import net.mcreator.boss_tools.BossToolsModElements;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import java.util.Map;
import java.util.HashMap;

import io.netty.buffer.Unpooled;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@BossToolsModElements.ModElement.Tag
public class RocketTier2Entity extends BossToolsModElements.ModElement {
	public static EntityType entity = null;
	public RocketTier2Entity(BossToolsModElements instance) {
		super(instance, 8);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@Override
	public void initElements() {
		entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER).setShouldReceiveVelocityUpdates(true)
				.setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).size(1f, 4f)).build("rocket_tier_2")
						.setRegistryName("rocket_tier_2");
		elements.entities.add(() -> entity);
	}

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(entity, renderManager -> {
			return new MobRenderer(renderManager, new ModelRocketTier2(), 0.5f) {
				@Override
				public ResourceLocation getEntityTexture(Entity entity) {
					return new ResourceLocation("boss_tools:textures/rockettier2new.png");
				}
			};
		});
	}
	public static class CustomEntity extends CreatureEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 5;
			setNoAI(false);
			enablePersistence();
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public boolean canDespawn(double distanceToClosestPlayer) {
			return false;
		}

		@Override
		public double getMountedYOffset() {
			return super.getMountedYOffset() + -2.1;
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity entity = this;
			Entity sourceentity = source.getTrueSource();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				Rockethurtentity2Procedure.executeProcedure($_dependencies);
			}
			return super.attackEntityFrom(source, amount);
		}
		private final ItemStackHandler inventory = new ItemStackHandler(9) {
			@Override
			public int getSlotLimit(int slot) {
				return 64;
			}
		};
		private final CombinedInvWrapper combined = new CombinedInvWrapper(inventory, new EntityHandsInvWrapper(this),
				new EntityArmorInvWrapper(this));
		@Override
		public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, @Nullable Direction side) {
			if (this.isAlive() && capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && side == null)
				return LazyOptional.of(() -> combined).cast();
			return super.getCapability(capability, side);
		}

		@Override
		protected void dropInventory() {
			super.dropInventory();
			for (int i = 0; i < inventory.getSlots(); ++i) {
				ItemStack itemstack = inventory.getStackInSlot(i);
				if (!itemstack.isEmpty() && !EnchantmentHelper.hasVanishingCurse(itemstack)) {
					this.entityDropItem(itemstack);
				}
			}
		}

		@Override
		public void writeAdditional(CompoundNBT compound) {
			super.writeAdditional(compound);
			compound.put("InventoryCustom", inventory.serializeNBT());
		}

		@Override
		public void readAdditional(CompoundNBT compound) {
			super.readAdditional(compound);
			INBT inventoryCustom = compound.get("InventoryCustom");
			if (inventoryCustom instanceof CompoundNBT)
				inventory.deserializeNBT((CompoundNBT) inventoryCustom);
		}

		@Override
		public boolean processInteract(PlayerEntity sourceentity, Hand hand) {
			ItemStack itemstack = sourceentity.getHeldItem(hand);
			boolean retval = true;
			if (sourceentity.isSecondaryUseActive()) {
				if (sourceentity instanceof ServerPlayerEntity) {
					NetworkHooks.openGui((ServerPlayerEntity) sourceentity, new INamedContainerProvider() {
						@Override
						public ITextComponent getDisplayName() {
							return new StringTextComponent("Rocket");
						}

						@Override
						public Container createMenu(int id, PlayerInventory inventory, PlayerEntity player) {
							PacketBuffer packetBuffer = new PacketBuffer(Unpooled.buffer());
							packetBuffer.writeBlockPos(new BlockPos(sourceentity));
							packetBuffer.writeByte(0);
							packetBuffer.writeVarInt(CustomEntity.this.getEntityId());
							return new RocketTier2GuiFuelGui.GuiContainerMod(id, inventory, packetBuffer);
						}
					}, buf -> {
						buf.writeBlockPos(new BlockPos(sourceentity));
						buf.writeByte(0);
						buf.writeVarInt(this.getEntityId());
					});
				}
				return true;
			}
			super.processInteract(sourceentity, hand);
			sourceentity.startRiding(this);
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				Rocketrightclicktir2Procedure.executeProcedure($_dependencies);
			}
			return retval;
		}

		@Override
		public void baseTick() {
			super.baseTick();
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity entity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				RocketOnEntityTicktier2Procedure.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void registerAttributes() {
			super.registerAttributes();
			if (this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
				this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
				this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1000);
			if (this.getAttribute(SharedMonsterAttributes.ARMOR) != null)
				this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0);
			if (this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) == null)
				this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0);
		}
	}

	// Made with Blockbench 3.5.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelRocketTier2 extends EntityModel<Entity> {
		private final ModelRenderer Rocket;
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		public ModelRocketTier2() {
			textureWidth = 512;
			textureHeight = 256;
			Rocket = new ModelRenderer(this);
			Rocket.setRotationPoint(0.0F, 24.0F, 0.0F);
			Rocket.setTextureOffset(273, 90).addBox(4.0F, -36.0F, -8.0F, 3.0F, 7.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(85, 46).addBox(3.0F, -36.0F, -8.1F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(86, 47).addBox(-4.0F, -36.0F, -8.1F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(87, 52).addBox(-3.0F, -36.0F, -8.1F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(89, 52).addBox(-3.0F, -30.0F, -8.1F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(279, 130).addBox(-7.0F, -36.0F, -8.0F, 3.0F, 7.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(275, 80).addBox(-7.0F, -29.0F, -8.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(275, 82).addBox(-7.0F, -41.0F, -8.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(275, 82).addBox(-7.0F, -41.0F, 7.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(274, 84).addBox(-7.0F, -46.0F, -8.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(275, 82).addBox(-7.0F, -46.0F, 7.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(274, 85).addBox(-7.0F, -51.0F, -8.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(275, 80).addBox(-7.0F, -51.0F, 7.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(276, 135).addBox(-7.0F, -24.0F, -8.0F, 14.0F, 19.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(136, 136).addBox(-2.0F, -14.0F, -12.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			Rocket.setTextureOffset(136, 136).addBox(-12.0F, -14.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			Rocket.setTextureOffset(136, 136).addBox(-2.0F, -14.0F, 8.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			Rocket.setTextureOffset(136, 136).addBox(8.0F, -14.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			Rocket.setTextureOffset(73, 156).addBox(-2.0F, -15.0F, -12.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Rocket.setTextureOffset(73, 156).addBox(-12.0F, -15.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Rocket.setTextureOffset(73, 156).addBox(-2.0F, -15.0F, 8.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Rocket.setTextureOffset(73, 156).addBox(8.0F, -15.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Rocket.setTextureOffset(73, 134).addBox(-2.0F, -16.0F, -12.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Rocket.setTextureOffset(73, 134).addBox(-12.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Rocket.setTextureOffset(73, 134).addBox(-2.0F, -16.0F, 8.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Rocket.setTextureOffset(73, 134).addBox(8.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Rocket.setTextureOffset(57, 137).addBox(-0.5F, -9.0F, -12.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(57, 137).addBox(-12.1F, -9.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(57, 137).addBox(-0.5F, -9.0F, 11.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(57, 137).addBox(11.1F, -9.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(57, 137).addBox(-2.1F, -9.0F, -10.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(57, 137).addBox(-10.5F, -9.0F, 1.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(57, 137).addBox(1.1F, -9.0F, 9.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(57, 137).addBox(9.5F, -9.0F, -2.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(57, 137).addBox(1.1F, -9.0F, -10.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(57, 137).addBox(-10.5F, -9.0F, -2.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(57, 137).addBox(-2.1F, -9.0F, 9.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(57, 137).addBox(9.5F, -9.0F, 1.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(57, 137).addBox(-0.5F, -9.0F, -12.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(279, 120).addBox(-7.0F, -36.0F, 7.0F, 14.0F, 31.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(276, 107).addBox(-8.0F, -36.0F, -7.0F, 1.0F, 31.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(275, 68).addBox(7.0F, -39.0F, -7.0F, 1.0F, 3.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(274, 81).addBox(-8.0F, -39.0F, -7.0F, 1.0F, 3.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(275, 68).addBox(7.0F, -42.0F, -7.0F, 1.0F, 3.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(274, 80).addBox(-8.0F, -42.0F, -7.0F, 1.0F, 3.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(275, 68).addBox(7.0F, -45.0F, -7.0F, 1.0F, 3.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(275, 76).addBox(-8.0F, -45.0F, -7.0F, 1.0F, 3.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(275, 68).addBox(7.0F, -48.0F, -7.0F, 1.0F, 3.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(275, 68).addBox(-8.0F, -48.0F, -7.0F, 1.0F, 3.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(275, 68).addBox(7.0F, -51.0F, -7.0F, 1.0F, 3.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(275, 68).addBox(-8.0F, -51.0F, -7.0F, 1.0F, 3.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(307, 78).addBox(-8.0F, -37.0F, -8.0F, 1.0F, 32.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(307, 78).addBox(-8.0F, -37.0F, 7.0F, 1.0F, 32.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(37, 23).addBox(-7.0F, -52.0F, 7.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(37, 23).addBox(-7.0F, -52.0F, -8.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(29, 17).addBox(-8.0F, -52.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(29, 17).addBox(7.0F, -52.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(307, 78).addBox(7.0F, -37.0F, 7.0F, 1.0F, 32.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(307, 78).addBox(7.0F, -52.0F, 7.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(307, 78).addBox(-8.0F, -52.0F, 7.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(307, 78).addBox(-8.0F, -52.0F, -8.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(307, 78).addBox(7.0F, -52.0F, -8.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(307, 78).addBox(7.0F, -37.0F, -8.0F, 1.0F, 32.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(276, 110).addBox(7.0F, -36.0F, -7.0F, 1.0F, 31.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(33, 87).addBox(4.0F, -53.0F, -7.0F, 2.0F, 1.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(33, 87).addBox(6.0F, -53.0F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
			Rocket.setTextureOffset(33, 87).addBox(-7.0F, -53.0F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-7.0F, -53.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(6.0F, -53.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(5.0F, -54.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(5.0F, -55.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(4.0F, -57.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(4.0F, -56.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(4.0F, -57.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(4.0F, -56.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-5.0F, -57.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-4.0F, -59.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-3.0F, -61.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-3.0F, -60.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(2.0F, -61.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(2.0F, -60.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-3.0F, -61.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-2.0F, -62.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-2.0F, -63.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-2.0F, -62.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-2.0F, -63.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(1.0F, -62.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(1.0F, -63.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(1.0F, -62.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(1.0F, -63.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-3.0F, -60.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(2.0F, -61.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(2.0F, -60.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-4.0F, -58.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-4.0F, -59.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-4.0F, -58.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(3.0F, -59.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(3.0F, -58.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(3.0F, -59.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(3.0F, -58.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-5.0F, -56.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-5.0F, -57.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-5.0F, -56.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-6.0F, -54.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-6.0F, -55.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(5.0F, -54.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(5.0F, -55.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-6.0F, -54.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-6.0F, -55.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(-7.0F, -53.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(249, 94).addBox(6.0F, -53.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(31, 17).addBox(4.0F, -5.0F, -8.0F, 4.0F, 1.0F, 16.0F, 0.0F, false);
			Rocket.setTextureOffset(31, 17).addBox(3.0F, -52.0F, -7.0F, 4.0F, 1.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(64, 5).addBox(-1.0F, -80.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Rocket.setTextureOffset(500, 146).addBox(-1.0F, -78.0F, -1.0F, 2.0F, 15.0F, 2.0F, 0.0F, false);
			Rocket.setTextureOffset(64, 102).addBox(-1.0F, -62.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			Rocket.setTextureOffset(64, 102).addBox(-1.0F, -63.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			Rocket.setTextureOffset(64, 102).addBox(-2.0F, -62.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Rocket.setTextureOffset(64, 102).addBox(-2.0F, -63.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Rocket.setTextureOffset(64, 102).addBox(1.0F, -62.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Rocket.setTextureOffset(64, 102).addBox(1.0F, -63.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			Rocket.setTextureOffset(88, 110).addBox(-3.0F, -61.0F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			Rocket.setTextureOffset(88, 110).addBox(-3.0F, -60.0F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			Rocket.setTextureOffset(88, 110).addBox(-2.0F, -61.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(88, 110).addBox(-2.0F, -60.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(88, 110).addBox(-2.0F, -61.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(88, 110).addBox(-2.0F, -60.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(88, 88).addBox(-3.0F, -59.0F, -4.0F, 6.0F, 1.0F, 8.0F, 0.0F, false);
			Rocket.setTextureOffset(88, 88).addBox(-3.0F, -58.0F, -4.0F, 6.0F, 1.0F, 8.0F, 0.0F, false);
			Rocket.setTextureOffset(88, 88).addBox(3.0F, -59.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Rocket.setTextureOffset(88, 88).addBox(3.0F, -58.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Rocket.setTextureOffset(88, 88).addBox(-4.0F, -59.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Rocket.setTextureOffset(88, 88).addBox(-4.0F, -58.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Rocket.setTextureOffset(75, 97).addBox(-4.0F, -57.0F, -5.0F, 8.0F, 1.0F, 10.0F, 0.0F, false);
			Rocket.setTextureOffset(75, 97).addBox(-4.0F, -56.0F, -5.0F, 8.0F, 1.0F, 10.0F, 0.0F, false);
			Rocket.setTextureOffset(75, 97).addBox(-5.0F, -57.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			Rocket.setTextureOffset(75, 97).addBox(-5.0F, -56.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			Rocket.setTextureOffset(75, 97).addBox(4.0F, -57.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			Rocket.setTextureOffset(75, 97).addBox(4.0F, -56.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			Rocket.setTextureOffset(65, 106).addBox(-5.0F, -54.0F, -6.0F, 10.0F, 1.0F, 12.0F, 0.0F, false);
			Rocket.setTextureOffset(65, 106).addBox(-5.0F, -55.0F, -6.0F, 10.0F, 1.0F, 12.0F, 0.0F, false);
			Rocket.setTextureOffset(65, 106).addBox(-6.0F, -54.0F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			Rocket.setTextureOffset(65, 106).addBox(-6.0F, -55.0F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			Rocket.setTextureOffset(65, 106).addBox(5.0F, -54.0F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			Rocket.setTextureOffset(65, 106).addBox(5.0F, -55.0F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			Rocket.setTextureOffset(66, 94).addBox(-6.0F, -53.0F, -7.0F, 10.0F, 1.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(416, 22).addBox(-7.0F, -5.0F, -6.0F, 11.0F, 1.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(30, 14).addBox(-7.0F, -52.0F, -7.0F, 10.0F, 1.0F, 14.0F, 0.0F, false);
			Rocket.setTextureOffset(43, 17).addBox(-7.0F, -5.0F, -8.0F, 11.0F, 1.0F, 2.0F, 0.0F, false);
			Rocket.setTextureOffset(27, 15).addBox(-8.0F, -5.0F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
			Rocket.setTextureOffset(33, 23).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			Rocket.setTextureOffset(30, 23).addBox(-3.0F, -3.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Rocket.setTextureOffset(14, 2).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 0.0F, 6.0F, 0.0F, false);
			Rocket.setTextureOffset(33, 29).addBox(-4.0F, -2.0F, 3.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(37, 26).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(45, 20).addBox(3.0F, -2.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Rocket.setTextureOffset(37, 20).addBox(-4.0F, -2.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Rocket.setTextureOffset(34, 17).addBox(2.0F, -3.0F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			Rocket.setTextureOffset(39, 26).addBox(-2.0F, -3.0F, 2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(65, 5).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			Rocket.setTextureOffset(72, 7).addBox(-2.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(68, 7).addBox(0.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(65, 7).addBox(1.0F, -3.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(65, 5).addBox(-2.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(59, 7).addBox(1.0F, -3.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(40, 11).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(34, 30).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(32, 16).addBox(-5.0F, -1.0F, 4.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
			Rocket.setTextureOffset(34, 23).addBox(4.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			Rocket.setTextureOffset(34, 17).addBox(-5.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(8.0F, 0.0F, 3.0F);
			Rocket.addChild(bone);
			setRotationAngle(bone, 0.0F, 0.8727F, 0.0F);
			bone.setTextureOffset(43, 17).addBox(7.0F, -11.0F, -8.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(43, 17).addBox(10.0F, -9.0F, -8.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(43, 17).addBox(9.0F, -10.0F, -8.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(43, 17).addBox(11.0F, -7.0F, -8.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(43, 17).addBox(12.0F, -7.0F, -8.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(43, 17).addBox(13.0F, -11.0F, -8.0F, 1.0F, 13.0F, 2.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(8.0F, 0.0F, 3.0F);
			Rocket.addChild(bone2);
			setRotationAngle(bone2, 0.0F, 0.8727F, 0.0F);
			bone2.setTextureOffset(43, 17).addBox(-14.8917F, -11.0F, -9.9549F, 2.0F, 6.0F, 2.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-4.8F, -11.0F, 2.1117F, 2.0F, 6.0F, 2.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-2.9F, -11.0F, -19.8502F, 2.0F, 6.0F, 2.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-16.8917F, -9.0F, -9.9549F, 1.0F, 6.0F, 2.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-4.8F, -9.0F, 5.1117F, 2.0F, 6.0F, 1.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-2.9F, -9.0F, -21.8502F, 2.0F, 6.0F, 1.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-15.8917F, -10.0F, -9.9549F, 1.0F, 6.0F, 2.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-4.8F, -10.0F, 4.1117F, 2.0F, 6.0F, 1.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-2.9F, -10.0F, -20.8502F, 2.0F, 6.0F, 1.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-17.8917F, -7.0F, -9.9549F, 1.0F, 6.0F, 2.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-4.8F, -7.0F, 6.1117F, 2.0F, 6.0F, 1.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-2.9F, -7.0F, -22.8502F, 2.0F, 6.0F, 1.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-18.8917F, -7.0F, -9.9549F, 1.0F, 7.0F, 2.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-4.8F, -7.0F, 7.1117F, 2.0F, 7.0F, 1.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-2.9F, -7.0F, -23.8502F, 2.0F, 7.0F, 1.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-19.8917F, -11.0F, -9.9549F, 1.0F, 13.0F, 2.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-4.8F, -11.0F, 8.1117F, 2.0F, 13.0F, 1.0F, 0.0F, true);
			bone2.setTextureOffset(43, 17).addBox(-2.9F, -11.0F, -24.8502F, 2.0F, 13.0F, 1.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Rocket.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
