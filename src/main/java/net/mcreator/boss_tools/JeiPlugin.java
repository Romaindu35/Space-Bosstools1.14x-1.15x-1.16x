/**
 * This mod element is always locked. Enter your code in the methods below.
 * If you don't need some of these methods, you can remove them as they
 * are overrides of the base class BossToolsModElements.ModElement.
 *
 * You can register new events in this class too.
 *
 * As this class is loaded into mod element list, it NEEDS to extend
 * ModElement class. If you remove this extend statement or remove the
 * constructor, the compilation will fail.
 *
 * If you want to make a plain independent class, create it in
 * "Workspace" -> "Source" menu.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
*/
package net.mcreator.boss_tools;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.helpers.IJeiHelpers;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
//workbench
import net.mcreator.boss_tools.block.WorkbenchBlock;
//Generator
import net.mcreator.boss_tools.block.GeneratorBlock;
//New maschine
import net.mcreator.boss_tools.block.OxygenGeneratorBlock;
//old
import net.mcreator.boss_tools.block.OxygenMachineBlock;
//Compressor
import net.mcreator.boss_tools.block.CompressorBlock;
//Space Armor100item
import net.mcreator.boss_tools.item.SpaceArmorItem;
//Commpressedsteel
import net.mcreator.boss_tools.item.CompressesteelItem;
//CompressedTinItem
import net.mcreator.boss_tools.item.CompressedTinItem;
//MotorItem
import net.mcreator.boss_tools.item.MotorItem;
//OxygenTank Item
import net.mcreator.boss_tools.item.OxygenTankItem;
//MotorItem Tier2
import net.mcreator.boss_tools.item.MotorTier2Item;
//BlastFurnace
import net.mcreator.boss_tools.block.BlastingFurnaceBlock;
//steel
import net.mcreator.boss_tools.item.SteahlItem;
//Tin
import net.mcreator.boss_tools.item.MoonCopperingotItem;
//Turbineitem
import net.mcreator.boss_tools.item.TurbineItem;
//TurbineTier2 Item
import net.mcreator.boss_tools.item.TurbineTier2Item;
//RocketFinsItems
import net.mcreator.boss_tools.item.RocketfinsItem;
//RocketItem
import net.mcreator.boss_tools.block.RocketItemBlock; //wichtig Vergissnicht das .block ...
//Rocket Tier 2 Item
import net.mcreator.boss_tools.block.RocketItemtir2Block;
//Rocket Tier 3 item
import net.mcreator.boss_tools.block.RocketItemTier3Block;
//CompressedSilicon
import net.mcreator.boss_tools.item.CompressedsiliconItem;
//SliconIngotItem
import net.mcreator.boss_tools.item.SiliconIngotItem;
//Engine Tier 3
import net.mcreator.boss_tools.item.EngineTier3Item;
//Tank Tier 3
import net.mcreator.boss_tools.item.TankTier3Item;
//FuelBucket
import net.mcreator.boss_tools.item.FuelBuckedItem;
//Big Fuel Bucket
import net.mcreator.boss_tools.item.FuelBucketBigItem;
//RocketNose
import net.mcreator.boss_tools.item.RocketNoseItem;
//OxygenMachine
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.items.wrapper.SidedInvWrapper;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;



import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.trees.OakTree;

