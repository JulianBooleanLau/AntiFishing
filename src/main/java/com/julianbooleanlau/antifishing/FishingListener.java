package com.julianbooleanlau.antifishing;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerFishEvent;

public class FishingListener implements Listener {
    @EventHandler
    public void onFishReel(PlayerFishEvent event) {
        if (event.getCaught() != null) {
            Player player = event.getPlayer();
            player.sendMessage("Fishing!");
            player.giveExp(100);
        }
    }


    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Material type = event.getBlock().getType();
        if (type == Material.TORCH) {
            Player player = event.getPlayer();
            player.sendMessage("Hello there");
        }
    }
}
