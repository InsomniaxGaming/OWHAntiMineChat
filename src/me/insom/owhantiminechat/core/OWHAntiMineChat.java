package me.insom.owhantiminechat.core;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class OWHAntiMineChat extends JavaPlugin implements org.bukkit.event.Listener{
	
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	public void onDisable(){}
	
	String peskyMessageStart = "connected with a";
	String peskyMessageEnd = "using MineChat";
	
	@EventHandler(priority = EventPriority.LOWEST)
	public void playerChat(AsyncPlayerChatEvent event)
	{	
		// Check if this message starts and ends with the horrid MineChat spam. This avoids having to check every single type of device (iphone, ipod, etc..).
		if(event.getMessage().startsWith(peskyMessageStart) && event.getMessage().endsWith(peskyMessageEnd))
		{
			event.setCancelled(true); // No spam today, stupid app!
		}
		
	}
	
	
}
