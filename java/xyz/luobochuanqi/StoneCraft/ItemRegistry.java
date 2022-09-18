package xyz.luobochuanqi.StoneCraft;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.luobochuanqi.StoneCraft.item.*;
import xyz.luobochuanqi.StoneCraft.item.GraniteTools.*;
import xyz.luobochuanqi.StoneCraft.item.GoldenGraniteTools.*;

public class ItemRegistry {
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
}
