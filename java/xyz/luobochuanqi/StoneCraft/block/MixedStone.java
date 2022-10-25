package xyz.luobochuanqi.StoneCraft.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class MixedStone extends Block {
    public MixedStone() {
        super(Properties.of(Material.STONE).jumpFactor(5.0F).speedFactor(5.0F).destroyTime(2));
    }
}