@mezz.jei.api.JeiPlugin
public class JeiPlugin implements IModPlugin {
	public static IJeiHelpers jeiHelper;
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("boss_tools", "default");
	}

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        jeiHelper = registration.getJeiHelpers();
        registration.addRecipeCategories(new OxygenMachineJeiCategory(jeiHelper.getGuiHelper()));
        //Neue maschine
        registration.addRecipeCategories(new OxygenGeneratorJeiCategory(jeiHelper.getGuiHelper()));
        //Genrator
        registration.addRecipeCategories(new GeneratorJeiCategory(jeiHelper.getGuiHelper()));
        //workbench
        registration.addRecipeCategories(new WorkbenchJeiCategory(jeiHelper.getGuiHelper()));
        //BlastFurnace
        registration.addRecipeCategories(new BlastingFurnaceJeiCategory(jeiHelper.getGuiHelper()));
        //RocketTier1Gui
        registration.addRecipeCategories(new RocketItemBlockJeiCategory(jeiHelper.getGuiHelper())); 
        //RocketTier2Gui
        registration.addRecipeCategories(new RocketItemtir2BlockJeiCategory(jeiHelper.getGuiHelper()));
		//RocketItem3Gui
        registration.addRecipeCategories(new RocketItemTier3BlockJeiCategory(jeiHelper.getGuiHelper()));
        //Compressor
        registration.addRecipeCategories(new CompressorJeiCategory(jeiHelper.getGuiHelper()));
    }
    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addRecipes(generateOxygenMachineRecipes(), OxygenMachineJeiCategory.Uid);
        //Neue maschine
        registration.addRecipes(generateOxygenGeneratorRecipes(), OxygenGeneratorJeiCategory.Uid);
        //Generator
        registration.addRecipes(generateGeneratorRecipes(), GeneratorJeiCategory.Uid);
        //workbench
        registration.addRecipes(generateWorkbenchRecipes(), WorkbenchJeiCategory.Uid);
		//workbench Tier 2
        registration.addRecipes(generateWorkbenchRecipes2(), WorkbenchJeiCategory.Uid);
        //workbench Tier 3
        registration.addRecipes(generateWorkbenchRecipes3(), WorkbenchJeiCategory.Uid);
        //BlastFurnace
        registration.addRecipes(generateBlastingFurnaceRecipes(), BlastingFurnaceJeiCategory.Uid);
        //RocketTier1Gui
        registration.addRecipes(generateRocketItemBlockRecipes(), RocketItemBlockJeiCategory.Uid);
        //RocketTier2Gui
        registration.addRecipes(generateRocketItemtir2BlockRecipes(), RocketItemtir2BlockJeiCategory.Uid);
        //RocketTier3Gui
        registration.addRecipes(generateRocketItemTier3BlockRecipes(), RocketItemTier3BlockJeiCategory.Uid);
        //Compressor
        registration.addRecipes(generateCompressorRecipes(), CompressorJeiCategory.Uid);
        //Compresor 2 Recpie
        registration.addRecipes(generateCompressorRecipes2(), CompressorJeiCategory.Uid);
        //Compressor 3 Recpie
        registration.addRecipes(generateCompressorRecipes3(), CompressorJeiCategory.Uid);
        // ...
    }

    private List<OxygenMachineJeiCategory.OxygenMachineRecipeWrapper> generateOxygenMachineRecipes() {
        List<OxygenMachineJeiCategory.OxygenMachineRecipeWrapper> recipes = new ArrayList<>();
        ArrayList<ItemStack> inputs = new ArrayList<>();
        ArrayList<ItemStack> outputs = new ArrayList<>();
        inputs.add(new ItemStack(SpaceArmorItem.body));
        inputs.add(new ItemStack(Items.OAK_LEAVES));
        // ...
        recipes.add(new OxygenMachineJeiCategory.OxygenMachineRecipeWrapper(inputs));
        return recipes;
    }
    //New Maschine
        private List<OxygenGeneratorJeiCategory.OxygenGeneratorRecipeWrapper> generateOxygenGeneratorRecipes() {
        List<OxygenGeneratorJeiCategory.OxygenGeneratorRecipeWrapper> recipes = new ArrayList<>();
        ArrayList<ItemStack> inputs = new ArrayList<>();
        inputs.add(new ItemStack(Items.OAK_LEAVES));
        // ...
        recipes.add(new OxygenGeneratorJeiCategory.OxygenGeneratorRecipeWrapper(inputs));
        return recipes;
    }
    //Generator
        private List<GeneratorJeiCategory.GeneratorRecipeWrapper> generateGeneratorRecipes() {
        List<GeneratorJeiCategory.GeneratorRecipeWrapper> recipes = new ArrayList<>();
        ArrayList<ItemStack> inputs = new ArrayList<>();
        inputs.add(new ItemStack(Items.COAL));
        // ...
        recipes.add(new GeneratorJeiCategory.GeneratorRecipeWrapper(inputs));
        return recipes;
    }
        //Workbench
    private List<WorkbenchJeiCategory.WorkbenchRecipeWrapper> generateWorkbenchRecipes() {
        List<WorkbenchJeiCategory.WorkbenchRecipeWrapper> recipes = new ArrayList<>();
        ArrayList<ItemStack> inputs = new ArrayList<>();
        ArrayList<ItemStack> outputs = new ArrayList<>();
        inputs.add(new ItemStack(RocketNoseItem.block)); //RocketNoseitem
        inputs.add(new ItemStack(CompressesteelItem.block)); //Compressesteelitem
        inputs.add(new ItemStack(CompressesteelItem.block)); //Compressesteelitem
        inputs.add(new ItemStack(CompressesteelItem.block)); //Compressesteelitem
        inputs.add(new ItemStack(CompressesteelItem.block)); //Compressesteelitem
        inputs.add(new ItemStack(CompressesteelItem.block)); //Compressesteelitem
        inputs.add(new ItemStack(CompressesteelItem.block)); //Compressesteelitem
        inputs.add(new ItemStack(MotorItem.block)); //MotorItem
        inputs.add(new ItemStack(MotorItem.block)); //MotorItem
        inputs.add(new ItemStack(RocketfinsItem.block)); //Rocketfinsitems
        inputs.add(new ItemStack(RocketfinsItem.block)); //Rocketfinsitems
        inputs.add(new ItemStack(RocketfinsItem.block)); //Rocketfinsitems
        inputs.add(new ItemStack(RocketfinsItem.block)); //Rocketfinsitems
        inputs.add(new ItemStack(TurbineItem.block)); //TurbineItem
        outputs.add(new ItemStack(RocketItemBlock.block)); //RocketItem
        // ...
        recipes.add(new WorkbenchJeiCategory.WorkbenchRecipeWrapper(inputs, outputs));
        return recipes;
    }
        //Workbench Tier 2 
    private List<WorkbenchJeiCategory.WorkbenchRecipeWrapper> generateWorkbenchRecipes2() {
        List<WorkbenchJeiCategory.WorkbenchRecipeWrapper> recipes = new ArrayList<>();
        ArrayList<ItemStack> inputs = new ArrayList<>();
        ArrayList<ItemStack> outputs = new ArrayList<>();
        inputs.add(new ItemStack(RocketNoseItem.block)); //RocketNoseitem
        inputs.add(new ItemStack(CompressedTinItem.block)); //CompressedTinItem
        inputs.add(new ItemStack(CompressedTinItem.block)); //CompressedTinItem
        inputs.add(new ItemStack(CompressedTinItem.block)); //CompressedTinItem
        inputs.add(new ItemStack(CompressedTinItem.block)); //CompressedTinItem
        inputs.add(new ItemStack(CompressedTinItem.block)); //CompressedTinItem
        inputs.add(new ItemStack(CompressedTinItem.block)); //CompressedTinItem
        inputs.add(new ItemStack(MotorTier2Item.block)); //MotorTier2Item
        inputs.add(new ItemStack(MotorTier2Item.block)); //MotorTier2Item
        inputs.add(new ItemStack(OxygenTankItem.block)); //OxygenTankItem
        inputs.add(new ItemStack(OxygenTankItem.block)); //OxygenTankItem
        inputs.add(new ItemStack(RocketfinsItem.block)); //Rocketfinsitems
        inputs.add(new ItemStack(RocketfinsItem.block)); //Rocketfinsitems
        inputs.add(new ItemStack(TurbineTier2Item.block)); //TurbineTier2Item
        outputs.add(new ItemStack(RocketItemtir2Block.block)); //RocketItemtir2
        // ...
        recipes.add(new WorkbenchJeiCategory.WorkbenchRecipeWrapper(inputs, outputs));
        return recipes;
    }
            //Workbench Tier 3 
    private List<WorkbenchJeiCategory.WorkbenchRecipeWrapper> generateWorkbenchRecipes3() {
        List<WorkbenchJeiCategory.WorkbenchRecipeWrapper> recipes = new ArrayList<>();
        ArrayList<ItemStack> inputs = new ArrayList<>();
        ArrayList<ItemStack> outputs = new ArrayList<>();
        inputs.add(new ItemStack(RocketNoseItem.block)); //RocketNoseitem
        inputs.add(new ItemStack(CompressedsiliconItem.block)); //CompressedsiliconItem
        inputs.add(new ItemStack(CompressedsiliconItem.block)); //CompressedsiliconItem
        inputs.add(new ItemStack(CompressedsiliconItem.block)); //CompressedsiliconItem
        inputs.add(new ItemStack(CompressedsiliconItem.block)); //CompressedsiliconItem
        inputs.add(new ItemStack(CompressedsiliconItem.block)); //CompressedsiliconItem
        inputs.add(new ItemStack(CompressedsiliconItem.block)); //CompressedsiliconItem
        inputs.add(new ItemStack(TankTier3Item.block)); //MotorTier3Item
        inputs.add(new ItemStack(TankTier3Item.block)); //MotorTier3Item
        inputs.add(new ItemStack(OxygenTankItem.block)); //OxygenTankItem
        inputs.add(new ItemStack(OxygenTankItem.block)); //OxygenTankItem
        inputs.add(new ItemStack(RocketfinsItem.block)); //Rocketfinsitems
        inputs.add(new ItemStack(RocketfinsItem.block)); //Rocketfinsitems
        inputs.add(new ItemStack(EngineTier3Item.block)); //TurbineTier3Item
        outputs.add(new ItemStack(RocketItemTier3Block.block)); //RocketItemtir3
        // ...
        recipes.add(new WorkbenchJeiCategory.WorkbenchRecipeWrapper(inputs, outputs));
        return recipes;
    }
        //BlastFurnace
        private List<BlastingFurnaceJeiCategory.BlastingFurnaceRecipeWrapper> generateBlastingFurnaceRecipes() {
        List<BlastingFurnaceJeiCategory.BlastingFurnaceRecipeWrapper> recipes = new ArrayList<>();
        ArrayList<ItemStack> inputs = new ArrayList<>();
        ArrayList<ItemStack> outputs = new ArrayList<>();
		inputs.add(new ItemStack(Items.COAL));
        inputs.add(new ItemStack(Items.IRON_INGOT));
        outputs.add(new ItemStack(SteahlItem.block));
        // ...
        recipes.add(new BlastingFurnaceJeiCategory.BlastingFurnaceRecipeWrapper(inputs, outputs)); //Compressor
        return recipes;
    }
            //Compressor
        private List<CompressorJeiCategory.CompressorRecipeWrapper> generateCompressorRecipes() {
        List<CompressorJeiCategory.CompressorRecipeWrapper> recipes = new ArrayList<>();
        ArrayList<ItemStack> inputs = new ArrayList<>();
        ArrayList<ItemStack> outputs = new ArrayList<>();
		inputs.add(new ItemStack(SteahlItem.block));
        outputs.add(new ItemStack(CompressesteelItem.block));
        // ...
        recipes.add(new CompressorJeiCategory.CompressorRecipeWrapper(inputs, outputs));
        return recipes;
    }
          //Compressor 2 Recpie
        private List<CompressorJeiCategory.CompressorRecipeWrapper> generateCompressorRecipes2() {
        List<CompressorJeiCategory.CompressorRecipeWrapper> recipes = new ArrayList<>();
        ArrayList<ItemStack> inputs = new ArrayList<>();
        ArrayList<ItemStack> outputs = new ArrayList<>();
		inputs.add(new ItemStack(MoonCopperingotItem.block));
        outputs.add(new ItemStack(CompressedTinItem.block));
        // ...
        recipes.add(new CompressorJeiCategory.CompressorRecipeWrapper(inputs, outputs));
        return recipes;
    }
              //Compressor 3 Recpie
        private List<CompressorJeiCategory.CompressorRecipeWrapper> generateCompressorRecipes3() {
        List<CompressorJeiCategory.CompressorRecipeWrapper> recipes = new ArrayList<>();
        ArrayList<ItemStack> inputs = new ArrayList<>();
        ArrayList<ItemStack> outputs = new ArrayList<>();
		inputs.add(new ItemStack(SiliconIngotItem.block));
        outputs.add(new ItemStack(CompressedsiliconItem.block));
        // ...
        recipes.add(new CompressorJeiCategory.CompressorRecipeWrapper(inputs, outputs));
        return recipes;
    }
		//Rockettier1Gui 
        private List<RocketItemBlockJeiCategory.RocketItemBlockRecipeWrapper> generateRocketItemBlockRecipes() {
        List<RocketItemBlockJeiCategory.RocketItemBlockRecipeWrapper> recipes = new ArrayList<>();
        ArrayList<ItemStack> inputs = new ArrayList<>();
		inputs.add(new ItemStack(FuelBuckedItem.block));
        // ...
        recipes.add(new RocketItemBlockJeiCategory.RocketItemBlockRecipeWrapper(inputs));
        return recipes;
    }
    //RocektTier2Gui
            private List<RocketItemtir2BlockJeiCategory.RocketItemtir2BlockRecipeWrapper> generateRocketItemtir2BlockRecipes() {
        List<RocketItemtir2BlockJeiCategory.RocketItemtir2BlockRecipeWrapper> recipes = new ArrayList<>();
        ArrayList<ItemStack> inputs = new ArrayList<>();
		inputs.add(new ItemStack(FuelBucketBigItem.block));
        // ...
        recipes.add(new RocketItemtir2BlockJeiCategory.RocketItemtir2BlockRecipeWrapper(inputs));
        return recipes;
    }
        //RocektTier3Gui
            private List<RocketItemTier3BlockJeiCategory.RocketItemTier3BlockRecipeWrapper> generateRocketItemTier3BlockRecipes() { //RocketItemTier3Block
        List<RocketItemTier3BlockJeiCategory.RocketItemTier3BlockRecipeWrapper> recipes = new ArrayList<>();
        ArrayList<ItemStack> inputs = new ArrayList<>();
		inputs.add(new ItemStack(FuelBucketBigItem.block));
        // ...
        recipes.add(new RocketItemTier3BlockJeiCategory.RocketItemTier3BlockRecipeWrapper(inputs));
        return recipes;
    }
    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(OxygenMachineBlock.block), OxygenMachineJeiCategory.Uid);
        //Neue maschine
        registration.addRecipeCatalyst(new ItemStack(OxygenGeneratorBlock.block), OxygenGeneratorJeiCategory.Uid);
        //Genrator
        registration.addRecipeCatalyst(new ItemStack(GeneratorBlock.block), GeneratorJeiCategory.Uid);
        //workbench
        registration.addRecipeCatalyst(new ItemStack(WorkbenchBlock.block), WorkbenchJeiCategory.Uid);
        //BlastingFurnace
        registration.addRecipeCatalyst(new ItemStack(BlastingFurnaceBlock.block), BlastingFurnaceJeiCategory.Uid);
        //RocketTier1Gui
        registration.addRecipeCatalyst(new ItemStack(RocketItemBlock.block), RocketItemBlockJeiCategory.Uid);
        //RocketTier2Gui
        registration.addRecipeCatalyst(new ItemStack(RocketItemtir2Block.block), RocketItemtir2BlockJeiCategory.Uid);
        //RocketTier3Gui
        registration.addRecipeCatalyst(new ItemStack(RocketItemTier3Block.block), RocketItemTier3BlockJeiCategory.Uid);
        //Compressor
        registration.addRecipeCatalyst(new ItemStack(CompressorBlock.block), CompressorJeiCategory.Uid);
    }
