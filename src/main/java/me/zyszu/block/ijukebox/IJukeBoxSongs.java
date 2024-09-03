package me.zyszu.block.ijukebox;

import me.zyszu.CrazyCrops;
import me.zyszu.sound.ModSounds;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.block.jukebox.JukeboxSongs;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.List;

// do funkcyji w itemsach potrzebny jest typ RegistryKey<JukeboxSong>
// public record JukeboxSong(RegistryEntry<SoundEvent> soundEvent, Text description, float lengthInSeconds, int comparatorOutput)

public interface IJukeBoxSongs {

    RegistryKey<JukeboxSong> MUSIC_DISC_FAGATA = of("music_disc_fagata");

    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(CrazyCrops.MOD_ID, id));
    }

}
