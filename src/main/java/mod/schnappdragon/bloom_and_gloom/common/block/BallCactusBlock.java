package mod.schnappdragon.bloom_and_gloom.common.block;

import mod.schnappdragon.bloom_and_gloom.common.misc.BallCactusColor;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ForgeHooks;

import java.util.Random;

public class BallCactusBlock extends AbstractBallCactusBlock implements IGrowable {
    public BallCactusBlock(BallCactusColor color, Properties properties) {
        super(color, properties);
    }

    /*
     * Growth Methods
     */

    public boolean ticksRandomly(BlockState state) {
        return true;
    }

    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        if (ForgeHooks.onCropsGrowPre(worldIn, pos, state,random.nextInt(10) == 0)) {
            worldIn.setBlockState(pos, getColor().getFloweringBallCactus().getDefaultState());
            ForgeHooks.onCropsGrowPost(worldIn, pos, state);
        }
    }

    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }

    public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
        worldIn.setBlockState(pos, getColor().getFloweringBallCactus().getDefaultState());
    }
}
