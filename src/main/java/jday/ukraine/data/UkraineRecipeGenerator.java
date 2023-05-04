package jday.ukraine.data;

import jday.ukraine.block.UkraineBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class UkraineRecipeGenerator extends FabricRecipeProvider {
    public UkraineRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //offerSmelting(exporter, List.of(ModItems.RAW_CITRINE), RecipeCategory.MISC, ModItems.CITRINE,
        //        0.7f, 200, "citrine");

        //offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CITRINE, RecipeCategory.DECORATIONS,
        //        ModBlocks.CITRINE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, UkraineBlocks.RED_VIBURNUM_LOG, RecipeCategory.DECORATIONS,
                UkraineBlocks.RED_VIBURNUM_PLANKS);

        // JUST AN EXAMPLE
        /* ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_CITRINE)
                .pattern("SSS")
                .pattern("SCS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('C', ModItems.CITRINE)
                .criterion(FabricRecipeProvider.hasItem(Items.STONE),
                        FabricRecipeProvider.conditionsFromItem(Items.STONE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RAW_CITRINE)));

         */
    }
}
