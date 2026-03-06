package net.saturn.pluginCourse;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class TestArgumentCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if (sender instanceof Player) {
            ((Player) sender).sendMessage("This is a console only comamnd");
        } else {
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("console")) {
                    System.out.println("You messaged the Console WITH Arguments");
                }
            }
        }
        return false;
    }
}
