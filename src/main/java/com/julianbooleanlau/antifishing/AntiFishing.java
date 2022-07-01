package com.julianbooleanlau.antifishing;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiFishing extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("AntiFishing starting up");

        //Registering new event handler
        //Placing torch will say hi back
        Bukkit.getPluginManager().registerEvents(new FishingListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("AntiFishing shutting down");
    }
}
