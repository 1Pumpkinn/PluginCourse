package net.saturn.pluginCourse;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Warden;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if (sender instanceof Player) {
            // if first argument is equal to hello then send hello back
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("hello")) {
                    ((Player) sender).sendMessage("Hello Idiot Head");
                } else if (args[0].equalsIgnoreCase("meow")) {
                    ((Player) sender).sendMessage(ChatColor.AQUA + "Meow!");
                    ((Player) sender).setHealth(18);
                }
            }


        }

        return false;
    }
}
