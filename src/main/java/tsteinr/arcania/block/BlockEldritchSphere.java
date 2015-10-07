package tsteinr.arcania.block;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import tsteinr.arcania.Reference;
import tsteinr.arcania.tile.TileEntityEldritchSphere;

public class BlockEldritchSphere extends BlockBase implements ITileEntityProvider {

    public BlockEldritchSphere() {
        super(Material.cloth);
        this.setBlockUnbreakable();
        this.setBlockName(Reference.Blocks.ELDRITCH_SPHERE);
        this.isBlockContainer = true;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityEldritchSphere();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float px, float py, float pz) {
        TileEntityEldritchSphere tileEntityEldritchSphere = (TileEntityEldritchSphere) world.getTileEntity(x, y, z);

        if (tileEntityEldritchSphere instanceof TileEntityEldritchSphere) {
            if (!world.isRemote) {
                player.addChatComponentMessage(new ChatComponentText("Block is TileEntityEldritchSphere"));
            }
        }

        return true;
    }
}
