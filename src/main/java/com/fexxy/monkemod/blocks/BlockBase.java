package com.fexxy.monkemod.blocks;

import com.fexxy.monkemod.lists.MonkeBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import java.util.Properties;

public class BlockBase extends Block {
    public Item item;

    public BlockBase(Properties properties, Item.Properties builder, ResourceLocation regName) {
        super(properties);

        this.setRegistryName(regName);
        item = new BlockItem(this,builder).setRegistryName(regName);

        MonkeBlocks.BLOCKS.add(this);
        MonkeBlocks.ITEMBLOCKS.add(item);
    }

    private void setRegistryName(ResourceLocation regName) {
    }
}
