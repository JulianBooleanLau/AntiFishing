package com.julianbooleanlau.antifishing;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiFishing extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("STARTING UP");

        //Registering new event handler
        //Placing torch will say hi back
        Bukkit.getPluginManager().registerEvents(new FishingListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
