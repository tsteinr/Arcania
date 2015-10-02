package tsteinr.arcania;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import tsteinr.arcania.proxy.CommonProxy;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION)
public class Arcania {

    @Mod.Instance(Reference.ID)
    public static Arcania instance;

    @SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    public static CreativeTabs tabArcania = new CreativeTabs(Reference.ID) {

        @Override
        public Item getTabIconItem() {
            return Items.diamond;
        }

    };

}
