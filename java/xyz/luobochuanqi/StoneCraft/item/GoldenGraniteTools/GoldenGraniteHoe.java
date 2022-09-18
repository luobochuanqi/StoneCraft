package xyz.luobochuanqi.StoneCraft.item.GoldenGraniteTools;

import net.minecraft.world.item.HoeItem;
import xyz.luobochuanqi.StoneCraft.ModGroup;
import xyz.luobochuanqi.StoneCraft.ModTier;

public class GoldenGraniteHoe extends HoeItem {
    public GoldenGraniteHoe() {
        super(ModTier.GOLDENGRANITE, -2, -1.0F, new Properties().tab(ModGroup.StoneCraftGroup));
    }
}
