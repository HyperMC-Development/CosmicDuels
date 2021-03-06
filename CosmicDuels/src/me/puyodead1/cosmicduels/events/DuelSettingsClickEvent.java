package me.puyodead1.cosmicduels.events;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import me.puyodead1.cosmicduels.api.CosmicDuelsAPI;
import me.puyodead1.cosmicduels.itemstacks.Armor;
import me.puyodead1.cosmicduels.itemstacks.Bounty;
import me.puyodead1.cosmicduels.itemstacks.Bows;
import me.puyodead1.cosmicduels.itemstacks.CosmicEnvoy;
import me.puyodead1.cosmicduels.itemstacks.DeathCertificates;
import me.puyodead1.cosmicduels.itemstacks.EnderPearls;
import me.puyodead1.cosmicduels.itemstacks.Fix;
import me.puyodead1.cosmicduels.itemstacks.Fly;
import me.puyodead1.cosmicduels.itemstacks.FoodLoss;
import me.puyodead1.cosmicduels.itemstacks.GlassPane;
import me.puyodead1.cosmicduels.itemstacks.GoldenApple;
import me.puyodead1.cosmicduels.itemstacks.Healing;
import me.puyodead1.cosmicduels.itemstacks.Mcmmo;
import me.puyodead1.cosmicduels.itemstacks.Potions;
import me.puyodead1.cosmicduels.itemstacks.RiskInventory;
import me.puyodead1.cosmicduels.itemstacks.Weapons;

public class DuelSettingsClickEvent implements Listener {
	public static boolean goldenApplesToggled = true;
	public static boolean mcmmoToggled = true;
	public static boolean potionsToggled = true;
	public static boolean bowsToggled = true;
	public static boolean foodLossToggled = true;
	public static boolean enderPearls = true;
	public static boolean riskInventory = false;
	public static boolean bounty = false;
	public static boolean armor = true;
	public static boolean weapons = true;
	public static boolean fix = true;
	public static boolean fly = false;
	public static boolean cosmicEnvoy = false;
	public static boolean deathCertif = true;
	
	public static ArrayList<Boolean> booleans = new ArrayList<Boolean>();
	public static void resetBooleans() {
		booleans.add(goldenApplesToggled);
		booleans.add(mcmmoToggled);
		booleans.add(potionsToggled);
		booleans.add(bowsToggled);
		booleans.add(foodLossToggled);
		booleans.add(enderPearls);
		booleans.add(riskInventory);
		booleans.add(bounty);
		booleans.add(armor);
		booleans.add(weapons);
		booleans.add(fix);
		booleans.add(fly);
		booleans.add(cosmicEnvoy);
		booleans.add(deathCertif);
		
		goldenApplesToggled = true;
		mcmmoToggled = true;
		potionsToggled = true;
		bowsToggled = true;
		foodLossToggled = true;
		enderPearls = true;
		riskInventory = false;
		bounty = false;
		armor = true;
		weapons = true;
		fix = true;
		fly = false;
		cosmicEnvoy = false;
		deathCertif = true;
	}

