package me.paper.customenchantments.enchants.enchantments;

import me.paper.customenchantments.CustomEnchantments;
import me.paper.customenchantments.utils.Color;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class TokenHunterEnchantment extends Enchantment implements Listener, Color {

    private FileConfiguration config = CustomEnchantments.getInstance().getConfig();

    public TokenHunterEnchantment(int id) {
        super(id);
    }

    @Override
    public int getId() {
        return 125;
    }

    @Override
    public String getName() {
        return "Token Hunter";
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public int getStartLevel() {
        return 1;
    }

    @Override
    public EnchantmentTarget getItemTarget() {
        return EnchantmentTarget.TOOL;
    }

    @Override
    public boolean conflictsWith(Enchantment enchantment) {
        return false;
    }

    @Override
    public boolean canEnchantItem(ItemStack itemStack) {
        return true;
    }

}
