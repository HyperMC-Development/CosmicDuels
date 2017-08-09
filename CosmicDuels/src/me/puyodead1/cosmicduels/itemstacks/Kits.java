package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Kits {
	
	public ItemStack kitNone() {
		ItemStack none = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta noneMeta = none.getItemMeta();
		noneMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		noneMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		noneMeta.addEnchant(Enchantment.DEPTH_STRIDER, 1, true);
		
		noneMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lNone Kit"));
		ArrayList<String> noneLore = new ArrayList<String>();
		
		noneLore.add("§7Click to select this kit.");
		
		noneMeta.setLore(noneLore);
		none.setItemMeta(noneMeta);
		return none;
	}
	
	public ItemStack kitSoup() {
		ItemStack soup = new ItemStack(Material.MUSHROOM_SOUP);
		ItemMeta soupMeta = soup.getItemMeta();
		soupMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		soupMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lNone Kit"));
		ArrayList<String> soupLore = new ArrayList<String>();
		
		soupLore.add("§7Click to select this kit.");
		
		soupMeta.setLore(soupLore);
		soup.setItemMeta(soupMeta);
		return soup;
	}
	
	public ItemStack kitPotion() {
		ItemStack potion = new ItemStack(Material.SPIDER_EYE);
		ItemMeta potionMeta = potion.getItemMeta();
		potionMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		potionMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		potionMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lPotion Kit"));
		ArrayList<String> potionLore = new ArrayList<String>();
		
		potionLore.add("§7Click to select this kit.");
		
		potionMeta.setLore(potionLore);
		potion.setItemMeta(potionMeta);
		return potion;
	}
	public ItemStack kitPotionNoDebuff() {
		ItemStack potionDebuff = new ItemStack(Material.POTION);
		ItemMeta potionDebuffMeta = potionDebuff.getItemMeta();
		potionDebuffMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		potionDebuffMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lPotion (No Debuff) Kit"));
		ArrayList<String> potionDebuffLore = new ArrayList<String>();
		
		potionDebuffLore.add("§7Click to select this kit.");
		
		potionDebuffMeta.setLore(potionDebuffLore);
		potionDebuff.setItemMeta(potionDebuffMeta);
		return potionDebuff;
	}
	
	public ItemStack kitGlobal() {
		ItemStack global = new ItemStack(Material.DIAMOND);
		ItemMeta globalMeta = global.getItemMeta();
		globalMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		globalMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lGlobal Kit"));
		ArrayList<String> globalLore = new ArrayList<String>();
		
		globalLore.add("§7Click to select a /gkit.");
		
		globalMeta.setLore(globalLore);
		global.setItemMeta(globalMeta);
		return global;
	}
	
	public ItemStack kitEnvoy() {
		ItemStack envoy = new ItemStack(Material.CHEST);
		ItemMeta envoyMeta = envoy.getItemMeta();
		envoyMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		envoyMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lEnvoy Kit"));
		ArrayList<String> envoyLore = new ArrayList<String>();
		
		envoyLore.add("§7Click to select this kit.");
		
		envoyMeta.setLore(envoyLore);
		envoy.setItemMeta(envoyMeta);
		return envoy;
	}

}
