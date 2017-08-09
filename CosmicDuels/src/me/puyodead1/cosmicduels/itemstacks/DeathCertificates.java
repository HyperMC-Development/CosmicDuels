package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class DeathCertificates {
	
public static String lore = "§a§lENABLED";
	
	public ItemStack deathCertifEnabled() {
		ItemStack deathCertif = new ItemStack(Material.PAPER);
		ItemMeta deathCertifMeta = deathCertif.getItemMeta();
		
		deathCertifMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		deathCertifMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		deathCertifMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		deathCertifMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lDeath Certificates"));
		
		ArrayList<String> deathCertifLore = new ArrayList<String>();
		deathCertifLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		deathCertifMeta.setLore(deathCertifLore);
		deathCertif.setItemMeta(deathCertifMeta);
		
		return deathCertif;
	}
	
	public ItemStack deathCertifDisabled() {
		ItemStack deathCertif = new ItemStack(Material.PAPER);
		ItemMeta deathCertifMeta = deathCertif.getItemMeta();
		
		deathCertifMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		deathCertifMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		deathCertifMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		deathCertifMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lDeath Certificates"));
		
		ArrayList<String> deathCertifLore = new ArrayList<String>();
		deathCertifLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		deathCertifMeta.setLore(deathCertifLore);
		deathCertif.setItemMeta(deathCertifMeta);
		
		return deathCertif;
	}

}
