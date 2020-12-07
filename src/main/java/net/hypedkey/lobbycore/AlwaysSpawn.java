package net.hypedkey.lobbycore;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class AlwaysSpawn implements Listener {
    private final LobbyCore main;
    public AlwaysSpawn (LobbyCore plugin) {
        main = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        World hub = player.getWorld();
        Location loc = new Location(hub, 1, 71, 0, -90, 2);
        player.teleport(loc);

    }

}