public static class OxygenMachineJeiCategory implements IRecipeCategory<OxygenMachineJeiCategory.OxygenMachineRecipeWrapper> {
		private static ResourceLocation Uid = new ResourceLocation("boss_tools", "oxygenmachinecategory");
		private static final int input1 = 0; // THE NUMBER = SLOTID
                private static final int input2 = 1; // THE NUMBER = SLOTID
		// ...
		private final String title;
		private final IDrawable background;
		public OxygenMachineJeiCategory(IGuiHelper guiHelper) {
			this.title = "Oxygen Loader";
			this.background = guiHelper.createDrawable(new ResourceLocation("boss_tools", "textures/oxygenmachineguitexture.png"), 0, 0, 144, 84);
		}

		@Override
		public ResourceLocation getUid() {
			return Uid;
		}

		@Override
		public Class<? extends OxygenMachineRecipeWrapper> getRecipeClass() {
			return OxygenMachineJeiCategory.OxygenMachineRecipeWrapper.class;
		}

		@Override
		public String getTitle() {
			return title;
		}

		@Override
		public IDrawable getBackground() {
			return background;
		}

		@Override
		public IDrawable getIcon() {
			return null;
		}

		@Override
		public void setIngredients(OxygenMachineRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            iIngredients.setInputs(VanillaTypes.ITEM, recipeWrapper.getInput());
		}

