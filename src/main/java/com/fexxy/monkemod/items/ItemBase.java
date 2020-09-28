package com.fexxy.monkemod.items;

import com.fexxy.monkemod.MonkeMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item{

    public ItemBase() {
        super(new Item.Properties().group(ItemGroup.BREWING));
    }
}
