package com.samicpp.first;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;

public class PluginCommands implements CommandExecutor {
	private final App plugin;

	public PluginCommands(App plugin) {

		this.plugin = plugin; // Store the plugin in situations where you need it.
	}

	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("basic")) { // If the player typed /basic then do the following...
            // do something...
            sender.sendMessage("/basic is executed");
            return true;
        } else if (cmd.getName().equalsIgnoreCase("basic2")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("This command can only be run by a player.");
            } else {
                Player player = (Player) sender;
                // do something
            }
            return true;
        } else if (cmd.getName().equalsIgnoreCase("test")){
            for(String m : args)sender.sendMessage(m);
            return true;
        }
        return false;
    }
}