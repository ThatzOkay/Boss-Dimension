package legokay11.MoBosses.dimension;

import net.minecraftforge.common.DimensionManager;

public class dimensionRegistry {

	public static void mainRegistry(){
		registerDimension();
	}

	public static final int dimID = 8;
	
	public static void registerDimension() {
		DimensionManager.registerProviderType(dimID, WorldProviderBoss.class, false);
		DimensionManager.registerDimension(dimID, dimID);
		
	}
}
