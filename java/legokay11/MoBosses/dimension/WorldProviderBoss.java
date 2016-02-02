package legokay11.MoBosses.dimension;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderBoss extends WorldProvider {

	public void registerWorldChunkManager(){
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.extremeHillsEdge, 1.2F);
		this.dimensionId = dimensionRegistry.dimID;
	}
	
	public IChunkProvider createChunkGenertion(){
		return null;
		
	}
	
	@Override
	public String getDimensionName() {
		return "Boss";
	}

	@Override
	public String getInternalNameSuffix() {
		// TODO Auto-generated method stub
		return "Boss";
	}



}
