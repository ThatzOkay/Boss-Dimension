package legokay11.MoBosses.init;

import legokay11.MoBosses.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class InitItems {
	
	public static Item boss_and_steal;
	
	
 public static void init(){
	 boss_and_steal = new Item().setUnlocalizedName("boss_and_steal");
 }
 
 public static void register(){
	 GameRegistry.registerItem(boss_and_steal, boss_and_steal.getUnlocalizedName().substring(5));
 }
 
 public static void registerRenders(){
	 registerRender(boss_and_steal);
 }
 
 public static void registerRender(Item item){
	 Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
 }
}
