package net.saturn.pluginCourse;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;

            if(player.hasPermission("testplugin.use")) {
                player.sendMessage(ChatColor.GREEN + "You have permission to use this command!");
            } else {
                player.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            }

        }

        return false;
    }
}
