package me.zyszu.item;

import me.zyszu.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;

public class ModItemGroups {

    public static void inti() {
        addItemToItemGroup(ModItems.MUSIC_DISC_FAGATA, ItemGroups.TOOLS);

//        addBlockToItemGroup(ModBlocks.SOUND_BLOCK, ItemGroups.REDSTONE);

        addItemToItemGroup(ModItems.HEMP_SEEDS, ItemGroups.NATURAL);
        addItemToItemGroup(ModItems.HEMP, ItemGroups.NATURAL);
    }

    private static void addItemToItemGroup(Item item, RegistryKey<ItemGroup> group) {
        ItemGroupEvents.modifyEntriesEvent(group).register((itemGroup) -> itemGroup.addAfter(
                item.getDefaultStack(), item.getDefaultStack()));
    }

//    private static void addBlockToItemGroup(Block block, RegistryKey<Blocks> group) {
//        ItemGroupEvents.modifyEntriesEvent(group).register((itemGroup) -> itemGroup.addAfter(
//                block.getDefaultStack(), block.getDefaultStack()));
//    }

}
