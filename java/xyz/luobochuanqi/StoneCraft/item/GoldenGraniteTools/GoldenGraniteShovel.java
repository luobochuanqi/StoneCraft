package xyz.luobochuanqi.StoneCraft.item.GoldenGraniteTools;

import net.minecraft.world.item.ShovelItem;
import xyz.luobochuanqi.StoneCraft.ModGroup;
import xyz.luobochuanqi.StoneCraft.ModTier;

public class GoldenGraniteShovel extends ShovelItem {
    public GoldenGraniteShovel() {
        super(ModTier.GOLDENGRANITE, 1.0F, -3.0F, new Properties().tab(ModGroup.StoneCraftGroup));
    }
}
