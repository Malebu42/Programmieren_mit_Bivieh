package de.Malebu.tutorial.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.Malebu.tutorial.commands.HealCommand;
import de.Malebu.tutorial.commands.KitCommand;
import de.Malebu.tutorial.listeners.JoinListener;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getCommand("Heal").setExecutor(new HealCommand());
		getCommand("Kit").setExecutor(new KitCommand());
		
		PluginManager pluginManager = Bukkit.getPluginManager();
		pluginManager.registerEvents(new JoinListener(), this);
	}
	
}
	
	

