package xyz.luobochuanqi.StoneCraft.item.GoldenGraniteTools;

import net.minecraft.world.item.SwordItem;
import xyz.luobochuanqi.StoneCraft.ModGroup;
import xyz.luobochuanqi.StoneCraft.ModTier;

public class GoldenGraniteSword extends SwordItem {
    public GoldenGraniteSword() {
        super(ModTier.GOLDENGRANITE, 2, -2.0F, new Properties().tab(ModGroup.StoneCraftGroup));
    }
}
