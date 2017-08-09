package me.puyodead1.cosmicduels.api;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import me.puyodead1.cosmicduels.Main;

public class ArenaLocation {
	public static void teleportToLocation(Player player) {
		World world = Bukkit.getWorld("world");
		double x = Main.getInstance().getConfig().getDouble("Arenas.1.Locations.X");
		double y = Main.getInstance().getConfig().getDouble("Arenas.1.Locations.Y");
		double z = Main.getInstance().getConfig().getDouble("Arenas.1.Locations.Z");
		
		Location arena = new Location(world, x, y, z);
		player.teleport(arena);
	}
	
	public static void teleportToLocation2(Player player) {
		World world = (World) Main.getInstance().getConfig().get("Arena.1.Locations.World");
		double x = Main.getInstance().getConfig().getDouble("Arenas.2.Locations.X");
		double y = Main.getInstance().getConfig().getDouble("Arenas.2.Locations.Y");
		double z = Main.getInstance().getConfig().getDouble("Arenas.2.Locations.Z");
		
		Location arena = new Location(world, x, y, z);
		player.teleport(arena);
	}

}
