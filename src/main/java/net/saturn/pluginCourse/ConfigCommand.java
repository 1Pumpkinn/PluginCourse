package net.saturn.pluginCourse;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ConfigCommand implements CommandExecutor {

    private PluginCourse main;

    public ConfigCommand(PluginCourse main) {
        this.main = main;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

    if (sender instanceof Player) {
        Player player = (Player) sender;

        player.sendMessage(main.getConfig().getString("Word"));
        player.sendMessage(main.getConfig().getInt("Number") + "");

        if (main.getConfig().getBoolean("Boolean")) {
            player.sendMessage("This feature is Enabled.");
        }

        for(String string : main.getConfig().getStringList("String-list")) {
            player.sendMessage(string);
        }
    }
        return false;
    }
}
