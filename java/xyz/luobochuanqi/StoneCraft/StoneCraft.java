package xyz.luobochuanqi.StoneCraft;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import xyz.luobochuanqi.StoneCraft.Register.*;

@Mod("stonecraft")
public class StoneCraft {
    public StoneCraft() {
        ItemRegister.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}

