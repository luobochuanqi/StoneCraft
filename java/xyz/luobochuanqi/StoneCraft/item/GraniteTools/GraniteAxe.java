package xyz.luobochuanqi.StoneCraft.item.GraniteTools;

import net.minecraft.world.item.AxeItem;
import xyz.luobochuanqi.StoneCraft.ModUtils.ModGroup;
import xyz.luobochuanqi.StoneCraft.ModUtils.ModTier;

public class GraniteAxe extends AxeItem {
    public GraniteAxe() {
        super(ModTier.GRANITE, 5.0F, -3.0F, new Properties().tab(ModGroup.StoneCraftGroup));
    }
}
