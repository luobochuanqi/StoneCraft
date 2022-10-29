package xyz.luobochuanqi.StoneCraft.Register;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import net.minecraftforge.registries.RegistryObject;
import xyz.luobochuanqi.StoneCraft.Utils;
import xyz.luobochuanqi.StoneCraft.block.BlockEntity.CrusherEntityBlock;
import xyz.luobochuanqi.StoneCraft.block.BlockEntity.DreamCrusher.DreamCrusherBlockEntity;

public class BlockEntityRegister {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Utils.ModId);


    public static final RegistryObject<BlockEntityType<CrusherEntityBlock>> StoneCrusherBlockEntity = BLOCK_ENTITIES.register("stone_crusher_block_entity",
            () -> BlockEntityType.Builder.of(CrusherEntityBlock::new, BlockRegister.StoneCrusher.get()).build(null));
    //测试DreamCrusher
    public static final RegistryObject<BlockEntityType<DreamCrusherBlockEntity>> DreamCrusherBlockEntity = BLOCK_ENTITIES.register("dream_crusher_block_entity",
            () -> BlockEntityType.Builder.of(DreamCrusherBlockEntity::new, BlockRegister.DreamCrusher.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
