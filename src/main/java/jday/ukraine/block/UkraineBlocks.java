package jday.ukraine.block;

import jday.ukraine.Ukraine;
import jday.ukraine.block.custom.GarlicplantCropBlock;
import jday.ukraine.block.custom.OnionplantCropBlock;
import jday.ukraine.item.UkraineItemGroup;
import jday.ukraine.world.tree.RedViburnumSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
public class UkraineBlocks {
    public static final Block UKRAINE_BLOCK = registerBlock("ukraine_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(32.0f).requiresTool()), UkraineItemGroup.UKRAINE);

    public static final Block G_WALL_BLOCK = registerBlock("g_wall_block",
            new PillarBlock(FabricBlockSettings.of(Material.GOURD).strength(16.0f).requiresTool()), UkraineItemGroup.UKRAINE);
    /*
    public static final Block CITRINE_ORE = registerBlock("citrine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(2, 6)), UkraineItemGroup.UKRAINE);
    public static final Block DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(2, 6)), UkraineItemGroup.UKRAINE);

    public static final Block RED_MAPLE_LOG = registerBlock("red_maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.CITRINE);
    public static final Block RED_MAPLE_WOOD = registerBlock("red_maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.CITRINE);
    public static final Block STRIPPED_RED_MAPLE_LOG = registerBlock("stripped_red_maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.CITRINE);
    public static final Block STRIPPED_RED_MAPLE_WOOD = registerBlock("stripped_red_maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.CITRINE);

    public static final Block RED_MAPLE_PLANKS = registerBlock("red_maple_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.CITRINE);
    public static final Block RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()), ModItemGroup.CITRINE);

    public static final Block RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",
            new SaplingBlock(new RedMapleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()), ModItemGroup.CITRINE);

    public static final Block ANIMATED_BLOCK = Registry.register(Registries.BLOCK, new Identifier(Ukraine.MOD_ID, "animated_block"),
            new AnimatedBlock(FabricBlockSettings.of(Material.STONE).sounds(ModSounds.ANIMATED_BLOCK_SOUNDS).strength(1.0f).nonOpaque()));
    */

    public static final Block RED_VIBURNUM_LOG = registerBlock("red_viburnum_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)), UkraineItemGroup.UKRAINE);
    public static final Block RED_VIBURNUM_WOOD = registerBlock("red_viburnum_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)), UkraineItemGroup.UKRAINE);
    public static final Block STRIPPED_RED_VIBURNUM_LOG = registerBlock("stripped_red_viburnum_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)), UkraineItemGroup.UKRAINE);
    public static final Block STRIPPED_RED_VIBURNUM_WOOD = registerBlock("stripped_red_viburnum_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)), UkraineItemGroup.UKRAINE);

    public static final Block RED_VIBURNUM_PLANKS = registerBlock("red_viburnum_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), UkraineItemGroup.UKRAINE);
    public static final Block RED_VIBURNUM_LEAVES = registerBlock("red_viburnum_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)), UkraineItemGroup.UKRAINE);

    public static final Block RED_VIBURNUM_SAPLING = registerBlock("red_viburnum_sapling",
            new SaplingBlock(new RedViburnumSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), UkraineItemGroup.UKRAINE);


    public static final Block UKRAINE_GARLIC_CROP = registerBlockWithoutItem("garlicplant_crop",
            new GarlicplantCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));
    public static final Block UKRAINE_ONION_CROP = registerBlockWithoutItem("onionplant_crop",
            new OnionplantCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));


    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Ukraine.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(Ukraine.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Ukraine.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerUkraineBlocks() {
        Ukraine.LOGGER.info("Registering ModBlocks for " + Ukraine.MOD_ID);
    }
}
