package xyz.luobochuanqi.StoneCraft.item.GoldenGraniteTools;

import net.minecraft.world.item.AxeItem;
import xyz.luobochuanqi.StoneCraft.ModGroup;
import xyz.luobochuanqi.StoneCraft.ModTier;

public class GoldenGraniteAxe extends AxeItem {
    public GoldenGraniteAxe() {
        super(ModTier.GOLDENGRANITE, 5.0F, -3.0F, new Properties().tab(ModGroup.StoneCraftGroup));
    }
}
