package com.eric.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

import static com.eric.BECUYeric.jiaotongka;

public class Zj1 extends Block {
    //super()
    public Zj1(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(OPEN, false).with(FACING, Direction.NORTH));
    }

    //psf"open"
    public static final BooleanProperty OPEN = BooleanProperty.of("open");
    //方块朝向
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    //builder.add()
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(OPEN);
        builder.add(FACING);
    }
    // 关闭状态碰撞体积
    public static final VoxelShape SHAPE_OFF_N = Stream.of(
            Block.createCuboidShape(6.31039, 4.25, 7.00444, 14.31039, 15.75, 8.00444),
            Block.createCuboidShape(12.06039, 11, 0.00444, 16.060389999999998, 15, 16.00444),
            Block.createCuboidShape(12.06039, 15, 0.00444, 16.060389999999998, 17.125, 13.85444),
            Block.createCuboidShape(12.06039, 9.9798, 15.31287, 16.060389999999998, 12.9798, 17.31287),
            Block.createCuboidShape(12.06039, 0, 0.00444, 16.060389999999998, 11.5, 16.00444)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    public static final VoxelShape SHAPE_OFF_S = Stream.of(
            Block.createCuboidShape(2.06039, 4.25, 8.23787, 10.060390000000002, 15.75, 9.23787),
            Block.createCuboidShape(0.31038999999999994, 11, 0.23787, 4.31039, 15, 16.23787),
            Block.createCuboidShape(0.31038999999999994, 15, 2.38787, 4.31039, 17.125, 16.23787),
            Block.createCuboidShape(0.31038999999999994, 15.29796, 3.9947, 4.31039, 17.29796, 6.9947),
            Block.createCuboidShape(0.31038999999999994, 0, 0.23787, 4.31039, 11.5, 16.23787)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    public static final VoxelShape SHAPE_OFF_W = Stream.of(
            Block.createCuboidShape(7.01122, 4.25, 1.9536100000000003, 8.01122, 15.75, 9.95362),
            Block.createCuboidShape(0.01122, 11, 0.2036100000000003, 16.01122, 15, 4.203609999999999),
            Block.createCuboidShape(0.01122, 15, 0.2036100000000003, 13.86122, 17.125, 4.203609999999999),
            Block.createCuboidShape(13.23456, 13.86654, 0.2036199999999999, 15.23456, 16.86654, 4.203620000000001),
            Block.createCuboidShape(0.01122, 0, 0.2036100000000003, 16.01122, 11.5, 4.203609999999999)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    public static final VoxelShape SHAPE_OFF_E = Stream.of(
            Block.createCuboidShape(8.05956, 4.25, 6.20361, 9.05956, 15.75, 14.20361),
            Block.createCuboidShape(0.05956, 11, 11.953610000000001, 16.05956, 15, 15.95361),
            Block.createCuboidShape(2.20956, 15, 11.953610000000001, 16.05956, 17.125, 15.95361),
            Block.createCuboidShape(-1.24886, 9.9798, 11.953610000000001, 0.75114, 12.9798, 15.95361),
            Block.createCuboidShape(0.05956, 0, 11.953610000000001, 16.05956, 11.5, 15.95361)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    //打开状态碰撞体积
    public static final VoxelShape SHAPE_OPEN_N = Stream.of(
            Block.createCuboidShape(12.06039, 11, 0.00444, 16.060389999999998, 15, 16.00444),
            Block.createCuboidShape(12.06039, 15, 0.00444, 16.060389999999998, 17.125, 13.85444),
            Block.createCuboidShape(12.06039, 9.9798, 15.31287, 16.060389999999998, 12.9798, 17.31287),
            Block.createCuboidShape(12.06039, 0, 0.00444, 16.060389999999998, 11.5, 16.00444)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    public static final VoxelShape SHAPE_OPEN_S = Stream.of(
            Block.createCuboidShape(0.31038999999999994, 11, 0.23787, 4.31039, 15, 16.23787),
            Block.createCuboidShape(0.31038999999999994, 15, 2.38787, 4.31039, 17.125, 16.23787),
            Block.createCuboidShape(0.31038999999999994, 15.29796, 3.9947, 4.31039, 17.29796, 6.9947),
            Block.createCuboidShape(0.31038999999999994, 0, 0.23787, 4.31039, 11.5, 16.23787)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    public static final VoxelShape SHAPE_OPEN_W = Stream.of(
            Block.createCuboidShape(0.01122, 11, 0.2036100000000003, 16.01122, 15, 4.203609999999999),
            Block.createCuboidShape(0.01122, 15, 0.2036100000000003, 13.86122, 17.125, 4.203609999999999),
            Block.createCuboidShape(13.23456, 13.86654, 0.2036199999999999, 15.23456, 16.86654, 4.203620000000001),
            Block.createCuboidShape(0.01122, 0, 0.2036100000000003, 16.01122, 11.5, 4.203609999999999)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    public static final VoxelShape SHAPE_OPEN_E = Stream.of(
            Block.createCuboidShape(0.05956, 11, 11.953610000000001, 16.05956, 15, 15.953609999999998),
            Block.createCuboidShape(2.20956, 15, 11.953610000000001, 16.05956, 17.125, 15.953609999999998),
            Block.createCuboidShape(-1.24886, 9.9798, 11.953610000000001, 0.75114, 12.9798, 15.953609999999998),
            Block.createCuboidShape(0.05956, 0, 11.953610000000001, 16.05956, 11.5, 15.953609999999998)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape SHAPE_DY = Block.createCuboidShape(0,0,0,16,24,16);

    //闸机交互逻辑
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            if (hand != Hand.MAIN_HAND) {
                return ActionResult.PASS;
            }
            ItemStack accItemStack = player.getMainHandStack();
            if (accItemStack.getItem() == jiaotongka) {
                boolean isOpen = state.get(OPEN);
                if (!isOpen) {
                    Direction playerFacing = player.getHorizontalFacing();
                    Direction blockFacing = state.get(FACING);
                    if (playerFacing.getOpposite() != blockFacing) {
                        NbtCompound nbt = accItemStack.getOrCreateNbt();
                        boolean entered = nbt.getBoolean("entered");
                        boolean exited = nbt.getBoolean("exited");
                        if (!entered && !exited) {
                            nbt.putBoolean("entered", true);
                            world.setBlockState(pos, state.with(OPEN, true));
                            int delayInTicks = 30;
                            if (world instanceof ServerWorld) {
                                world.scheduleBlockTick(pos, this, delayInTicks);
                            }
                            accItemStack.setCustomName(Text.literal("雷云地铁交通(已标记)"));
                            return ActionResult.SUCCESS;
                        }
                        if (entered && !exited) {
                            nbt.putBoolean("exited", true);
                            world.setBlockState(pos, state.with(OPEN, true));// 播放音效->成功
                            accItemStack.setCount(0);
                            int delayInTicks = 30;  // 0.5秒=10个tick
                            if (world instanceof ServerWorld) {
                                world.scheduleBlockTick(pos, this, delayInTicks);
                            }
                            return ActionResult.SUCCESS;
                        }
                    }
                }
            } else {

            }
            return ActionResult.FAIL;
        }
        return ActionResult.PASS;
    }

    //碰撞体积
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape shape = null;//初始化shape
        if (state.get(OPEN)) {
            switch (state.get(FACING)) {//处理方向
                case NORTH -> shape = SHAPE_OPEN_N;
                case SOUTH -> shape = SHAPE_OPEN_S;
                case WEST -> shape = SHAPE_OPEN_W;
                case EAST -> shape = SHAPE_OPEN_E;
            }
        } else {
            switch (state.get(FACING)) {//处理方向
                case NORTH -> shape = SHAPE_OFF_N;
                case SOUTH -> shape = SHAPE_OFF_S;
                case WEST -> shape = SHAPE_OFF_W;
                case EAST -> shape = SHAPE_OFF_E;
            }
        }
        return shape;
    }
    //碰撞箱
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape shape = null;
        if (state.get(OPEN)) {
            switch (state.get(FACING)) {//处理方向
                case NORTH -> shape = SHAPE_OPEN_N;
                case SOUTH -> shape = SHAPE_OPEN_S;
                case WEST -> shape = SHAPE_OPEN_W;
                case EAST -> shape = SHAPE_OPEN_E;
            }
        } else {
            return SHAPE_DY;
        }
        return shape;
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        // 关闭方块
        world.setBlockState(pos, state.with(OPEN, false));
    }


    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing());
    }
}
