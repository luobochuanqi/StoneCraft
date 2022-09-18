package xyz.luobochuanqi.StoneCraft.item.GraniteTools;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.SwordItem;
import xyz.luobochuanqi.StoneCraft.ModGroup;
import xyz.luobochuanqi.StoneCraft.ModTier;

public class GraniteSword extends SwordItem {
    public GraniteSword() {
        super(ModTier.GRANITE, 2, -2.0F, new Properties().tab(ModGroup.StoneCraftGroup));
    }
}
