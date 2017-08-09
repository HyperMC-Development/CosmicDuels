package me.puyodead1.cosmicduels.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.puyodead1.cosmicduels.api.CosmicDuelsAPI;

public class test implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args) {
		if (cmd.getName().equalsIgnoreCase("duelme")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				player.openInventory(CosmicDuelsAPI.createDuelSettingsGUI(player));
				return true;
			}
		}
		return false;
	}

}
