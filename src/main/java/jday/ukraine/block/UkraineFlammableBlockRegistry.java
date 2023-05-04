package jday.ukraine.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class UkraineFlammableBlockRegistry {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(UkraineBlocks.RED_VIBURNUM_LOG, 5, 5);
        registry.add(UkraineBlocks.RED_VIBURNUM_WOOD, 5, 5);
        registry.add(UkraineBlocks.STRIPPED_RED_VIBURNUM_LOG, 5, 5);
        registry.add(UkraineBlocks.STRIPPED_RED_VIBURNUM_WOOD, 5, 5);

        registry.add(UkraineBlocks.RED_VIBURNUM_LEAVES, 30, 60);
        registry.add(UkraineBlocks.RED_VIBURNUM_PLANKS, 5, 20);
    }
}
