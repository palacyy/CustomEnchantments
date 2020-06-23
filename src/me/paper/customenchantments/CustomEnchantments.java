package me.paper.customenchantments;

import me.paper.customenchantments.commands.EnchanterCommand;
import me.paper.customenchantments.enchants.EnchantManager;
import me.paper.customenchantments.enchants.enchantments.MobcoinHunterEnchantment;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class CustomEnchantments extends JavaPlugin {

    private static CustomEnchantments instance;

    private EnchantManager enchantManager;

    public void onEnable() {
        instance = this;
        if (Bukkit.getPluginManager().getPlugin("Factions") == null) {
            Bukkit.getPluginManager().disablePlugin(this);
            Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + "CustomEnchantments requires Factions in order to work!");
        }else {
            this.enchantManager = new EnchantManager(this);
            this.enchantManager.load();
            loadConfiguration();
            loadCommands();
            loadListeners();
            Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE + "CustomEnchantments by Paper has been successfully enabled.");
        }
    }

    public void onDisable() {
        this.enchantManager.unload();
        instance = null;
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "CustomEnchantments by Paper has been successfully disabled.");
    }

    private void loadCommands() {
        getCommand("ENCHANTER").setExecutor(new EnchanterCommand());
    }

    private void loadListeners() {
        enchantManager.register();

    }

    private void loadConfiguration() {
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
    }

    public static CustomEnchantments getInstance() {
        return instance;
    }

    public EnchantManager getEnchantManager() {
        return this.enchantManager;
    }

}
