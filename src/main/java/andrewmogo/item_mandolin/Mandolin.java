package andrewmogo.item_mandolin;


import andrewmogo.Sounds.SoundRegistrator;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.*;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.*;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;
import java.util.List;

public class Mandolin extends Item
{

    public Mandolin() {
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.TOOLS);
    }

    ResourceLocation location = new ResourceLocation("musicmagic", "guitar_noise.ogg");
    SoundEvent event = new SoundEvent(location);


    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        // IMPORTANT! Only spawn new entities on the server. If the world is not remote,
        // that means you are on the server:
//       if (!world.isRemote) {
//            world.spawnEntityInWorld(new EntityThrowingRock(world, player));
//        }
        System.out.println("Right Clicked");
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        worldIn.playSound((EntityPlayer) null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundRegistrator.guitarSound, SoundCategory.PLAYERS, 1.0F, 1.0F);
//        worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.BLOCK_LAVA_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, 1.0F );
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);



    }

}