package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Fix {
	
public static String lore = "§a§lENABLED";
	
	public ItemStack fixEnabled() {
		ItemStack fix = new ItemStack(Material.ANVIL);
		ItemMeta fixMeta = fix.getItemMeta();
		
		fixMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		fixMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		fixMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		fixMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&l/fix"));
		
		ArrayList<String> fixLore = new ArrayList<String>();
		fixLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		fixMeta.setLore(fixLore);
		fix.setItemMeta(fixMeta);
		
		return fix;
	}
	
	public ItemStack fixDisabled() {
		ItemStack fix = new ItemStack(Material.ANVIL);
		ItemMeta fixMeta = fix.getItemMeta();
		
		fixMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		fixMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		fixMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		fixMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&l/fix"));
		
		ArrayList<String> fixLore = new ArrayList<String>();
		fixLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		fixMeta.setLore(fixLore);
		fix.setItemMeta(fixMeta);
		
		return fix;
	}

}
