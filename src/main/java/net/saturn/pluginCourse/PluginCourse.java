package net.saturn.pluginCourse;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginCourse extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("OUR PLUGIN IS WORKING");
        PluginManager pluginManager = Bukkit.getPluginManager();

        pluginManager.registerEvents(new EntityHitEvent(), this);


    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
