package me.zyszu.datagen;

import me.zyszu.block.ModBlocks;
import me.zyszu.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipieProvider extends FabricRecipeProvider {
    public ModRecipieProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SOUND_BLOCK, 1)
                .pattern("XXX")
                .pattern("XYX")
                .pattern("XXX")
                .input('X', Items.DIAMOND)
                .input('Y', Items.WOODEN_HOE)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.WOODEN_HOE), conditionsFromItem(Items.WOODEN_HOE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.SOUND_BLOCK)));
    }
}
