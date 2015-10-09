package tsteinr.arcania.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tsteinr.arcania.Arcania;

public class BlockBase extends Block {

    public BlockBase() {
        super(Material.rock);
    }

    public BlockBase(Material material) {
        super(material);
        this.setCreativeTab(Arcania.tabArcania);
    }



}
