package xyz.luobochuanqi.StoneCraft.block.BlockEntity.DreamCrusher;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import xyz.luobochuanqi.StoneCraft.Register.BlockEntityRegister;

import javax.annotation.Nullable;

public class AbstractDreamCrusherBlockEntity extends BaseEntityBlock {
    public AbstractDreamCrusherBlockEntity(Properties p_49795_) {
        super(p_49795_);
    }

    /** 注意，BaseEntityBlock 默认覆写此方法，导致不手动修改会不显示方块原有的模型（但是显示 BlockEntityRenderer） */
    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    /** 右键这个方块的时候会调用 */
    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (pLevel.getBlockEntity(pPos) instanceof DreamCrusherBlockEntity tbe) {
            tbe.use(pPlayer);
            pPlayer.sendMessage(new TextComponent("使用方块的手：" + pHand.name()), pPlayer.getUUID());
        }

        return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
    }

    /** 1.18 一个让我觉得比较神经病的改变，把 tick 方法从 BlockEntity 里拆了出来 */
    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        return BaseEntityBlock.createTickerHelper(pBlockEntityType, BlockEntityRegister.DreamCrusherBlockEntity.get(),
                pLevel.isClientSide ? DreamCrusherBlockEntity::clientTick : DreamCrusherBlockEntity::serverTick);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new DreamCrusherBlockEntity(pPos, pState);
    }
}
