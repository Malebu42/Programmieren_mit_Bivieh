package de.Malebu.tutorial.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.Malebu.tutorial.commands.HealCommand;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getCommand("Heal").setExecutor(new HealCommand());
		
		PluginManager pluginMananger = Bukkit.getPluginManager();
	}
	
}
	
	

