package com.eric.block;

import com.eric.BECUYeric;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class TurnstileBlock extends Block {
    public static final BooleanProperty ACTIVATED = BooleanProperty.of("activated");

    // 碰撞箱尺寸 (1.5格高 = 24像素)
    private static final VoxelShape COLLISION_SHAPE = Block.createCuboidShape(0, 0, 0, 16, 24, 16);

    public TurnstileBlock(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(ACTIVATED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ACTIVATED);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        // 始终使用阻挡玩家的碰撞箱
        return COLLISION_SHAPE;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack stack = player.getStackInHand(hand);

        // 检查是否使用了交通卡
        if (stack.isOf(BECUYeric.jiaotongka) && !state.get(ACTIVATED)) {
            if (!world.isClient) {
                // 设置为激活状态
                world.setBlockState(pos, state.with(ACTIVATED, true));

                // 3秒后恢复原始状态 (60 ticks = 3秒)
                ((ServerWorld) world).scheduleBlockTick(pos, this, 60);
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (state.get(ACTIVATED)) {
            world.setBlockState(pos, state.with(ACTIVATED, false));
        }
    }
}