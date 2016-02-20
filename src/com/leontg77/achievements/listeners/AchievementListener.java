package com.leontg77.achievements.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAchievementAwardedEvent;

/**
 * Achievement listener class.
 * 
 * @author LeonTG77
 */
public class AchievementListener implements Listener {

	@EventHandler
	public void on(PlayerAchievementAwardedEvent event) {
		Player player = event.getPlayer();
		
		player.setMaxHealth(player.getMaxHealth() + 1);
		player.setHealth(player.getHealth() + 1);
	}
}