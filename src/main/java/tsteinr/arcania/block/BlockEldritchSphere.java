package tsteinr.arcania.block;

import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import tsteinr.arcania.Reference;

public class BlockEldritchSphere extends BlockBase {

    public BlockEldritchSphere() {
        super(Material.rock);
        this.setBlockUnbreakable();
        this.setBlockName(Reference.Blocks.ELDRITCH_SPHERE);
    }

}
