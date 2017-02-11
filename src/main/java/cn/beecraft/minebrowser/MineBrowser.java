package cn.beecraft.minebrowser;

import cn.beecraft.minebrowser.handler.EventHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;



@Mod(modid = "MineBrowser")
public class MineBrowser
{
	@Mod.Instance("MineBrowser")
	public static MineBrowser instance;
	public static String webPageUrl = "";
	@Mod.EventHandler
	@SideOnly(Side.CLIENT)
	public void preInit(FMLPreInitializationEvent e)
	{
		Configuration config = new Configuration(e.getSuggestedConfigurationFile());
		webPageUrl = config.getString("webPageUrl", "Browser", "", "The url of the web page that the screen will render.");
		MinecraftForge.EVENT_BUS.register(EventHandler.instance);
	}
}