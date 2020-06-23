package me.paper.customenchantments.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemBuilder implements Color{

    private ItemStack stack;
    private ItemMeta meta;

    public ItemBuilder(final Material material) {
        this.stack = new ItemStack(material);
        this.meta = this.stack.getItemMeta();
    }

    public ItemBuilder setDisplayName(final String displayName) {
        this.meta.setDisplayName(format(displayName));
        return this;
    }

    public ItemBuilder setLore(final List<String> lines) {
        List<String> colorizedLore = new ArrayList<>();
        for (String loreLine : lines) {
            colorizedLore.add(format(loreLine));
        }
        this.meta.setLore(colorizedLore);
        return this;
    }

    public ItemStack build() {
        final ItemStack clonedStack = this.stack.clone();
        clonedStack.setItemMeta(this.meta.clone());
        return clonedStack;
    }
}
