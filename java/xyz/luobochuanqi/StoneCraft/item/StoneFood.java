package xyz.luobochuanqi.StoneCraft.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import xyz.luobochuanqi.StoneCraft.ModUtils.ModGroup;

import java.util.List;


public class StoneFood extends Item{
    private static final FoodProperties Apple = (new FoodProperties.Builder())
            .nutrition(10)
            .saturationMod(20)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 3 * 20, 1), 1)
            .build();

    protected FoodType foodType;

    public StoneFood(FoodType type) {
        super(new Item.Properties().tab(ModGroup.StoneCraftGroup).food(Apple).rarity(Rarity.UNCOMMON));
        this.foodType = type;
    }
    public FoodType getType() {
        return this.foodType;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        FoodType type = ((StoneFood)itemstack.getItem()).getType();
        list.add(new TranslatableComponent("item.stonecraft.food."+ type +".tooltip").setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
    }

    public enum FoodType implements StringRepresentable {
        APPLE("apple"),
        CARROT("carrot");

        private final String name;
        FoodType(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }

        @Override
        public String getSerializedName() {
            return this.name;
        }
    }
}
