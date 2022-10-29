package xyz.luobochuanqi.StoneCraft.Register;

import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xyz.luobochuanqi.StoneCraft.Screen.CrusherMenu;
import xyz.luobochuanqi.StoneCraft.Utils;
import xyz.luobochuanqi.StoneCraft.block.BlockEntity.CrusherEntityBlock;

public class MenuRegister {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.CONTAINERS, Utils.ModId);
    //注册我们的方块菜单界面
    public static final RegistryObject<MenuType<CrusherMenu>> CrusherMenu = registerMenuType(CrusherMenu::new, "stone_crusher_menu");

    private static <T extends AbstractContainerMenu>RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
