package com.appromode.menu;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.appromode.core.Initialise;
import com.google.inject.Inject;

import net.md_5.bungee.api.ChatColor;

public class AdminMenu {

	@Inject
	private Initialise plugin;
	
	public ItemStack blackPane() {
		ItemStack blackpane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
		ItemMeta blackpanem = blackpane.getItemMeta();
		blackpanem.setDisplayName(" ");
		blackpanem.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		blackpane.setItemMeta(blackpanem);
		
		return blackpane;		
	}
	
	public ItemStack goBack() {
		ItemStack goback = new ItemStack(Material.NETHER_STAR, 1);
		ItemMeta gobackm = goback.getItemMeta();
		gobackm.setDisplayName(ChatColor.WHITE + "Go Back");
		gobackm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		goback.setItemMeta(gobackm);

		return goback;
	}
	
	public void adminHomeInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 27, plugin.prefix + ChatColor.WHITE + " Admin Menu");
		
		ItemStack adminm1p1 = new ItemStack(Material.COMMAND,1 );
		ItemMeta adminm1p1m = adminm1p1.getItemMeta();
		adminm1p1m.setDisplayName(ChatColor.WHITE + "Ap Addons");
		adminm1p1m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		adminm1p1.setItemMeta(adminm1p1m);
		
		inv.setItem(11, adminm1p1);
		
        player.openInventory(inv);
		
		for (int i = 0; i <inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}
	
	public void adminAddonInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 27, plugin.prefix + ChatColor.WHITE + " Ap Addons");
		
		ItemStack adminm2p1 = new ItemStack(Material.PAPER, 1);
		ItemMeta adminm2p1m = adminm2p1.getItemMeta();
		adminm2p1m.setDisplayName(ChatColor.DARK_PURPLE + "Custom Items");
		ArrayList<String> adminm2p1l = new ArrayList<String>();
		adminm2p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		adminm2p1l.add(ChatColor.WHITE + "Custom Items Addon: ");
		adminm2p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		adminm2p1m.setLore(adminm2p1l);
		adminm2p1m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		adminm2p1.setItemMeta(adminm2p1m);
		
		ItemStack adminm2p2 = new ItemStack(Material.PAPER, 1);
		ItemMeta adminm2p2m = adminm2p2.getItemMeta();
		adminm2p2m.setDisplayName(ChatColor.DARK_PURPLE + "Extras");
		ArrayList<String> adminm2p2l = new ArrayList<String>();
		adminm2p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		adminm2p2l.add(ChatColor.WHITE + "Extras Addon: ");
		adminm2p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		adminm2p2m.setLore(adminm2p2l);
		adminm2p2m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		adminm2p2.setItemMeta(adminm2p2m);
		
		ItemStack adminm2p3 = new ItemStack(Material.PAPER, 1);
		ItemMeta adminm2p3m = adminm2p3.getItemMeta();
		adminm2p3m.setDisplayName(ChatColor.DARK_PURPLE + "Quests");
		ArrayList<String> adminm2p3l = new ArrayList<String>();
		adminm2p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		adminm2p3l.add(ChatColor.WHITE + "Quests Addon: ");
		adminm2p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		adminm2p3m.setLore(adminm2p3l);
		adminm2p3m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		adminm2p3.setItemMeta(adminm2p3m);
		
		inv.setItem(10, adminm2p1);
		inv.setItem(11, adminm2p2);
		inv.setItem(12, adminm2p3);
		inv.setItem(18, goBack());
		
		player.openInventory(inv);
		
		for (int i = 0; i <inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}
}
