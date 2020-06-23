package me.paper.customenchantments.commands;

import me.paper.customenchantments.CustomEnchantments;
import me.paper.customenchantments.inventory.EnchanterInventory;
import me.paper.customenchantments.utils.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class EnchanterCommand implements CommandExecutor, Color {

    private FileConfiguration config = CustomEnchantments.getInstance().getConfig();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                EnchanterInventory enchanterInventory = new EnchanterInventory(player);
                enchanterInventory.execute();
            }

        }else {
            sender.sendMessage(format(config.getString("messages.player_only")));
            return false;
        }

        return false;
    }
}
