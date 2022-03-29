package me.toto7735.pwms;

import me.toto7735.pwms.listener.Listener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class PvpWithMySelf extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Enabled! >_<");

        Bukkit.getPluginManager().registerEvents(new Listener(), this);
    }

}
