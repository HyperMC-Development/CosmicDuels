package me.puyodead1.cosmicduels.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;

import me.puyodead1.cosmicduels.Main;
import me.puyodead1.cosmicduels.api.CosmicDuelsAPI;
import me.puyodead1.cosmicduels.events.DuelSettingsClickEvent;
import me.puyodead1.cosmicduels.events.DuelTypeClickEvent;
import me.puyodead1.cosmicduels.itemstacks.Armor;
import me.puyodead1.cosmicduels.itemstacks.Bounty;
import me.puyodead1.cosmicduels.itemstacks.Bows;
import me.puyodead1.cosmicduels.itemstacks.CosmicEnvoy;
import me.puyodead1.cosmicduels.itemstacks.DeathCertificates;
import me.puyodead1.cosmicduels.itemstacks.EnderPearls;
import me.puyodead1.cosmicduels.itemstacks.Fix;
import me.puyodead1.cosmicduels.itemstacks.Fly;
import me.puyodead1.cosmicduels.itemstacks.FoodLoss;
import me.puyodead1.cosmicduels.itemstacks.GoldenApple;
import me.puyodead1.cosmicduels.itemstacks.Healing;
import me.puyodead1.cosmicduels.itemstacks.KitSelect;
import me.puyodead1.cosmicduels.itemstacks.Mcmmo;
import me.puyodead1.cosmicduels.itemstacks.Potions;
import me.puyodead1.cosmicduels.itemstacks.RiskInventory;
import me.puyodead1.cosmicduels.itemstacks.Weapons;

public class DuelCommand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args) {
		if (cmd.getName().equalsIgnoreCase("duel")) {
			if (sender instanceof Player) {
				if (args.length == 0) {
					Player player = (Player) sender;
					CosmicDuelsAPI.createMainDuelGUI(player);
					// open Duel type selection (Ranked/Unranked)
				}
				if (args.length == 1) {
					if (args[0].equalsIgnoreCase("godset")) {
						// open godset customization
						return true;
					}
					if(args[0].equalsIgnoreCase("setarena1")) {
						Main.getInstance().getConfig().set("Arenas.1.Locations.World", ((Player) sender).getWorld().getName());
						Main.getInstance().getConfig().set("Arenas.1.Locations.X", ((Player) sender).getLocation().getX());
						Main.getInstance().getConfig().set("Arenas.1.Locations.Y", ((Player) sender).getLocation().getY());
						Main.getInstance().getConfig().set("Arenas.1.Locations.Z", ((Player) sender).getLocation().getZ());
						Main.getInstance().saveConfig();
						Main.getInstance().saveDefaultConfig();
						sender.sendMessage("Added Location for Arena 1 Spawn Location.");
						return true;
					}
					if (args[0].equalsIgnoreCase("help")) {
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e&l&nDuel Commands"));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e/duel <name>"));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
								"&7Invite a player to a setting specific duel."));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e/duel ranked"));
						sender.sendMessage(
								ChatColor.translateAlternateColorCodes('&', "&7Enter the duel ranked Queue."));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e/duel godset"));
						sender.sendMessage(
								ChatColor.translateAlternateColorCodes('&', "&7Access the Duel Godset edit menu."));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e/duel top"));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7View top Duel ELO players."));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e/duel toggle"));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
								"&7Toggle duel invites from other players."));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e/duel collect"));
						sender.sendMessage(
								ChatColor.translateAlternateColorCodes('&', "&7Access your Stake Collection Bin."));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e/duel spectate"));
						sender.sendMessage(
								ChatColor.translateAlternateColorCodes('&', "&7Access the duel spectate menu."));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e/duel unranked"));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
								"&7Enter the Global Duel Queue to duel a random opponent."));
						sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e/duel custom"));
						sender.sendMessage(
								ChatColor.translateAlternateColorCodes('&', "&7Customize your duel kit loadouts."));
						return true;
					}
				}
				if (args.length == 1) {
					Player player = Bukkit.getPlayerExact(args[0]);
					if (!(player == null)) {
						Player playerSender = (Player) sender;
						player.closeInventory();
						DuelSettingsClickEvent.resetBooleans();
						CosmicDuelsAPI.createDuelSettingsGUI(playerSender);
						// start invite process
					} else {
						sender.sendMessage(ChatColor.RED + "Error: " + "'" + args[0] + "'" + " is not a valid player!");
					}
				}
			} else {
				Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Error: Only players can use that command!");
			}
		}
		return true;
	}

}
