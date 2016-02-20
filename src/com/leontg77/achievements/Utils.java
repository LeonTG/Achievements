package com.leontg77.achievements;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * Utilities class.
 * 
 * @author LeonTG77
 */
public class Utils {
	
	/**
	 * Broadcasts a message to everyone online.
	 * 
	 * @param message the message.
	 */
	public static void broadcast(String message) {
		broadcast(message, null);
	}
	
	/**
	 * Broadcasts a message to everyone online with a specific permission.
	 * 
	 * @param message the message.
	 * @param permission the permission.
	 */
	public static void broadcast(String message, final String permission) {
		for (Player online : Bukkit.getOnlinePlayers()) {
			if (permission != null && !online.hasPermission(permission)) {
				continue;
			}
			
			online.sendMessage(message);
		}

		message = message.replaceAll("§l", "");
		message = message.replaceAll("§o", "");
		message = message.replaceAll("§r", "§f");
		message = message.replaceAll("§m", "");
		message = message.replaceAll("§n", "");
		
		Bukkit.getLogger().info(message);
	}
}