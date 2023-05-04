package jday.ukraine;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import jday.ukraine.data.UkraineLootTableGenerator;
import jday.ukraine.data.UkraineRecipeGenerator;
import jday.ukraine.data.UkraineModelProvider;
import jday.ukraine.data.UkraineWorldGenerator;
import jday.ukraine.world.UkraineConfiguredFeatures;
import jday.ukraine.world.UkrainePlacedFeatures;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class UkraineModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(UkraineLootTableGenerator::new);
        pack.addProvider(UkraineRecipeGenerator::new);
        pack.addProvider(UkraineModelProvider::new);
        pack.addProvider(UkraineWorldGenerator::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, UkraineConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, UkrainePlacedFeatures::bootstrap);
    }
}
