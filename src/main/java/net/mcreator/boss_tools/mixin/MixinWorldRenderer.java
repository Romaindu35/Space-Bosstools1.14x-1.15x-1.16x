package net.mcreator.boss_tools.mixin;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.mcreator.boss_tools.world.dimension.MarsDimension;
import net.mcreator.boss_tools.world.dimension.MercuryDimension;
import net.mcreator.boss_tools.world.dimension.MoonDimension;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WorldRenderer.class)
public class MixinWorldRenderer {

    private static final ResourceLocation SUN_TEXTURES = new ResourceLocation("boss_tools", "textures/environment/sun.png");
    private static final ResourceLocation EARTH_TEXTURES = new ResourceLocation("boss_tools", "textures/environment/earth.png");
    private static final ResourceLocation PHOBOS_TEXTURES = new ResourceLocation("boss_tools", "textures/environment/phobos.png");
    private static final ResourceLocation SKY_TEXTURE = new ResourceLocation("boss_tools", "textures/environment/sky.png");
    private Minecraft mc = Minecraft.getInstance();

    @Inject(at = @At("HEAD"), method = "Lnet/minecraft/client/renderer/WorldRenderer;renderSky(Lcom/mojang/blaze3d/matrix/MatrixStack;F)V")
    public void renderSky(MatrixStack matrixStackIn, float partialTicks, CallbackInfo ci) {
        if (Minecraft.getInstance().world.dimension.getType() == MoonDimension.type) {
            this.renderSkyMoon(matrixStackIn, partialTicks);
        }
        if (Minecraft.getInstance().world.dimension.getType() == MarsDimension.type) {
            renderMarsSky(matrixStackIn, partialTicks);
        }
        if (Minecraft.getInstance().world.dimension.getType() == MercuryDimension.type) {
            renderSkyMercury(matrixStackIn, partialTicks);
        }
    }

