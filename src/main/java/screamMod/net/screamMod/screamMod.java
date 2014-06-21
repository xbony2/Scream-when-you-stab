package screamMod.net.screamMod;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "bonyscream", name = "Scream when you stab mod", version = "1.0.0a", dependencies = "required-after:AWWayofTime")
public class screamMod {

	@Instance("bonyscream")
	public static screamMod instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event){
		
		MinecraftForge.EVENT_BUS.register(new stabEvent());
	}
}
