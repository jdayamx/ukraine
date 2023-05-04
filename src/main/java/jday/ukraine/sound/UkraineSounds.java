package jday.ukraine.sound;

import jday.ukraine.Ukraine;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class UkraineSounds {
    public static SoundEvent COOL_SOUND = registerSoundEvent("cool_sound");

    public static SoundEvent ANIMATED_BLOCK_BREAK = registerSoundEvent("animated_block_break");
    public static SoundEvent ANIMATED_BLOCK_WALK = registerSoundEvent("animated_block_walk");
    public static SoundEvent ANIMATED_BLOCK_PLACE = registerSoundEvent("animated_block_place");
    public static SoundEvent ANIMATED_BLOCK_HIT = registerSoundEvent("animated_block_hit");

    public static final BlockSoundGroup ANIMATED_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            UkraineSounds.ANIMATED_BLOCK_BREAK, UkraineSounds.ANIMATED_BLOCK_WALK, UkraineSounds.ANIMATED_BLOCK_PLACE,
            UkraineSounds.ANIMATED_BLOCK_HIT, UkraineSounds.ANIMATED_BLOCK_WALK);

    public static SoundEvent UKRAINE_AMBIENT = registerSoundEvent("ukraine_ambient");
    public static SoundEvent UKRAINE_LASTIVOCHKA = registerSoundEvent("ukraine_lastivochka");
    public static SoundEvent UKRAINE_SOUL = registerSoundEvent("ukraine_soul");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Ukraine.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}
