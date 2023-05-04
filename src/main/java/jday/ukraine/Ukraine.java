package jday.ukraine;

import jday.ukraine.block.UkraineBlocks;
import jday.ukraine.item.UkraineItemGroup;
import jday.ukraine.item.UkraineItems;
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

import java.util.List;
public class Ukraine implements ModInitializer {
    public static final String MOD_ID = "ukraine";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        UkraineItemGroup.registerItemGroups();
        UkraineItems.registerModItems();
        UkraineBlocks.registerModBlocks();
        //ModWorldGeneration.generateModWorldGen();

        //ModBlockEntities.registerAllBlockEntities();

        //GeckoLib.initialize();

        //ModFlammableBlockRegistry.registerFlammableBlocks();
        //StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_LOG, ModBlocks.STRIPPED_RED_MAPLE_LOG);
        //StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_WOOD, ModBlocks.STRIPPED_RED_MAPLE_WOOD);

        //FabricDefaultAttributeRegistry.register(ModEntities.TIGER, TigerEntity.setAttributes());
    }
}
