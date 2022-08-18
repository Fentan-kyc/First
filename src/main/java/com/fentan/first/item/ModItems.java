package com.fentan.first.item;

import com.fentan.first.First;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, First.MOD_ID);

        public static final RegistryObject<Item> BEBRA = ITEMS.register("bebra",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FIRST_TAB)));
        public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
