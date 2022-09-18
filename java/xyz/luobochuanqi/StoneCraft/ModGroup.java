package xyz.luobochuanqi.StoneCraft;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModGroup {
    public static final CreativeModeTab StoneCraftGroup = (new CreativeModeTab("stone_craft_item") {
        @Override
        public ItemStack makeIcon() {
            return (new ItemStack(ItemRegistry.GraniteDebris.get()));
        }
    });
}
