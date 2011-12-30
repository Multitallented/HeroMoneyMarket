package main.java.multitallented.plugins.heromoneymarket;

import org.bukkit.plugin.java.JavaPlugin;

public class Heromoneymarket extends JavaPlugin {
    @Override
    public void onDisable() {
        // TODO: Place any custom disable code here.
        System.out.println(this + " is now disabled!");
    }

    @Override
    public void onEnable() {
        // TODO: Place any custom enable code here, such as registering events
        
        System.out.println(this + " is now enabled!");
    }
}
