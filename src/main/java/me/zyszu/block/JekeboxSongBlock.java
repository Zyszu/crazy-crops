package me.zyszu.block;

import me.zyszu.CrazyCrops;
import me.zyszu.sound.ModSounds;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.block.jukebox.JukeboxSongs;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class JekeboxSongBlock extends Block {

    static RegistryKey<JukeboxSong> BANDIT_RIDE = of("bandit_ride");
    public static final Block BLOCK_DISC = registerBlock("block_disc", new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));

    public JekeboxSongBlock(Settings settings) {
        super(settings);
    }
    private static Block registerBlock(String name, Block block) {

        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CrazyCrops.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {

        return Registry.register(Registries.ITEM, Identifier.of(CrazyCrops.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(CrazyCrops.MOD_ID, id));
    }

    private static void register(
            Registerable<JukeboxSong> registry, RegistryKey<JukeboxSong> key, RegistryEntry.Reference<SoundEvent> soundEvent, int lengthInSeconds, int comparatorOutput
    ) {
        registry.register(
                key, new JukeboxSong(soundEvent, Text.translatable(Util.createTranslationKey("jukebox_song", key.getValue())), (float)lengthInSeconds, comparatorOutput)
        );
    }

    public static void registerModItems() {
        Identifier itemID = Identifier.of(CrazyCrops.MOD_ID, "block_disc");
    }
}
