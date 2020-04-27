package com.appromode.listener;

import org.bukkit.event.EventHandler;

import java.io.File;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.appromode.core.FileManager;
import com.appromode.core.Initialise;
import com.google.inject.Inject;

import net.md_5.bungee.api.ChatColor;

public class JoinListener implements Listener{
	
	@Inject
	private Initialise plugin;
	
	@Inject
	private FileManager film;
	
	private String location = "plugins/ApCore/playerdata";
	
	@EventHandler
    public void motd(PlayerJoinEvent event) {
    	Player player = event.getPlayer();
    	event.setJoinMessage("");
    	player.sendMessage(plugin.servern + ChatColor.LIGHT_PURPLE + " =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    	player.sendMessage(plugin.servern + ChatColor.WHITE + " Welcome to " + plugin.servern + " " + ChatColor.DARK_PURPLE + player.getName());
    	player.sendMessage(plugin.servern + ChatColor.WHITE + " Please be respectful while playing");
    	player.sendMessage(plugin.servern + ChatColor.WHITE + " Do /help if you need assistance");
    	player.sendMessage(plugin.servern + ChatColor.LIGHT_PURPLE + " =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
	
	@EventHandler
	public void generatePlayerFile(PlayerJoinEvent event) {
		final Player player = event.getPlayer();
		File pfile = new File(location, player.getUniqueId().toString() + ".yml");
		
        try {
            if (!pfile.exists()) {
                film.createPlayerFile(player);
                plugin.getServer().getConsoleSender().sendMessage(plugin.prefix + " Player data file successfully generated for " + player.getName());
            } else {
            	return;
            }
        } catch (Exception e) {
            plugin.getServer().getConsoleSender().sendMessage(plugin.prefix + " Could not generate file  - " + e.getMessage());
          
        }
	}
}
