package xyz.luobochuanqi.StoneCraft.Register;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.luobochuanqi.StoneCraft.Utils;
import xyz.luobochuanqi.StoneCraft.block.BlockEntity.AbstractCrusherBlock;
import xyz.luobochuanqi.StoneCraft.block.BlockEntity.DreamCrusher.AbstractDreamCrusherBlockEntity;
import xyz.luobochuanqi.StoneCraft.block.MixedStone;
import xyz.luobochuanqi.StoneCraft.block.OreBlock.*;

public class BlockRegister {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.ModId);

    public static final RegistryObject<Block> MixedStone = BLOCKS.register("mixed_stone", MixedStone::new);

    //矿石
    public static final RegistryObject<Block> SpiriStoneOre = BLOCKS.register("spiri_stone_ore", SpiriStoneOre::new);

    public static final RegistryObject<Block> StoneCrusher = BLOCKS.register("stone_crusher",
            () -> new AbstractCrusherBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> DreamCrusher = BLOCKS.register("dream_crusher",
            () -> new AbstractDreamCrusherBlockEntity(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));
}
