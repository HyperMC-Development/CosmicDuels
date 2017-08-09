package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class CosmicEnvoy {
	
public static String lore = "§C§lDISABLED";
	
	public ItemStack cosmicEnvoyEnabled() {
		ItemStack cosmicEnvoy = new ItemStack(Material.FIREWORK);
		ItemMeta cosmicEnvoyMeta = cosmicEnvoy.getItemMeta();
		
		cosmicEnvoyMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		cosmicEnvoyMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		cosmicEnvoyMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		cosmicEnvoyMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lCosmic Envoy"));
		
		ArrayList<String> cosmicEnvoyLore = new ArrayList<String>();
		cosmicEnvoyLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		cosmicEnvoyMeta.setLore(cosmicEnvoyLore);
		cosmicEnvoy.setItemMeta(cosmicEnvoyMeta);
		
		return cosmicEnvoy;
	}
	
	public ItemStack cosmicEnvoyDisabled() {
		ItemStack cosmicEnvoy = new ItemStack(Material.FIREWORK);
		ItemMeta cosmicEnvoyMeta = cosmicEnvoy.getItemMeta();
		
		cosmicEnvoyMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		cosmicEnvoyMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		cosmicEnvoyMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		cosmicEnvoyMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lCosmic Envoy"));
		
		ArrayList<String> cosmicEnvoyLore = new ArrayList<String>();
		cosmicEnvoyLore.addAll(Arrays.asList(lore, " ", "§7Click to §7§ntoggle§7 this setting."));
		
		cosmicEnvoyMeta.setLore(cosmicEnvoyLore);
		cosmicEnvoy.setItemMeta(cosmicEnvoyMeta);
		
		return cosmicEnvoy;
	}

}