        @Override
        public void setRecipe(IRecipeLayout iRecipeLayout, OxygenMachineRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            IGuiItemStackGroup stacks = iRecipeLayout.getItemStacks();
            stacks.init(input1, true, 42, 13);
            stacks.init(input2, true, 42, 47);
            // ...

            stacks.set(input1, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
            stacks.set(input2, iIngredients.getInputs(VanillaTypes.ITEM).get(1));
            // ...
        }
		public static class OxygenMachineRecipeWrapper {
            private ArrayList input;
            private ArrayList output;

            public OxygenMachineRecipeWrapper(ArrayList input) {
                this.input = input;
                this.output = output;
            }


            public ArrayList getInput() {
                return input;
            }
        }
	}
	//New Maschine
	public static class OxygenGeneratorJeiCategory implements IRecipeCategory<OxygenGeneratorJeiCategory.OxygenGeneratorRecipeWrapper> {
		private static ResourceLocation Uid = new ResourceLocation("boss_tools", "oxygengeneratorcategory");// muss klein geschrieben sein
		private static final int input1 = 0; // THE NUMBER = SLOTID
                private static final int input2 = 1; // THE NUMBER = SLOTID
		// ...
		private final String title;
		private final IDrawable background;
		public OxygenGeneratorJeiCategory(IGuiHelper guiHelper) {
			this.title = "Oxygen Bullet Generator | 3x6";
			this.background = guiHelper.createDrawable(new ResourceLocation("boss_tools", "textures/oxygen_geneartor_gui.png"), 0, 0, 144, 84);
		}

