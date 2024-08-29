package me.zyszu.item;

import net.minecraft.util.Identifier;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;

public final class MyItemTags extends ItemTags {
    public static final TagKey<Item> MUSIC_DISCS = TagKey.of(RegistryKeys.ITEM, Identifier.of("music_discs"));
}
