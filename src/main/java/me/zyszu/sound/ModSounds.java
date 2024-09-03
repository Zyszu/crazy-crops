package me.zyszu.sound;

import me.zyszu.CrazyCrops;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final Identifier BANDIT_RIDE = Identifier.of(CrazyCrops.MOD_ID, "music_disc_fagata");
    public static SoundEvent BANDIT_RIDE_EVENT = SoundEvent.of(BANDIT_RIDE);

    public static void registerSounds() {
        CrazyCrops.LOGGER.info("Registering Sounds for" + CrazyCrops.MOD_ID);
        Registry.register(Registries.SOUND_EVENT, BANDIT_RIDE, BANDIT_RIDE_EVENT);
    }
}
