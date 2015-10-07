package tsteinr.arcania.proxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import tsteinr.arcania.handler.ConfigurationHandler;
import tsteinr.arcania.init.ModBlocks;
import tsteinr.arcania.init.ModItems;
import tsteinr.arcania.init.ModRecipes;
import tsteinr.arcania.init.ModTileEntities;
import tsteinr.arcania.world.WorldGenArcania;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        ModTileEntities.init();
        ModRecipes.init();
        ModBlocks.init();
        ModItems.init();
        GameRegistry.registerWorldGenerator(new WorldGenArcania(), 0);
    }

    public void init(FMLInitializationEvent event) {
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
    }

    public void postInit(FMLPostInitializationEvent event) {

    }

}
