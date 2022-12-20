package xyz.luobochuanqi.StoneCraft.item.GraniteTools;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import xyz.luobochuanqi.StoneCraft.ModUtils.ModGroup;
import xyz.luobochuanqi.StoneCraft.ModUtils.ModTier;

public class GranitePickaxe extends PickaxeItem {
    public GranitePickaxe() {
//        super(ModTier.GRANITE, 2, -3f, new Item.Properties().tab(ModGroup.StoneCraftGroup));
        super(ModTier.GRANITE, 0, -2.5f, new Item.Properties().tab(ModGroup.StoneCraftGroup));
    }
}
