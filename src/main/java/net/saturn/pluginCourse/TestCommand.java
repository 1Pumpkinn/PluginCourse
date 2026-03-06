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
            ((Player) sender).sendMessage("This is a console only Command!");

        } else {
            System.out.println("Hello you have messaged the Console!");
        }

        return false;
    }
}
