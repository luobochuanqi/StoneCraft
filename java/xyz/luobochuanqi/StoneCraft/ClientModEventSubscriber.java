package xyz.luobochuanqi.StoneCraft;

import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import xyz.luobochuanqi.StoneCraft.block.BlockEntity.CrusherRecipe;

public class ClientModEventSubscriber {
    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, CrusherRecipe.Type.ID, CrusherRecipe.Type.INSTANCE);
    }
}
