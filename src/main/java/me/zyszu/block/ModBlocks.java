package me.zyszu.block;

import me.zyszu.CrazyCrops;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SOUND_BLOCK = registerBlock("sound_block", new SoundBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    private static Block registerBlock(String name, Block block) {

        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CrazyCrops.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {

        return Registry.register(Registries.ITEM, Identifier.of(CrazyCrops.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CrazyCrops.LOGGER.info("Registering ModBlocks for" + CrazyCrops.MOD_ID);
    }
}
