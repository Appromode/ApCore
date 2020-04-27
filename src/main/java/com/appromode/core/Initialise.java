package com.appromode.core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.appromode.listener.AdminListener;
import com.appromode.listener.HelpListener;
import com.appromode.listener.JoinListener;
import com.appromode.listener.StaffListener;
import com.appromode.versions.NMS;
import com.appromode.versions.NMS_1_10_R1;
import com.appromode.versions.NMS_1_11_R1;
import com.appromode.versions.NMS_1_12_R1;
import com.appromode.versions.NMS_1_13_R1;
import com.appromode.versions.NMS_1_13_R2;
import com.appromode.versions.NMS_1_14_R1;
import com.appromode.versions.NMS_1_15_R1;
import com.appromode.versions.NMS_1_8_R1;
import com.appromode.versions.NMS_1_8_R2;
import com.appromode.versions.NMS_1_8_R3;
import com.appromode.versions.NMS_1_9_R1;
import com.appromode.versions.NMS_1_9_R2;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Initialise extends JavaPlugin {

	public String prefix = this.getConfig().getString("prefix");
	public String servern = this.getConfig().getString("servername");
	public String syntax = this.getConfig().getString("syntaxerror");
	public String noperm = this.getConfig().getString("nopermission");
	public String version;
	
	public NMS nms;

	@Inject
	private Commands command;

	@Inject
	private AdminListener al;

	@Inject
	private HelpListener hl;

	@Inject
	private StaffListener sl;

	@Inject
	private JoinListener jl;

	@Inject
	private FileManager fm;

	@Override
	public void onEnable() {
		if (setup()) {
			BinderModule module = new BinderModule(this);
			Injector injector = module.createInjector();
			injector.injectMembers(this);
			this.saveDefaultConfig();
			fm.createCustomConfigs();
			this.getCommand("ap").setExecutor(command);
			this.getCommand("help").setExecutor(command);
			this.getServer().getPluginManager().registerEvents(al, this);
			this.getServer().getPluginManager().registerEvents(hl, this);
			this.getServer().getPluginManager().registerEvents(sl, this);
			this.getServer().getPluginManager().registerEvents(jl, this);
			getServer().getConsoleSender().sendMessage(prefix + " Ap Core has been enabled");
		} else {
			getServer().getConsoleSender().sendMessage(prefix + " Ap Core failed to initialise");
			getServer().getConsoleSender().sendMessage(prefix + " Your server version is not compatible with this plugin!");
		}
	}
	
	private boolean setup() {
		try {
			version = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3];
		} catch(ArrayIndexOutOfBoundsException e) {
			return false;
		}
		getServer().getConsoleSender().sendMessage(prefix + " Your server is running version" + version);
		if (version.equals("v1_8_R1")) {
			nms = new NMS_1_8_R1();
		} else if (version.equals("v1_8_R2")) {
			nms = new NMS_1_8_R2();
		} else if (version.equals("v1_8_R3")) {
			nms = new NMS_1_8_R3();
		} else if (version.equals("v1_9_R1")) {
			nms = new NMS_1_9_R1();
		} else if (version.equals("v1_9_R2")) {
			nms = new NMS_1_9_R2();
		} else if (version.equals("v1_10_R1")) {
			nms = new NMS_1_10_R1();
		} else if (version.equals("v1_11_R1")) {
			nms = new NMS_1_11_R1();
		} else if (version.equals("v1_12_R1")) {
			nms = new NMS_1_12_R1();
		} else if (version.equals("v1_13_R1")) {
			nms = new NMS_1_13_R1();
		} else if (version.equals("v1_13_R2")) {
			nms = new NMS_1_13_R2();
		} else if (version.equals("v1_14_R1")) {
			nms = new NMS_1_14_R1();
		} else if (version.equals("v1_15_R1")) {
			nms = new NMS_1_15_R1();
		}
		return nms != null;	    
	}

	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(prefix + " Ap Core has been disabled");
	}
}
