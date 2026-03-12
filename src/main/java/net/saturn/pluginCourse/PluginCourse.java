package net.saturn.pluginCourse;

import org.bukkit.event.Listener;

import org.bukkit.plugin.java.JavaPlugin;

public final class PluginCourse extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("OUR PLUGIN IS WORKING");

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("config").setExecutor(new ConfigCommand(this));


    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
