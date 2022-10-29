package xyz.luobochuanqi.StoneCraft.Register;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.luobochuanqi.StoneCraft.Utils;
import xyz.luobochuanqi.StoneCraft.block.BlockEntity.CrusherRecipe;

public class RecipeRegister {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Utils.ModId);

    public static final RegistryObject<RecipeSerializer<CrusherRecipe>> CrusherSeriaLlizer = SERIALIZERS.register("stone_crusher", () -> CrusherRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
