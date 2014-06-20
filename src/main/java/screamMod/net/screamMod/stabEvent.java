package screamMod.net.screamMod;

import WayofTime.alchemicalWizardry.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class stabEvent{

	
	@SubscribeEvent
	public void onStabbling(PlayerInteractEvent i){
		EntityPlayer Eplayer = i.entityPlayer;
		
		if(Eplayer.getCurrentEquippedItem() != null && ItemStack.areItemStacksEqual(Eplayer.getCurrentEquippedItem(), new ItemStack(ModItems.sacrificialDagger))){	
			if(i.action == i.action.RIGHT_CLICK_AIR){
				System.out.println("YOLOYOLYOLYOLYOYLYOYLYOYL");
				
				World.playSoundAtEntity(i.entityPlayer, "random.fizz", 1.0F, 1.0F);
			}
		
		}
		
	}
	
/*public static void doDatScream(World world, EntityPlayer player){
		
		world.playSoundAtEntity(player, "random.fizz", 1.0F, 1.0F);//bonyscream:bonyScream
		
	}*/
}
