package legokay11.MoBosses;

import legokay11.MoBosses.init.InitBlocks;
import legokay11.MoBosses.init.InitItems;
import legokay11.MoBosses.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID , name = Reference.MOD_NAME , version = Reference.VERSION)
public class MoBosses {

	@SidedProxy(clientSide = Reference.Client_Proxy_Class , serverSide = Reference.Server_Proxy_Class)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
	    InitBlocks.init();
		InitBlocks.register();
		InitItems.init();
		InitItems.register();

	}
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerRenders();
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
