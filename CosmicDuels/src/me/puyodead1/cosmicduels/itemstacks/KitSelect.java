package me.puyodead1.cosmicduels.itemstacks;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class KitSelect {
	
public static String lore = "§a§lNONE";
	
	public ItemStack kitSelect() {
		ItemStack kitSelect = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta kitSelectMeta = kitSelect.getItemMeta();
		
		kitSelectMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		kitSelectMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		kitSelectMeta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		
		kitSelectMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e&lKit"));
		
		ArrayList<String> kitSelectLore = new ArrayList<String>();
		kitSelectLore.addAll(Arrays.asList(lore, "§7Click to select a kit."));
		
		kitSelectMeta.setLore(kitSelectLore);
		kitSelect.setItemMeta(kitSelectMeta);
		
		return kitSelect;
	}

}
