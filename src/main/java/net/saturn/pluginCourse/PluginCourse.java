package net.saturn.pluginCourse;

import org.bukkit.event.Listener;

import org.bukkit.plugin.java.JavaPlugin;

public final class PluginCourse extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("OUR PLUGIN IS WORKING");

        getCommand("heal").setExecutor(new HealCommand());
        getCommand("god").setExecutor(new GodModeCommand());


    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
