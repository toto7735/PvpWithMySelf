package me.toto7735.pwms.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import xyz.haoshoku.nick.api.NickAPI;

public class Listener implements org.bukkit.event.Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        NickAPI.nick(player, "toto7735");
        NickAPI.setSkin(player, "toto7735");
        NickAPI.setGameProfileName(player, "toto7735");
        NickAPI.refreshPlayer(player);
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        NickAPI.resetNick(player);
        NickAPI.resetSkin(player);
        NickAPI.setGameProfileName( player, player.getName());
    }
    
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        event.setCancelled(true);
    }

}
