package xyz.luobochuanqi.StoneCraft.block.BlockEntity.DreamCrusher;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import xyz.luobochuanqi.StoneCraft.Register.BlockEntityRegister;

public class DreamCrusherBlockEntity extends BlockEntity {
    public DreamCrusherBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(BlockEntityRegister.DreamCrusherBlockEntity.get(), pWorldPosition, pBlockState);
    }

    int count;

    boolean initialized = false;
    int serverMsg;
    int clientMsg;

    public void use(Player player) {
        if (getLevel().isClientSide()) {
            if (!initialized) {
                clientMsg = 1001;
                initialized = true;
            }

            // 调试信息，展示了不同步状态下的信息
            player.sendMessage(new TextComponent("仅在客户端的内容：" + clientMsg), player.getUUID());
            player.sendMessage(new TextComponent("双端内容客户端：" + count), player.getUUID());
        }
        else {
            if (!initialized) {
                serverMsg = 2332;
                initialized = true;
            }

            // 调试信息，展示了不同步状态下的信息
            player.sendMessage(new TextComponent("仅在服务器端的内容：" + serverMsg), player.getUUID());

            count++;
            player.sendMessage(new TextComponent("双端内容服务端：" + count), player.getUUID());

            sync();
        }
    }

    /** 同步的方法，看不懂就照抄，调用它会调用下面的 getUpdateTag */
    protected void sync() {
        if (!level.isClientSide) {
            ClientboundBlockEntityDataPacket p = ClientboundBlockEntityDataPacket.create(this);
            ((ServerLevel)this.level).getChunkSource().chunkMap.getPlayers(new ChunkPos(getBlockPos()), false).forEach(k -> k.connection.send(p));

            // 用来告知 mc，“这个方块得保存”的东西，你也可以在其他地方调用
            setChanged();
        }
    }

    /** 网络包会调用这个方法（服务端） */
    @Override
    public CompoundTag getUpdateTag() {
        CompoundTag result = new CompoundTag();

        result.putInt("count", count);

        return result;
    }

    /** 持久化会调用这个方法：也就是说，你退出游戏再进入游戏，数据不会消失就是它的作用（服务端） */
    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.putInt("count", count);
    }

    /**
     * 不论是网络包还是持久化都会调用这个方法，从 nbt 加载数据（服务端（持久化）/客户端（网络包））
     * 注意，此时的 BlockEntity *没有* 初始化 level，所以此时 getLevel 一定会报错
     * 但服务端的内容不会自动同步到客户端，怎么办呢？见下方的解决方法
     */
    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);

        count = pTag.getInt("count");

        // 虽然此时的客户端上的 needSync 也被修改了，但由于这个字段不会在客户端使用所以无需担心
        needSync = true;
    }

    /** 每 tick 都会调用，仅在客户端上执行 */
    public static void clientTick(Level level, BlockPos pos, BlockState state, BlockEntity o) {

    }

    /** 每 tick 都会调用，仅在服务端上执行 */
    public static void serverTick(Level level, BlockPos pos, BlockState state, DreamCrusherBlockEntity e) {
        e.syncTick();
    }

    // 同步的解决方案

    boolean needSync;

    void syncTick() {
        if (needSync) {
            sync();
            needSync = false;
        }
    }
}