	@EventHandler
	public void onGoldenAppleClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Golden Apples")) {
				if (goldenApplesToggled == false) {
					goldenApplesToggled = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.goldenAppleStat = "�a�lON";
					GoldenApple.lore = "�a�lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(0, new GoldenApple().goldenAppleEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					player.openInventory(inv);
					e.getWhoClicked().sendMessage(String.valueOf(goldenApplesToggled));
				} else {
					goldenApplesToggled = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.goldenAppleStat = "�c�lOFF";
					GoldenApple.lore = "�c�lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(0, new GoldenApple().goldenAppleDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					player.openInventory(inv);
					e.getWhoClicked().sendMessage(String.valueOf(goldenApplesToggled));
				}
			}
		}
	}

	@EventHandler
	public void onMcmmoClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().equalsIgnoreCase("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("MCMMO")) {
				if (mcmmoToggled == false) {
					mcmmoToggled = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.mcmmoStat = "�a�lON";
					Mcmmo.lore = "�a�lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(1, new Mcmmo().mcmmoEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(mcmmoToggled));
				} else {
					mcmmoToggled = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.mcmmoStat = "�c�lOFF";
					Mcmmo.lore = "�c�lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(1, new Mcmmo().mcmmoDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(mcmmoToggled));
				}
			}
		}
	}

	@EventHandler
	public void onPotionClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Potions")) {
				if (potionsToggled == false) {
					potionsToggled = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.potionsStat = "�a�lON";
					Potions.lore = "�a�lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(2, new Potions().potionsEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(potionsToggled));
				} else {
					potionsToggled = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.potionsStat = "�c�lOFF";
					Potions.lore = "�c�lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(2, new Potions().potionsDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(bowsToggled));
				}
			}
		}
	}

	@EventHandler
	public void onBowClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Bows")) {
				if (bowsToggled == false) {
					bowsToggled = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.bowStat = "�a�lON";
					Bows.lore = "�a�lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(3, new Bows().bowsEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(potionsToggled));
				} else {
					bowsToggled = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.bowStat = "�c�lOFF";
					Bows.lore = "�c�lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(3, new Bows().bowsDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(bowsToggled));
				}
			}
		}
	}

	@EventHandler
	public void onHealingClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Healing")) {
				if (foodLossToggled == false) {
					foodLossToggled = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.healingStat = "�a�lON";
					Healing.lore = "�a�lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(4, new Healing().healingEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(foodLossToggled));
				} else {
					foodLossToggled = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.healingStat = "�c�lOFF";
					Healing.lore = "�c�lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(4, new Healing().healingDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(foodLossToggled));
				}
			}
		}
	}

	@EventHandler
	public void onFoodLossClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Food")) {
				if (foodLossToggled == false) {
					foodLossToggled = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.foodLossStat = "�a�lON";
					FoodLoss.lore = "�a�lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(5, new FoodLoss().foodLossEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(foodLossToggled));
				} else {
					foodLossToggled = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.foodLossStat = "�c�lOFF";
					FoodLoss.lore = "�c�lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(5, new FoodLoss().foodLossDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(foodLossToggled));
				}
			}
		}
	}

	@EventHandler
	public void onEnderPearlsClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Ender")) {
				if (enderPearls == false) {
					enderPearls = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.enderPearlsStat = "�a�lON";
					EnderPearls.lore = "�a�lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(6, new EnderPearls().enderPearlsEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(enderPearls));
				} else {
					enderPearls = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.enderPearlsStat = "�c�lOFF";
					EnderPearls.lore = "�c�lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(6, new EnderPearls().enderPearlsDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(enderPearls));
				}
			}
		}
	}

	@EventHandler
	public void onRiskInventoryClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Risk")) {
				if (riskInventory == false) {
					riskInventory = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.riskInventoryStat = "�a�lON";
					RiskInventory.lore = "�a�lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(7, new RiskInventory().riskInventoryEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(riskInventory));
				} else {
					riskInventory = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.riskInventoryStat = "�c�lOFF";
					RiskInventory.lore = "�c�lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(7, new RiskInventory().riskInventoryDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(riskInventory));
				}
			}
		}
	}

	@EventHandler
	public void onBountyInventoryClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Bounty")) {
				if (bounty == false) {
					bounty = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.bountyStat = "�a�lON";
					Bounty.lore = "�a�lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(8, new Bounty().bountyEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(bounty));
				} else {
					bounty = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.bountyStat = "�c�lOFF";
					Bounty.lore = "�c�lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(8, new Bounty().bountyDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(bounty));
				}
			}
		}
	}

	@EventHandler
	public void onArmorInventoryClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Armor")) {
				if (armor == false) {
					armor = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.armorStat = "�a�lON";
					Armor.lore = "�a�lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(10, new Armor().armorEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(armor));
				} else {
					armor = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.armorStat = "�c�lOFF";
					Armor.lore = "�c�lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(10, new Armor().armorDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(armor));
				}
			}
		}
	}

	@EventHandler
	public void onWeaponInventoryClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Weapons")) {
				if (weapons == false) {
					weapons = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.weaponsStat = "�a�lON";
					Weapons.lore = "�a�lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(11, new Weapons().weaponsEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(weapons));
				} else {
					weapons = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.weaponsStat = "�c�lOFF";
					Weapons.lore = "�c�lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(11, new Weapons().weaponsDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(weapons));
				}
			}
		}
	}

	@EventHandler
	public void onFixInventoryClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("/fix")) {
				if (fix == false) {
					fix = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.fixStat = "�a�lON";
					Fix.lore = "�a�lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(12, new Fix().fixEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(fix));
				} else {
					fix = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.fixStat = "�c�lOFF";
					Fix.lore = "�c�lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(12, new Fix().fixDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(fix));
				}
			}
		}
	}

	@EventHandler
	public void onFlyInventoryClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("/fly")) {
				if (fly == false) {
					fly = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.flyStat = "�a�lON";
					Fly.lore = "�a�lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(14, new Fly().flyEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(fly));
				} else {
					fly = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.flyStat = "�c�lOFF";
					Fly.lore = "�c�lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(14, new Fly().flyDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(fly));
				}
			}
		}
	}

	@EventHandler
	public void onCosmicEnvoyInventoryClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Envoy")) {
				if (cosmicEnvoy == false) {
					cosmicEnvoy = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.cosmicEnvoyStat = "�a�lON";
					CosmicEnvoy.lore = "�a�lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(15, new CosmicEnvoy().cosmicEnvoyEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(cosmicEnvoy));
				} else {
					cosmicEnvoy = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.cosmicEnvoyStat = "�c�lOFF";
					CosmicEnvoy.lore = "�c�lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(15, new CosmicEnvoy().cosmicEnvoyDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(cosmicEnvoy));
				}
			}
		}
	}

	@EventHandler
	public void onDeathCertifInventoryClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Death")) {
				if (deathCertif == false) {
					deathCertif = true;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.deathCertifStat = "�a�lON";
					DeathCertificates.lore = "�a�lENABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(16, new DeathCertificates().deathCertifEnabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(deathCertif));
				} else {
					deathCertif = false;
					e.setCancelled(true);
					Player player = (Player) e.getWhoClicked();
					GlassPane.deathCertifStat = "�c�lOFF";
					DeathCertificates.lore = "�c�lDISABLED";
					Inventory inv = CosmicDuelsAPI.createDuelSettingsGUI(player);
					inv.setItem(16, new DeathCertificates().deathCertifDisabled());
					inv.setItem(22, new GlassPane().greenGlassPane());
					e.getWhoClicked().sendMessage(String.valueOf(deathCertif));
				}
			}
		}
	}

	@EventHandler
	public void onKitSelectionClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Kit")) {
				e.setCancelled(true);
				Player player = (Player) e.getWhoClicked();
				Inventory inv = CosmicDuelsAPI.createKitSelectionGUI(player);
			}
		}
	}
}