		@Override
		public ResourceLocation getUid() {
			return Uid;
		}

		@Override
		public Class<? extends OxygenGeneratorRecipeWrapper> getRecipeClass() {
			return OxygenGeneratorJeiCategory.OxygenGeneratorRecipeWrapper.class;
		}

		@Override
		public String getTitle() {
			return title;
		}

		@Override
		public IDrawable getBackground() {
			return background;
		}

		@Override
		public IDrawable getIcon() {
			return null;
		}

		@Override
		public void setIngredients(OxygenGeneratorRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            iIngredients.setInputs(VanillaTypes.ITEM, recipeWrapper.getInput());
		}

        @Override
        public void setRecipe(IRecipeLayout iRecipeLayout, OxygenGeneratorRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            IGuiItemStackGroup stacks = iRecipeLayout.getItemStacks();
            stacks.init(input1, true, 38, 40);//Numern wie im GUI
            // ...

            stacks.set(input1, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
            // ...
        }
		public static class OxygenGeneratorRecipeWrapper {
            private ArrayList input;
            private ArrayList output;

            public OxygenGeneratorRecipeWrapper(ArrayList input) {
                this.input = input;
            }


            public ArrayList getInput() {
                return input;
            }
        }
	}
	//Genrator
	public static class GeneratorJeiCategory implements IRecipeCategory<GeneratorJeiCategory.GeneratorRecipeWrapper> {
		private static ResourceLocation Uid = new ResourceLocation("boss_tools", "generatorcategory");// muss klein geschrieben sein
		private static final int input1 = 0; // THE NUMBER = SLOTID
		// ...
		private final String title;
		private final IDrawable background;
		public GeneratorJeiCategory(IGuiHelper guiHelper) {
			this.title = "Coal Generator";
			this.background = guiHelper.createDrawable(new ResourceLocation("boss_tools", "textures/coalgeneratortexture.png"), 0, 0, 144, 84);
		}

		@Override
		public ResourceLocation getUid() {
			return Uid;
		}

		@Override
		public Class<? extends GeneratorRecipeWrapper> getRecipeClass() {
			return GeneratorJeiCategory.GeneratorRecipeWrapper.class;
		}

		@Override
		public String getTitle() {
			return title;
		}

		@Override
		public IDrawable getBackground() {
			return background;
		}

		@Override
		public IDrawable getIcon() {
			return null;
		}

		@Override
		public void setIngredients(GeneratorRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            iIngredients.setInputs(VanillaTypes.ITEM, recipeWrapper.getInput());
		}

