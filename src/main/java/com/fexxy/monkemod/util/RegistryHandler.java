package com.fexxy.monkemod.util;

import com.fexxy.monkemod.MonkeMod;
import com.fexxy.monkemod.blocks.BananaTreeLog;
import com.fexxy.monkemod.blocks.BlockItemBase;
import com.fexxy.monkemod.items.ItemBase;
import com.sun.javafx.menu.CheckMenuItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.swing.*;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MonkeMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MonkeMod.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> BANANA = ITEMS.register("banana", ItemBase::new);


    //Blocks
    public static final RegistryObject<Block> BANANA_TREE_LOG = BLOCKS.register("banana_tree_log", BananaTreeLog::new);
    public static final RegistryObject<Block> BANANA_TREE_LEAVES = BLOCKS.register("banana_tree_leaves", BananaTreeLog::new);


    //Block Items
    public static final RegistryObject<Item> BANANA_TREE_LOG_ITEM = ITEMS.register("banana_tree_log", () -> new BlockItemBase(BANANA_TREE_LOG.get()));
    public static final RegistryObject<Item> BANANA_TREE_LEAVES_ITEM = ITEMS.register("banana_tree_leaves", () -> new BlockItemBase(BANANA_TREE_LEAVES.get()));


}
