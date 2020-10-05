package com.fexxy.monkemod.blocks;

import com.fexxy.monkemod.lists.MonkeBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootContext;

import java.util.List;

public class BlockBase extends Block {
    public Item item;

    Blocks
    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> list = super.getDrops(state, builder);
        if(list.isEmpty()){
            list.add(new ItemStack(item, 1));
        }

        return list;
    }

    public BlockBase(Properties properties) {
        super(properties);

        ResourceLocation location = new ResourceLocation("monkemod",regName);

        this.setRegistryName(location);
        item = new BlockItem(this,builder).setRegistryName(location);

        MonkeBlocks.BLOCKS.add(this);
        MonkeBlocks.ITEMBLOCKS.add(item);
    }
}
