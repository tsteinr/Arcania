package tsteinr.arcania.world;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import tsteinr.arcania.init.ModBlocks;

import java.util.Random;

public class WorldGenArcania implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        if (random.nextInt(32) == 0) {
            int randX = chunkX * 16 + random.nextInt(16);
            int randZ = chunkZ * 16 + random.nextInt(16);
            int randY = world.getHeightValue(randX, randZ);
            Block block = world.getBlock(randX, randY - 1, randZ);

            world.setBlock(randX, randY, randZ, Blocks.obsidian, 0, 2);
            world.setBlock(randX, randY + 1, randZ, Blocks.obsidian, 0, 2);
            world.setBlock(randX, randY + 2, randZ, ModBlocks.eldritchStone, 0, 2);

            System.out.println("Created Eldritch Pillar at x:" + randX + " y:" + randY + " z:" + randZ);
            System.out.println("Pillar placed on " + block.getUnlocalizedName());
        }
    }

}
