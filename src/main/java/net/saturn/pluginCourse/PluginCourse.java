package net.saturn.pluginCourse;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.server.ServerEvent;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginCourse extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("OUR PLUGIN IS WORKING");

        // If your events are in a different class you do
        // .registerEvents(new (classname), this);
        Bukkit.getPluginManager().registerEvents(this, this);


    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {

        e.setCancelled(true);
        e.getPlayer().sendMessage(ChatColor.RED + "Stop Moving");
    }

    @EventHandler
    public void onPlayerEggThrow(PlayerEggThrowEvent e) {

        System.out.println(e.getEgg().getLocation().getBlock());
        e.getPlayer().sendMessage("You threw a Egg!");
    }

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent e) {
        e.getPlayer().setDisplayName("Meow");
        e.getPlayer().sendMessage(ChatColor.GOLD + "Hey Welcome "); e.getPlayer().getDisplayName();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
