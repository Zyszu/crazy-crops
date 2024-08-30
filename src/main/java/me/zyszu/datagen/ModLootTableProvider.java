package me.zyszu.datagen;

import me.zyszu.block.HempCropBlock;
import me.zyszu.block.ModBlocks;
import me.zyszu.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.loottable.LootTableProvider;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SOUND_BLOCK);

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.HEMP_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(HempCropBlock.AGE, 5));
        addDrop(ModBlocks.HEMP_CROP, cropDrops(ModBlocks.HEMP_CROP, ModItems.HEMP, ModItems.HEMP_SEEDS, builder));
    }
}
