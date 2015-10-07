package tsteinr.arcania.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import tsteinr.arcania.Reference;

public class ItemOrb extends ItemBase {

    public ItemOrb() {
        super();
        this.setUnlocalizedName(Reference.Items.ORB);
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int s, float xs, float ys, float zs) {
        Block block = world.getBlock(x, y, z);

        if (!world.isRemote) {
            player.addChatComponentMessage(new ChatComponentText(block.getUnlocalizedName()));
        }

        return false;
    }

}
