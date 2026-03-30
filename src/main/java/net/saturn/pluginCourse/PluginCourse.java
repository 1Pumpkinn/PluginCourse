package net.saturn.pluginCourse;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginCourse extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("OUR PLUGIN IS WORKING");
        PluginManager pluginManager = Bukkit.getPluginManager();

        ItemStack itemStack = new ItemStack(Material.CARROT, 3);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setItemName("BIGG Carrot");
        itemStack.setItemMeta(meta);

        Bukkit.getWorld("world").getBlockAt(1, 1, 1).setType(Material.BEDROCK);
    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
