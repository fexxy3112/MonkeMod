package com.fexxy.monkemod.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BananaTreeLog extends Block {

    public BananaTreeLog() {
        super(Block.Properties.create(Material.WOOD)
                .hardnessAndResistance(2.0f, 2.0f)
                .sound(SoundType.WOOD)
                .harvestTool(ToolType.AXE)
                .harvestLevel(0));
    }
}
