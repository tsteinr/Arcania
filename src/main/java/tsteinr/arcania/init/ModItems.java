package tsteinr.arcania.init;

import cpw.mods.fml.common.registry.GameRegistry;
import tsteinr.arcania.Reference;
import tsteinr.arcania.item.ItemBase;
import tsteinr.arcania.item.ItemOrb;

@GameRegistry.ObjectHolder(Reference.ID)
public class ModItems {

    public static ItemBase orb = new ItemOrb();

    public static void init() {
        GameRegistry.registerItem(orb, Reference.Items.ORB);
    }

}
