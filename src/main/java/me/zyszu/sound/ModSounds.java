package me.zyszu.sound;

import me.zyszu.CrazyCrops;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final Identifier BANDIT_RIDE = Identifier.of(CrazyCrops.MOD_ID, "bandit_ride");
    public static SoundEvent BANDIT_RIDE_EVENT = SoundEvent.of(BANDIT_RIDE);

    public static void registerSounds() {
        CrazyCrops.LOGGER.info("Registering Sounds for" + CrazyCrops.MOD_ID);
        Registry.register(Registries.SOUND_EVENT, BANDIT_RIDE, BANDIT_RIDE_EVENT);
    }
}
