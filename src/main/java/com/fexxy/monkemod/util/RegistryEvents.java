package com.fexxy.monkemod.util;

import com.fexxy.monkemod.MonkeMod;
import com.fexxy.monkemod.blocks.BlockBase;
import com.fexxy.monkemod.items.ItemBase;
import com.fexxy.monkemod.lists.MonkeBlocks;
import com.fexxy.monkemod.lists.MonkeItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Food;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        MonkeMod.LOGGER.info("Registering items");
        for (Item itemblock : MonkeBlocks.ITEMBLOCKS) {
            event.getRegistry().register(itemblock);
        }

        Item[] items = new Item[]{
                MonkeItems.BANANA = new Item(new Item.Properties().food(Foods.APPLE).group(MonkeMod.TAB)).setRegistryName(location("banana")),
                MonkeItems.GOLDEN_BANANA = new Item(new Item.Properties().food(Foods.GOLDEN_APPLE).group(MonkeMod.TAB)).setRegistryName(location("golden_banana"))
        };

        event.getRegistry().registerAll(items);
    }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        MonkeMod.LOGGER.info("Registering blocks");
        Block[] blocks = new Block[]{
                MonkeBlocks.BANANA_TREE_LOG = new BlockBase(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f,2.0f).sound(SoundType.WOOD).harvestTool(ToolType.AXE), new Item.Properties().group(MonkeMod.TAB), "banana_tree_log"),
                MonkeBlocks.BANANA_TREE_LEAVES = new BlockBase(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2f,0.2f).sound(SoundType.PLANT), new Item.Properties().group(MonkeMod.TAB), "banana_tree_leaves"),
                MonkeBlocks.BANANA_TREE_PLANKS = new BlockBase(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0f, 3.0f).sound(SoundType.WOOD), new Item.Properties().group(MonkeMod.TAB), "banana_tree_planks"),
        };

        event.getRegistry().registerAll(blocks);
    }
    public static ResourceLocation location(String name){
        return new ResourceLocation("monkemod",name);
    }
}