    private void renderSkyMoon(MatrixStack matrixStack, float partialTicks) {
        ClientWorld world = mc.world;

        RenderSystem.disableTexture();
        Vec3d vector3d = world.getSkyColor(mc.gameRenderer.getActiveRenderInfo().getBlockPos(), partialTicks);
        float f = (float) vector3d.x;
        float f1 = (float) vector3d.y;
        float f2 = (float) vector3d.z;
        FogRenderer.applyFog();
        BufferBuilder bufferbuilder = Tessellator.getInstance().getBuffer();
        RenderSystem.depthMask(false);
        RenderSystem.enableFog();
        RenderSystem.color3f(f, f1, f2);
        mc.worldRenderer.skyVBO.bindBuffer();
        mc.worldRenderer.skyVertexFormat.setupBufferState(0L);
        mc.worldRenderer.skyVBO.draw(matrixStack.getLast().getMatrix(), 7);
        VertexBuffer.unbindBuffer();
        mc.worldRenderer.skyVertexFormat.clearBufferState();
        Matrix4f matrix4f1 = matrixStack.getLast().getMatrix();
        RenderSystem.enableAlphaTest();
        RenderSystem.enableTexture();
        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE,
                GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        RenderSystem.color4f(1f, 1f, 1f, 1f);
        mc.getTextureManager().bindTexture(SKY_TEXTURE);
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        bufferbuilder.pos(matrix4f1, -100, 8f, -100).tex(0.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, 100, 8f, -100).tex(1.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, 100, 8f, 100).tex(1.0F, 1.0F).endVertex();
        bufferbuilder.pos(matrix4f1, -100, 8f, 100).tex(0.0F, 1.0F).endVertex();
        bufferbuilder.finishDrawing();
        WorldVertexBufferUploader.draw(bufferbuilder);
        RenderSystem.disableTexture();
        RenderSystem.disableFog();
        RenderSystem.disableAlphaTest();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        float[] afloat = world.dimension.calcSunriseSunsetColors(world.getCelestialAngleRadians(partialTicks), partialTicks);
        if (afloat != null) {
            RenderSystem.disableTexture();
            RenderSystem.shadeModel(7425);
            matrixStack.push();
            matrixStack.rotate(Vector3f.XP.rotationDegrees(90.0F));
            float f3 = MathHelper.sin(world.getCelestialAngleRadians(partialTicks)) < 0.0F ? 180.0F : 0.0F;
            matrixStack.rotate(Vector3f.ZP.rotationDegrees(f3));
            matrixStack.rotate(Vector3f.ZP.rotationDegrees(90.0F));
            float f4 = afloat[0];
            float f5 = afloat[1];
            float f6 = afloat[2];
            Matrix4f matrix4f = matrixStack.getLast().getMatrix();
            bufferbuilder.begin(6, DefaultVertexFormats.POSITION_COLOR);
            bufferbuilder.pos(matrix4f, 0.0F, 100.0F, 0.0F).color(f4, f5, f6, afloat[3]).endVertex();
            for (int j = 0; j <= 16; ++j) {
                float f7 = (float) j * ((float) Math.PI * 2F) / 16.0F;
                float f8 = MathHelper.sin(f7);
                float f9 = MathHelper.cos(f7);
                bufferbuilder.pos(matrix4f, f8 * 120.0F, f9 * 120.0F, -f9 * 40.0F * afloat[3])
                        .color(afloat[0], afloat[1], afloat[2], 0.0F).endVertex();
            }
            bufferbuilder.finishDrawing();
            WorldVertexBufferUploader.draw(bufferbuilder);
            matrixStack.pop();
            RenderSystem.shadeModel(7424);
        }
        RenderSystem.enableTexture();
        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE,
                GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        matrixStack.push();
        float f11 = 100000.0F - world.getRainStrength(partialTicks);//Rrain basiss ist es auf 1.0F
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, f11);
        matrixStack.rotate(Vector3f.YP.rotationDegrees(-90.0F));
        matrixStack.rotate(Vector3f.XP.rotationDegrees(0.0F /*world.func_242415_f(partialTicks) * 360.0F */));
//Sun Rotation (Main Planet)
        matrix4f1 = matrixStack.getLast().getMatrix();
        float f12 = 30.0F;
        mc.getTextureManager().bindTexture(SUN_TEXTURES);
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        //bufferbuilder.pos(matrix4f1, -f12, 100.0F, -f12).tex(0.0F, 0.0F).endVertex();
        //bufferbuilder.pos(matrix4f1, f12, 100.0F, -f12).tex(1.0F, 0.0F).endVertex();
        //bufferbuilder.pos(matrix4f1, f12, 100.0F, f12).tex(1.0F, 1.0F).endVertex();
        //bufferbuilder.pos(matrix4f1, -f12, 100.0F, f12).tex(0.0F, 1.0F).endVertex();

