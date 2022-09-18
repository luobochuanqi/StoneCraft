//package xyz.luobochuanqi.StoneCraft;
//
//import net.minecraft.util.LazyLoadedValue;
//import net.minecraft.world.item.Items;
//import net.minecraft.world.item.Tier;
//import net.minecraft.world.item.crafting.Ingredient;
//
//import java.util.function.Supplier;
//
//public enum CustomItemTier implements Tier {
//    //这是我们的自定义的工具等级，可以往下续写...
//    exampleToolTire(10, 120, 8.0F, 10.0F, 100, Ingredient.of(Items.DIAMOND));
//    private final int level;
//    private final int uses;
//    private final float speed;
//    private final float damage;
//    private final int enchantmentValue;
//    private final Ingredient repairIngredient;
//
//
//    CustomItemTier(int p_43332_, int p_43333_, float p_43334_, float p_43335_, int p_43336_, Ingredient p_43337_) {
//        this.level = p_43332_;
//        this.uses = p_43333_;
//        this.speed = p_43334_;
//        this.damage = p_43335_;
//        this.enchantmentValue = p_43336_;
//        this.repairIngredient = p_43337_;
//    }
//
//
//    public int getUses() {
//        return this.uses;
//    }
//    public float getSpeed() {
//        return this.speed;
//    }
//    public float getAttackDamageBonus() {
//        return this.damage;
//    }
//    public int getLevel() {
//        return this.level;
//    }
//    public int getEnchantmentValue() {
//        return this.enchantmentValue;
//    }
//    public Ingredient getRepairIngredient() {
//        return this.repairIngredient;
////        return Ingredient.of(ItemRegistry.GraniteDebris.get());
//    }
//}
