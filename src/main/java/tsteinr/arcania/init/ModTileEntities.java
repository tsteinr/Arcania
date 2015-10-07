package tsteinr.arcania.init;

import cpw.mods.fml.common.registry.GameRegistry;
import tsteinr.arcania.Reference;
import tsteinr.arcania.tile.TileEntityEldritchSphere;

@GameRegistry.ObjectHolder(Reference.ID)
public class ModTileEntities {

    public static void init() {
        GameRegistry.registerTileEntity(TileEntityEldritchSphere.class, Reference.Blocks.ELDRITCH_SPHERE);
    }

}
