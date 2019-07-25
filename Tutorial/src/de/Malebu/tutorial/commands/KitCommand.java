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
					
					Inventory inventory = Bukkit.createInventory(null, 9*3, "§6 Kit-Inventar");
					
					ItemStack item = new ItemStack(Material.BOW);
					ItemMeta itemMeta = item.getItemMeta();
					itemMeta.setDisplayName("Heiliger Bogen der Salami");
					itemMeta.addEnchant(Enchantment.DAMAGE_ALL, 10000, true);
					itemMeta.addEnchant(Enchantment.ARROW_INFINITE, 1, false);
					item.setItemMeta(itemMeta);
					item.setAmount(1);
					inventory.setItem(14, item);
					
					ItemStack item2 = new ItemStack(Material.DIAMOND_SWORD);
					ItemMeta itemMeta2 = item.getItemMeta();
					itemMeta2.setDisplayName("Heiliges Schwert des Bifi");
					itemMeta2.addEnchant(Enchantment.DAMAGE_ALL, 10000, true);
					itemMeta2.addEnchant(Enchantment.DIG_SPEED, 10000, true);
					itemMeta2.addEnchant(Enchantment.IMPALING, 10000, true);
					itemMeta2.addEnchant(Enchantment.MENDING, 10000, true);
					itemMeta2.addEnchant(Enchantment.SWEEPING_EDGE, 10000, true);
					item2.setItemMeta(itemMeta2);
					item2.setAmount(1);
					inventory.setItem(13, item2);
					
					ItemStack item3 = new ItemStack(Material.ARROW);
					ItemMeta itemMeta3 = item.getItemMeta();
					itemMeta3.setDisplayName("Heilige Pfeile der Salami");
					itemMeta3.addEnchant(Enchantment.DAMAGE_ALL, 1000, true);
					item3.setItemMeta(itemMeta3);
					item3.setAmount(1);
					inventory.setItem(15, item3);
					
					
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
