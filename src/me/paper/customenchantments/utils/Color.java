package me.paper.customenchantments.utils;

import org.bukkit.ChatColor;

public interface Color {

    default String format(final String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

}
