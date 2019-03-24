package com.arwenmc;

import org.bukkit.plugin.java.JavaPlugin;

public class StaffPlusPlus extends JavaPlugin {

    public StaffPlusPlus instance;

    @Override
    public void onEnable() {
        this.instance = this;
    }

    @Override
    public void onDisable() {}
}
