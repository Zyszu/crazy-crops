package me.zyszu.sound;

import me.zyszu.CrazyCrops;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent SOUND_MUSIC_DISC_FAGATA = registerSoundEvent("sound_music_disc_fagata");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(CrazyCrops.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {

        CrazyCrops.LOGGER.info("Registering Sounds for" + CrazyCrops.MOD_ID);
    }
}
