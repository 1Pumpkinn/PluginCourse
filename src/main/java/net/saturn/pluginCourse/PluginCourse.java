package net.saturn.pluginCourse;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginCourse extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("OUR PLUGIN IS WORKING");

        ArmorStand stand = (ArmorStand) Bukkit.getWorld("world").spawnEntity
                (new Location(Bukkit.getWorld("world"), 0, 70, 0), EntityType.ARMOR_STAND);

    }

    @EventHandler
    public void onEntitySpawn(CreatureSpawnEvent e) {

        EntityType entityType = EntityType.CREEPER;

        if(entityType.isSpawnable()) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onEntityDeath(EntityDeathEvent e) {

    }

    @EventHandler
    public void onEntityDamage (EntityDamageByEntityEvent e) {

    }

    @EventHandler

    public void entityEvents(EntityEvent e) {

        // If you do EntityEvent you can look at all or
        // almost all the EntityEvents you can do and look at

    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
