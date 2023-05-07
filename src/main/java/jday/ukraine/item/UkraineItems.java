package jday.ukraine.item;

import jday.ukraine.Ukraine;
import jday.ukraine.block.UkraineBlocks;
import jday.ukraine.sound.UkraineSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
public class UkraineItems {
    public static final Item EMBLEM = registerItem("emblem",
            new Item(new FabricItemSettings()));

    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new FabricItemSettings()));
    public static final Item IRON_NUGGET = registerItem("iron_nugget",
            new Item(new FabricItemSettings()));

    public static final Item UKRAINE_GARLIC = registerItem("ukraine_garlic",
            new AliasedBlockItem(UkraineBlocks.UKRAINE_GARLIC_CROP, new FabricItemSettings().food(
                    new FoodComponent.Builder()
                            .hunger(2)
                            .saturationModifier(0.2f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 10 * 20), 1.0f)
                            .build()
            )));
    public static final Item UKRAINE_ONION = registerItem("ukraine_onion",
            new AliasedBlockItem(UkraineBlocks.UKRAINE_ONION_CROP, new FabricItemSettings().food(
                    new FoodComponent.Builder()
                            .hunger(3)
                            .saturationModifier(0.4f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 10 * 40), 2.0f)
                            .build()
            )));
    public static final Item UKRAINE_SALO = registerItem("ukraine_salo",
            new AliasedBlockItem(UkraineBlocks.UKRAINE_GARLIC_CROP, new FabricItemSettings().food(
                    new FoodComponent.Builder()
                            .hunger(3)
                            .saturationModifier(0.5f)
                            .build()
            )));
    public static final Item UKRAINE_SALO_FRIED = registerItem("ukraine_salo_fried",
            new AliasedBlockItem(UkraineBlocks.UKRAINE_GARLIC_CROP, new FabricItemSettings().food(
                    new FoodComponent.Builder()
                            .hunger(6)
                            .saturationModifier(0.5f)
                            .build()
            )));
    public static final Item UKRAINE_EGG_FRIED = registerItem("ukraine_egg_fried",
            new AliasedBlockItem(UkraineBlocks.UKRAINE_GARLIC_CROP, new FabricItemSettings().food(
                    new FoodComponent.Builder()
                            .hunger(3)
                            .saturationModifier(0.6f)
                            .build()
            )));

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
    public static final Item UKRAINE_AMBIENT_MUSIC_DISC = registerItem("ukraine_ambient_music_disc",
            new MusicDiscItem(6, UkraineSounds.UKRAINE_AMBIENT, new FabricItemSettings().maxCount(1), 181));
    public static final Item UKRAINE_LASTIVOCHKA_MUSIC_DISC = registerItem("ukraine_lastivochka_music_disc",
            new MusicDiscItem(6, UkraineSounds.UKRAINE_LASTIVOCHKA, new FabricItemSettings().maxCount(1), 64));
    public static final Item UKRAINE_SOUL_MUSIC_DISC = registerItem("ukraine_soul_music_disc",
            new MusicDiscItem(6, UkraineSounds.UKRAINE_SOUL, new FabricItemSettings().maxCount(1), 120));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Ukraine.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        //addToItemGroup(ItemGroups.INGREDIENTS, EMBLEM);
        addToItemGroup(UkraineItemGroup.UKRAINE, EMBLEM);

        addToItemGroup(UkraineItemGroup.UKRAINE, UKRAINE_GARLIC);
        addToItemGroup(UkraineItemGroup.UKRAINE, UKRAINE_ONION);
        addToItemGroup(UkraineItemGroup.UKRAINE, UKRAINE_SALO);
        addToItemGroup(UkraineItemGroup.UKRAINE, UKRAINE_SALO_FRIED);
        addToItemGroup(UkraineItemGroup.UKRAINE, UKRAINE_EGG_FRIED);

        //addToItemGroup(UkraineItemGroup.UKRAINE, CITRINE);
        //addToItemGroup(UkraineItemGroup.UKRAINE, RAW_CITRINE);
        //addToItemGroup(UkraineItemGroup.UKRAINE, TIGER_SPAWN_EGG);
        //addToItemGroup(UkraineItemGroup.UKRAINE, ANIMATED_ITEM);
        //addToItemGroup(UkraineItemGroup.UKRAINE, ANIMATED_BLOCK_ITEM);

        //addToItemGroup(UkraineItemGroup.UKRAINE, AMETHYST_BOOTS);
        //addToItemGroup(UkraineItemGroup.UKRAINE, AMETHYST_LEGGINGS);
        //addToItemGroup(UkraineItemGroup.UKRAINE, AMETHYST_CHESTPLATE);
        //addToItemGroup(UkraineItemGroup.UKRAINE, AMETHYST_HELMET);

        addToItemGroup(UkraineItemGroup.UKRAINE, UKRAINE_AMBIENT_MUSIC_DISC);
        addToItemGroup(UkraineItemGroup.UKRAINE, UKRAINE_LASTIVOCHKA_MUSIC_DISC);
        addToItemGroup(UkraineItemGroup.UKRAINE, UKRAINE_SOUL_MUSIC_DISC);

        addToItemGroup(UkraineItemGroup.UKRAINE, COPPER_NUGGET);
        addToItemGroup(UkraineItemGroup.UKRAINE, IRON_NUGGET);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerUkraineItems() {
        Ukraine.LOGGER.info("Registering Mod Items for " + Ukraine.MOD_ID);

        addItemsToItemGroup();
    }
}
