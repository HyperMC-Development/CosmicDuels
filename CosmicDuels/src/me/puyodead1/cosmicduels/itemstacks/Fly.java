package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Fly {
	
public static String lore = "§c§lDISABLED";
	
	public ItemStack flyEnabled() {
		ItemStack fly = new ItemStack(Material.FEATHER);
		ItemMeta flyMeta = fly.getItemMeta();
		
		flyMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		flyMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		flyMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		flyMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&l/fly"));
		
		ArrayList<String> flyLore = new ArrayList<String>();
		flyLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		flyMeta.setLore(flyLore);
		fly.setItemMeta(flyMeta);
		
		return fly;
	}
	
	public ItemStack flyDisabled() {
		ItemStack fly = new ItemStack(Material.FEATHER);
		ItemMeta flyMeta = fly.getItemMeta();
		
		flyMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		flyMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		flyMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		flyMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&l/fly"));
		
		ArrayList<String> flyLore = new ArrayList<String>();
		flyLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		flyMeta.setLore(flyLore);
		fly.setItemMeta(flyMeta);
		
		return fly;
	}

}
