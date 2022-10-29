package xyz.luobochuanqi.StoneCraft;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import xyz.luobochuanqi.StoneCraft.Register.*;
import xyz.luobochuanqi.StoneCraft.Screen.CrusherScreen;

@Mod("stonecraft")
public class StoneCraft {
    public StoneCraft() {
        ItemRegister.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegister.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockEntityRegister.BLOCK_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        MenuRegister.MENUS.register(FMLJavaModLoadingContext.get().getModEventBus());
        RecipeRegister.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    private void clientSetup(final FMLClientSetupEvent event) {
        //添加这个，第一个参数机器方块的GUI，后面是这个机器方块的screen
        MenuScreens.register(MenuRegister.CrusherMenu.get(), CrusherScreen::new);
    }
}

