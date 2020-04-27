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

public class HelpMenu {

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

	public void helpHomeInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 27, plugin.servern + ChatColor.WHITE + " Help Menu");

		ItemStack helpm1p1 = new ItemStack(Material.BOOK, 1);
		ItemMeta helpm1p1m = helpm1p1.getItemMeta();
		helpm1p1m.setDisplayName(ChatColor.WHITE + "Useful Commands");
		ArrayList<String> helpm1p1l = new ArrayList<String>();
		helpm1p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm1p1l.add(ChatColor.DARK_PURPLE + "Right click me to find out some useful commands!");
		helpm1p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm1p1m.setLore(helpm1p1l);
		helpm1p1m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm1p1.setItemMeta(helpm1p1m);

		ItemStack helpm1p2 = new ItemStack(Material.INK_SACK, 1);
		ItemMeta helpm1p2m = helpm1p2.getItemMeta();
		helpm1p2m.setDisplayName(ChatColor.WHITE + "Rules");
		ArrayList<String> helpm1p2l = new ArrayList<String>();
		helpm1p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm1p2l.add(ChatColor.DARK_PURPLE + "Right click me to find out the rules of the");
		helpm1p2l.add(ChatColor.DARK_PURPLE + "server!");
		helpm1p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm1p2m.setLore(helpm1p2l);
		helpm1p2m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm1p2.setItemMeta(helpm1p2m);

		inv.setItem(11, helpm1p1);
		inv.setItem(15, helpm1p2);

		player.openInventory(inv);

		for (int i = 0; i < inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}

	}

	public void helpCommandsHomeInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 27, plugin.servern + ChatColor.WHITE + " Commands");

		ItemStack helpm2p1 = new ItemStack(Material.GRASS, 1);
		ItemMeta helpm2p1m = helpm2p1.getItemMeta();
		helpm2p1m.setDisplayName(ChatColor.WHITE + "Skyblock and Warp Commands");
		ArrayList<String> helpm2p1l = new ArrayList<String>();
		helpm2p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm2p1l.add(ChatColor.DARK_PURPLE + "Right click me to find out some skyblock and");
		helpm2p1l.add(ChatColor.DARK_PURPLE + "warp commands!");
		helpm2p1l.add(ChatColor.WHITE + "In this section, skyblock commands are listed");
		helpm2p1l.add(ChatColor.WHITE + "that cover the most common aspects of playing");
		helpm2p1l.add(ChatColor.WHITE + "skyblock. Warp commands are also included in");
		helpm2p1l.add(ChatColor.WHITE + "this section.");
		helpm2p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm2p1m.setLore(helpm2p1l);
		helpm2p1m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm2p1.setItemMeta(helpm2p1m);

		ItemStack helpm2p2 = new ItemStack(Material.BEACON, 1);
		ItemMeta helpm2p2m = helpm2p2.getItemMeta();
		helpm2p2m.setDisplayName(ChatColor.WHITE + "Shop and Spawner Commands");
		ArrayList<String> helpm2p2l = new ArrayList<String>();
		helpm2p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm2p2l.add(ChatColor.DARK_PURPLE + "Right click me to find out some shop and");
		helpm2p2l.add(ChatColor.DARK_PURPLE + "spawner commands!");
		helpm2p2l.add(ChatColor.WHITE + "In this section, shop commands are listed that");
		helpm2p2l.add(ChatColor.WHITE + "cover how to sell and purchase items using");
		helpm2p2l.add(ChatColor.WHITE + "different methods. Spawner commands are also");
		helpm2p2l.add(ChatColor.WHITE + "covered in this section.");
		helpm2p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm2p2m.setLore(helpm2p2l);
		helpm2p2m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm2p2.setItemMeta(helpm2p2m);

		ItemStack helpm2p3 = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta helpm2p3m = helpm2p3.getItemMeta();
		helpm2p3m.setDisplayName(ChatColor.WHITE + "PvP and other Commands");
		ArrayList<String> helpm2p3l = new ArrayList<String>();
		helpm2p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm2p3l.add(ChatColor.DARK_PURPLE + "Right click me to find out some PvP commands!");
		helpm2p3l.add(ChatColor.WHITE + "In this section, PvP commands are listed that");
		helpm2p3l.add(ChatColor.WHITE + "cover how to PvP on " + plugin.servern + ChatColor.WHITE + ".");
		helpm2p3l.add(ChatColor.WHITE + "This section also covers any misc commands that");
		helpm2p3l.add(ChatColor.WHITE + "could be useful on the server.");
		helpm2p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm2p3m.setLore(helpm2p3l);
		helpm2p3m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm2p3.setItemMeta(helpm2p3m);

		inv.setItem(11, helpm2p1);
		inv.setItem(13, helpm2p2);
		inv.setItem(15, helpm2p3);
		inv.setItem(18, goBack());

		player.openInventory(inv);

		for (int i = 0; i < inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}

	public void helpRulesHomeInv(Player player) {

		Inventory inv = plugin.getServer().createInventory(null, 27, plugin.servern + ChatColor.WHITE + " Rules");

		ItemStack helpm3p1 = new ItemStack(Material.DIAMOND, 1);
		ItemMeta helpm3p1m = helpm3p1.getItemMeta();
		helpm3p1m.setDisplayName(ChatColor.WHITE + "Server Rules");
		ArrayList<String> helpm3p1l = new ArrayList<String>();
		helpm3p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm3p1l.add(ChatColor.DARK_PURPLE + "Right click me to find out some server rules!");
		helpm3p1l.add(ChatColor.WHITE + "These rules need to be followed on the server");
		helpm3p1l.add(ChatColor.WHITE + "otherwise punishments will be given out");
		helpm3p1l.add(ChatColor.WHITE + "accordingly.");
		helpm3p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm3p1m.setLore(helpm3p1l);
		helpm3p1m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm3p1.setItemMeta(helpm3p1m);

		ItemStack helpm3p2 = new ItemStack(Material.BOOK, 1);
		ItemMeta helpm3p2m = helpm3p2.getItemMeta();
		helpm3p2m.setDisplayName(ChatColor.WHITE + "Other Platform Rules");
		ArrayList<String> helpm3p2l = new ArrayList<String>();
		helpm3p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm3p2l.add(ChatColor.DARK_PURPLE + "Right click me to find out some other platform");
		helpm3p2l.add(ChatColor.DARK_PURPLE + "rules!");
		helpm3p2l.add(ChatColor.WHITE + "These rules will be enforced on platforms such");
		helpm3p2l.add(ChatColor.WHITE + "as discord.");
		helpm3p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm3p2m.setLore(helpm3p2l);
		helpm3p2m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm3p2.setItemMeta(helpm3p2m);

		ItemStack helpm3p3 = new ItemStack(Material.EMERALD, 1);
		ItemMeta helpm3p3m = helpm3p3.getItemMeta();
		helpm3p3m.setDisplayName(ChatColor.WHITE + "Website Rules");
		ArrayList<String> helpm3p3l = new ArrayList<String>();
		helpm3p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm3p3l.add(ChatColor.DARK_PURPLE + "Right click me to find out some website rules!");
		helpm3p3l.add(ChatColor.WHITE + "These rules will be enforced on the website to");
		helpm3p3l.add(ChatColor.WHITE + "make sure that it is a friendly place open to");
		helpm3p3l.add(ChatColor.WHITE + "everyone.");
		helpm3p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm3p3m.setLore(helpm3p3l);
		helpm3p3m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm3p3.setItemMeta(helpm3p3m);

		inv.setItem(11, helpm3p1);
		inv.setItem(13, helpm3p2);
		inv.setItem(15, helpm3p3);
		inv.setItem(18, goBack());

		player.openInventory(inv);

		for (int i = 0; i < inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}

	public void helpCommandsSkyblockWarpInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 45,
				plugin.servern + ChatColor.WHITE + " Skyblock + Warp Cmds");
		
		ItemStack helpm4p1 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm4p1m = helpm4p1.getItemMeta();
		helpm4p1m.setDisplayName(ChatColor.WHITE + "[1]" + ChatColor.DARK_PURPLE + " /is (/island)");
		ArrayList<String> helpm4p1l = new ArrayList<String>();
		helpm4p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p1l.add(ChatColor.WHITE + "Creates an empty island if one is not already");
		helpm4p1l.add(ChatColor.WHITE + "created. You will have a choice when creating");
		helpm4p1l.add(ChatColor.WHITE + "an island.");
		helpm4p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p1m.setLore(helpm4p1l);
		helpm4p1m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p1.setItemMeta(helpm4p1m);
		
		ItemStack helpm4p2 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm4p2m = helpm4p2.getItemMeta();
		helpm4p2m.setDisplayName(ChatColor.WHITE + "[2]" + ChatColor.DARK_PURPLE + " /is cp (/is controlpanel)");
		ArrayList<String> helpm4p2l = new ArrayList<String>();
		helpm4p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p2l.add(ChatColor.WHITE + "Opens the island control panel. This can control");
		helpm4p2l.add(ChatColor.WHITE + "many settings for both visitors and owners of");
		helpm4p2l.add(ChatColor.WHITE + "the island.");
		helpm4p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p2m.setLore(helpm4p2l);
		helpm4p2m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p2.setItemMeta(helpm4p2m);
		
		ItemStack helpm4p3 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm4p3m = helpm4p3.getItemMeta();
		helpm4p3m.setDisplayName(ChatColor.WHITE + "[3]" + ChatColor.DARK_PURPLE + " /is reset");
		ArrayList<String> helpm4p3l = new ArrayList<String>();
		helpm4p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p3l.add(ChatColor.WHITE + "This resets the island to it's original state. Each");
		helpm4p3l.add(ChatColor.WHITE + "player only gets three reset so use them wisely.");
		helpm4p3l.add(ChatColor.WHITE + "This command will also reset the player's");
		helpm4p3l.add(ChatColor.WHITE + "inventory so make sure to put anything you want");
		helpm4p3l.add(ChatColor.WHITE + "to keep in a safe place.");
		helpm4p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p3m.setLore(helpm4p3l);
		helpm4p3m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p3.setItemMeta(helpm4p3m);
		
		ItemStack helpm4p4 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm4p4m = helpm4p4.getItemMeta();
		helpm4p4m.setDisplayName(ChatColor.WHITE + "[4]" + ChatColor.DARK_PURPLE + " /is sethome");
		ArrayList<String> helpm4p4l = new ArrayList<String>();
		helpm4p4l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p4l.add(ChatColor.WHITE + "Use this command to set a home on your island.");
		helpm4p4l.add(ChatColor.WHITE + "This will change the position that you spawn on");
		helpm4p4l.add(ChatColor.WHITE + "your island when you type /is");
		helpm4p4l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p4m.setLore(helpm4p4l);
		helpm4p4m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p4.setItemMeta(helpm4p4m);
		
		ItemStack helpm4p5 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm4p5m = helpm4p5.getItemMeta();
		helpm4p5m.setDisplayName(ChatColor.WHITE + "[5]" + ChatColor.DARK_PURPLE + " /is top");
		ArrayList<String> helpm4p5l = new ArrayList<String>();
		helpm4p5l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p5l.add(ChatColor.WHITE + "This will display the top 10 islands on the");
		helpm4p5l.add(ChatColor.WHITE + "server. These score are based off the amount of");
		helpm4p5l.add(ChatColor.WHITE + "blocks and the type of blocks used on the island.");
		helpm4p5l.add(ChatColor.WHITE + "There is also an island worth category which gives");
		helpm4p5l.add(ChatColor.WHITE + "the monetary value of the blocks used on the");
		helpm4p5l.add(ChatColor.WHITE + "island.");
		helpm4p5l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p5m.setLore(helpm4p5l);
		helpm4p5m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p5.setItemMeta(helpm4p5m);
		
		ItemStack helpm4p6 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm4p6m = helpm4p6.getItemMeta();
		helpm4p6m.setDisplayName(ChatColor.WHITE + "[6]" + ChatColor.DARK_PURPLE + " /is warps");
		ArrayList<String> helpm4p6l = new ArrayList<String>();
		helpm4p6l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p6l.add(ChatColor.WHITE + "This will list all the player islands that you can");
		helpm4p6l.add(ChatColor.WHITE + "warp to. What you can interact with depends on");
		helpm4p6l.add(ChatColor.WHITE + "the island you visit. Some you will be able to");
		helpm4p6l.add(ChatColor.WHITE + "open doors whereas others you won't be able to.");
		helpm4p6l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p6m.setLore(helpm4p6l);
		helpm4p6m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p6.setItemMeta(helpm4p6m);
		
		ItemStack helpm4p7 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm4p7m = helpm4p7.getItemMeta();
		helpm4p7m.setDisplayName(ChatColor.WHITE + "[7]" + ChatColor.DARK_PURPLE + " /is invite [username]");
		ArrayList<String> helpm4p7l = new ArrayList<String>();
		helpm4p7l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p7l.add(ChatColor.WHITE + "To invite a player to your island, this command");
		helpm4p7l.add(ChatColor.WHITE + "must be used.");
		helpm4p7l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p7m.setLore(helpm4p7l);
		helpm4p7m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p7.setItemMeta(helpm4p7m);
		
		ItemStack helpm4p8 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm4p8m = helpm4p8.getItemMeta();
		helpm4p8m.setDisplayName(ChatColor.WHITE + "[8]" + ChatColor.DARK_PURPLE + " /is team");
		ArrayList<String> helpm4p8l = new ArrayList<String>();
		helpm4p8l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p8l.add(ChatColor.WHITE + "This command will list the players that are apart");
		helpm4p8l.add(ChatColor.WHITE + "of an island.");
		helpm4p8l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p8m.setLore(helpm4p8l);
		helpm4p8m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p8.setItemMeta(helpm4p8m);
		
		ItemStack helpm4p9 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm4p9m = helpm4p9.getItemMeta();
		helpm4p9m.setDisplayName(ChatColor.WHITE + "[9]" + ChatColor.DARK_PURPLE + " /is leave");
		ArrayList<String> helpm4p9l = new ArrayList<String>();
		helpm4p9l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p9l.add(ChatColor.WHITE + "This command is used to leave an island. This");
		helpm4p9l.add(ChatColor.WHITE + "will remove all items from the players inventory.");
		helpm4p9l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p9m.setLore(helpm4p9l);
		helpm4p9m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p9.setItemMeta(helpm4p9m);
		
		ItemStack helpm4p10 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm4p10m = helpm4p10.getItemMeta();
		helpm4p10m.setDisplayName(ChatColor.WHITE + "[10]" + ChatColor.DARK_PURPLE + " /is kick [username]");
		ArrayList<String> helpm4p10l = new ArrayList<String>();
		helpm4p10l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p10l.add(ChatColor.WHITE + "This command is used to kick players from an");
		helpm4p10l.add(ChatColor.WHITE + "island. Only the owner of an island can use this");
		helpm4p10l.add(ChatColor.WHITE + "command.");
		helpm4p10l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p10m.setLore(helpm4p10l);
		helpm4p10m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p10.setItemMeta(helpm4p10m);
		
		ItemStack helpm4p11 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm4p11m = helpm4p11.getItemMeta();
		helpm4p11m.setDisplayName(ChatColor.WHITE + "[11]" + ChatColor.DARK_PURPLE + " /is makeleader [username]");
		ArrayList<String> helpm4p11l = new ArrayList<String>();
		helpm4p11l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p11l.add(ChatColor.WHITE + "This command is used to make another player");
		helpm4p11l.add(ChatColor.WHITE + "on your island the leader of said island. This");
		helpm4p11l.add(ChatColor.WHITE + "command can only be used by the island leader.");
		helpm4p11l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p11m.setLore(helpm4p11l);
		helpm4p11m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p11.setItemMeta(helpm4p11m);
		
		ItemStack helpm4p12 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm4p12m = helpm4p12.getItemMeta();
		helpm4p12m.setDisplayName(ChatColor.WHITE + "[12]" + ChatColor.DARK_PURPLE + " /is expel [username]");
		ArrayList<String> helpm4p12l = new ArrayList<String>();
		helpm4p12l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p12l.add(ChatColor.WHITE + "Used to remove specific visitors from an island.");
		helpm4p12l.add(ChatColor.WHITE + "created.");
		helpm4p12l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p12m.setLore(helpm4p12l);
		helpm4p12m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p12.setItemMeta(helpm4p12m);
		
		ItemStack helpm4p13 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm4p13m = helpm4p13.getItemMeta();
		helpm4p13m.setDisplayName(ChatColor.WHITE + "[13]" + ChatColor.DARK_PURPLE + " /is ban [username]");
		ArrayList<String> helpm4p13l = new ArrayList<String>();
		helpm4p13l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p13l.add(ChatColor.WHITE + "Used to ban specific players from an island.");
		helpm4p13l.add(ChatColor.WHITE + "this can be used so that 'annoying' players");
		helpm4p13l.add(ChatColor.WHITE + "cannot access your island warp anymore.");
		helpm4p13l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p13m.setLore(helpm4p13l);
		helpm4p13m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p13.setItemMeta(helpm4p13m);
		
		ItemStack helpm4p14 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm4p14m = helpm4p14.getItemMeta();
		helpm4p14m.setDisplayName(ChatColor.WHITE + "[14]" + ChatColor.DARK_PURPLE + " /is settings");
		ArrayList<String> helpm4p14l = new ArrayList<String>();
		helpm4p14l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p14l.add(ChatColor.WHITE + "This command is used to alter island settings");
		helpm4p14l.add(ChatColor.WHITE + "for visitors and members of the island alike.");
		helpm4p14l.add(ChatColor.WHITE + "Some settings may be locked by default");
		helpm4p14l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p14m.setLore(helpm4p14l);
		helpm4p14m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p14.setItemMeta(helpm4p14m);
		
		ItemStack helpm4p15 = new ItemStack(Material.BOOK, 1);
		ItemMeta helpm4p15m = helpm4p15.getItemMeta();
		helpm4p15m.setDisplayName(ChatColor.WHITE + "Skyblock Commands");
		ArrayList<String> helpm4p15l = new ArrayList<String>();
		helpm4p15l.add(ChatColor.DARK_PURPLE + "---------->");
		helpm4p15m.setLore(helpm4p15l);
		helpm4p15m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p15.setItemMeta(helpm4p15m);
		
		ItemStack helpm4p16 = new ItemStack(Material.BOOK, 1);
		ItemMeta helpm4p16m = helpm4p16.getItemMeta();
		helpm4p16m.setDisplayName(ChatColor.WHITE + "Warp Commands");
		ArrayList<String> helpm4p16l = new ArrayList<String>();
		helpm4p16l.add(ChatColor.DARK_PURPLE + "---------->");
		helpm4p16m.setLore(helpm4p16l);
		helpm4p16m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p16.setItemMeta(helpm4p16m);
		
		ItemStack helpm4p17 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm4p17m = helpm4p17.getItemMeta();
		helpm4p17m.setDisplayName(ChatColor.WHITE + "[1]" + ChatColor.DARK_PURPLE + "/warps");
		ArrayList<String> helpm4p17l = new ArrayList<String>();
		helpm4p17l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p17l.add(ChatColor.WHITE + "This command is used to open up the warps menu");
		helpm4p17l.add(ChatColor.WHITE + "which you can choose from.");
		helpm4p17l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p17m.setLore(helpm4p17l);
		helpm4p17m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p17.setItemMeta(helpm4p17m);
		
		ItemStack helpm4p18 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm4p18m = helpm4p18.getItemMeta();
		helpm4p18m.setDisplayName(ChatColor.DARK_PURPLE + "/warp [warp name]");
		ArrayList<String> helpm4p18l = new ArrayList<String>();
		helpm4p18l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p18l.add(ChatColor.WHITE + "This command is used to warp to specific places.");
		helpm4p18l.add(ChatColor.WHITE + "Each of the warp names can be found in /warps.");
		helpm4p18l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm4p18m.setLore(helpm4p18l);
		helpm4p18m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm4p18.setItemMeta(helpm4p18m);		
		
		inv.setItem(10, helpm4p15);
		inv.setItem(11, helpm4p1);
		inv.setItem(12, helpm4p2);
		inv.setItem(13, helpm4p3);
		inv.setItem(14, helpm4p4);
		inv.setItem(15, helpm4p5);
		inv.setItem(16, helpm4p6);
		inv.setItem(19, helpm4p7);
		inv.setItem(20, helpm4p8);
		inv.setItem(21, helpm4p9);
		inv.setItem(22, helpm4p10);
		inv.setItem(23, helpm4p11);
		inv.setItem(24, helpm4p12);
		inv.setItem(25, helpm4p13);
		inv.setItem(28, helpm4p14);
		inv.setItem(29, helpm4p16);
		inv.setItem(30, helpm4p17);
		inv.setItem(31, helpm4p18);
		inv.setItem(36, goBack());
		
		player.openInventory(inv);
		
		for (int i = 0; i < inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
		
	}
	
	public void helpCommandsShopSpawnerInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 36, plugin.servern + ChatColor.WHITE + " Shop + Spawner Cmds");
		
		ItemStack helpm5p1 = new ItemStack(Material.BOOK, 1);
		ItemMeta helpm5p1m = helpm5p1.getItemMeta();
		helpm5p1m.setDisplayName(ChatColor.WHITE + "Shop Commands");
		ArrayList<String> helpm5p1l = new ArrayList<String>();
		helpm5p1l.add(ChatColor.DARK_PURPLE + "---------->");
		helpm5p1m.setLore(helpm5p1l);
		helpm5p1m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm5p1.setItemMeta(helpm5p1m);
		
		ItemStack helpm5p2 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm5p2m = helpm5p2.getItemMeta();
		helpm5p2m.setDisplayName(ChatColor.WHITE + "[1]" + ChatColor.DARK_PURPLE + " /shop");
		ArrayList<String> helpm5p2l = new ArrayList<String>();
		helpm5p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm5p2l.add(ChatColor.WHITE + "This command is for donors only but is a");
		helpm5p2l.add(ChatColor.WHITE + "shortcut to reach the shop. This is the main");
		helpm5p2l.add(ChatColor.WHITE + "way to purchase and sell items.");
		helpm5p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm5p2m.setLore(helpm5p2l);
		helpm5p2m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm5p2.setItemMeta(helpm5p2m);
		
		ItemStack helpm5p3 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm5p3m = helpm5p3.getItemMeta();
		helpm5p3m.setDisplayName(ChatColor.WHITE + "[2]" + ChatColor.DARK_PURPLE + " /ah");
		ArrayList<String> helpm5p3l = new ArrayList<String>();
		helpm5p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm5p3l.add(ChatColor.WHITE + "This is the core command for the auction house.");
		helpm5p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm5p3m.setLore(helpm5p3l);
		helpm5p3m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm5p3.setItemMeta(helpm5p3m);
		
		ItemStack helpm5p4 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm5p4m = helpm5p4.getItemMeta();
		helpm5p4m.setDisplayName(ChatColor.WHITE + "[3]" + ChatColor.DARK_PURPLE + " /ah ");
		ArrayList<String> helpm5p4l = new ArrayList<String>();
		helpm5p4l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm5p4l.add(ChatColor.WHITE + "This is the core command for the auction house.");
		helpm5p4l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm5p4m.setLore(helpm5p4l);
		helpm5p4m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm5p4.setItemMeta(helpm5p4m);
		
		ItemStack helpm5p5 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm5p5m = helpm5p5.getItemMeta();
		helpm5p5m.setDisplayName(ChatColor.WHITE + "[4]" + ChatColor.DARK_PURPLE + " /ah help");
		ArrayList<String> helpm5p5l = new ArrayList<String>();
		helpm5p5l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm5p5l.add(ChatColor.WHITE + "Brings up the help menu for the auction house.");
		helpm5p5l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm5p5m.setLore(helpm5p5l);
		helpm5p5m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm5p5.setItemMeta(helpm5p5m);
		
		ItemStack helpm5p6 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm5p6m = helpm5p6.getItemMeta();
		helpm5p6m.setDisplayName(ChatColor.WHITE + "[5]" + ChatColor.DARK_PURPLE + " /ah sell");
		ArrayList<String> helpm5p6l = new ArrayList<String>();
		helpm5p6l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm5p6l.add(ChatColor.WHITE + "This command sells whatever the user is holding");
		helpm5p6l.add(ChatColor.WHITE + "for the specified price.");
		helpm5p6l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm5p6m.setLore(helpm5p6l);
		helpm5p6m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm5p6.setItemMeta(helpm5p6m);
		
		ItemStack helpm5p7 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm5p7m = helpm5p7.getItemMeta();
		helpm5p7m.setDisplayName(ChatColor.WHITE + "[6]" + ChatColor.DARK_PURPLE + " /ah expired");
		ArrayList<String> helpm5p7l = new ArrayList<String>();
		helpm5p7l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm5p7l.add(ChatColor.WHITE + "This command shows all the expired items");
		helpm5p7l.add(ChatColor.WHITE + "for the specified price.");
		helpm5p7l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm5p7m.setLore(helpm5p7l);
		helpm5p7m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm5p7.setItemMeta(helpm5p7m);
		
		ItemStack helpm5p8 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm5p8m = helpm5p8.getItemMeta();
		helpm5p8m.setDisplayName(ChatColor.WHITE + "[7]" + ChatColor.DARK_PURPLE + " /ah listed");
		ArrayList<String> helpm5p8l = new ArrayList<String>();
		helpm5p8l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm5p8l.add(ChatColor.WHITE + "This command shows all the items that you have");
		helpm5p8l.add(ChatColor.WHITE + "listed and that haven't expired.");
		helpm5p8l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm5p8m.setLore(helpm5p8l);
		helpm5p8m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm5p8.setItemMeta(helpm5p8m);
		
		ItemStack helpm5p9 = new ItemStack(Material.BOOK, 1);
		ItemMeta helpm5p9m = helpm5p9.getItemMeta();
		helpm5p9m.setDisplayName(ChatColor.WHITE + "Shop Commands");
		ArrayList<String> helpm5p9l = new ArrayList<String>();
		helpm5p9l.add(ChatColor.DARK_PURPLE + "---------->");
		helpm5p9m.setLore(helpm5p9l);
		helpm5p9m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm5p9.setItemMeta(helpm5p9m);
		
		ItemStack helpm5p10 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm5p10m = helpm5p10.getItemMeta();
		helpm5p10m.setDisplayName(ChatColor.DARK_PURPLE + "Spawner Information");
		ArrayList<String> helpm5p10l = new ArrayList<String>();
		helpm5p10l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm5p10l.add(ChatColor.WHITE + "Spawners are available from the shop and.");
		helpm5p10l.add(ChatColor.WHITE + "crates. Spawner stacking is enabled and stack up");
		helpm5p10l.add(ChatColor.WHITE + "to 10 and can be broken as a stack by shift");
		helpm5p10l.add(ChatColor.WHITE + "- right clicking the spawner to bring up the break");
		helpm5p10l.add(ChatColor.WHITE + "menu.");
		helpm5p10l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm5p10m.setLore(helpm5p10l);
		helpm5p10m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm5p10.setItemMeta(helpm5p10m);	
		
		
		inv.setItem(10, helpm5p1);
		inv.setItem(11, helpm5p2);
		inv.setItem(12, helpm5p3);
		inv.setItem(13, helpm5p4);
		inv.setItem(14, helpm5p5);
		inv.setItem(15, helpm5p6);
		inv.setItem(16, helpm5p7);
		inv.setItem(19, helpm5p8);
		inv.setItem(20, helpm5p9);
		inv.setItem(21, helpm5p10);
		inv.setItem(27, goBack());
		
		
		player.openInventory(inv);
		
		for (int i = 0; i < inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}
	
	public void helpCommandsPvPOtherInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 36, plugin.servern + ChatColor.WHITE + " PvP + Other Cmds");
		
		ItemStack helpm6p1 = new ItemStack(Material.BOOK, 1);
		ItemMeta helpm6p1m = helpm6p1.getItemMeta();
		helpm6p1m.setDisplayName(ChatColor.WHITE + "PvP Commands");
		ArrayList<String> helpm6p1l = new ArrayList<String>();
		helpm6p1l.add(ChatColor.DARK_PURPLE + "---------->");
		helpm6p1m.setLore(helpm6p1l);
		helpm6p1m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm6p1.setItemMeta(helpm6p1m);
		
		ItemStack helpm6p2 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm6p2m = helpm6p2.getItemMeta();
		helpm6p2m.setDisplayName(ChatColor.WHITE + "[1]" + ChatColor.DARK_PURPLE + " /duel [playername]");
		ArrayList<String> helpm6p2l = new ArrayList<String>();
		helpm6p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm6p2l.add(ChatColor.WHITE + "This is the core command to duel other players");
		helpm6p2l.add(ChatColor.WHITE + "on the server. You will be told to choose a kit");
		helpm6p2l.add(ChatColor.WHITE + "and then teleport to the duels arena.");
		helpm6p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm6p2m.setLore(helpm6p2l);
		helpm6p2m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm6p2.setItemMeta(helpm6p2m);
		
		ItemStack helpm6p3 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm6p3m = helpm6p3.getItemMeta();
		helpm6p3m.setDisplayName(ChatColor.WHITE + "[2]" + ChatColor.DARK_PURPLE + " /ct");
		ArrayList<String> helpm6p3l = new ArrayList<String>();
		helpm6p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm6p3l.add(ChatColor.WHITE + "This command will state whether the player is");
		helpm6p3l.add(ChatColor.WHITE + "combat tagged and how long for.");
		helpm6p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm6p3m.setLore(helpm6p3l);
		helpm6p3m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm6p3.setItemMeta(helpm6p3m);
		
		ItemStack helpm6p4 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm6p4m = helpm6p4.getItemMeta();
		helpm6p4m.setDisplayName(ChatColor.WHITE + "[3]" + ChatColor.DARK_PURPLE + " /duel accept");
		ArrayList<String> helpm6p4l = new ArrayList<String>();
		helpm6p4l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm6p4l.add(ChatColor.WHITE + "This command is used to accept duels from other");
		helpm6p4l.add(ChatColor.WHITE + "players.");
		helpm6p4l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm6p4m.setLore(helpm6p4l);
		helpm6p4m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm6p4.setItemMeta(helpm6p4m);
		
		ItemStack helpm6p5 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm6p5m = helpm6p5.getItemMeta();
		helpm6p5m.setDisplayName(ChatColor.WHITE + "[4]" + ChatColor.DARK_PURPLE + " /duel deny");
		ArrayList<String> helpm6p5l = new ArrayList<String>();
		helpm6p5l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm6p5l.add(ChatColor.WHITE + "This command is used to deny duels from other");
		helpm6p5l.add(ChatColor.WHITE + "players.");
		helpm6p5l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm6p5m.setLore(helpm6p5l);
		helpm6p5m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm6p5.setItemMeta(helpm6p5m);
		
		ItemStack helpm6p6 = new ItemStack(Material.BOOK, 1);
		ItemMeta helpm6p6m = helpm6p6.getItemMeta();
		helpm6p6m.setDisplayName(ChatColor.WHITE + "Other Commands");
		ArrayList<String> helpm6p6l = new ArrayList<String>();
		helpm6p6l.add(ChatColor.DARK_PURPLE + "---------->");
		helpm6p6m.setLore(helpm6p6l);
		helpm6p6m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm6p6.setItemMeta(helpm6p6m);
		
		ItemStack helpm6p7 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm6p7m = helpm6p7.getItemMeta();
		helpm6p7m.setDisplayName(ChatColor.WHITE + "[1]" + ChatColor.DARK_PURPLE + " (TBD)");
		ArrayList<String> helpm6p7l = new ArrayList<String>();
		helpm6p7l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm6p7l.add(ChatColor.WHITE + "[TBD]");
		helpm6p7l.add(ChatColor.WHITE + "[TBD]");
		helpm6p7l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm6p7m.setLore(helpm6p7l);
		helpm6p7m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm6p7.setItemMeta(helpm6p7m);
		
		inv.setItem(10, helpm6p1);
		inv.setItem(11, helpm6p2);
		inv.setItem(12, helpm6p3);
		inv.setItem(13, helpm6p4);
		inv.setItem(14, helpm6p5);
		inv.setItem(15, helpm6p6);
		inv.setItem(16, helpm6p7);
		inv.setItem(27, goBack());
		
		player.openInventory(inv);
		
		for (int i = 0; i < inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}
	
	public void helpRulesServerInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 36, plugin.servern + ChatColor.WHITE + " Server Rules");
		
		ItemStack helpm7p1 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm7p1m = helpm7p1.getItemMeta();
		helpm7p1m.setDisplayName(ChatColor.WHITE + "[1]" + ChatColor.DARK_PURPLE + " Don't ask for 'OP' or free donor / staff ranks");
		ArrayList<String> helpm7p1l = new ArrayList<String>();
		helpm7p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p1l.add(ChatColor.WHITE + "Please do not ask for donor / staff ranks or OP");
		helpm7p1l.add(ChatColor.WHITE + "as this will result in a punishment. If you");
		helpm7p1l.add(ChatColor.WHITE + "persist in asking for ranks then you will be");
		helpm7p1l.add(ChatColor.WHITE + "banned from this server.");
		helpm7p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p1m.setLore(helpm7p1l);
		helpm7p1m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm7p1.setItemMeta(helpm7p1m);
		
		ItemStack helpm7p2 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm7p2m = helpm7p2.getItemMeta();
		helpm7p2m.setDisplayName(ChatColor.WHITE + "[2]" + ChatColor.DARK_PURPLE + " Do not attempt to ban / mute evade");
		ArrayList<String> helpm7p2l = new ArrayList<String>();
		helpm7p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p2l.add(ChatColor.WHITE + "You were banned / muted for a reason so if");
		helpm7p2l.add(ChatColor.WHITE + "you attempt to evade these punishments you");
		helpm7p2l.add(ChatColor.WHITE + "will get the alternate account permanently");
		helpm7p2l.add(ChatColor.WHITE + "muted or banned. Repeatedly doing this will");
		helpm7p2l.add(ChatColor.WHITE + "result in an IP ban.");
		helpm7p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p2m.setLore(helpm7p2l);
		helpm7p2m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm7p2.setItemMeta(helpm7p2m);
		
		ItemStack helpm7p3 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm7p3m = helpm7p3.getItemMeta();
		helpm7p3m.setDisplayName(ChatColor.WHITE + "[3]" + ChatColor.DARK_PURPLE + " Don't hack or use unauthorised mods");
		ArrayList<String> helpm7p3l = new ArrayList<String>();
		helpm7p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p3l.add(ChatColor.WHITE + "Using a hacked client or unauthorised mod will");
		helpm7p3l.add(ChatColor.WHITE + "result in a ban without warning. A list of allowed");
		helpm7p3l.add(ChatColor.WHITE + "mods can be found on the website. Hacking gives");
		helpm7p3l.add(ChatColor.WHITE + "an unfair advantage and reduces the enjoyment");
		helpm7p3l.add(ChatColor.WHITE + "of other players.");
		helpm7p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p3m.setLore(helpm7p3l);
		helpm7p3m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm7p3.setItemMeta(helpm7p3m);
		
		ItemStack helpm7p4 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm7p4m = helpm7p4.getItemMeta();
		helpm7p4m.setDisplayName(ChatColor.WHITE + "[4]" + ChatColor.DARK_PURPLE + " Don't spam in chat");
		ArrayList<String> helpm7p4l = new ArrayList<String>();
		helpm7p4l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p4l.add(ChatColor.WHITE + "Don't spam in chat as this becomes annoying");
		helpm7p4l.add(ChatColor.WHITE + "and will irritate players on the server. If you");
		helpm7p4l.add(ChatColor.WHITE + "manage to spam in chat then you will be");
		helpm7p4l.add(ChatColor.WHITE + "punished.");
		helpm7p4l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p4m.setLore(helpm7p4l);
		helpm7p4m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm7p4.setItemMeta(helpm7p4m);
		
		ItemStack helpm7p5 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm7p5m = helpm7p5.getItemMeta();
		helpm7p5m.setDisplayName(ChatColor.WHITE + "[5]" + ChatColor.DARK_PURPLE + " Don't exploit server bugs or glitches");
		ArrayList<String> helpm7p5l = new ArrayList<String>();
		helpm7p5l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p5l.add(ChatColor.WHITE + "The staff team understands that there will be");
		helpm7p5l.add(ChatColor.WHITE + "bugs and exploits but please don't exploit them");
		helpm7p5l.add(ChatColor.WHITE + "however tempting it may be. Please report these");
		helpm7p5l.add(ChatColor.WHITE + "exploits and bugs to the staff team so they can");
		helpm7p5l.add(ChatColor.WHITE + "be dealt with.");
		helpm7p5l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p5m.setLore(helpm7p5l);
		helpm7p5m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm7p5.setItemMeta(helpm7p5m);
		
		ItemStack helpm7p6 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm7p6m = helpm7p6.getItemMeta();
		helpm7p6m.setDisplayName(ChatColor.WHITE + "[6]" + ChatColor.DARK_PURPLE + " Don't island farm");
		ArrayList<String> helpm7p6l = new ArrayList<String>();
		helpm7p6l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p6l.add(ChatColor.WHITE + "Don't island farm as this will provide an unfair");
		helpm7p6l.add(ChatColor.WHITE + "advantage to the player doing the farming.");
		helpm7p6l.add(ChatColor.WHITE + "Island farming is the act of restarting an island");
		helpm7p6l.add(ChatColor.WHITE + "multiple times to gain resources from the island.");
		helpm7p6l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p6m.setLore(helpm7p6l);
		helpm7p6m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm7p6.setItemMeta(helpm7p6m);
		
		ItemStack helpm7p7 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm7p7m = helpm7p7.getItemMeta();
		helpm7p7m.setDisplayName(ChatColor.WHITE + "[7]" + ChatColor.DARK_PURPLE + " Don't issue threats towards other players");
		ArrayList<String> helpm7p7l = new ArrayList<String>();
		helpm7p7l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p7l.add(ChatColor.WHITE + "Don't threaten other players such as Doxing or");
		helpm7p7l.add(ChatColor.WHITE + "Ddosing. These acts will result in a mute being");
		helpm7p7l.add(ChatColor.WHITE + "issued depending on the severity of the threat");
		helpm7p7l.add(ChatColor.WHITE + "or the action. The act of Ddosing is illegal in");
		helpm7p7l.add(ChatColor.WHITE + "most if not all the countries currently.");
		helpm7p7l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p7m.setLore(helpm7p7l);
		helpm7p7m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm7p7.setItemMeta(helpm7p7m);
		
		ItemStack helpm7p8 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm7p8m = helpm7p8.getItemMeta();
		helpm7p8m.setDisplayName(ChatColor.WHITE + "[8]" + ChatColor.DARK_PURPLE + " Don't make offensive or explicit builds");
		ArrayList<String> helpm7p8l = new ArrayList<String>();
		helpm7p8l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p8l.add(ChatColor.WHITE + "Making offensive or explicit builds may be fun");
		helpm7p8l.add(ChatColor.WHITE + "but are punishable by a kick for a first offence");
		helpm7p8l.add(ChatColor.WHITE + "and then a ban for the next offence as the");
		helpm7p8l.add(ChatColor.WHITE + "server needs to be child friendly.");
		helpm7p8l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p8m.setLore(helpm7p8l);
		helpm7p8m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm7p8.setItemMeta(helpm7p8m);
		
		ItemStack helpm7p9 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm7p9m = helpm7p9.getItemMeta();
		helpm7p9m.setDisplayName(ChatColor.WHITE + "[9]" + ChatColor.DARK_PURPLE + " AFK machines are not allowed");
		ArrayList<String> helpm7p9l = new ArrayList<String>();
		helpm7p9l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p9l.add(ChatColor.WHITE + "AFK pools and machines are not allowed due to");
		helpm7p9l.add(ChatColor.WHITE + "them giving an unfair advantage and rendering");
		helpm7p9l.add(ChatColor.WHITE + "chunks on the server that do not need to be");
		helpm7p9l.add(ChatColor.WHITE + "rendered if the player is AFKing. This causes");
		helpm7p9l.add(ChatColor.WHITE + "unnecassary lag for other players. Donor ranks");
		helpm7p9l.add(ChatColor.WHITE + "include increasing afk timers which is the one");
		helpm7p9l.add(ChatColor.WHITE + "way of legal AFKing on the server.");
		helpm7p9l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p9m.setLore(helpm7p9l);
		helpm7p9m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm7p9.setItemMeta(helpm7p9m);
		
		ItemStack helpm7p10 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm7p10m = helpm7p10.getItemMeta();
		helpm7p10m.setDisplayName(ChatColor.WHITE + "[10]" + ChatColor.DARK_PURPLE + " Don't make redstone machines to cause lag");
		ArrayList<String> helpm7p10l = new ArrayList<String>();
		helpm7p10l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p10l.add(ChatColor.WHITE + "These contraptions will result in the player");
		helpm7p10l.add(ChatColor.WHITE + "who made it getting punished. Lagging the");
		helpm7p10l.add(ChatColor.WHITE + "server intentionally makes it less enjoyable");
		helpm7p10l.add(ChatColor.WHITE + "for others who want to play.");
		helpm7p10l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p10m.setLore(helpm7p10l);
		helpm7p10m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm7p10.setItemMeta(helpm7p10m);
		
		ItemStack helpm7p11 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm7p11m = helpm7p11.getItemMeta();
		helpm7p11m.setDisplayName(ChatColor.WHITE + "[11]" + ChatColor.DARK_PURPLE + " Donor abuse is not allowed");
		ArrayList<String> helpm7p11l = new ArrayList<String>();
		helpm7p11l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p11l.add(ChatColor.WHITE + "Donor abuse such as spawning animals for");
		helpm7p11l.add(ChatColor.WHITE + "other players who do not have a rank or fixing");
		helpm7p11l.add(ChatColor.WHITE + "their items. These perks are only available to");
		helpm7p11l.add(ChatColor.WHITE + "those who bought the rank or perk.");
		helpm7p11l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p11m.setLore(helpm7p11l);
		helpm7p11m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm7p11.setItemMeta(helpm7p11m);
		
		ItemStack helpm7p12 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm7p12m = helpm7p12.getItemMeta();
		helpm7p12m.setDisplayName(ChatColor.WHITE + "[12]" + ChatColor.DARK_PURPLE + " Don't discriminate or be racist");
		ArrayList<String> helpm7p12l = new ArrayList<String>();
		helpm7p12l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p12l.add(ChatColor.WHITE + "Discrimination, racism and hate speech of any");
		helpm7p12l.add(ChatColor.WHITE + "kind is not tolerated and will be punished");
		helpm7p12l.add(ChatColor.WHITE + "accordingly. The server needs to be kept ");
		helpm7p12l.add(ChatColor.WHITE + "friendly towards all who join.");
		helpm7p12l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p12m.setLore(helpm7p12l);
		helpm7p12m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm7p12.setItemMeta(helpm7p12m);
		
		ItemStack helpm7p13 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm7p13m = helpm7p13.getItemMeta();
		helpm7p13m.setDisplayName(ChatColor.WHITE + "[13]" + ChatColor.DARK_PURPLE + " Don't impersonate staff members");
		ArrayList<String> helpm7p13l = new ArrayList<String>();
		helpm7p13l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p13l.add(ChatColor.WHITE + "Impersonating staff members is not allowed");
		helpm7p13l.add(ChatColor.WHITE + "which includes nicknames, saying you are an alt");
		helpm7p13l.add(ChatColor.WHITE + "of a staff member and any other impersonation");
		helpm7p13l.add(ChatColor.WHITE + "method.");
		helpm7p13l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p13m.setLore(helpm7p13l);
		helpm7p13m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm7p13.setItemMeta(helpm7p13m);
		
		ItemStack helpm7p14 = new ItemStack(Material.BOOK, 1);
		ItemMeta helpm7p14m = helpm7p14.getItemMeta();
		helpm7p14m.setDisplayName(ChatColor.WHITE + "[14]" + ChatColor.DARK_PURPLE + " A full list of rules can be found on our website");
		ArrayList<String> helpm7p14l = new ArrayList<String>();
		helpm7p14l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p14l.add(ChatColor.WHITE + "www.SouthHollow.net");
		helpm7p14l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm7p14m.setLore(helpm7p14l);
		helpm7p14m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm7p14.setItemMeta(helpm7p14m);
		
		inv.setItem(10, helpm7p1);
		inv.setItem(11, helpm7p2);
		inv.setItem(12, helpm7p3);
		inv.setItem(13, helpm7p4);
		inv.setItem(14, helpm7p5);
		inv.setItem(15, helpm7p6);
		inv.setItem(16, helpm7p7);
		inv.setItem(19, helpm7p8);
		inv.setItem(20, helpm7p9);
		inv.setItem(21, helpm7p10);
		inv.setItem(22, helpm7p11);
		inv.setItem(23, helpm7p12);
		inv.setItem(24, helpm7p13);
		inv.setItem(25, helpm7p14);
		inv.setItem(27, goBack());
		
		
		player.openInventory(inv);
		
		for (int i = 0; i < inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}
	
	public void helpRulesOtherInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 27, plugin.servern + ChatColor.WHITE + " Other Platform Rules");
		
		ItemStack helpm8p1 = new ItemStack(Material.BOOK, 1);
		ItemMeta helpm8p1m = helpm8p1.getItemMeta();
		helpm8p1m.setDisplayName(ChatColor.WHITE + "Discord Rules");
		ArrayList<String> helpm8p1l = new ArrayList<String>();
		helpm8p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm8p1l.add(ChatColor.WHITE + "Right click me to find out the discord rules.");
		helpm8p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm8p1m.setLore(helpm8p1l);
		helpm8p1m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm8p1.setItemMeta(helpm8p1m);
		
		inv.setItem(11, helpm8p1);
		inv.setItem(18, goBack());
		
		player.openInventory(inv);
		
		for (int i = 0; i < inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}
	
	public void helpRulesOtherDiscordInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 36, plugin.servern + ChatColor.WHITE + " Discord Rules");
		
		ItemStack helpm9p1 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm9p1m = helpm9p1.getItemMeta();
		helpm9p1m.setDisplayName(ChatColor.WHITE + "[1]" + ChatColor.DARK_PURPLE + " Respecting Community Members");
		ArrayList<String> helpm9p1l = new ArrayList<String>();
		helpm9p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm9p1l.add(ChatColor.WHITE + "Please remain respectful when speaking in our");
		helpm9p1l.add(ChatColor.WHITE + "community chats such as on Discord and the");
		helpm9p1l.add(ChatColor.WHITE + "server. We would like to keep this community");
		helpm9p1l.add(ChatColor.WHITE + "free of inappropriate behaviour and disrespect");
		helpm9p1l.add(ChatColor.WHITE + "but we do understand that this is not always");
		helpm9p1l.add(ChatColor.WHITE + "possible. Please be aware of how you are");
		helpm9p1l.add(ChatColor.WHITE + "treating others and make sure to keep");
		helpm9p1l.add(ChatColor.WHITE + "inappropriate language to a minimum. A large");
		helpm9p1l.add(ChatColor.WHITE + "proportion of our community are young children");
		helpm9p1l.add(ChatColor.WHITE + "and the " + plugin.servern + ChatColor.WHITE + " staff team want to");
		helpm9p1l.add(ChatColor.WHITE + "make sure that our services stay professional.");
		helpm9p1l.add(ChatColor.WHITE + "Discrimination, harassment and toxicity will");
		helpm9p1l.add(ChatColor.WHITE + "not be tolerated and depending on the severity,");
		helpm9p1l.add(ChatColor.WHITE + "the player could be verbally warned or");
		helpm9p1l.add(ChatColor.WHITE + "permanently removed from our community");
		helpm9p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm9p1m.setLore(helpm9p1l);
		helpm9p1m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm9p1.setItemMeta(helpm9p1m);
		
		ItemStack helpm9p2 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm9p2m = helpm9p1.getItemMeta();
		helpm9p1m.setDisplayName(ChatColor.WHITE + "[2]" + ChatColor.DARK_PURPLE + " Account Security");
		ArrayList<String> helpm9p2l = new ArrayList<String>();
		helpm9p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm9p2l.add(ChatColor.WHITE + "Make sure that you have full control over");
		helpm9p2l.add(ChatColor.WHITE + "your account. You will be held accountable");
		helpm9p2l.add(ChatColor.WHITE + "for any inappropriate action that any other");
		helpm9p2l.add(ChatColor.WHITE + "user does while using your account. If you hold");
		helpm9p2l.add(ChatColor.WHITE + "an " + plugin.servern + " official staff rank then you are");
		helpm9p2l.add(ChatColor.WHITE + "required to use two factor authentication");
		helpm9p2l.add(ChatColor.WHITE + "which must be enabled at all times");
		helpm9p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm9p2m.setLore(helpm9p2l);
		helpm9p2m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm9p2.setItemMeta(helpm9p2m);
		
		ItemStack helpm9p3 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm9p3m = helpm9p3.getItemMeta();
		helpm9p3m.setDisplayName(ChatColor.WHITE + "[3]" + ChatColor.DARK_PURPLE + " File Sharing (Direct Uploads)");
		ArrayList<String> helpm9p3l = new ArrayList<String>();
		helpm9p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm9p3l.add(ChatColor.WHITE + "Only images or gifs should be shared in the ");
		helpm9p3l.add(ChatColor.WHITE + "discord. Any other type of file will be treated");
		helpm9p3l.add(ChatColor.WHITE + "as malicious. Any files that members want to");
		helpm9p3l.add(ChatColor.WHITE + "upload can be reviewed by a moderator. Any");
		helpm9p3l.add(ChatColor.WHITE + "malicious or inappropriate images or files will");
		helpm9p3l.add(ChatColor.WHITE + "result in the user getting banned.");
		helpm9p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm9p3m.setLore(helpm9p3l);
		helpm9p3m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm9p3.setItemMeta(helpm9p3m);
		
		ItemStack helpm9p4 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm9p4m = helpm9p4.getItemMeta();
		helpm9p4m.setDisplayName(ChatColor.WHITE + "[4]" + ChatColor.DARK_PURPLE + " Giveaways");
		ArrayList<String> helpm9p4l = new ArrayList<String>();
		helpm9p4l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm9p4l.add(ChatColor.WHITE + "No giveaways are to be done via the discord");
		helpm9p4l.add(ChatColor.WHITE + "besides official " + plugin.servern + " giveaways. These are");
		helpm9p4l.add(ChatColor.WHITE + "not guarenteed to be held but could happen.");
		helpm9p4l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm9p4m.setLore(helpm9p4l);
		helpm9p4m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm9p4.setItemMeta(helpm9p4m);
		
		ItemStack helpm9p5 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm9p5m = helpm9p5.getItemMeta();
		helpm9p5m.setDisplayName(ChatColor.WHITE + "[5]" + ChatColor.DARK_PURPLE + " Help / Support Channels");
		ArrayList<String> helpm9p5l = new ArrayList<String>();
		helpm9p5l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm9p5l.add(ChatColor.WHITE + "Please do not spam help and support channels.");
		helpm9p5l.add(ChatColor.WHITE + "These channels are to be used for concerns");
		helpm9p5l.add(ChatColor.WHITE + "and questions only about our platforms.");
		helpm9p5l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm9p5m.setLore(helpm9p5l);
		helpm9p5m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm9p5.setItemMeta(helpm9p5m);
		
		ItemStack helpm9p6 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm9p6m = helpm9p6.getItemMeta();
		helpm9p6m.setDisplayName(ChatColor.WHITE + "[6]" + ChatColor.DARK_PURPLE + " Link / URL Sharing");
		ArrayList<String> helpm9p6l = new ArrayList<String>();
        helpm9p6l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        helpm9p6l.add(ChatColor.WHITE + "We ask that you keep any and all links shared");
        helpm9p6l.add(ChatColor.WHITE + "free from inappropriate and harmful content");
        helpm9p6l.add(ChatColor.WHITE + "that we do not deem appropriate. Any members");
        helpm9p6l.add(ChatColor.WHITE + "sharing inappropriate or harmful URLs will be");
        helpm9p6l.add(ChatColor.WHITE + "remove from the discord without question.");
        helpm9p6l.add(ChatColor.WHITE + "Depending on the severity we will also further");
        helpm9p6l.add(ChatColor.WHITE + "revoke access to either or both the server and");
        helpm9p6l.add(ChatColor.WHITE + "forums");
        helpm9p6l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        helpm9p6m.setLore(helpm9p6l);
        helpm9p6m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        helpm9p6.setItemMeta(helpm9p6m);
        
        ItemStack helpm9p7 = new ItemStack(Material.PAPER, 1);
        ItemMeta helpm9p7m = helpm9p7.getItemMeta();
        helpm9p7m.setDisplayName(ChatColor.WHITE + "[7]" + ChatColor.DARK_PURPLE + " Punishment Related Concerns");
        ArrayList<String> helpm9p7l = new ArrayList<String>();
        helpm9p7l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        helpm9p7l.add(ChatColor.WHITE + "The " + plugin.servern + " staff team do not discuss");
        helpm9p7l.add(ChatColor.WHITE + "punishments on the discord and will not engage");
        helpm9p7l.add(ChatColor.WHITE + "in any discussions about 'wrongful' punishments.");
        helpm9p7l.add(ChatColor.WHITE + "These matters are to be handled only on");
        helpm9p7l.add(ChatColor.WHITE + "the " + plugin.servern + " official forums. Any user");
        helpm9p7l.add(ChatColor.WHITE + "found spamming, tagging or causing issues regarding");
        helpm9p7l.add(ChatColor.WHITE + "their punishment may be punished further and have");
        helpm9p7l.add(ChatColor.WHITE + "their appeal overlooked.");
        helpm9p7l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        helpm9p7m.setLore(helpm9p7l);
        helpm9p7m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        helpm9p7.setItemMeta(helpm9p7m);
        
        ItemStack helpm9p8 = new ItemStack(Material.PAPER, 1);
        ItemMeta helpm9p8m = helpm9p8.getItemMeta();
        helpm9p8m.setDisplayName(ChatColor.WHITE + "[8]" + ChatColor.DARK_PURPLE + " Staff Impersonations");
        ArrayList<String> helpm9p8l = new ArrayList<String>();
        helpm9p8l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        helpm9p8l.add(ChatColor.WHITE + "Please do not impersonate or pretend to be a");
        helpm9p8l.add(ChatColor.WHITE + "staff member under any circumstance. Changing");
        helpm9p8l.add(ChatColor.WHITE + "your profile picture and / or changing your");
        helpm9p8l.add(ChatColor.WHITE + "name with the intent to impersonate is not");
        helpm9p8l.add(ChatColor.WHITE + "allowed. If you cannot deal with an issue you");
        helpm9p8l.add(ChatColor.WHITE + "are having or another user is having then you");
        helpm9p8l.add(ChatColor.WHITE + "can contact a helper, moderator or an admin. If");
        helpm9p8l.add(ChatColor.WHITE + "the issue still cannot be solved then another");
        helpm9p8l.add(ChatColor.WHITE + "member of staff will be contacted");
        helpm9p8l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        helpm9p8m.setLore(helpm9p8l);
        helpm9p8m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        helpm9p8.setItemMeta(helpm9p8m);
        
        ItemStack helpm9p9 = new ItemStack(Material.PAPER, 1);
        ItemMeta helpm9p9m = helpm9p9.getItemMeta();
        helpm9p9m.setDisplayName(ChatColor.WHITE + "[9]" + ChatColor.DARK_PURPLE + " Tagging Staff");
        ArrayList<String> helpm9p9l = new ArrayList<String>();
        helpm9p9l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        helpm9p9l.add(ChatColor.WHITE + "Please do not harass staff members for any");
        helpm9p9l.add(ChatColor.WHITE + "reason what so ever. We are here to help and");
        helpm9p9l.add(ChatColor.WHITE + "have provided methods of which you can contact");
        helpm9p9l.add(ChatColor.WHITE + "us with but tagging staff unnecessarily does");
        helpm9p9l.add(ChatColor.WHITE + "not help anyone. Please keep it to a minimum.");
        helpm9p9l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        helpm9p9m.setLore(helpm9p9l);
        helpm9p9m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        helpm9p9.setItemMeta(helpm9p9m);
        
        ItemStack helpm9p10 = new ItemStack(Material.PAPER, 1);
        ItemMeta helpm9p10m = helpm9p10.getItemMeta();
        helpm9p10m.setDisplayName(ChatColor.WHITE + "[10]" + ChatColor.DARK_PURPLE + " Voice Channels");
        ArrayList<String> helpm9p10l = new ArrayList<String>();
        helpm9p10l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        helpm9p10l.add(ChatColor.WHITE + "Those participating in voice chats and found to");
        helpm9p10l.add(ChatColor.WHITE + "be disruptive or disrespectful will have this");
        helpm9p10l.add(ChatColor.WHITE + "priviledge revoked. Depending on the severity");
        helpm9p10l.add(ChatColor.WHITE + "other priviledges will be revoked as well.");
        helpm9p10l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        helpm9p10m.setLore(helpm9p10l);
        helpm9p10m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        helpm9p10.setItemMeta(helpm9p10m);
        
		inv.setItem(10, helpm9p1);
		inv.setItem(11, helpm9p2);
		inv.setItem(12, helpm9p3);
		inv.setItem(13, helpm9p4);
		inv.setItem(14, helpm9p5);
		inv.setItem(15, helpm9p6);
		inv.setItem(16, helpm9p7);
		inv.setItem(19, helpm9p8);
		inv.setItem(20, helpm9p9);
		inv.setItem(21, helpm9p10);
		inv.setItem(27, goBack());
        
		player.openInventory(inv);
		
		for (int i = 0; i < inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}
	
	public void helpRulesWebsiteInv(Player player) {
		Inventory inv = plugin.getServer().createInventory(null, 36, plugin.servern + ChatColor.WHITE + " Website Rules");
		
		ItemStack helpm10p1 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm10p1m = helpm10p1.getItemMeta();
		helpm10p1m.setDisplayName(ChatColor.WHITE + "[1]" + ChatColor.DARK_PURPLE + " Reporting Players");
		ArrayList<String> helpm10p1l = new ArrayList<String>();
		helpm10p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm10p1l.add(ChatColor.WHITE + "When reporting a player, please follow the");
		helpm10p1l.add(ChatColor.WHITE + "correct format. This makes it easier for staff");
		helpm10p1l.add(ChatColor.WHITE + "members to handle the report. Sufficient");
		helpm10p1l.add(ChatColor.WHITE + "evidence needs to be uploaded when making a");
		helpm10p1l.add(ChatColor.WHITE + "report otherwise nothing can be done about");
		helpm10p1l.add(ChatColor.WHITE + "it. There are guides on the forums on how");
		helpm10p1l.add(ChatColor.WHITE + "to report players, the format and what");
		helpm10p1l.add(ChatColor.WHITE + "evidence is sufficient for staff members to");
		helpm10p1l.add(ChatColor.WHITE + "act upon.");
		helpm10p1l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm10p1m.setLore(helpm10p1l);
		helpm10p1m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm10p1.setItemMeta(helpm10p1m);
		
		ItemStack helpm10p2 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm10p2m = helpm10p2.getItemMeta();
		helpm10p2m.setDisplayName(ChatColor.WHITE + "[2]" + ChatColor.DARK_PURPLE + " Shoutbox");
		ArrayList<String> helpm10p2l = new ArrayList<String>();
		helpm10p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm10p2l.add(ChatColor.WHITE + "Server chat rules apply here. Please be");
		helpm10p2l.add(ChatColor.WHITE + "respectful and treat others how you would like");
		helpm10p2l.add(ChatColor.WHITE + "to be treated.");
		helpm10p2l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm10p2m.setLore(helpm10p2l);
		helpm10p2m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm10p2.setItemMeta(helpm10p2m);
		
		ItemStack helpm10p3 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm10p3m = helpm10p3.getItemMeta();
		helpm10p3m.setDisplayName(ChatColor.WHITE + "[3]" + ChatColor.DARK_PURPLE + " Double+ Posting");
		ArrayList<String> helpm10p3l = new ArrayList<String>();
		helpm10p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm10p3l.add(ChatColor.WHITE + "Double posting is the act of posting two or more");
		helpm10p3l.add(ChatColor.WHITE + "responses on a thread. There is an edit button");
		helpm10p3l.add(ChatColor.WHITE + "that can be used if anything needs to be added");
		helpm10p3l.add(ChatColor.WHITE + "to a previous message.");
		helpm10p3l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm10p3m.setLore(helpm10p3l);
		helpm10p3m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm10p3.setItemMeta(helpm10p3m);
		
		ItemStack helpm10p4 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm10p4m = helpm10p4.getItemMeta();
		helpm10p4m.setDisplayName(ChatColor.WHITE + "[4]" + ChatColor.DARK_PURPLE + " Respect Other Users");
		ArrayList<String> helpm10p4l = new ArrayList<String>();
		helpm10p4l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm10p4l.add(ChatColor.WHITE + "Please remain respectful when speaking in our");
		helpm10p4l.add(ChatColor.WHITE + "community chats such as on Discord and the");
		helpm10p4l.add(ChatColor.WHITE + "server. We would like to keep this community");
		helpm10p4l.add(ChatColor.WHITE + "free of inappropriate behaviour and disrespect");
		helpm10p4l.add(ChatColor.WHITE + "but we do understand that this is not always");
		helpm10p4l.add(ChatColor.WHITE + "possible. Please be aware of how you are");
		helpm10p4l.add(ChatColor.WHITE + "treating others and make sure to keep");
		helpm10p4l.add(ChatColor.WHITE + "inappropriate language to a minimum. A large");
		helpm10p4l.add(ChatColor.WHITE + "proportion of our community are young children");
		helpm10p4l.add(ChatColor.WHITE + "and the " + plugin.servern + ChatColor.WHITE + " staff team want to");
		helpm10p4l.add(ChatColor.WHITE + "make sure that our services stay professional.");
		helpm10p4l.add(ChatColor.WHITE + "Discrimination. harassment and toxicity will");
		helpm10p4l.add(ChatColor.WHITE + "not be tolerated and depending on the severity,");
		helpm10p4l.add(ChatColor.WHITE + "the player could be verbally warned or");
		helpm10p4l.add(ChatColor.WHITE + "permanently remove from our community.");
		helpm10p4l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm10p4m.setLore(helpm10p4l);
		helpm10p4m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm10p4.setItemMeta(helpm10p4m);
		
		ItemStack helpm10p5 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm10p5m = helpm10p5.getItemMeta();
		helpm10p5m.setDisplayName(ChatColor.WHITE + "[5]" + ChatColor.DARK_PURPLE + " Advertising");
		ArrayList<String> helpm10p5l = new ArrayList<String>();
		helpm10p5l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm10p5l.add(ChatColor.WHITE + "Please do not advertise other server's IP");
		helpm10p5l.add(ChatColor.WHITE + "addresses while on the forums. This will");
		helpm10p5l.add(ChatColor.WHITE + "result in being remove from the forums");
		helpm10p5l.add(ChatColor.WHITE + "permanently. Mentioning server names in");
		helpm10p5l.add(ChatColor.WHITE + "private message is perfectly fine but abuse of");
		helpm10p5l.add(ChatColor.WHITE + "this or mentioning server names in public chat");
		helpm10p5l.add(ChatColor.WHITE + "/ posts will result in punishment.");
		helpm10p5l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm10p5m.setLore(helpm10p5l);
		helpm10p5m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm10p5.setItemMeta(helpm10p5m);
		
		ItemStack helpm10p6 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm10p6m = helpm10p6.getItemMeta();
		helpm10p6m.setDisplayName(ChatColor.WHITE + "[6]" + ChatColor.DARK_PURPLE + " Criticsm / Opinion");
		ArrayList<String> helpm10p6l = new ArrayList<String>();
		helpm10p6l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm10p6l.add(ChatColor.WHITE + "Criticsm and opinion are perfectly fine but");
		helpm10p6l.add(ChatColor.WHITE + "attacking a member or staff member");
		helpm10p6l.add(ChatColor.WHITE + "unecassarily and / or continually will result");
		helpm10p6l.add(ChatColor.WHITE + "in punishment. Similarly unecassary negative");
		helpm10p6l.add(ChatColor.WHITE + "language such as repeatedly posting 'This");
		helpm10p6l.add(ChatColor.WHITE + "server is so dead' will also result in a");
		helpm10p6l.add(ChatColor.WHITE + "punishment.");
		helpm10p6l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm10p6m.setLore(helpm10p6l);
		helpm10p6m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm10p6.setItemMeta(helpm10p6m);
		
		ItemStack helpm10p7 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm10p7m = helpm10p7.getItemMeta();
		helpm10p7m.setDisplayName(ChatColor.WHITE + "[7]" + ChatColor.DARK_PURPLE + " Stealing Threads");
		ArrayList<String> helpm10p7l = new ArrayList<String>();
		helpm10p7l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm10p7l.add(ChatColor.WHITE + "Please do not hijack other user's threads");
		helpm10p7l.add(ChatColor.WHITE + "to steer the conversation away from the");
		helpm10p7l.add(ChatColor.WHITE + "original topic to your issue. Please make");
		helpm10p7l.add(ChatColor.WHITE + "your own thread and it will be dealt with");
		helpm10p7l.add(ChatColor.WHITE + "equally.");
		helpm10p7l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm10p7m.setLore(helpm10p7l);
		helpm10p7m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm10p7.setItemMeta(helpm10p7m);
		
		ItemStack helpm10p8 = new ItemStack(Material.PAPER, 1);
		ItemMeta helpm10p8m = helpm10p8.getItemMeta();
		helpm10p8m.setDisplayName(ChatColor.WHITE + "[8]" + ChatColor.DARK_PURPLE + " Reviving Dead Threads");
		ArrayList<String> helpm10p8l = new ArrayList<String>();
		helpm10p8l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm10p8l.add(ChatColor.WHITE + "If a thread has not had a reply in more than a");
		helpm10p8l.add(ChatColor.WHITE + "month then it is classed as 'dead'. Revival of");
		helpm10p8l.add(ChatColor.WHITE + "said threads are allowed but as long as the post");
		helpm10p8l.add(ChatColor.WHITE + "adds meaningful content to the thread. Posting");
		helpm10p8l.add(ChatColor.WHITE + "useles content to a dead thread will result");
		helpm10p8l.add(ChatColor.WHITE + "in punishment. If you cannot be sure that the");
		helpm10p8l.add(ChatColor.WHITE + "post will add anything meaningful to the thread");
		helpm10p8l.add(ChatColor.WHITE + "then do not post it.");
		helpm10p8l.add(ChatColor.WHITE + "act upon.");
		helpm10p8l.add(ChatColor.LIGHT_PURPLE + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		helpm10p8m.setLore(helpm10p8l);
		helpm10p8m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		helpm10p8.setItemMeta(helpm10p8m);
		
		inv.setItem(10, helpm10p1);
		inv.setItem(11, helpm10p2);
		inv.setItem(12, helpm10p3);
		inv.setItem(13, helpm10p4);
		inv.setItem(14, helpm10p5);
		inv.setItem(15, helpm10p6);
		inv.setItem(16, helpm10p7);
		inv.setItem(19, helpm10p8);
		inv.setItem(27, goBack());
		
		
		player.openInventory(inv);
		
		for (int i = 0; i < inv.getSize(); i++) {
			if (inv.getItem(i) == null || inv.getItem(i).getType().equals(Material.AIR)) {
				inv.setItem(i, blackPane());
			}
		}
	}
}
