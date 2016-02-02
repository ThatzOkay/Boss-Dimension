package legokay11.MoBosses.proxy;

import legokay11.MoBosses.init.InitBlocks;
import legokay11.MoBosses.init.InitItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders(){
		InitItems.registerRenders();
		InitBlocks.registerRenders();
	}
}
