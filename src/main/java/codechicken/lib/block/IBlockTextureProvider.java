package codechicken.lib.block;

import codechicken.lib.texture.TextureUtils.IIconRegister;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.EnumFacing;

/**
 * Created by covers1624 on 30/10/2016.
 */
public interface IBlockTextureProvider extends IIconRegister {

    TextureAtlasSprite getTexture(EnumFacing side, int metadata);
}
