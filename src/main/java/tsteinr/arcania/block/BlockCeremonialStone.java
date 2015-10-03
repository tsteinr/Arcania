package tsteinr.arcania.block;

import net.minecraft.block.material.Material;
import tsteinr.arcania.Arcania;
import tsteinr.arcania.Reference;

public class BlockCeremonialStone extends BlockBase {

    public BlockCeremonialStone() {
        super(Material.rock);
        this.setCreativeTab(Arcania.tabArcania);
        this.setBlockName(Reference.Blocks.CEREMONIAL_STONE);
    }

}
