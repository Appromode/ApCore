package com.appromode.core;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.appromode.menu.AdminMenu;
import com.appromode.menu.HelpMenu;
import com.appromode.menu.StaffMenu;
import com.google.inject.Inject;

import net.md_5.bungee.api.ChatColor;

public class Commands implements CommandExecutor {

	@Inject
	private Initialise plugin;

	@Inject
	private HelpMenu helpm;

	@Inject
	private AdminMenu am;

	@Inject
	private StaffMenu sm;

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			if (command.getName().equalsIgnoreCase("help")) {
				if (args.length == 0) {
					helpm.helpHomeInv(player);
					return true;
				} else if (args.length == 1) {
					if (args[0].equalsIgnoreCase("staff")) {
						if (sender.hasPermission("apcore.staff")) {
							sm.staffHomeInv(player);
							return true;
						} else {
							player.sendMessage(plugin.servern + " " + plugin.noperm);
							return true;
						}
					} else {
						player.sendMessage(plugin.servern + " " + plugin.syntax);
						return true;
					}
				} else {
					player.sendMessage(plugin.servern + " " + plugin.syntax);
					return true;
				}
			} else if (command.getName().equalsIgnoreCase("ap")) {
				if (args.length == 0) {
					player.sendMessage(ChatColor.LIGHT_PURPLE + "=-=-=-=-=- " + plugin.servern + ChatColor.LIGHT_PURPLE
							+ " -=-=-=-=-=");
					player.sendMessage(ChatColor.WHITE + "Type /ap help for help!");
					player.sendMessage(ChatColor.LIGHT_PURPLE + "Made by: Appromode");
					player.sendMessage(
							ChatColor.WHITE + "=-=-=-=-=- " + plugin.servern + ChatColor.WHITE + " -=-=-=-=-=");
					return true;
				} else if (args.length == 1) {
					if (args[0].equalsIgnoreCase("help")) {
						if (sender.hasPermission("apcore.menu.h")) {
							player.sendMessage(ChatColor.LIGHT_PURPLE + "=-=-=-=-=- " + plugin.servern
									+ ChatColor.LIGHT_PURPLE + " -=-=-=-=-=");
							player.sendMessage(ChatColor.WHITE + "[1] /ap");
							player.sendMessage(ChatColor.LIGHT_PURPLE + "The core command for Ap Core");
							player.sendMessage(ChatColor.WHITE + "[2] /help");
							player.sendMessage(ChatColor.LIGHT_PURPLE + "The server help menu");
							player.sendMessage(ChatColor.WHITE + "[3] /help staff");
							player.sendMessage(ChatColor.LIGHT_PURPLE + "The staff server help menu");
							player.sendMessage(ChatColor.WHITE + "[4] /ap reload");
							player.sendMessage(ChatColor.LIGHT_PURPLE + "Command to reload the plugin config");
							player.sendMessage(ChatColor.WHITE + "[5] /ap admin");
							player.sendMessage(ChatColor.LIGHT_PURPLE + "Ap Core admin menu");
							player.sendMessage(
									ChatColor.WHITE + "=-=-=-=-=- " + plugin.servern + ChatColor.WHITE + " -=-=-=-=-=");
							return true;
						} else {
							player.sendMessage(plugin.servern + " " + plugin.noperm);
							return true;
						}
					} else if (args[0].equalsIgnoreCase("reload")) {
						if (sender.hasPermission("apcore.reload")) {
							plugin.reloadConfig();
							player.sendMessage(plugin.servern + ChatColor.WHITE + " Plugin config files have been reloaded.");
							return true;
						} else {
							player.sendMessage(plugin.servern + " " + plugin.noperm);
							return true;
						}
					} else if (args[0].equalsIgnoreCase("admin")) {
						if (sender.hasPermission("apcore.menu.a")) {
							am.adminHomeInv(player);
							return true;
						} else {
							player.sendMessage(plugin.servern + " " + plugin.noperm);
							return true;
						}
					} else {
						player.sendMessage(plugin.servern + " " + plugin.syntax);
						return true;
					}
				} else {
					player.sendMessage(plugin.servern + " " + plugin.syntax);
					return true;
				}
			} else {
				return false;
			}
		} else {
			if (command.getName().equalsIgnoreCase("help")) {
				sender.sendMessage(plugin.servern + " This command can only be executed by players in game!");
				return true;
			} else if (command.getName().equalsIgnoreCase("ap")) {
				if (args.length == 0) {
					sender.sendMessage(ChatColor.LIGHT_PURPLE + "=-=-=-=-=- " + plugin.servern + ChatColor.LIGHT_PURPLE
							+ " -=-=-=-=-=");
					sender.sendMessage(ChatColor.WHITE + "Type /ap help for help!");
					sender.sendMessage(ChatColor.LIGHT_PURPLE + "Made by: Appromode");
					sender.sendMessage(
							ChatColor.WHITE + "=-=-=-=-=- " + plugin.servern + ChatColor.WHITE + " -=-=-=-=-=");
					return true;
				} else if (args.length == 1) {
					if (args[0].equalsIgnoreCase("help")) {
						sender.sendMessage(ChatColor.LIGHT_PURPLE + "=-=-=-=-=- " + plugin.servern
								+ ChatColor.LIGHT_PURPLE + " -=-=-=-=-=");
						sender.sendMessage(ChatColor.WHITE + "[1] /ap");
						sender.sendMessage(ChatColor.LIGHT_PURPLE + "The core command for Ap Core");
						sender.sendMessage(ChatColor.WHITE + "[2] /help");
						sender.sendMessage(ChatColor.LIGHT_PURPLE + "The server help menu");
						sender.sendMessage(ChatColor.WHITE + "[3] /help staff");
						sender.sendMessage(ChatColor.LIGHT_PURPLE + "The staff server help menu");
						sender.sendMessage(ChatColor.WHITE + "[4] /ap reload");
						sender.sendMessage(ChatColor.LIGHT_PURPLE + "Command to reload the plugin config");
						sender.sendMessage(ChatColor.WHITE + "[5] /ap admin");
						sender.sendMessage(ChatColor.LIGHT_PURPLE + "Ap Core admin menu");
						sender.sendMessage(
								ChatColor.WHITE + " =-=-=-=-=-" + plugin.servern + ChatColor.WHITE + "-=-=-=-=-=");
						return true;
					} else if (args[0].equalsIgnoreCase("reload")) {
						plugin.reloadConfig();
						sender.sendMessage(plugin.servern + ChatColor.WHITE + " Plugin config files have been reloaded.");
						return true;
					} else if (args[0].equalsIgnoreCase("admin")) {
						sender.sendMessage(plugin.servern + " This command can only be executed by players in game!");
						return true;
					} else {
						sender.sendMessage(plugin.servern + " " + plugin.syntax);
						return true;
					}
				} else {
					sender.sendMessage(plugin.servern + " " + plugin.syntax);
					return true;
				}
			} else {
				return false;
			}
		}
	}

}
