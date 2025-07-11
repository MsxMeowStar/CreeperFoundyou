package com.mscreeperseeu.myplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class MyPurpurPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CreeperSenseListener(this), this);
    }

    @Override
    public void onDisable() {
    }
}
