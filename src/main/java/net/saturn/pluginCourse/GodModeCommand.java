package net.saturn.pluginCourse;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodModeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {


        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.setInvulnerable(true);
            player.sendMessage(ChatColor.RED + "God Mode Activated");
        }
        return false;
    }
}
