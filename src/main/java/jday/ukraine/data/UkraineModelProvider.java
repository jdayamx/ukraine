package jday.ukraine.data;

import jday.ukraine.block.UkraineBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class UkraineModelProvider extends FabricModelProvider {
    public UkraineModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CITRINE_BLOCK);
        //blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CITRINE_ORE);
        //blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_CITRINE_ORE);

        blockStateModelGenerator.registerLog(UkraineBlocks.RED_VIBURNUM_LOG).log(UkraineBlocks.RED_VIBURNUM_LOG).wood(UkraineBlocks.RED_VIBURNUM_WOOD);
        blockStateModelGenerator.registerLog(UkraineBlocks.STRIPPED_RED_VIBURNUM_LOG).log(UkraineBlocks.STRIPPED_RED_VIBURNUM_LOG).wood(UkraineBlocks.STRIPPED_RED_VIBURNUM_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(UkraineBlocks.RED_VIBURNUM_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(UkraineBlocks.RED_VIBURNUM_LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(UkraineBlocks.RED_VIBURNUM_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.CITRINE, Models.GENERATED);
        //itemModelGenerator.register(ModItems.RAW_CITRINE, Models.GENERATED);
    }
}
