package net.hypedkey.lobbycore;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandSpawn implements CommandExecutor {
        private final LobbyCore main;
        public CommandSpawn (LobbyCore plugin) {
            main = plugin;
        }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            World hub = player.getWorld();
            Location loc = new Location(hub, 1, 71, 0, -90, 2);
            player.teleport(loc);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&',main.getConfig().getString("SpawnCommandMessage")));

        }
        return true;
    }

}
