package screamMod.net.screamMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import WayofTime.alchemicalWizardry.ModItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class stabEvent{

	public World worldObj;
	
	@SubscribeEvent
	public void onStabbling(PlayerInteractEvent i){
		EntityPlayer Eplayer = i.entityPlayer;
		
		if(Eplayer.getCurrentEquippedItem() != null && ItemStack.areItemStacksEqual(Eplayer.getCurrentEquippedItem(), new ItemStack(ModItems.sacrificialDagger))){	
			if(i.action == i.action.RIGHT_CLICK_AIR){
				System.out.println("YOLOYOLYOLYOLYOYLYOYLYOYL");
				
				worldObj.playSoundAtEntity(i.entityPlayer, "game.tnt.primed", 1.0F, 1.0F);
				// TNT until I can get the sound to at least work
			}
		
		}
		
	}
	
}
