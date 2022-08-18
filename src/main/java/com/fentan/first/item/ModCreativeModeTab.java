package com.fentan.first.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FIRST_TAB = new CreativeModeTab("firstTab") {
        @Override
        public ItemStack makeIcon() {
            return  new ItemStack(ModItems.BEBRA.get());
        }
    };
}
