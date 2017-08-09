package me.puyodead1.cosmicduels;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.McVier3ck.arena.Arena;
import me.McVier3ck.arena.ArenaListener;
import me.McVier3ck.countdown.CountDownEvent;
import me.McVier3ck.team.Team;
import me.McVier3ck.team.TeamListener;
import me.puyodead1.cosmicduels.api.ArenaLocation;
import me.puyodead1.cosmicduels.commands.DuelCommand;
import me.puyodead1.cosmicduels.events.DuelSettingsClickEvent;
import me.puyodead1.cosmicduels.events.DuelTypeClickEvent;
import me.puyodead1.cosmicduels.events.KitSelectionClickEvent;

public class Main extends JavaPlugin implements CommandExecutor {
	
	public static Main instance;
	
	public static ArrayList<Team> Teams = new ArrayList<Team>();
	public static ArrayList<Arena> Arenas = new ArrayList<Arena>();

	public static CountDownEvent countDownEvent;
	
	public void onEnable() {
		registerCommands();
		registerConfig();
		registerEvents();
		instance = this;
		countDownEvent = new CountDownEvent();
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new TeamListener(), this);
		pm.registerEvents(new ArenaListener(), this);
	}
	
	public void onDisable() {
		
	}
	
	public void registerConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
	
	public void registerEvents() {
		Bukkit.getPluginManager().registerEvents(new DuelSettingsClickEvent(), this);
		Bukkit.getPluginManager().registerEvents(new DuelTypeClickEvent(), this);
		Bukkit.getPluginManager().registerEvents(new KitSelectionClickEvent(), this);
	}
	
	public void registerCommands() {
		getCommand("duel").setExecutor(new DuelCommand());
	}
	
	public static Main getInstance() {
		return instance;
	}

}
