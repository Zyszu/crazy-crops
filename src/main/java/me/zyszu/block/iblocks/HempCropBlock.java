package me.zyszu.block.iblocks;

import me.zyszu.CrazyCrops;
import me.zyszu.genetics.Gens;
import me.zyszu.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class HempCropBlock extends CropBlock {

    public static final int MAX_AGE = 5;
    public static final IntProperty AGE = IntProperty.of("age", 0, MAX_AGE);
    public static final IntProperty CG = IntProperty.of("gen", 0, 7);
    public Gens.GEN_TYPE CROP_GEN;

    public HempCropBlock(Settings settings) {
        super(settings);
        CROP_GEN = Gens.intToGEN_TYPE(Random.createLocal().nextInt(7));
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.HEMP_SEEDS;
    }

    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        CrazyCrops.LOGGER.info("zasadzono z genem: " + Gens.GEN_TYPEToString(CROP_GEN));
    }
}
