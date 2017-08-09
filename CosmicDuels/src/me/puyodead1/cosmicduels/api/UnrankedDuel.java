package me.puyodead1.cosmicduels.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class UnrankedDuel {

	public static UnrankedDuel instance;

	public static UnrankedDuel getInstance() {
		return instance;
	}
	
	public static List<String> duelPlayer = new ArrayList<>();

	public static void pairPlayerWithAnotherPlayer(Player player1) {
		Random random = new Random();
		List<String> players = new ArrayList<>();
		players.add(player1.getName());

		Player randomPlayer2 = Bukkit.getPlayer(players.get(random.nextInt(players.size())));

		while (randomPlayer2 == player1 && players.size() > 1) {
		  randomPlayer2 = Bukkit.getPlayer(players.get(random.nextInt(players.size())));
		}
		player1.closeInventory();
		player1.sendMessage(org.bukkit.ChatColor.GREEN + randomPlayer2.getName() + ChatColor.translateAlternateColorCodes('&', " &ais your duel partner"));
		duelPlayer.add(player1.getName());
		duelPlayer.add(randomPlayer2.getName());
		ArenaLocation.teleportToLocation(player1);
		ArenaLocation.teleportToLocation2(randomPlayer2);
	}
}
