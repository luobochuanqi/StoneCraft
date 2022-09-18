//package xyz.luobochuanqi.StoneCraft;
//
//import net.minecraft.world.item.Tier;
//import net.minecraft.world.item.crafting.Ingredient;
//
//public enum ModItemTier implements Tier {
//    GRANITE(3, 2000, 10.0F, 4.0F, 30);
//
//    private final int harvestLevel;
//    private final int maxUses;
//    private final float efficiency;
//    private final float attackDamage;
//    private final int enchantability;
//
//    ModItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn) {
//        this.harvestLevel = harvestLevelIn;
//        this.maxUses = maxUsesIn;
//        this.efficiency = efficiencyIn;
//        this.attackDamage = attackDamageIn;
//        this.enchantability = enchantabilityIn;
//    }
//
//    @Override
//    public int getUses() {
//        return this.maxUses;
//    }
//
//    @Override
//    public float getSpeed() {
//        return this.efficiency;
//    }
//
//    @Override
//    public float getAttackDamageBonus() {
//        return this.attackDamage;
//    }
//
//    @Override
//    public int getLevel() {
//        return this.harvestLevel;
//    }
//
//    @Override
//    public int getEnchantmentValue() {
//        return this.enchantability;
//    }
//
//    @Override
//    public Ingredient getRepairIngredient() {
//        return Ingredient.of(ItemRegistry.GraniteDebris.get());
//    }
//}
