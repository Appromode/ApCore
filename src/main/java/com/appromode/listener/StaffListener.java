package com.appromode.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.appromode.core.Initialise;
import com.appromode.menu.StaffMenu;
import com.google.inject.Inject;

import net.md_5.bungee.api.ChatColor;

public class StaffListener implements Listener{

	@Inject
	private Initialise plugin;
	
	@Inject
	private StaffMenu sm;
	
	@EventHandler
	public void smMenuClick(InventoryClickEvent event) {
		
		Player player = (Player) event.getWhoClicked();
		Inventory open = event.getClickedInventory();
		ItemStack item = event.getCurrentItem();
		
		if (open == null) {
			return;
		}
		
		if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Staff Help Menu")) {		
			event.setCancelled(true);
			
			if (item == null || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Retired" + ChatColor.DARK_PURPLE + " Menu")) {
				player.closeInventory();
				sm.staffRetiredInv(player);
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Helper" + ChatColor.DARK_PURPLE + " Menu")) {
				player.closeInventory();
				sm.staffHelperInv(player);
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Mod" + ChatColor.DARK_PURPLE + " Menu")) {
				player.closeInventory();
				sm.staffModeratorInv(player);
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Admin" + ChatColor.DARK_PURPLE + " Menu")) {
				player.closeInventory();
				sm.staffAdministratorInv(player);
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Sr. Admin" + ChatColor.DARK_PURPLE + " Menu")) {
				player.closeInventory();
				sm.staffSeniorInv(player);
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Manager" + ChatColor.DARK_PURPLE + " Menu")) {
			    player.closeInventory();
			    sm.staffManagerInv(player);
			    return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Exec. Admin" + ChatColor.DARK_PURPLE + " Menu")) {
				player.closeInventory();
				sm.staffExecutiveInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Retired Help Menu")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				sm.staffHomeInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Helper Help Menu")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				sm.staffHomeInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Mod Help Menu")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				sm.staffHomeInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Admin Help Menu")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				sm.staffHomeInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Senior Help Menu")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				sm.staffHomeInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Manager Help Menu")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				sm.staffHomeInv(player);
				return;
			} else {
				return;
			}
		} else if (open.getName().equals(plugin.servern + ChatColor.WHITE + " Exec Help Menu")) {
			event.setCancelled(true);
			
			if (item.equals(null) || !item.hasItemMeta()) {
				return;
			} else if (item.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "Go Back")) {
				player.closeInventory();
				sm.staffHomeInv(player);
				return;
			} else {
				return;
			}
		} else {
			return;
		}
	}
}
