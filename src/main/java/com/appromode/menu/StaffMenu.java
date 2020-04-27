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

public class StaffMenu {

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
	
	public void staffHomeInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 27, plugin.servern + ChatColor.WHITE + " Staff Help Menu");
		
		ItemStack staffm1p1 = new ItemStack(Material.LEATHER);
		ItemMeta staffm1p1m = staffm1p1.getItemMeta();
		staffm1p1m.setDisplayName(ChatColor.WHITE + "Retired" + ChatColor.DARK_PURPLE + " Menu");
		staffm1p1m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		staffm1p1.setItemMeta(staffm1p1m);
		
		ItemStack staffm1p2 = new ItemStack(Material.COAL,1 );
		ItemMeta staffm1p2m = staffm1p2.getItemMeta();
		staffm1p2m.setDisplayName(ChatColor.WHITE + "Helper" + ChatColor.DARK_PURPLE + " Menu");
		staffm1p2m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		staffm1p2.setItemMeta(staffm1p2m);
		
		ItemStack staffm1p3 = new ItemStack(Material.IRON_INGOT, 1);
		ItemMeta staffm1p3m = staffm1p3.getItemMeta();
		staffm1p3m.setDisplayName(ChatColor.WHITE + "Mod" + ChatColor.DARK_PURPLE + " Menu");
		staffm1p3m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		staffm1p3.setItemMeta(staffm1p3m);
		
		ItemStack staffm1p4 = new ItemStack(Material.GOLD_INGOT, 1);
		ItemMeta staffm1p4m = staffm1p4.getItemMeta();
		staffm1p4m.setDisplayName(ChatColor.WHITE + "Admin" + ChatColor.DARK_PURPLE + " Menu");
		staffm1p4m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		staffm1p4.setItemMeta(staffm1p4m);
		
		ItemStack staffm1p5 = new ItemStack(Material.DIAMOND, 1);
		ItemMeta staffm1p5m = staffm1p5.getItemMeta();
		staffm1p5m.setDisplayName(ChatColor.WHITE + "Sr. Admin" + ChatColor.DARK_PURPLE + " Menu");
		staffm1p5m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		staffm1p5.setItemMeta(staffm1p5m);
		
		ItemStack staffm1p6 = new ItemStack(Material.EMERALD, 1);
		ItemMeta staffm1p6m = staffm1p6.getItemMeta();
		staffm1p6m.setDisplayName(ChatColor.WHITE + "Manager" + ChatColor.DARK_PURPLE + " Menu");
		staffm1p6m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		staffm1p6.setItemMeta(staffm1p6m);
		
		ItemStack staffm1p7 = new ItemStack(Material.NETHER_STAR, 1);
		ItemMeta staffm1p7m = staffm1p7.getItemMeta();
		staffm1p7m.setDisplayName(ChatColor.WHITE + "Exec. Admin" + ChatColor.DARK_PURPLE + " Menu");
		staffm1p7m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		staffm1p7.setItemMeta(staffm1p7m);
		
		inv.setItem(10, staffm1p1);
		inv.setItem(11, staffm1p2);
		inv.setItem(12, staffm1p3);
		inv.setItem(13, staffm1p4);
		inv.setItem(14, staffm1p5);
		inv.setItem(15, staffm1p6);
		inv.setItem(16, staffm1p7);
		
		player.openInventory(inv);
		
		for (int i = 0; i <inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}
	
	public void staffRetiredInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 27, plugin.servern + ChatColor.WHITE + " Retired Help Menu");
		
		ItemStack staffm2p1 = new ItemStack(Material.EXP_BOTTLE, 1);
		ItemMeta staffm2p1m = staffm2p1.getItemMeta();
		staffm2p1m.setDisplayName(ChatColor.DARK_PURPLE + "Introduction");
		ArrayList<String> staffm2p1l = new ArrayList<String>();
		staffm2p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		staffm2p1l.add(ChatColor.WHITE + "");
		staffm2p1l.add(ChatColor.WHITE + "");
		staffm2p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		staffm2p1m.setLore(staffm2p1l);
		staffm2p1m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		staffm2p1.setItemMeta(staffm2p1m);
		
		ItemStack staffm2p2 = new ItemStack(Material.PAPER, 1);
		ItemMeta staffm2p2m = staffm2p2.getItemMeta();
		staffm2p2m.setDisplayName(ChatColor.WHITE + "Command [1]" + ChatColor.DARK_PURPLE + " /kick [player] [reason]");
		ArrayList<String> staffm2p2l = new ArrayList<String>();
		staffm2p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		staffm2p2l.add(ChatColor.WHITE + "");
		staffm2p2l.add(ChatColor.WHITE + "");
		staffm2p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		staffm2p2m.setLore(staffm2p2l);
		staffm2p2m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		staffm2p2.setItemMeta(staffm2p2m);
		
		ItemStack staffm2p3 = new ItemStack(Material.PAPER, 1);
		ItemMeta staffm2p3m = staffm2p3.getItemMeta();
		staffm2p3m.setDisplayName(ChatColor.WHITE + "Command [1]" + ChatColor.DARK_PURPLE + " /warn [player] [reason]");
		ArrayList<String> staffm2p3l = new ArrayList<String>();
		staffm2p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		staffm2p3l.add(ChatColor.WHITE + "");
		staffm2p3l.add(ChatColor.WHITE + "");
		staffm2p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		staffm2p3m.setLore(staffm2p3l);
		staffm2p3m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		staffm2p3.setItemMeta(staffm2p3m);
		
		ItemStack staffm2p4 = new ItemStack(Material.PAPER, 1);
		ItemMeta staffm2p4m = staffm2p4.getItemMeta();
		staffm2p4m.setDisplayName(ChatColor.WHITE + "Command [1]" + ChatColor.DARK_PURPLE + " /kick [player] [reason]");
		ArrayList<String> staffm2p4l = new ArrayList<String>();
		staffm2p4l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		staffm2p4l.add(ChatColor.WHITE + "");
		staffm2p4l.add(ChatColor.WHITE + "");
		staffm2p4l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		staffm2p4m.setLore(staffm2p4l);
		staffm2p4m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		staffm2p4.setItemMeta(staffm2p4m);
		
		ItemStack staffm2p5 = new ItemStack(Material.PAPER, 1);
		ItemMeta staffm2p5m = staffm2p5.getItemMeta();
		staffm2p5m.setDisplayName(ChatColor.WHITE + "Command [1]" + ChatColor.DARK_PURPLE + " /kick [player] [reason]");
		ArrayList<String> staffm2p5l = new ArrayList<String>();
		staffm2p5l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		staffm2p5l.add(ChatColor.WHITE + "");
		staffm2p5l.add(ChatColor.WHITE + "");
		staffm2p5l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		staffm2p5m.setLore(staffm2p5l);
		staffm2p5m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		staffm2p5.setItemMeta(staffm2p5m);
		
		ItemStack staffm2p6 = new ItemStack(Material.PAPER, 1);
		ItemMeta staffm2p6m = staffm2p6.getItemMeta();
		staffm2p6m.setDisplayName(ChatColor.WHITE + "Command [1]" + ChatColor.DARK_PURPLE + " /kick [player] [reason]");
		ArrayList<String> staffm2p6l = new ArrayList<String>();
		staffm2p6l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		staffm2p6l.add(ChatColor.WHITE + "");
		staffm2p6l.add(ChatColor.WHITE + "");
		staffm2p6l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		staffm2p6m.setLore(staffm2p6l);
		staffm2p6m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		staffm2p6.setItemMeta(staffm2p6m);
		
		ItemStack staffm2p7 = new ItemStack(Material.PAPER, 1);
		ItemMeta staffm2p7m = staffm2p7.getItemMeta();
		staffm2p7m.setDisplayName(ChatColor.WHITE + "Command [1]" + ChatColor.DARK_PURPLE + " /kick [player] [reason]");
		ArrayList<String> staffm2p7l = new ArrayList<String>();
		staffm2p7l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		staffm2p7l.add(ChatColor.WHITE + "");
		staffm2p7l.add(ChatColor.WHITE + "");
		staffm2p7l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		staffm2p7m.setLore(staffm2p7l);
		staffm2p7m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		staffm2p7.setItemMeta(staffm2p7m);
		
		inv.setItem(18, goBack());
		
        player.openInventory(inv);
		
		for (int i = 0; i <inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}
	
	public void staffHelperInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 36, plugin.servern + ChatColor.WHITE + " Helper Help Menu");
		
		inv.setItem(27, goBack());
		
		player.openInventory(inv);
		
		for (int i = 0; i <inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}		
	}
	
	public void staffModeratorInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 36, plugin.servern + ChatColor.WHITE + " Mod Help Menu");
		
		inv.setItem(27, goBack());
		
		player.openInventory(inv);
		
		for (int i = 0; i <inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}
	
	public void staffAdministratorInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 36, plugin.servern + ChatColor.WHITE + " Admin Help Menu");
		
		inv.setItem(27, goBack());
		
		player.openInventory(inv);
		
		for (int i = 0; i <inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}
	
	public void staffSeniorInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 36, plugin.servern + ChatColor.WHITE + " Senior Help Menu");
		
		inv.setItem(27, goBack());
		
		player.openInventory(inv);
		
		for (int i = 0; i <inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}
	
	public void staffManagerInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 36, plugin.servern + ChatColor.WHITE + " Manager Help Menu");
		
		inv.setItem(27, goBack());
		
		player.openInventory(inv);
		
		for (int i = 0; i <inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}
	
	public void staffExecutiveInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 36, plugin.servern + ChatColor.WHITE + " Exec Help Menu");
		
		inv.setItem(27, goBack());
		
		player.openInventory(inv);
		
		for (int i = 0; i <inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}
}
