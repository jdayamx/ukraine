package jday.ukraine.registries;

import jday.ukraine.Ukraine;
import jday.ukraine.block.UkraineBlocks;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class UkraineRegistries {
    public static void registerModFuels() {
        System.out.println("Now registering Fuels for " + Ukraine.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(UkraineBlocks.RED_VIBURNUM_LEAVES, 50);
        registry.add(UkraineBlocks.RED_VIBURNUM_SAPLING, 50);
        registry.add(UkraineBlocks.RED_VIBURNUM_PLANKS, 150);
        registry.add(UkraineBlocks.RED_VIBURNUM_LOG, 300);
        registry.add(UkraineBlocks.STRIPPED_RED_VIBURNUM_LOG, 250);
        registry.add(UkraineBlocks.STRIPPED_RED_VIBURNUM_WOOD, 200);
        registry.add(UkraineBlocks.RED_VIBURNUM_WOOD, 250);
    }
}
