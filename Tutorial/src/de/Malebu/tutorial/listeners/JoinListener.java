package de.Malebu.tutorial.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
	
	@EventHandler
	public void handlePlayerJoin(PlayerJoinEvent event) {
		event.setJoinMessage("§a Der Spieler §6" + event.getPlayer().getName() + "§a hat denServer betreten");
		
	}

}
