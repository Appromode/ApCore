package com.appromode.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.appromode.core.Initialise;
import com.appromode.menu.AdminMenu;
import com.google.inject.Inject;

import net.md_5.bungee.api.ChatColor;

public class AdminListener implements Listener{

	@Inject
	private Initialise plugin;
	
	@Inject
	private AdminMenu am;
	
	@EventHandler
	public void amMenuClick(InventoryClickEvent event) {
		
		Player player = (Player) event.getWhoClicked();
		Inventory open = event.getClickedInventory();
		ItemStack item = event.getCurrentItem();
		
		if (open == null) {
			return;
		}
		
		if (open.getName().equals(plugin.prefix + ChatColor.WHITE + " Admin Menu")) {
			event.setCancelled(true);
			
			if (item == null || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Ap Addons")) {
				player.closeInventory();
				am.adminAddonInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.prefix + ChatColor.WHITE + " Ap Addons")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				am.adminHomeInv(player);
				return;
			} else {
				return;
			}
		} else {
			return;
		}
	}
}
