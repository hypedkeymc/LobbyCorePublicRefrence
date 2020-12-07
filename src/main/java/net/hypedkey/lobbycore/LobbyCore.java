package net.hypedkey.lobbycore;

import org.bukkit.Color;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class LobbyCore extends JavaPlugin implements Listener {
    AlwaysSpawn alwaysspawn = (new AlwaysSpawn(this));
    CommandSpawn commandSpawn = (new CommandSpawn(this));

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getConfig().options().copyDefaults();
        saveDefaultConfig();
        getLogger().info(Color.RED+"LobbyCore v1.0 enabled");
        getServer().getPluginManager().registerEvents(alwaysspawn, this);
        this.getCommand("spawn").setExecutor(commandSpawn);
    }


}
