package com.julianbooleanlau.antifishing;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerFishEvent;
import java.util.Random;

public class FishingListener implements Listener {

    @EventHandler
    public void onFish(PlayerFishEvent event) {
        if (event.getCaught() != null) {
            Player player = event.getPlayer();
            //player.sendMessage("Nice Catch!");

            Location location = player.getLocation();
            location.setYaw(location.getYaw() + 2.0f);
            location.setPitch(location.getPitch() + 2.0f);

            //player.sendMessage("Yaw: " + location.getYaw() + 10.0f);
            //player.sendMessage("Yaw: " + location.getPitch() + 10.0f);

            player.teleport(location);
        }
    }

}
