package tsteinr.arcania.init;

import cpw.mods.fml.common.registry.GameRegistry;
import tsteinr.arcania.Reference;
import tsteinr.arcania.block.BlockBase;
import tsteinr.arcania.block.BlockCeremonialStone;

@GameRegistry.ObjectHolder(Reference.ID)
public class ModBlocks {

    public static BlockBase ceremonialStone = new BlockCeremonialStone();

    public static void init() {
        GameRegistry.registerBlock(ceremonialStone, Reference.Blocks.CEREMONIAL_STONE);
    }

}
