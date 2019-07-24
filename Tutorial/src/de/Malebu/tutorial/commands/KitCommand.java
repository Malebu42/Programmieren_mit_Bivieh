package de.Malebu.tutorial.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class KitCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) { 
			Player player = (Player) sender;
			if(player.hasPermission("Tutorial.kit")) {
				if (args.length == 0) {
					
					Inventory inventory = Bukkit.createInventory(null, 9*3, "§6 Kit-Inventar");
					player.openInventory(inventory);
					player.sendMessage("§aDir wurde das Kit-Inventar geöffnet");
			   
					
			} else
				player.sendMessage("§c Bitte benutze /kit [SPIELER] §c");
				
		} else 
			player.sendMessage("§cDazu hast du keine Rechte");	
		
		
		
	}
		return false;

  } 
	
}
