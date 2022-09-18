package xyz.luobochuanqi.StoneCraft;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.function.Supplier;

@Mod("stonecraft")
public class StoneCraft {
    public StoneCraft() {
//        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
//        ItemRegistry.ITEMS.register(modbus);
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}

