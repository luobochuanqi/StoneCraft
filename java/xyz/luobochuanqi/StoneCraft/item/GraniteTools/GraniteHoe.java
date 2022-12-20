package xyz.luobochuanqi.StoneCraft.item.GraniteTools;

import net.minecraft.world.item.HoeItem;
import xyz.luobochuanqi.StoneCraft.ModUtils.ModGroup;
import xyz.luobochuanqi.StoneCraft.ModUtils.ModTier;

public class GraniteHoe extends HoeItem {
    public GraniteHoe() {
        super(ModTier.GRANITE, -2, -1.0F, new Properties().tab(ModGroup.StoneCraftGroup));
    }
}
