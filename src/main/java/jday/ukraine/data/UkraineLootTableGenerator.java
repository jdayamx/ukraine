package jday.ukraine.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class UkraineLootTableGenerator extends FabricBlockLootTableProvider {
    public UkraineLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //addDrop(ModBlocks.CITRINE_BLOCK);

        //addDrop(ModBlocks.CITRINE_ORE, oreDrops(ModBlocks.CITRINE_ORE, ModItems.RAW_CITRINE));
        //addDrop(ModBlocks.DEEPSLATE_CITRINE_ORE, oreDrops(ModBlocks.DEEPSLATE_CITRINE_ORE, ModItems.RAW_CITRINE));
    }
}
