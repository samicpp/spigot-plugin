package com.samicpp.first;

import org.bukkit.plugin.java.JavaPlugin;

//import Commands;

public class App extends JavaPlugin {
    
    PluginCommands exec=new PluginCommands(this);

    @Override
    public void onEnable() {
        getLogger().info("Hello, SpigotMC! im tired");
        this.getCommand("basic").setExecutor(exec);
        this.getCommand("test").setExecutor(exec);
        //this.getCommand("basic2").setExecutor(exec);
        //Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "/say welcome");
    }
    @Override
    public void onDisable() {
        getLogger().info("See you again, SpigotMC! still tired");
    }
}

