package tsteinr.arcania.init;

import cpw.mods.fml.common.registry.GameRegistry;
import tsteinr.arcania.Reference;
import tsteinr.arcania.block.BlockBase;
import tsteinr.arcania.block.BlockEldritchStone;

@GameRegistry.ObjectHolder(Reference.ID)
public class ModBlocks {

    public static BlockBase eldritchStone = new BlockEldritchStone();

    public static void init() {
        GameRegistry.registerBlock(eldritchStone, Reference.Blocks.ELDRITCH_STONE);
    }

}
