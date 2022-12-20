package xyz.luobochuanqi.StoneCraft.item.GraniteTools;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import xyz.luobochuanqi.StoneCraft.ModUtils.ModGroup;
import xyz.luobochuanqi.StoneCraft.ModUtils.ModTier;

public class GraniteShovel extends ShovelItem {
    public GraniteShovel() {
        super(ModTier.GRANITE, 1.0F, -3.0F, new Item.Properties().tab(ModGroup.StoneCraftGroup));
    }
}
