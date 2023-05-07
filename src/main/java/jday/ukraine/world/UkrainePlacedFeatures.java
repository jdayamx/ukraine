package jday.ukraine.world;

import jday.ukraine.Ukraine;
import jday.ukraine.block.UkraineBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

public class UkrainePlacedFeatures {
    public static final RegistryKey<PlacedFeature> RED_VIBURNUM_PLACED_KEY = registerKey("red_viburnum_placed");
    public static final RegistryKey<PlacedFeature> UKRAINE_SAGEBRUSH_PLACED_KEY = registerKey("ukraine_sagebrush_placed");
    public static final RegistryKey<PlacedFeature> UKRAINE_THISTLE_PLACED_KEY = registerKey("ukraine_thistle_placed");
    public static final RegistryKey<PlacedFeature>UKRAINE_TULIP_BLUE_PLACED_KEY = registerKey("ukraine_tulip_blue_placed");
    public static final RegistryKey<PlacedFeature> UKRAINE_TULIP_YELLOW_PLACED_KEY = registerKey("ukraine_tulip_yellow_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, RED_VIBURNUM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(UkraineConfiguredFeatures.RED_VIBURNUM_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(2, 0.3f, 5), UkraineBlocks.RED_VIBURNUM_SAPLING));

        register(context, UKRAINE_SAGEBRUSH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(UkraineConfiguredFeatures.UKRAINE_SAGEBRUSH_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, UKRAINE_THISTLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(UkraineConfiguredFeatures.UKRAINE_THISTLE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, UKRAINE_TULIP_BLUE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(UkraineConfiguredFeatures.UKRAINE_TULIP_BLUE_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
        register(context, UKRAINE_TULIP_YELLOW_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(UkraineConfiguredFeatures.UKRAINE_TULIP_YELLOW_KEY),
                RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Ukraine.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
