package com.appromode.core;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import com.google.inject.Inject;

public class FileManager {

	@Inject
	private Initialise plugin;

	private String location = "plugins/ApCore/playerdata";
	private File pfile;
	private FileConfiguration pfileconfig;
	private File pfolder;
	
	public void createCustomConfigs() {
		pfile = new File(plugin.getDataFolder(), "players.yml");
		pfolder = new File(plugin.getDataFolder(), "playerdata");
		if (!pfile.exists()) {
			pfile.getParentFile().mkdirs();
			plugin.saveResource("players.yml", false);
			plugin.getServer().getConsoleSender().sendMessage(plugin.prefix + " Players file has been generated");
		}
		if (!pfolder.exists()) {
			pfolder.getParentFile().mkdirs();
			plugin.getServer().getConsoleSender().sendMessage(plugin.prefix + " Player data folder has been generated");
		}
		pfileconfig = new YamlConfiguration();
		try {
			pfileconfig.load(pfile);
		} catch (IOException | InvalidConfigurationException e) {
			e.printStackTrace();
		}
		plugin.getServer().getConsoleSender().sendMessage(plugin.prefix + " Config files generated / checked");
		return;
	}
	
	public FileConfiguration pFileConfiguration() {
		return this.pfileconfig;
	}

	public void createPlayerFile(Player player) {
		File pfile = new File(location, player.getUniqueId().toString() + ".yml");
		if (!pfile.equals(null)) {
			if (!pfile.exists()) {
				try {
					pfile.createNewFile();
				} catch (Exception e) {
					plugin.getServer().getConsoleSender()
							.sendMessage(plugin.prefix + " Error generating " + player.getName() + " data file");
					plugin.getServer().getConsoleSender().sendMessage(plugin.prefix + " " + e.getMessage());
				}
			}
		} else {
			plugin.getServer().getConsoleSender().sendMessage(plugin.prefix + " Playerdata folder not found");
			return;
		}
	}
}