        //new System (Sun main Planet)
        float f17 = (float) mc.player.getEyePosition(partialTicks).y /*- world.getWorldInfo().getVoidFogHeight()*/;
        bufferbuilder.pos(matrix4f1, -150.0F, -f17 -18.0F, 150.0F).tex(0.0F, 0.0F).endVertex(); //350 is nice but fps xD
        bufferbuilder.pos(matrix4f1, 150.0F, -f17 -18.0F, 150.0F).tex(1.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, 150.0F, -f17 -18.0F, -150.0F).tex(1.0F, 1.0F).endVertex();
        bufferbuilder.pos(matrix4f1, -150.0F, -f17 -18.0F, -150.0F).tex(0.0F, 1.0F).endVertex();
        bufferbuilder.finishDrawing();
        WorldVertexBufferUploader.draw(bufferbuilder);
        f12 = 20.0F;
        matrixStack.rotate(Vector3f.XP.rotationDegrees(world.getCelestialAngleRadians(partialTicks) * 360.0F ));//Moon Rotation (Sun Planet)
        mc.getTextureManager().bindTexture(EARTH_TEXTURES);
        int k = world.getMoonPhase();
        int l = k % 4;
        int i1 = k / 4 % 2;
        float f13 = (float) (l + 0) / 4.0F;
        float f14 = (float) (i1 + 0) / 2.0F;
        float f15 = (float) (l + 1) / 4.0F;
        float f16 = (float) (i1 + 1) / 2.0F;
        //New Orbit Planet System
        //float f17 = (float) mc.player.getEyePosition(partialTicks).y /*- world.getWorldInfo().getVoidFogHeight()*/;
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        // bufferbuilder.pos(matrix4f1, -f12, -100.0F, f12).tex(f15, f16).endVertex();
        //	bufferbuilder.pos(matrix4f1, f12, -100.0F, f12).tex(f13, f16).endVertex();
        // bufferbuilder.pos(matrix4f1, f12, -100.0F, -f12).tex(f13, f14).endVertex();
        //	bufferbuilder.pos(matrix4f1, -f12, -100.0F, -f12).tex(f15, f14).endVertex();
        //New System
							 	/*bufferbuilder.pos(matrix4f1, -300.0F, -f17 -18.0F, 300.0F).tex(f15, f16).endVertex(); //350 is nice but fps xD
						     	bufferbuilder.pos(matrix4f1, 300.0F, -f17 -18.0F, 300.0F).tex(f13, f16).endVertex();
						     	bufferbuilder.pos(matrix4f1, 300.0F, -f17 -18.0F, -300.0F).tex(f13, f14).endVertex();
						     	bufferbuilder.pos(matrix4f1, -300.0F, -f17 -18.0F, -300.0F).tex(f15, f14).endVertex();*/
        //moon Texture
        bufferbuilder.pos(matrix4f1, -f12, 100.0F, -f12).tex(0.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, f12, 100.0F, -f12).tex(1.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, f12, 100.0F, f12).tex(1.0F, 1.0F).endVertex();
        bufferbuilder.pos(matrix4f1, -f12, 100.0F, f12).tex(0.0F, 1.0F).endVertex();
        bufferbuilder.finishDrawing();
        WorldVertexBufferUploader.draw(bufferbuilder);
        RenderSystem.disableTexture();
        // f11 = 1000.0F;// Star Brightness
        float f10 = 1.0F;// world.getStarBrightness(partialTicks) * f11;
        // f11
        if (f10 > 0.0F) {
            RenderSystem.color4f(f10, f10, f10, f10);
            mc.worldRenderer.starVBO.bindBuffer();
            mc.worldRenderer.skyVertexFormat.setupBufferState(0L);
            mc.worldRenderer.starVBO.draw(matrixStack.getLast().getMatrix(), 7);
            VertexBuffer.unbindBuffer();
            mc.worldRenderer.skyVertexFormat.clearBufferState();
        }
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.disableBlend();
        RenderSystem.enableAlphaTest();
        RenderSystem.enableFog();
        matrixStack.pop();
        RenderSystem.disableTexture();
        RenderSystem.color3f(0.0F, 0.0F, 0.0F);
        double d0 = 2.0F;// mc.player.getEyePosition(partialTicks).y -
        // world.getWorldInfo().getVoidFogHeight();
        // This is the Player High When The Sky Removed zb. bei 60 blöcken
        if (d0 < 1.0D) {
            // 0.0D
            matrixStack.push();
            matrixStack.translate(0.0D, 12.0D, 0.0D);
            mc.worldRenderer.sky2VBO.bindBuffer();
            mc.worldRenderer.skyVertexFormat.setupBufferState(0L);
            mc.worldRenderer.sky2VBO.draw(matrixStack.getLast().getMatrix(), 7);
            VertexBuffer.unbindBuffer();
            mc.worldRenderer.skyVertexFormat.clearBufferState();
            matrixStack.pop();
        }
        //if (world.func_239132_a_().func_239216_b_()) {
        RenderSystem.color3f(f * 0.2F + 0.04F, f1 * 0.2F + 0.04F, f2 * 0.6F + 0.1F);
        //} else {
        //RenderSystem.color3f(f, f1, f2);
        //}
        RenderSystem.enableTexture();
        RenderSystem.depthMask(true);
        RenderSystem.disableFog();
    }

    public void renderMarsSky(MatrixStack matrixStack, float partialTicks) {

        ClientWorld world = mc.world;
        RenderSystem.disableTexture();
        Vec3d vector3d = world.getSkyColor(mc.gameRenderer.getActiveRenderInfo().getBlockPos(), partialTicks);
        float f = (float) vector3d.x;
        float f1 = (float) vector3d.y;
        float f2 = (float) vector3d.z;
        FogRenderer.applyFog();
        BufferBuilder bufferbuilder = Tessellator.getInstance().getBuffer();
        RenderSystem.depthMask(false);
        RenderSystem.enableFog();
        RenderSystem.color3f(f, f1, f2);
        mc.worldRenderer.skyVBO.bindBuffer();
        mc.worldRenderer.skyVertexFormat.setupBufferState(0L);
        mc.worldRenderer.skyVBO.draw(matrixStack.getLast().getMatrix(), 7);
        VertexBuffer.unbindBuffer();
        mc.worldRenderer.skyVertexFormat.clearBufferState();
        Matrix4f matrix4f1 = matrixStack.getLast().getMatrix();
        RenderSystem.enableAlphaTest();
        RenderSystem.enableTexture();
        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE,
                GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        RenderSystem.color4f(1f, 1f, 1f, 1f);
        mc.getTextureManager().bindTexture(SKY_TEXTURE);
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        bufferbuilder.pos(matrix4f1, -100, 8f, -100).tex(0.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, 100, 8f, -100).tex(1.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, 100, 8f, 100).tex(1.0F, 1.0F).endVertex();
        bufferbuilder.pos(matrix4f1, -100, 8f, 100).tex(0.0F, 1.0F).endVertex();
        bufferbuilder.finishDrawing();
        WorldVertexBufferUploader.draw(bufferbuilder);
        RenderSystem.disableTexture();
        RenderSystem.disableFog();
        RenderSystem.disableAlphaTest();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        float[] afloat = world.dimension.calcSunriseSunsetColors(world.getCelestialAngleRadians(partialTicks), partialTicks);
        if (afloat != null) {
            RenderSystem.disableTexture();
            RenderSystem.shadeModel(7425);
            matrixStack.push();
            matrixStack.rotate(Vector3f.XP.rotationDegrees(90.0F));
            float f3 = MathHelper.sin(world.getCelestialAngleRadians(partialTicks)) < 0.0F ? 180.0F : 0.0F;
            matrixStack.rotate(Vector3f.ZP.rotationDegrees(f3));
            matrixStack.rotate(Vector3f.ZP.rotationDegrees(90.0F));
            float f4 = afloat[0];
            float f5 = afloat[1];
            float f6 = afloat[2];
            Matrix4f matrix4f = matrixStack.getLast().getMatrix();
            bufferbuilder.begin(6, DefaultVertexFormats.POSITION_COLOR);
            bufferbuilder.pos(matrix4f, 0.0F, 100.0F, 0.0F).color(f4, f5, f6, afloat[3]).endVertex();
            for (int j = 0; j <= 16; ++j) {
                float f7 = (float) j * ((float) Math.PI * 2F) / 16.0F;
                float f8 = MathHelper.sin(f7);
                float f9 = MathHelper.cos(f7);
                bufferbuilder.pos(matrix4f, f8 * 120.0F, f9 * 120.0F, -f9 * 40.0F * afloat[3])
                        .color(afloat[0], afloat[1], afloat[2], 0.0F).endVertex();
            }
            bufferbuilder.finishDrawing();
            WorldVertexBufferUploader.draw(bufferbuilder);
            matrixStack.pop();
            RenderSystem.shadeModel(7424);
        }
        RenderSystem.enableTexture();
        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE,
                GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        matrixStack.push();
        float f11 = 100000.0F - world.getRainStrength(partialTicks);// Rrain basiss ist es auf
        // 1.0F
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, f11);
        matrixStack.rotate(Vector3f.YP.rotationDegrees(-90.0F));
        matrixStack.rotate(Vector3f.XP.rotationDegrees(world.getCelestialAngleRadians(partialTicks) * 360.0F));
        matrix4f1 = matrixStack.getLast().getMatrix();
        float f12 = 30.0F;
        mc.getTextureManager().bindTexture(SUN_TEXTURES);
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        bufferbuilder.pos(matrix4f1, -f12, 100.0F, -f12).tex(0.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, f12, 100.0F, -f12).tex(1.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, f12, 100.0F, f12).tex(1.0F, 1.0F).endVertex();
        bufferbuilder.pos(matrix4f1, -f12, 100.0F, f12).tex(0.0F, 1.0F).endVertex();
        bufferbuilder.finishDrawing();
        WorldVertexBufferUploader.draw(bufferbuilder);
        f12 = 20.0F;
        mc.getTextureManager().bindTexture(PHOBOS_TEXTURES);
        int k = world.getMoonPhase();
        int l = k % 4;
        int i1 = k / 4 % 2;
        float f13 = (float) (l + 0) / 4.0F;
        float f14 = (float) (i1 + 0) / 2.0F;
        float f15 = (float) (l + 1) / 4.0F;
        float f16 = (float) (i1 + 1) / 2.0F;
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        //	bufferbuilder.pos(matrix4f1, -f12, -100.0F, f12).tex(f15, f16).endVertex();
        //	bufferbuilder.pos(matrix4f1, f12, -100.0F, f12).tex(f13, f16).endVertex();
        //	bufferbuilder.pos(matrix4f1, f12, -100.0F, -f12).tex(f13, f14).endVertex();
        //	bufferbuilder.pos(matrix4f1, -f12, -100.0F, -f12).tex(f15, f14).endVertex();
        //New System
        //bufferbuilder.pos(matrix4f1, -f12, -100.0F, f12).tex(0.0F, 0.0F).endVertex();
        //bufferbuilder.pos(matrix4f1, f12, -100.0F, f12).tex(1.0F, 0.0F).endVertex();
        //bufferbuilder.pos(matrix4f1, f12, -100.0F, -f12).tex(1.0F, 1.0F).endVertex();
        //bufferbuilder.pos(matrix4f1, -f12, -100.0F, -f12).tex(0.0F, 1.0F).endVertex();
        //New System
        bufferbuilder.pos(matrix4f1, -10, -100.0F, 10).tex(0.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, 10, -100.0F, 10).tex(1.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, 10, -100.0F, -10).tex(1.0F, 1.0F).endVertex();
        bufferbuilder.pos(matrix4f1, -10, -100.0F, -10).tex(0.0F, 1.0F).endVertex();
        bufferbuilder.finishDrawing();
        WorldVertexBufferUploader.draw(bufferbuilder);
        RenderSystem.disableTexture();
        // f11 = 1000.0F;// Star Brightness
        float f10 = 1.0F;// world.getStarBrightness(partialTicks) * f11;
        // f11
        if (f10 > 0.0F) {
            RenderSystem.color4f(f10, f10, f10, f10);
            mc.worldRenderer.starVBO.bindBuffer();
            mc.worldRenderer.skyVertexFormat.setupBufferState(0L);
            mc.worldRenderer.starVBO.draw(matrixStack.getLast().getMatrix(), 7);
            VertexBuffer.unbindBuffer();
            mc.worldRenderer.skyVertexFormat.clearBufferState();
        }
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.disableBlend();
        RenderSystem.enableAlphaTest();
        RenderSystem.enableFog();
        matrixStack.pop();
        RenderSystem.disableTexture();
        RenderSystem.color3f(0.0F, 0.0F, 0.0F);
        double d0 = 2.0F;//mc.player.getEyePosition(partialTicks).y - world.getWorldInfo().getVoidFogHeight();
        if (d0 < 0.0D) {
            matrixStack.push();
            matrixStack.translate(0.0D, 12.0D, 0.0D);
            mc.worldRenderer.sky2VBO.bindBuffer();
            mc.worldRenderer.skyVertexFormat.setupBufferState(0L);
            mc.worldRenderer.sky2VBO.draw(matrixStack.getLast().getMatrix(), 7);
            VertexBuffer.unbindBuffer();
            mc.worldRenderer.skyVertexFormat.clearBufferState();
            matrixStack.pop();
        }
        //if (world.func_239132_a_().func_239216_b_()) {
            RenderSystem.color3f(f * 0.2F + 0.04F, f1 * 0.2F + 0.04F, f2 * 0.6F + 0.1F);
        /*} else {
            RenderSystem.color3f(f, f1, f2);
        }*/
        RenderSystem.enableTexture();
        RenderSystem.depthMask(true);
        RenderSystem.disableFog();
    }

    public void renderSkyMercury(MatrixStack matrixStack, float partialTicks) {

        ClientWorld world = mc.world;
        RenderSystem.disableTexture();
        Vec3d vector3d = world.getSkyColor(mc.gameRenderer.getActiveRenderInfo().getBlockPos(), partialTicks);
        float f = (float) vector3d.x;
        float f1 = (float) vector3d.y;
        float f2 = (float) vector3d.z;
        FogRenderer.applyFog();
        BufferBuilder bufferbuilder = Tessellator.getInstance().getBuffer();
        RenderSystem.depthMask(false);
        RenderSystem.enableFog();
        RenderSystem.color3f(f, f1, f2);
        mc.worldRenderer.skyVBO.bindBuffer();
        mc.worldRenderer.skyVertexFormat.setupBufferState(0L);
        mc.worldRenderer.skyVBO.draw(matrixStack.getLast().getMatrix(), 7);
        VertexBuffer.unbindBuffer();
        mc.worldRenderer.skyVertexFormat.clearBufferState();
        Matrix4f matrix4f1 = matrixStack.getLast().getMatrix();
        RenderSystem.enableAlphaTest();
        RenderSystem.enableTexture();
        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE,
                GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        RenderSystem.color4f(1f, 1f, 1f, 1f);
        mc.getTextureManager().bindTexture(SKY_TEXTURE);
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        bufferbuilder.pos(matrix4f1, -100, 8f, -100).tex(0.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, 100, 8f, -100).tex(1.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, 100, 8f, 100).tex(1.0F, 1.0F).endVertex();
        bufferbuilder.pos(matrix4f1, -100, 8f, 100).tex(0.0F, 1.0F).endVertex();
        bufferbuilder.finishDrawing();
        WorldVertexBufferUploader.draw(bufferbuilder);
        RenderSystem.disableTexture();
        RenderSystem.disableFog();
        RenderSystem.disableAlphaTest();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        float[] afloat = world.dimension.calcSunriseSunsetColors(world.getCelestialAngleRadians(partialTicks), partialTicks);
        if (afloat != null) {
            RenderSystem.disableTexture();
            RenderSystem.shadeModel(7425);
            matrixStack.push();
            matrixStack.rotate(Vector3f.XP.rotationDegrees(90.0F));
            float f3 = MathHelper.sin(world.getCelestialAngleRadians(partialTicks)) < 0.0F ? 180.0F : 0.0F;
            matrixStack.rotate(Vector3f.ZP.rotationDegrees(f3));
            matrixStack.rotate(Vector3f.ZP.rotationDegrees(90.0F));
            float f4 = afloat[0];
            float f5 = afloat[1];
            float f6 = afloat[2];
            Matrix4f matrix4f = matrixStack.getLast().getMatrix();
            bufferbuilder.begin(6, DefaultVertexFormats.POSITION_COLOR);
            bufferbuilder.pos(matrix4f, 0.0F, 100.0F, 0.0F).color(f4, f5, f6, afloat[3]).endVertex();
            for (int j = 0; j <= 16; ++j) {
                float f7 = (float) j * ((float) Math.PI * 2F) / 16.0F;
                float f8 = MathHelper.sin(f7);
                float f9 = MathHelper.cos(f7);
                bufferbuilder.pos(matrix4f, f8 * 120.0F, f9 * 120.0F, -f9 * 40.0F * afloat[3])
                        .color(afloat[0], afloat[1], afloat[2], 0.0F).endVertex();
            }
            bufferbuilder.finishDrawing();
            WorldVertexBufferUploader.draw(bufferbuilder);
            matrixStack.pop();
            RenderSystem.shadeModel(7424);
        }
        RenderSystem.enableTexture();
        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE,
                GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        matrixStack.push();
        float f11 = 100000.0F - world.getRainStrength(partialTicks);// Rrain basiss ist es auf
        // 1.0F
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, f11);
        matrixStack.rotate(Vector3f.YP.rotationDegrees(-90.0F));
        matrixStack.rotate(Vector3f.XP.rotationDegrees(world.getCelestialAngleRadians(partialTicks) * 360.0F));
        matrix4f1 = matrixStack.getLast().getMatrix();
        float f12 = 30.0F;
        mc.getTextureManager().bindTexture(SUN_TEXTURES);
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        bufferbuilder.pos(matrix4f1, -60, 100.0F, -60).tex(0.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, 60, 100.0F, -60).tex(1.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, 60, 100.0F, 60).tex(1.0F, 1.0F).endVertex();
        bufferbuilder.pos(matrix4f1, -60, 100.0F, 60).tex(0.0F, 1.0F).endVertex();
        bufferbuilder.finishDrawing();
        WorldVertexBufferUploader.draw(bufferbuilder);
        f12 = 20.0F;
        mc.getTextureManager().bindTexture(SKY_TEXTURE);
        int k = world.getMoonPhase();
        int l = k % 4;
        int i1 = k / 4 % 2;
        float f13 = (float) (l + 0) / 4.0F;
        float f14 = (float) (i1 + 0) / 2.0F;
        float f15 = (float) (l + 1) / 4.0F;
        float f16 = (float) (i1 + 1) / 2.0F;
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        //	bufferbuilder.pos(matrix4f1, -f12, -100.0F, f12).tex(f15, f16).endVertex();
        //	bufferbuilder.pos(matrix4f1, f12, -100.0F, f12).tex(f13, f16).endVertex();
        //	bufferbuilder.pos(matrix4f1, f12, -100.0F, -f12).tex(f13, f14).endVertex();
        //	bufferbuilder.pos(matrix4f1, -f12, -100.0F, -f12).tex(f15, f14).endVertex();
        //New System
        bufferbuilder.pos(matrix4f1, -f12, -100.0F, f12).tex(0.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, f12, -100.0F, f12).tex(1.0F, 0.0F).endVertex();
        bufferbuilder.pos(matrix4f1, f12, -100.0F, -f12).tex(1.0F, 1.0F).endVertex();
        bufferbuilder.pos(matrix4f1, -f12, -100.0F, -f12).tex(0.0F, 1.0F).endVertex();
        bufferbuilder.finishDrawing();
        WorldVertexBufferUploader.draw(bufferbuilder);
        RenderSystem.disableTexture();
        // f11 = 1000.0F;// Star Brightness
        float f10 = 1.0F;// world.getStarBrightness(partialTicks) * f11;
        // f11
        if (f10 > 0.0F) {
            RenderSystem.color4f(f10, f10, f10, f10);
            mc.worldRenderer.starVBO.bindBuffer();
            mc.worldRenderer.skyVertexFormat.setupBufferState(0L);
            mc.worldRenderer.starVBO.draw(matrixStack.getLast().getMatrix(), 7);
            VertexBuffer.unbindBuffer();
            mc.worldRenderer.skyVertexFormat.clearBufferState();
        }
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.disableBlend();
        RenderSystem.enableAlphaTest();
        RenderSystem.enableFog();
        matrixStack.pop();
        RenderSystem.disableTexture();
        RenderSystem.color3f(0.0F, 0.0F, 0.0F);
        double d0 = 2.0F;//mc.player.getEyePosition(partialTicks).y - world.getWorldInfo().getVoidFogHeight();
        if (d0 < 0.0D) {
            matrixStack.push();
            matrixStack.translate(0.0D, 12.0D, 0.0D);
            mc.worldRenderer.sky2VBO.bindBuffer();
            mc.worldRenderer.skyVertexFormat.setupBufferState(0L);
            mc.worldRenderer.sky2VBO.draw(matrixStack.getLast().getMatrix(), 7);
            VertexBuffer.unbindBuffer();
            mc.worldRenderer.skyVertexFormat.clearBufferState();
            matrixStack.pop();
        }
        //if (world.func_239132_a_().func_239216_b_()) {
            RenderSystem.color3f(f * 0.2F + 0.04F, f1 * 0.2F + 0.04F, f2 * 0.6F + 0.1F);
        /*} else {
            RenderSystem.color3f(f, f1, f2);
        }*/
        RenderSystem.enableTexture();
        RenderSystem.depthMask(true);
        RenderSystem.disableFog();
    }

}