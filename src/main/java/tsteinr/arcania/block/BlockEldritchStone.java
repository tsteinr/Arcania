package tsteinr.arcania.block;

import net.minecraft.block.material.Material;
import tsteinr.arcania.Reference;

public class BlockEldritchStone extends BlockBase {

    public BlockEldritchStone() {
        super(Material.rock);
        this.setBlockName(Reference.Blocks.ELDRITCH_STONE);
        this.setBlockUnbreakable();
    }

}
