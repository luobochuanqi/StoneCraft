package xyz.luobochuanqi.StoneCraft;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.luobochuanqi.StoneCraft.block.MixedStone;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.ModId);

    public static final RegistryObject<Block> MixedStone = BLOCKS.register("mixed_stone", MixedStone::new);
}
