package tsteinr.arcania.proxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import tsteinr.arcania.handler.ConfigurationHandler;
import tsteinr.arcania.init.ModBlocks;
import tsteinr.arcania.init.ModItems;
import tsteinr.arcania.init.ModRecipes;
import tsteinr.arcania.init.ModTileEntities;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        ModBlocks.init();
        ModItems.init();
    }

    public void init(FMLInitializationEvent event) {
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModTileEntities.init();
        ModRecipes.init();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}