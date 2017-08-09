package me.puyodead1.cosmicduels.events;

import java.util.Arrays;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import me.puyodead1.cosmicduels.api.CosmicDuelsAPI;

public class KitSelectionClickEvent implements Listener {

	@EventHandler
	public void onKitSelectionGUIClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Settings")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("Kit")) {
				CosmicDuelsAPI.settingsList()
						.addAll(Arrays.asList(DuelSettingsClickEvent.armor, DuelSettingsClickEvent.bounty,
								DuelSettingsClickEvent.bowsToggled, DuelSettingsClickEvent.cosmicEnvoy,
								DuelSettingsClickEvent.deathCertif, DuelSettingsClickEvent.enderPearls,
								DuelSettingsClickEvent.fix, DuelSettingsClickEvent.fly,
								DuelSettingsClickEvent.foodLossToggled, DuelSettingsClickEvent.goldenApplesToggled,
								DuelSettingsClickEvent.mcmmoToggled, DuelSettingsClickEvent.potionsToggled,
								DuelSettingsClickEvent.riskInventory, DuelSettingsClickEvent.weapons));
				e.setCancelled(true);
				Player player = (Player) e.getWhoClicked();
				Inventory inv = CosmicDuelsAPI.createKitSelectionGUI(player);
			}
		}
	}

	@EventHandler
	public void onNoneKitClick(InventoryClickEvent e) {
		if (e.getClickedInventory().getName().contains("Duel Kit")) {
			if (e.getCurrentItem().getItemMeta().getDisplayName().contains("None")) {
				Player player = (Player) e.getWhoClicked();
				player.openInventory((Inventory) CosmicDuelsAPI.createDuelSettingsGUI(player));
				e.setCancelled(true);
			}
		}
	}
}