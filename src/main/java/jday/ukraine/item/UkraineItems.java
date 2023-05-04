package jday.ukraine.item;

import jday.ukraine.Ukraine;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
public class UkraineItems {
    public static final Item EMBLEM = registerItem("emblem",
            new Item(new FabricItemSettings()));
    /*
    public static final Item RAW_CITRINE = registerItem("raw_citrine",
            new Item(new FabricItemSettings()));

    public static final Item TIGER_SPAWN_EGG = registerItem("tiger_spawn_egg",
            new SpawnEggItem(ModEntities.TIGER, 0xD57E36, 0x1D0D00,
                    new FabricItemSettings()));

    public static final Item ANIMATED_ITEM = registerItem("animated_item",
            new AnimatedItem(new FabricItemSettings()));

    public static final Item ANIMATED_BLOCK_ITEM = registerItem("animated_block",
            new AnimatedBlockItem(ModBlocks.ANIMATED_BLOCK, new FabricItemSettings()));

    public static final Item AMETHYST_HELMET = registerItem("amethyst_helmet",
            new AmethystArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate",
            new AmethystArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings",
            new AmethystArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AMETHYST_BOOTS = registerItem("amethyst_boots",
            new AmethystArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item MUSIC_BOX_MUSIC_DISC = registerItem("music_box_music_disc",
            new MusicDiscItem(6, ModSounds.MUSIC_BOX, new FabricItemSettings().maxCount(1), 16));
*/
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Ukraine.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        //addToItemGroup(ItemGroups.INGREDIENTS, EMBLEM);
        addToItemGroup(UkraineItemGroup.UKRAINE, EMBLEM);

        //addToItemGroup(UkraineItemGroup.UKRAINE, CITRINE);
        //addToItemGroup(UkraineItemGroup.UKRAINE, RAW_CITRINE);
        //addToItemGroup(UkraineItemGroup.UKRAINE, TIGER_SPAWN_EGG);
        //addToItemGroup(UkraineItemGroup.UKRAINE, ANIMATED_ITEM);
        //addToItemGroup(UkraineItemGroup.UKRAINE, ANIMATED_BLOCK_ITEM);

        //addToItemGroup(UkraineItemGroup.UKRAINE, AMETHYST_BOOTS);
        //addToItemGroup(UkraineItemGroup.UKRAINE, AMETHYST_LEGGINGS);
        //addToItemGroup(UkraineItemGroup.UKRAINE, AMETHYST_CHESTPLATE);
        //addToItemGroup(UkraineItemGroup.UKRAINE, AMETHYST_HELMET);

        //addToItemGroup(UkraineItemGroup.UKRAINE, MUSIC_BOX_MUSIC_DISC);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        Ukraine.LOGGER.info("Registering Mod Items for " + Ukraine.MOD_ID);

        addItemsToItemGroup();
    }
}
