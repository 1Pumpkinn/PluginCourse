package net.saturn.pluginCourse;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class ConfigCommand implements CommandExecutor {

    private PluginCourse main;

    public ConfigCommand(PluginCourse main) {
        this.main = main;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

    if (sender instanceof Player) {
        Player player = (Player) sender;

        main.getConfig().set("Word", "Cake");

        List<String> list = main.getConfig().getStringList("String-list");
        list.add("New value!");
        main.getConfig().set("String-list", list);

        main.saveConfig();

    }
        return false;
    }
}
