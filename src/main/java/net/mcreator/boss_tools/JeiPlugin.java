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
		//workbench Tier 3
        registration.addRecipes(generateWorkbenchRecipes2(), WorkbenchJeiCategory.Uid);
        // ...
    }

    private List<OxygenMachineJeiCategory.OxygenMachineRecipeWrapper> generateOxygenMachineRecipes() {
        List<OxygenMachineJeiCategory.OxygenMachineRecipeWrapper> recipes = new ArrayList<>();
        ArrayList<ItemStack> inputs = new ArrayList<>();
        ArrayList<ItemStack> outputs = new ArrayList<>();
        inputs.add(new ItemStack(SpaceArmorItem.body));
        inputs.add(new ItemStack(Items.OAK_LEAVES));
        outputs.add(new ItemStack(SpaceArmorItem.body));
        // ...
        recipes.add(new OxygenMachineJeiCategory.OxygenMachineRecipeWrapper(inputs, outputs));
        return recipes;
    }
    //New Maschine
        private List<OxygenGeneratorJeiCategory.OxygenGeneratorRecipeWrapper> generateOxygenGeneratorRecipes() {
        List<OxygenGeneratorJeiCategory.OxygenGeneratorRecipeWrapper> recipes = new ArrayList<>();
        ArrayList<ItemStack> inputs = new ArrayList<>();
        inputs.add(new ItemStack(Items.OAK_LEAVES));
        inputs.add(new ItemStack(Items.COAL));
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
    
    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(OxygenMachineBlock.block), OxygenMachineJeiCategory.Uid);
        //Neue maschine
        registration.addRecipeCatalyst(new ItemStack(OxygenGeneratorBlock.block), OxygenGeneratorJeiCategory.Uid);
        //Genrator
        registration.addRecipeCatalyst(new ItemStack(GeneratorBlock.block), GeneratorJeiCategory.Uid);
        //workbench
        registration.addRecipeCatalyst(new ItemStack(WorkbenchBlock.block), WorkbenchJeiCategory.Uid);
    }
public static class OxygenMachineJeiCategory implements IRecipeCategory<OxygenMachineJeiCategory.OxygenMachineRecipeWrapper> {
		private static ResourceLocation Uid = new ResourceLocation("boss_tools", "oxygenmachinecategory");
		private static final int input1 = 0; // THE NUMBER = SLOTID
                private static final int input2 = 1; // THE NUMBER = SLOTID
		private static final int output1 = 2; // THE NUMBER = SLOTID
		// ...
		private final String title;
		private final IDrawable background;
		public OxygenMachineJeiCategory(IGuiHelper guiHelper) {
			this.title = "Oxygen Loader";
			this.background = guiHelper.createDrawable(new ResourceLocation("boss_tools", "textures/oxygenmachineguitexture.png"), 0, 0, 175, 82);
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
            iIngredients.setOutputs(VanillaTypes.ITEM, recipeWrapper.getOutput());
		}

        @Override
        public void setRecipe(IRecipeLayout iRecipeLayout, OxygenMachineRecipeWrapper recipeWrapper, IIngredients iIngredients) {
            IGuiItemStackGroup stacks = iRecipeLayout.getItemStacks();
            stacks.init(input1, true, 41, 15);
                        stacks.init(input2, true, 41, 51);
            stacks.init(output1, false, 106, 34);
            // ...

            stacks.set(input1, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
            stacks.set(input2, iIngredients.getInputs(VanillaTypes.ITEM).get(1));
            stacks.set(output1, iIngredients.getOutputs(VanillaTypes.ITEM).get(0));
            // ...
        }
		public static class OxygenMachineRecipeWrapper {
            private ArrayList input;
            private ArrayList output;

            public OxygenMachineRecipeWrapper(ArrayList input, ArrayList output) {
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
	//New Maschine
	public static class OxygenGeneratorJeiCategory implements IRecipeCategory<OxygenGeneratorJeiCategory.OxygenGeneratorRecipeWrapper> {
		private static ResourceLocation Uid = new ResourceLocation("boss_tools", "oxygengeneratorcategory");// muss klein geschrieben sein
		private static final int input1 = 0; // THE NUMBER = SLOTID
                private static final int input2 = 1; // THE NUMBER = SLOTID
		// ...
		private final String title;
		private final IDrawable background;
		public OxygenGeneratorJeiCategory(IGuiHelper guiHelper) {
			this.title = "Oxygen Bullet Generator | 3x3";
			this.background = guiHelper.createDrawable(new ResourceLocation("boss_tools", "textures/oxygen_geneartor_guy.png"), 0, 0, 175, 82);
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
            stacks.init(input1, true, 79, 55);//Numern wie im GUI
                        stacks.init(input2, true, 79, 10);//Nummern wie im GUI
            // ...

            stacks.set(input1, iIngredients.getInputs(VanillaTypes.ITEM).get(0));
            stacks.set(input2, iIngredients.getInputs(VanillaTypes.ITEM).get(1));
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
			this.background = guiHelper.createDrawable(new ResourceLocation("boss_tools", "textures/coalgeneratortexture.png"), 0, 0, 175, 82);
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
            stacks.init(input1, true, 43, 21);//Numern wie im GUI
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
	//HERE der neue code dan
}