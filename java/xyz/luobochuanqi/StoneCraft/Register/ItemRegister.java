package xyz.luobochuanqi.StoneCraft.Register;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.luobochuanqi.StoneCraft.ModGroup;
import xyz.luobochuanqi.StoneCraft.Utils;
import xyz.luobochuanqi.StoneCraft.item.*;
import xyz.luobochuanqi.StoneCraft.item.GraniteTools.*;
import xyz.luobochuanqi.StoneCraft.item.GoldenGraniteTools.*;

public class ItemRegister {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.ModId);

    public static final RegistryObject<Item> GraniteDebris = ITEMS.register("granite_debris", GraniteDebris::new);

    public static final RegistryObject<Item> GraniteSword = ITEMS.register("granite_sword", GraniteSword::new);
    public static final RegistryObject<Item> GraniteShovel = ITEMS.register("granite_shovel", GraniteShovel::new);
    public static final RegistryObject<Item> GranitePickaxe = ITEMS.register("granite_pickaxe", GranitePickaxe::new);
    public static final RegistryObject<Item> GraniteAxe = ITEMS.register("granite_axe", GraniteAxe::new);
    public static final RegistryObject<Item> GraniteHoe = ITEMS.register("granite_hoe", GraniteHoe::new);

    public static final RegistryObject<Item> GoldenGraniteSword = ITEMS.register("golden_granite_sword", GoldenGraniteSword::new);
    public static final RegistryObject<Item> GoldenGraniteShovel = ITEMS.register("golden_granite_shovel", GoldenGraniteShovel::new);
    public static final RegistryObject<Item> GoldenGranitePickaxe = ITEMS.register("golden_granite_pickaxe", GoldenGranitePickaxe::new);
    public static final RegistryObject<Item> GoldenGraniteAxe = ITEMS.register("golden_granite_axe", GoldenGraniteAxe::new);
    public static final RegistryObject<Item> GoldenGraniteHoe = ITEMS.register("golden_granite_hoe", GoldenGraniteHoe::new);
    //食物类
    public static final RegistryObject<Item> GraniteApple = ITEMS.register("granite_apple",
            () -> new StoneFood(StoneFood.FoodType.APPLE));
    public static final RegistryObject<Item> GraniteCarrot = ITEMS.register("granite_carrot",
            () -> new StoneFood(StoneFood.FoodType.CARROT));
    //方块物品类
    public static final RegistryObject<Item> MixedStone = ITEMS.register("mixed_stone",
            () -> new BlockItem(BlockRegister.MixedStone.get(), new Item.Properties().tab(ModGroup.StoneCraftGroup)));
    public static final RegistryObject<Item> StoneCrusher = ITEMS.register("stone_crusher",
            () -> new BlockItem(BlockRegister.StoneCrusher.get(), new Item.Properties().tab(ModGroup.StoneCraftGroup)));
    public static final RegistryObject<Item> DreamCrusher = ITEMS.register("dream_crusher",
            () -> new BlockItem(BlockRegister.DreamCrusher.get(), new Item.Properties().tab(ModGroup.StoneCraftGroup)));
    //矿石方块物品
    public static final RegistryObject<Item> SpiriStoneOre = ITEMS.register("spiri_stone_ore",
            () -> new BlockItem(BlockRegister.SpiriStoneOre.get(), new Item.Properties().tab(ModGroup.StoneCraftGroup)));
}

