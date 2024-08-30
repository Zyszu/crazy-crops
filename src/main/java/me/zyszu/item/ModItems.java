package me.zyszu.item;

import me.zyszu.CrazyCrops;
import me.zyszu.block.ModBlocks;
import me.zyszu.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item HEMP = registerItem("hemp", new Item(new Item.Settings()));

    public static final Item HEMP_SEEDS = registerItem("hemp_seeds",
            new AliasedBlockItem(ModBlocks.HEMP_CROP, new Item.Settings()));

    public static final Item MUSIC_DISC_FAGATA = registerItem("music_disc_fagata", new Item(new Item.Settings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries group) {
        group.add(HEMP);
        group.add(HEMP_SEEDS);
    }

    private static void addItemsToToolsItemGroup(FabricItemGroupEntries group) {
        group.add(MUSIC_DISC_FAGATA);
    }

    private static Item registerItem(String name, Item item) {

        Identifier itemID = Identifier.of(CrazyCrops.MOD_ID, name);
        return Registry.register(Registries.ITEM, itemID, item);
    }

    public static void registerModItems() {
        CrazyCrops.LOGGER.info("Registering Mod Items for " + CrazyCrops.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);
    }

}