        @Override
        public void setRecipe(IRecipeLayout iRecipeLayout, GeneratorRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            IGuiItemStackGroup stacks = iRecipeLayout.getItemStacks();
            stacks.init(input1, true, 44, 25);//Numern wie im GUI
            // ...

            stacks.set(input1, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
            // ...
        }
		public static class GeneratorRecipeWrapper {
            private ArrayList input;
            private ArrayList output;

            public GeneratorRecipeWrapper(ArrayList input) {
                this.input = input;
            }


            public ArrayList getInput() {
                return input;
            }
        }
	}
		//workbench
   	public static class WorkbenchJeiCategory implements IRecipeCategory<WorkbenchJeiCategory.WorkbenchRecipeWrapper> {
		private static ResourceLocation Uid = new ResourceLocation("boss_tools", "workbenchcategory"); // muss klein sein !
		private static final int input1 = 0; // THE NUMBER = SLOTID
        private static final int input2 = 1; // THE NUMBER = SLOTID
        private static final int input3 = 2; // THE NUMBER = SLOTID
        private static final int input4 = 3; // THE NUMBER = SLOTID
        private static final int input5 = 4; // THE NUMBER = SLOTID
        private static final int input6 = 5; // THE NUMBER = SLOTID
        private static final int input7 = 6; // THE NUMBER = SLOTID
        private static final int input8 = 7; // THE NUMBER = SLOTID
        private static final int input9 = 8; // THE NUMBER = SLOTID
        private static final int input10 = 9; // THE NUMBER = SLOTID
        private static final int input11 = 10; // THE NUMBER = SLOTID
        private static final int input12 = 11; // THE NUMBER = SLOTID
        private static final int input13 = 12; // THE NUMBER = SLOTID
        private static final int input14 = 13; // THE NUMBER = SLOTID
		private static final int output1 = 14; // THE NUMBER = SLOTID
		// ...
		private final String title;
		private final IDrawable background;
		public WorkbenchJeiCategory(IGuiHelper guiHelper) {
			this.title = "NASA Workbench";
			this.background = guiHelper.createDrawable(new ResourceLocation("boss_tools", "textures/nasaworkbenchjei.png"), 0, 0, 175, 120);
		}

		@Override
		public ResourceLocation getUid() {
			return Uid;
		}

		@Override
		public Class<? extends WorkbenchRecipeWrapper> getRecipeClass() {
			return WorkbenchJeiCategory.WorkbenchRecipeWrapper.class;
		}

		@Override
		public String getTitle() {
			return title;
		}

		@Override
		public IDrawable getBackground() {
			return background;
		}

		@Override
		public IDrawable getIcon() {
			return null;
		}

		@Override
		public void setIngredients(WorkbenchRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            iIngredients.setInputs(VanillaTypes.ITEM, recipeWrapper.getInput());
            iIngredients.setOutputs(VanillaTypes.ITEM, recipeWrapper.getOutput());
		}

        @Override
        public void setRecipe(IRecipeLayout iRecipeLayout, WorkbenchRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            IGuiItemStackGroup stacks = iRecipeLayout.getItemStacks();
            stacks.init(input1, true, 37, 9);
            stacks.init(input2, true, 29, 26);
            stacks.init(input3, true, 46, 26);
            stacks.init(input4, true, 46, 43);
            stacks.init(input5, true, 29, 43);
            stacks.init(input6, true, 46, 60);
            stacks.init(input7, true, 29, 60);
            stacks.init(input8, true, 46, 77);
            stacks.init(input9, true, 29, 77);
            stacks.init(input10, true, 12, 77);
            stacks.init(input11, true, 63, 77);
            stacks.init(input12, true, 63, 94);
            stacks.init(input13, true, 12, 94);
            stacks.init(input14, true, 37, 94);
            stacks.init(output1, false, 133, 81);
            // ...

            stacks.set(input1, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
            stacks.set(input2, iIngredients.getInputs(VanillaTypes.ITEM).get(1));
            stacks.set(input3, iIngredients.getInputs(VanillaTypes.ITEM).get(2));
            stacks.set(input4, iIngredients.getInputs(VanillaTypes.ITEM).get(3));
            stacks.set(input5, iIngredients.getInputs(VanillaTypes.ITEM).get(4));
            stacks.set(input6, iIngredients.getInputs(VanillaTypes.ITEM).get(5));
            stacks.set(input7, iIngredients.getInputs(VanillaTypes.ITEM).get(6));
            stacks.set(input8, iIngredients.getInputs(VanillaTypes.ITEM).get(7));
            stacks.set(input9, iIngredients.getInputs(VanillaTypes.ITEM).get(8));
            stacks.set(input10, iIngredients.getInputs(VanillaTypes.ITEM).get(9));
            stacks.set(input11, iIngredients.getInputs(VanillaTypes.ITEM).get(10));
            stacks.set(input12, iIngredients.getInputs(VanillaTypes.ITEM).get(11));
            stacks.set(input13, iIngredients.getInputs(VanillaTypes.ITEM).get(12));
            stacks.set(input14, iIngredients.getInputs(VanillaTypes.ITEM).get(13));
            stacks.set(output1, iIngredients.getOutputs(VanillaTypes.ITEM).get(0));
            // ...
        }
		public static class WorkbenchRecipeWrapper {
            private ArrayList input;
            private ArrayList output;

            public WorkbenchRecipeWrapper(ArrayList input, ArrayList output) {
                this.input = input;
                this.output = output;
            }


            public ArrayList getInput() {
                return input;
            }

            public ArrayList getOutput() {
                return output;
            }
        }
	}
	//BlastingFurnace
	public static class BlastingFurnaceJeiCategory implements IRecipeCategory<BlastingFurnaceJeiCategory.BlastingFurnaceRecipeWrapper> {
		private static ResourceLocation Uid = new ResourceLocation("boss_tools", "blastingfurnacecategory");
		private static final int input1 = 0; // THE NUMBER = SLOTID
                private static final int input2 = 1; // THE NUMBER = SLOTID
		private static final int output1 = 2; // THE NUMBER = SLOTID
		// ...
		private final String title;
		private final IDrawable background;
		public BlastingFurnaceJeiCategory(IGuiHelper guiHelper) {
			this.title = "Blast Furnace";
			this.background = guiHelper.createDrawable(new ResourceLocation("boss_tools", "textures/blast_furnace_gui_jei.png"), 0, 0, 144, 84);
		}

