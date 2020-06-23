package me.paper.customenchantments.inventory;

import me.paper.customenchantments.CustomEnchantments;
import me.paper.customenchantments.utils.Color;
import me.paper.customenchantments.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EnchanterInventory implements Color {

    private Player player;
    private FileConfiguration config = CustomEnchantments.getInstance().getConfig();

    public EnchanterInventory(Player player) {
        this.player = player;
    }

    public void execute() {
        Inventory enchanter = Bukkit.createInventory(null, 9*6, format(config.getString("inventories.enchanter.name")));

        ItemStack basic = new ItemBuilder(Material.getMaterial(config.getString("inventories.enchanter.items.basic.item")))
                .setDisplayName(config.getString("inventories.enchanter.items.basic.name")).setLore(config.getStringList("inventories.enchanter.items.basic.lore")).build();
        ItemStack rare = new ItemBuilder(Material.getMaterial(config.getString("inventories.enchanter.items.rare.item")))
                .setDisplayName(config.getString("inventories.enchanter.items.rare.name")).setLore(config.getStringList("inventories.enchanter.items.rare.lore")).build();
        ItemStack supreme = new ItemBuilder(Material.getMaterial(config.getString("inventories.enchanter.items.supreme.item")))
                .setDisplayName(config.getString("inventories.enchanter.items.supreme.name")).setLore(config.getStringList("inventories.enchanter.items.supreme.lore")).build();

        ItemStack fillerOut = new ItemStack(Material.getMaterial(config.getString("inventories.enchanter.items.fillers.outside.material")), 1, (byte) config.getInt("inventories.enchanter.items.fillers.outside.data"));
        ItemMeta fillerOutMeta = fillerOut.getItemMeta();
        fillerOutMeta.setDisplayName("");
        fillerOut.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        fillerOutMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        fillerOutMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        fillerOut.setItemMeta(fillerOutMeta);

        ItemStack fillerIn = new ItemStack(Material.getMaterial(config.getString("inventories.enchanter.items.fillers.inside.material")), 1, (byte) config.getInt("inventories.enchanter.items.fillers.inside.data"));
        ItemMeta fillerInMeta = fillerIn.getItemMeta();
        fillerInMeta.setDisplayName("");
        fillerIn.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        fillerInMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        fillerInMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        fillerIn.setItemMeta(fillerInMeta);

        enchanter.setItem(21, basic);
        enchanter.setItem(23, rare);
        enchanter.setItem(31, supreme);

        // Perhaps fix this up, even though this most likely will not impact performance
        // Also, there is no way of automating it due to the pattern being quite random.
        enchanter.setItem(0,fillerOut);
        enchanter.setItem(1,fillerOut);
        enchanter.setItem(3,fillerOut);
        enchanter.setItem(4,fillerOut);
        enchanter.setItem(5,fillerOut);
        enchanter.setItem(7,fillerOut);
        enchanter.setItem(8,fillerOut);
        enchanter.setItem(2, fillerIn);
        enchanter.setItem(6,fillerIn);

        enchanter.setItem(9,fillerOut);
        enchanter.setItem(10, fillerIn);
        enchanter.setItem(16, fillerIn);
        enchanter.setItem(17,fillerOut);
        enchanter.setItem(18,fillerIn);
        enchanter.setItem(26,fillerIn);
        enchanter.setItem(27,fillerIn);
        enchanter.setItem(35, fillerIn);
        enchanter.setItem(36,fillerOut);

        enchanter.setItem(37,fillerIn);
        enchanter.setItem(43,fillerIn);
        enchanter.setItem(44,fillerOut);
        enchanter.setItem(45,fillerOut);
        enchanter.setItem(46,fillerOut);
        enchanter.setItem(47,fillerIn);
        enchanter.setItem(48,fillerOut);
        enchanter.setItem(49,fillerOut);
        enchanter.setItem(50,fillerOut);
        enchanter.setItem(51,fillerIn);
        enchanter.setItem(52,fillerOut);
        enchanter.setItem(53,fillerOut);

        this.player.openInventory(enchanter);
    }

}
