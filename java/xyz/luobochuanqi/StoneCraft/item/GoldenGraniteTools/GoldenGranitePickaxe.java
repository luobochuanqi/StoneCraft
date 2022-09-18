package xyz.luobochuanqi.StoneCraft.item.GoldenGraniteTools;

import net.minecraft.world.item.PickaxeItem;
import xyz.luobochuanqi.StoneCraft.ModGroup;
import xyz.luobochuanqi.StoneCraft.ModTier;

public class GoldenGranitePickaxe extends PickaxeItem {
    public GoldenGranitePickaxe() {
        super(ModTier.GOLDENGRANITE, 0, -2.5f, new Properties().tab(ModGroup.StoneCraftGroup));
    }
}