		@Override
		public ResourceLocation getUid() {
			return Uid;
		}

		@Override
		public Class<? extends BlastingFurnaceRecipeWrapper> getRecipeClass() {
			return BlastingFurnaceJeiCategory.BlastingFurnaceRecipeWrapper.class;
		}

		@Override
		public String getTitle() {
			return title;
		}

		@Override
		public IDrawable getBackground() {
			return background;
		}

		@Override
		public IDrawable getIcon() {
			return null;
		}

		@Override
		public void setIngredients(BlastingFurnaceRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            iIngredients.setInputs(VanillaTypes.ITEM, recipeWrapper.getInput());
            iIngredients.setOutputs(VanillaTypes.ITEM, recipeWrapper.getOutput());
		}

        @Override
        public void setRecipe(IRecipeLayout iRecipeLayout, BlastingFurnaceRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            IGuiItemStackGroup stacks = iRecipeLayout.getItemStacks();
            stacks.init(input1, true, 36, 53); //coal
                        stacks.init(input2, true, 36, 16);//Iron
            stacks.init(output1, false, 86, 35);//steel
            // ...

            stacks.set(input1, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
            stacks.set(input2, iIngredients.getInputs(VanillaTypes.ITEM).get(1));
            stacks.set(output1, iIngredients.getOutputs(VanillaTypes.ITEM).get(0));
            // ...
        }
		public static class BlastingFurnaceRecipeWrapper {
            private ArrayList input;
            private ArrayList output;

            public BlastingFurnaceRecipeWrapper(ArrayList input, ArrayList output) {
                this.input = input;
                this.output = output;
            }


            public ArrayList getInput() {
                return input;
            }

            public ArrayList getOutput() {
                return output;
            }
        }
	}
	//RocketTier1Gui
	public static class RocketItemBlockJeiCategory implements IRecipeCategory<RocketItemBlockJeiCategory.RocketItemBlockRecipeWrapper> {
		private static ResourceLocation Uid = new ResourceLocation("boss_tools", "rocketitemblockcategory");
		private static final int input1 = 0; // THE NUMBER = SLOTID
		// ...
		private final String title;
		private final IDrawable background;
		public RocketItemBlockJeiCategory(IGuiHelper guiHelper) {
			this.title = "Tier 1 Rocket";
			this.background = guiHelper.createDrawable(new ResourceLocation("boss_tools", "textures/rocket_gui_jui.png"), 0, 0, 128, 71);
		}

		@Override
		public ResourceLocation getUid() {
			return Uid;
		}

		@Override
		public Class<? extends RocketItemBlockRecipeWrapper> getRecipeClass() {
			return RocketItemBlockJeiCategory.RocketItemBlockRecipeWrapper.class;
		}

		@Override
		public String getTitle() {
			return title;
		}

		@Override
		public IDrawable getBackground() {
			return background;
		}

		@Override
		public IDrawable getIcon() {
			return null;
		}

		@Override
		public void setIngredients(RocketItemBlockRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            iIngredients.setInputs(VanillaTypes.ITEM, recipeWrapper.getInput());
		}

        @Override
        public void setRecipe(IRecipeLayout iRecipeLayout, RocketItemBlockRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            IGuiItemStackGroup stacks = iRecipeLayout.getItemStacks();
            stacks.init(input1, true, 13, 18);
            // ...

            stacks.set(input1, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
            // ...
        }
		public static class RocketItemBlockRecipeWrapper {
            private ArrayList input;

            public RocketItemBlockRecipeWrapper(ArrayList input) {
                this.input = input;
            }


            public ArrayList getInput() {
                return input;
            }
        }
	}
	//RocketTier2Gui
		public static class RocketItemtir2BlockJeiCategory implements IRecipeCategory<RocketItemtir2BlockJeiCategory.RocketItemtir2BlockRecipeWrapper> {
		private static ResourceLocation Uid = new ResourceLocation("boss_tools", "rocketitemtir2blockcategory");
		private static final int input1 = 0; // THE NUMBER = SLOTID
		// ...
		private final String title;
		private final IDrawable background;
		public RocketItemtir2BlockJeiCategory(IGuiHelper guiHelper) {
			this.title = "Tier 2 Rocket";
			this.background = guiHelper.createDrawable(new ResourceLocation("boss_tools", "textures/rocket_gui_jui.png"), 0, 0, 128, 71);
		}

		@Override
		public ResourceLocation getUid() {
			return Uid;
		}

		@Override
		public Class<? extends RocketItemtir2BlockRecipeWrapper> getRecipeClass() {
			return RocketItemtir2BlockJeiCategory.RocketItemtir2BlockRecipeWrapper.class;
		}

