package com.fexxy.monkemod.blocks;

import com.fexxy.monkemod.lists.MonkeBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import java.util.Properties;

public class BlockBase extends Block {
    public Item item;

    public BlockBase(Properties properties, Item.Properties builder, String regName) {
        super(properties);

        ResourceLocation location = new ResourceLocation("monkemod",regName);

        this.setRegistryName(location);
        item = new BlockItem(this,builder).setRegistryName(location);

        MonkeBlocks.BLOCKS.add(this);
        MonkeBlocks.ITEMBLOCKS.add(item);
    }
}
