package com.arwenmc;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class StaffPlusPlus extends JavaPlugin {

    public StaffPlusPlus plugin;
    public Logger logger;
    public PluginManager pm;

    public Permission admin = new Permission("spp.admin");
    public Permission moderator = new Permission("spp.moderator");
    public Permission helper = new Permission("spp.helper");

    public String noPermission = configString("messages.no_permission");
    public String notPlayer = configString("messages.not_player");

    @Override
    public void onEnable() {
        this.plugin = this;
        this.logger = getLogger();
        this.pm = Bukkit.getPluginManager();

        getCommand("staffplusplus").setExecutor((commandSender, command, label, args) -> {
            if (commandSender.hasPermission(helper)) {
                commandSender.sendMessage(ChatColor.GREEN + "Staff Plus Plus");
            }
            return false;
        });
    }

    @Override
    public void onDisable() {}

    private String configString(String path) {
        return ChatColor.translateAlternateColorCodes('&', getConfig().getString(path));
    }
}
