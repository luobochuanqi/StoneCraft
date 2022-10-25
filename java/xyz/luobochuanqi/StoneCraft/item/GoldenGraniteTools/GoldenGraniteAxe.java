package xyz.luobochuanqi.StoneCraft.item.GoldenGraniteTools;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import xyz.luobochuanqi.StoneCraft.ModGroup;
import xyz.luobochuanqi.StoneCraft.ModTier;

import java.util.List;

public class GoldenGraniteAxe extends AxeItem {
    public GoldenGraniteAxe() {
        super(ModTier.GOLDENGRANITE, 5.0F, -3.0F, new Properties().tab(ModGroup.StoneCraftGroup));
    }

    @Override
    public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_, List<Component> list, TooltipFlag p_41424_) {
        super.appendHoverText(p_41421_, p_41422_, list, p_41424_);
        list.add(new TranslatableComponent("item.stonecraft.golden_granite_tool.tooltip").setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
    }
}
