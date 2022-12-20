package xyz.luobochuanqi.StoneCraft.ModUtils;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModTier implements Tier {
    GRANITE(200, 6.0F, 2.0F, 2, 20, Ingredient.of(Items.GRANITE)),
    GOLDENGRANITE(1000, 8.0F, 4.0F, 3, 30, Ingredient.of(Items.GOLD_INGOT));

    private final int UseOut;
    private final float SpeedOut;
    private final float AttackDamageBonusOut;
    private final int LevelOut;
    private final int EnchantmentValueOut;
    private final Ingredient RepairIngredientOut;

    ModTier(int UseIn, float SpeedIn, float AttackDamageBonusIn, int LevelIn, int EnchantmentValueIn, Ingredient RepairIngredientIn) {
        this.UseOut = UseIn;
        this.SpeedOut = SpeedIn;
        this.AttackDamageBonusOut = AttackDamageBonusIn;
        this.LevelOut = LevelIn;
        this.EnchantmentValueOut = EnchantmentValueIn;
        this.RepairIngredientOut = RepairIngredientIn;
    }

    @Override
    public int getUses() {
        return this.UseOut;
    }

    @Override
    public float getSpeed() {
        return this.SpeedOut;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.AttackDamageBonusOut;
    }

    @Override
    public int getLevel() {
        return this.LevelOut;
    }

    @Override
    public int getEnchantmentValue() {
        return this.EnchantmentValueOut;
    }

    @Override
    public Ingredient getRepairIngredient() {
//        return Ingredient.of(ItemRegistry.GraniteDebris.get());
        return this.RepairIngredientOut;
    }
}
