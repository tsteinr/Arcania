package tsteinr.arcania.init;

import cpw.mods.fml.common.registry.GameRegistry;
import tsteinr.arcania.Reference;
import tsteinr.arcania.block.BlockBase;
import tsteinr.arcania.block.BlockEldritchSphere;

@GameRegistry.ObjectHolder(Reference.ID)
public class ModBlocks {

    public static BlockBase eldritchSphere = new BlockEldritchSphere();

    public static void init() {
        GameRegistry.registerBlock(eldritchSphere, Reference.Blocks.ELDRITCH_SPHERE);
    }

}
