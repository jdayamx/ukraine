package jday.ukraine.world;

import jday.ukraine.Ukraine;
import jday.ukraine.block.UkraineBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class UkraineConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_VIBURNUM_KEY = registerKey("red_viburnum");

    public static final RegistryKey<ConfiguredFeature<?,?>> UKRAINE_SAGEBRUSH_KEY = registerKey("ukraine_sagebrush");
    public static final RegistryKey<ConfiguredFeature<?,?>> UKRAINE_THISTLE_KEY = registerKey("ukraine_thistle");
    public static final RegistryKey<ConfiguredFeature<?,?>> UKRAINE_TULIP_BLUE_KEY = registerKey("ukraine_tulip_blue");
    public static final RegistryKey<ConfiguredFeature<?,?>> UKRAINE_TULIP_YELLOW_KEY = registerKey("ukraine_tulip_yellow");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, RED_VIBURNUM_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(UkraineBlocks.RED_VIBURNUM_LOG),
                new StraightTrunkPlacer(5, 5, 3),
                BlockStateProvider.of(UkraineBlocks.RED_VIBURNUM_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 1, 2)).build());

        register(context, UKRAINE_SAGEBRUSH_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(UkraineBlocks.UKRAINE_SAGEBRUSH)))));
        register(context, UKRAINE_THISTLE_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(UkraineBlocks.UKRAINE_THISTLE)))));
        register(context, UKRAINE_TULIP_BLUE_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(UkraineBlocks.UKRAINE_TULIP_BLUE)))));
        register(context, UKRAINE_TULIP_YELLOW_KEY, Feature.FLOWER,
                ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(UkraineBlocks.UKRAINE_TULIP_YELLOW)))));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Ukraine.MOD_ID, name));
    }


    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
