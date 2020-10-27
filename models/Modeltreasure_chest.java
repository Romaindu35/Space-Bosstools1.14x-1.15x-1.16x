// Made with Blockbench 3.6.6

public static class Modeltreasure_chest extends AnimatedEntityModel {

	private final AnimatedModelRenderer bone4;
	private final AnimatedModelRenderer bone;
	private final AnimatedModelRenderer bone2;
	private final AnimatedModelRenderer bone3_r1;
	private final AnimatedModelRenderer bone3;

	public Modeltreasure_chest() {
		textureWidth = 300;
		textureHeight = 300;
		bone4 = new AnimatedModelRenderer(this);
		bone4.setRotationPoint(0.0F, 24.0F, 0.0F);

		bone4.setModelRendererName("bone4");
		this.registerModelRenderer(bone4);

		bone = new AnimatedModelRenderer(this);
		bone.setRotationPoint(0.0F, -11.0F, 8.0F);
		bone4.addChild(bone);
		bone.setTextureOffset(0, 0).addBox(-11.0F, -5.0F, -16.0F, 22.0F, 5.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(0, 82).addBox(-11.0F, 0.0F, -15.5F, 22.0F, 2.0F, 0.0F, 0.0F, false);
		bone.setTextureOffset(0, 66).addBox(-10.75F, 0.0F, -15.5F, 0.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(0, 66).addBox(10.5F, 0.0F, -15.5F, 0.0F, 2.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(94, 1).addBox(-11.0F, -7.0F, -14.0F, 22.0F, 2.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(189, 0).addBox(-11.0F, -8.0F, -12.0F, 22.0F, 1.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(249, 17).addBox(-10.0F, -8.5F, -10.0F, 20.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(286, 0).addBox(-3.0F, -2.0F, -17.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(294, 7).addBox(-1.0F, -3.0F, -17.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 37).addBox(-2.0F, -1.0F, -17.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(28, 37).addBox(-2.0F, 2.0F, -18.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(59, 42).addBox(0.5F, 0.0F, -17.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(84, 44).addBox(-1.5F, 0.0F, -17.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setModelRendererName("bone");
		this.registerModelRenderer(bone);

		bone2 = new AnimatedModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(bone2);
		bone2.setTextureOffset(121, 41).addBox(-11.0F, -10.0F, -8.25F, 22.0F, 10.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(217, 47).addBox(-11.0F, -1.5F, -8.0F, 22.0F, 2.0F, 16.0F, 0.0F, false);
		bone2.setTextureOffset(280, 71).addBox(4.0F, -5.0F, 1.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);
		bone2.setTextureOffset(246, 89).addBox(-3.0F, -3.0F, 1.0F, 7.0F, 2.0F, 5.0F, 0.0F, false);
		bone2.setTextureOffset(178, 88).addBox(2.0F, -4.0F, -6.0F, 7.0F, 3.0F, 7.0F, 0.0F, false);
		bone2.setTextureOffset(113, 95).addBox(-10.0F, -5.0F, -6.0F, 8.0F, 4.0F, 4.0F, 0.0F, false);
		bone2.setTextureOffset(32, 115).addBox(-9.0F, -5.0F, -1.0F, 6.0F, 4.0F, 7.0F, 0.0F, false);
		bone2.setTextureOffset(0, 135).addBox(-11.0F, -10.0F, 6.25F, 22.0F, 10.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(66, 142).addBox(-11.25F, -10.0F, -7.0F, 2.0F, 10.0F, 15.0F, 0.0F, false);
		bone2.setTextureOffset(129, 150).addBox(9.25F, -10.0F, -7.0F, 2.0F, 10.0F, 15.0F, 0.0F, false);
		bone2.setTextureOffset(203, 160).addBox(9.5F, -11.0F, -8.5F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(257, 181).addBox(9.5F, -11.0F, 6.5F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(292, 194).addBox(-11.5F, -11.0F, 6.5F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(0, 222).addBox(-11.5F, -11.0F, -8.5F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(29, 226).addBox(-9.5F, -11.0F, -8.5F, 19.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(29, 234).addBox(-9.5F, -1.0F, -8.5F, 19.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(104, 234).addBox(-9.5F, -1.0F, 7.5F, 19.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(109, 248).addBox(-9.5F, -11.0F, 7.5F, 19.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(205, 246).addBox(4.5F, -12.0F, 7.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(218, 268).addBox(-6.5F, -12.0F, 7.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		bone2.setTextureOffset(266, 250).addBox(-11.5F, -11.0F, -6.5F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		bone2.setTextureOffset(272, 286).addBox(10.5F, -1.0F, -6.5F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		bone2.setTextureOffset(0, 286).addBox(-11.5F, -1.0F, -6.5F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		bone2.setTextureOffset(60, 286).addBox(10.5F, -11.0F, -6.5F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		bone2.setModelRendererName("bone2");
		this.registerModelRenderer(bone2);

		bone3_r1 = new AnimatedModelRenderer(this);
		bone3_r1.setRotationPoint(10.5F, -5.0F, -0.5F);
		bone2.addChild(bone3_r1);
		setRotationAngle(bone3_r1, 0.5672F, 0.0F, 0.0F);

		bone3_r1.setModelRendererName("bone3_r1");
		this.registerModelRenderer(bone3_r1);

		bone3 = new AnimatedModelRenderer(this);
		bone3.setRotationPoint(10.5F, -5.0F, -0.5F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, 0.5672F, 0.0F, 0.0F);
		bone3.setTextureOffset(124, 282).addBox(0.25F, -1.0F, -8.0F, 1.0F, 1.0F, 17.0F, 0.0F, false);
		bone3.setTextureOffset(207, 282).addBox(-22.25F, -1.0F, -8.0F, 1.0F, 1.0F, 17.0F, 0.0F, false);
		bone3.setModelRendererName("bone3");
		this.registerModelRenderer(bone3);

		this.rootBones.add(bone4);
	}

	@Override
	public ResourceLocation getAnimationFileLocation() {
		return new ResourceLocation("MODID", "animations/ANIMATIONFILE.json");
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}