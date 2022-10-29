package xyz.luobochuanqi.StoneCraft.block.OreBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import xyz.luobochuanqi.StoneCraft.Register.ItemRegister;

import net.minecraft.world.level.block.Blocks;

public class SpiriStoneOre extends OreBlock {
    public SpiriStoneOre() {
        super(Properties.of(Material.STONE).strength(3.0F, 3.0F), UniformInt.of(3, 7));
    }

//    public void spawnAfterBreak(BlockState pState, ServerLevel pLevel, BlockPos pPos, ItemStack pStack) {
//        super.spawnAfterBreak(pState, pLevel, pPos, new ItemStack(ItemRegister.GraniteDebris.get()));
//    }
}
