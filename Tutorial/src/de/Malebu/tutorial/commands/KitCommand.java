package de.Malebu.tutorial.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;



public class KitCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) { 
			Player player = (Player) sender;
			if(player.hasPermission("Tutorial.kit")) {
				if (args.length == 0) {
					
					Inventory inventory = Bukkit.createInventory(null, 9*3, "�6 Kit-Inventar");
					
					ItemStack item = new ItemStack(Material.BOW);
					ItemMeta itemMeta = item.getItemMeta();
					itemMeta.setDisplayName("Heiliger Bogen der Salami");
					itemMeta.addEnchant(Enchantment.DAMAGE_ALL, 5, false);
					item.setItemMeta(itemMeta);
					
					inventory.addItem(item);
					item.setAmount(10);
					
					
					player.openInventory(inventory);
					player.sendMessage("�aDir wurde das Kit-Inventar ge�ffnet");
			   
					
			} else
				player.sendMessage("�c Bitte benutze /kit [SPIELER] �c");
				
		} else 
			player.sendMessage("�cDazu hast du keine Rechte");	
		
		
		
	}
		return false;

  } 
	
}
