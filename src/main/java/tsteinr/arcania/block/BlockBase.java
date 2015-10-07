package tsteinr.arcania.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import tsteinr.arcania.Arcania;
import tsteinr.arcania.Reference;

public class BlockBase extends Block {

    public BlockBase(Material material) {
        super(material);
        this.setCreativeTab(Arcania.tabArcania);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s:%s", Reference.ID, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}
