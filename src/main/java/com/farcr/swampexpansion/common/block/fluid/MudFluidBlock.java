package com.farcr.swampexpansion.common.block.fluid;

import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;
import java.util.function.Supplier;

public abstract class MudFluidBlock extends FlowingFluidBlock {


    protected MudFluidBlock(Supplier<? extends FlowingFluid> fluid, Properties properties) {
        super(fluid, properties);
    }

    // WARNING: LITERALLY JANK AND CRAP :o

//    @Deprecated
//    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
//
//        if (entity instanceof PlayerEntity && ((PlayerEntity)entity).abilities.isFlying) {
//            return;
//        }
//        Vec3d motion = entity.getMotion();
//        entity.setMotion(motion.getX() * 0.3, -0.1d, motion.getZ() * 0.3);
//    }
}