package me.zyszu.datagen;

import me.zyszu.block.HempCropBlock;
import me.zyszu.block.ModBlocks;
import me.zyszu.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);
        blockStateModelGenerator.registerCrop(ModBlocks.HEMP_CROP, HempCropBlock.AGE, 0, 1, 2, 3, 4, 5);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.HEMP, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_FAGATA, Models.GENERATED);
    }
}