		@Override
		public String getTitle() {
			return title;
		}

		@Override
		public IDrawable getBackground() {
			return background;
		}

		@Override
		public IDrawable getIcon() {
			return null;
		}

		@Override
		public void setIngredients(RocketItemtir2BlockRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            iIngredients.setInputs(VanillaTypes.ITEM, recipeWrapper.getInput());
		}

        @Override
        public void setRecipe(IRecipeLayout iRecipeLayout, RocketItemtir2BlockRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            IGuiItemStackGroup stacks = iRecipeLayout.getItemStacks();
            stacks.init(input1, true, 13, 18);
            // ...

            stacks.set(input1, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
            // ...
        }
		public static class RocketItemtir2BlockRecipeWrapper {
            private ArrayList input;

            public RocketItemtir2BlockRecipeWrapper(ArrayList input) {
                this.input = input;
            }


            public ArrayList getInput() {
                return input;
            }
        }
	}
		//Compressor
	public static class CompressorJeiCategory implements IRecipeCategory<CompressorJeiCategory.CompressorRecipeWrapper> {
		private static ResourceLocation Uid = new ResourceLocation("boss_tools", "compressorcategory");
		private static final int input1 = 0; // THE NUMBER = SLOTID
		private static final int output1 = 2; // THE NUMBER = SLOTID
		// ...
		private final String title;
		private final IDrawable background;
		public CompressorJeiCategory(IGuiHelper guiHelper) {
			this.title = "Compressor";
			this.background = guiHelper.createDrawable(new ResourceLocation("boss_tools", "textures/compressor_gui_jei.png"), 0, 0, 144, 84);
		}

		@Override
		public ResourceLocation getUid() {
			return Uid;
		}

		@Override
		public Class<? extends CompressorRecipeWrapper> getRecipeClass() {
			return CompressorJeiCategory.CompressorRecipeWrapper.class;
		}

		@Override
		public String getTitle() {
			return title;
		}

		@Override
		public IDrawable getBackground() {
			return background;
		}

		@Override
		public IDrawable getIcon() {
			return null;
		}

		@Override
		public void setIngredients(CompressorRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            iIngredients.setInputs(VanillaTypes.ITEM, recipeWrapper.getInput());
            iIngredients.setOutputs(VanillaTypes.ITEM, recipeWrapper.getOutput());
		}

        @Override
        public void setRecipe(IRecipeLayout iRecipeLayout, CompressorRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            IGuiItemStackGroup stacks = iRecipeLayout.getItemStacks();
            stacks.init(input1, true, 14, 29);
            stacks.init(output1, false, 69, 28);
            // ...

            stacks.set(input1, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
            stacks.set(output1, iIngredients.getOutputs(VanillaTypes.ITEM).get(0));
            // ...
        }
		public static class CompressorRecipeWrapper {
            private ArrayList input;
            private ArrayList output;

            public CompressorRecipeWrapper(ArrayList input, ArrayList output) {
                this.input = input;
                this.output = output;
            }


            public ArrayList getInput() {
                return input;
            }

            public ArrayList getOutput() {
                return output;
            }
        }
	}
		//RocketTier3Gui
		public static class RocketItemTier3BlockJeiCategory implements IRecipeCategory<RocketItemTier3BlockJeiCategory.RocketItemTier3BlockRecipeWrapper> {
		private static ResourceLocation Uid = new ResourceLocation("boss_tools", "rocketitemtier3blockcategory");
		private static final int input1 = 0; // THE NUMBER = SLOTID
		// ...
		private final String title;
		private final IDrawable background;
		public RocketItemTier3BlockJeiCategory(IGuiHelper guiHelper) {
			this.title = "Tier 3 Rocket";
			this.background = guiHelper.createDrawable(new ResourceLocation("boss_tools", "textures/rocket_gui_jui.png"), 0, 0, 128, 71);
		}

		@Override
		public ResourceLocation getUid() {
			return Uid;
		}

		@Override
		public Class<? extends RocketItemTier3BlockRecipeWrapper> getRecipeClass() {
			return RocketItemTier3BlockJeiCategory.RocketItemTier3BlockRecipeWrapper.class;
		}

		@Override
		public String getTitle() {
			return title;
		}

		@Override
		public IDrawable getBackground() {
			return background;
		}

		@Override
		public IDrawable getIcon() {
			return null;
		}

		@Override
		public void setIngredients(RocketItemTier3BlockRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            iIngredients.setInputs(VanillaTypes.ITEM, recipeWrapper.getInput());
		}

        @Override
        public void setRecipe(IRecipeLayout iRecipeLayout, RocketItemTier3BlockRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            IGuiItemStackGroup stacks = iRecipeLayout.getItemStacks();
            stacks.init(input1, true, 13, 18);
            // ...

            stacks.set(input1, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
            // ...
        }
		public static class RocketItemTier3BlockRecipeWrapper {
            private ArrayList input;

            public RocketItemTier3BlockRecipeWrapper(ArrayList input) {
                this.input = input;
            }


            public ArrayList getInput() {
                return input;
            }
        }
	}
	//HERE der neue code dan
}
