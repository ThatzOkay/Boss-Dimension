package legokay11.MoBosses.init;

import legokay11.MoBosses.Reference;
import legokay11.MoBosses.Blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class InitBlocks {

	public static Block Xonim_block;
	public static Block Boss_portal;
	
	public static void init(){
		Xonim_block = new  Xonim_block(Material.iron).setUnlocalizedName("Xonim_block");
		Boss_portal = new Boss_Portal(Material.portal).setUnlocalizedName("Boss_portal");
	}
	
	public static void register(){
		GameRegistry.registerBlock(Xonim_block, Xonim_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(Boss_portal, Boss_portal.getUnlocalizedName().substring(5));
		
	}
	
	public static void registerRenders(){
			registerRender(Xonim_block);
			registerRender(Boss_portal);
	}
	public static void registerRender(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
