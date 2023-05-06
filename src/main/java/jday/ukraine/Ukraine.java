package jday.ukraine;

import jday.ukraine.block.UkraineBlocks;
import jday.ukraine.block.UkraineFlammableBlockRegistry;
import jday.ukraine.data.UkraineWorldGenerator;
import jday.ukraine.item.UkraineItemGroup;
import jday.ukraine.item.UkraineItems;
import jday.ukraine.painting.UkrainePaintings;
import jday.ukraine.world.gen.UkraineWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.DispenserBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import software.bernie.geckolib.GeckoLib;

import java.util.List;
public class Ukraine implements ModInitializer {
    public static final String MOD_ID = "ukraine";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        UkraineItemGroup.registerItemGroups();
        UkraineItems.registerUkraineItems();
        UkraineBlocks.registerUkraineBlocks();
        UkraineWorldGeneration.generateUkraineWorldGen();
        UkrainePaintings.registerPaintings();
        //ModBlockEntities.registerAllBlockEntities();

        GeckoLib.initialize();

        UkraineFlammableBlockRegistry.registerFlammableBlocks();
        StrippableBlockRegistry.register(UkraineBlocks.RED_VIBURNUM_LOG, UkraineBlocks.STRIPPED_RED_VIBURNUM_LOG);
        StrippableBlockRegistry.register(UkraineBlocks.RED_VIBURNUM_WOOD, UkraineBlocks.STRIPPED_RED_VIBURNUM_WOOD);

        //FabricDefaultAttributeRegistry.register(ModEntities.TIGER, TigerEntity.setAttributes());
    }
}
