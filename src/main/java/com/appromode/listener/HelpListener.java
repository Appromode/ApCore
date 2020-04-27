package com.appromode.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.appromode.core.Initialise;
import com.appromode.menu.HelpMenu;
import com.google.inject.Inject;

import net.md_5.bungee.api.ChatColor;

public class HelpListener implements Listener{

	@Inject
	private Initialise plugin;
	
	@Inject
	private HelpMenu hm;
	
	@EventHandler
	public void hmMenuClick(InventoryClickEvent event) {
		
		Player player = (Player) event.getWhoClicked();
		Inventory open = event.getClickedInventory();
		ItemStack item = event.getCurrentItem();
		
		if (open == null) {
			return;
		}
		
		if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Help Menu")) {
			event.setCancelled(true);
			
			if (item == null || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Useful Commands")) {
				player.closeInventory();
				hm.helpCommandsHomeInv(player);
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Rules")) {
				player.closeInventory();
				hm.helpRulesHomeInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Rules")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Server Rules")) {
				player.closeInventory();
				hm.helpRulesServerInv(player);
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Other Platform Rules")) {
				player.closeInventory();
				hm.helpRulesOtherInv(player);
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Website Rules")) {
				player.closeInventory();
				hm.helpRulesWebsiteInv(player);
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				hm.helpHomeInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Commands")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Skyblock and Warp Commands")) {
				player.closeInventory();
				hm.helpCommandsSkyblockWarpInv(player);
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Shop and Spawner Commands")) {
				player.closeInventory();
				hm.helpCommandsShopSpawnerInv(player);
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "PvP and other Commands")) {
				player.closeInventory();
				hm.helpCommandsPvPOtherInv(player);
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				hm.helpHomeInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Server Rules")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				hm.helpRulesHomeInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Other Platform Rules")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Discord Rules")) {
				player.closeInventory();
				hm.helpRulesOtherDiscordInv(player);
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				hm.helpRulesHomeInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Discord Rules")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				hm.helpRulesOtherInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Website Rules")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				hm.helpRulesHomeInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Skyblock + Warp Cmds")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				hm.helpCommandsHomeInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Shop + Spawner Cmds")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				hm.helpCommandsHomeInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.servern + ChatColor.WHITE + " PvP + Other Cmds")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				hm.helpCommandsHomeInv(player);
				return;
			} else {
				return;
			}
		} else {
			return;
		}
	}
}
