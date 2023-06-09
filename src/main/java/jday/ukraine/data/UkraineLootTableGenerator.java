package jday.ukraine.data;

import jday.ukraine.block.UkraineBlocks;
import jday.ukraine.item.UkraineItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;

public class UkraineLootTableGenerator extends FabricBlockLootTableProvider {
    public UkraineLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //addDrop(ModBlocks.CITRINE_BLOCK);
        //addDrop(UkraineBlocks.RED_VIBURNUM_LEAVES);
        addDrop(Blocks.GRASS_BLOCK, attachedCropStemDrops(Blocks.GRASS_BLOCK, UkraineItems.EMBLEM));
        //addDrop(UkraineBlocks.RED_VIBURNUM_LEAVES, oreDrops(UkraineBlocks.RED_VIBURNUM_LEAVES, UkraineBlocks.RED_VIBURNUM_PLANKS));
        //addDrop(ModBlocks.CITRINE_ORE, oreDrops(ModBlocks.CITRINE_ORE, ModItems.RAW_CITRINE));
        //addDrop(ModBlocks.DEEPSLATE_CITRINE_ORE, oreDrops(ModBlocks.DEEPSLATE_CITRINE_ORE, ModItems.RAW_CITRINE));
    }
}
