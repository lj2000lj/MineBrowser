package cn.beecraft.minebrowser.handler;

import java.io.IOException;

import cn.beecraft.minebrowser.screen.BrowserScreen;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraftforge.client.event.GuiOpenEvent;

public class EventHandler {
	public static EventHandler instance = new EventHandler();

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void onMainMenuOpen(GuiOpenEvent event) {
		if (!(event.gui instanceof BrowserScreen)) {
			event.gui = new BrowserScreen();
		}
	}
}
