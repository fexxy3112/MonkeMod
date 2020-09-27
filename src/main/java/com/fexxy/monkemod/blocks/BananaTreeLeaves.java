package com.fexxy.monkemod.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
public class BananaTreeLeaves extends Block {

    public BananaTreeLeaves(Properties properties) {
        super(Block.Properties.create(Material.LEAVES)
            .hardnessAndResistance(0.2f,0.2f)
            .sound(SoundType.PLANT));
    }
}
