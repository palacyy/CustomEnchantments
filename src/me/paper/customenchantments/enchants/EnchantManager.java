package me.paper.customenchantments.enchants;

import me.paper.customenchantments.CustomEnchantments;
import me.paper.customenchantments.enchants.enchantments.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.plugin.PluginManager;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

public class EnchantManager {

    private CustomEnchantments customEnchantments;

    public MobcoinHunterEnchantment mobcoinHunterEnchantment = new MobcoinHunterEnchantment(110);
    public AgilityEnchantment agilityEnchantment = new AgilityEnchantment(111);
    public SaturationEnchantment saturationEnchantment = new SaturationEnchantment(112);
    public FireResistanceEnchantment fireResistanceEnchantment = new FireResistanceEnchantment(113);
    public StarlightEnchantment starlightEnchantment = new StarlightEnchantment(114);
    public HeadhunterEnchantment headhunterEnchantment = new HeadhunterEnchantment(115);
    public WaterBreathingEnchantment waterBreathingEnchantment = new WaterBreathingEnchantment(116);
    public TripleEnchantment tripleEnchantment = new TripleEnchantment(117);
    public RecoverEnchantment recoverEnchantment = new RecoverEnchantment(118);
    public HellForgeEnchantment hellforgeEnchantment = new HellForgeEnchantment(119);
    public MobRusherEnchantment mobRusherEnchantment = new MobRusherEnchantment(120);
    public RejuvenationEnchantment rejuvenationEnchantment = new RejuvenationEnchantment(121);
    public HeadshotEnchantment headshotEnchantment = new HeadshotEnchantment(122);
    public AssassinEnchantment assassinEnchantment = new AssassinEnchantment(123);
    public HeavyEnchantment heavyEnchantment = new HeavyEnchantment(124);
    public TokenHunterEnchantment tokenHunterEnchantment = new TokenHunterEnchantment(125);

    public EnchantManager(CustomEnchantments customEnchantments) {
        this.customEnchantments = customEnchantments;
    }

    public void load() {
        this.loadEnchantment(mobcoinHunterEnchantment);
        this.loadEnchantment(agilityEnchantment);
        this.loadEnchantment(saturationEnchantment);
        this.loadEnchantment(fireResistanceEnchantment);
        this.loadEnchantment(starlightEnchantment);
        this.loadEnchantment(headhunterEnchantment);
        this.loadEnchantment(waterBreathingEnchantment);
        this.loadEnchantment(tripleEnchantment);
        this.loadEnchantment(recoverEnchantment);
        this.loadEnchantment(hellforgeEnchantment);
        this.loadEnchantment(mobRusherEnchantment);
        this.loadEnchantment(rejuvenationEnchantment);
        this.loadEnchantment(headshotEnchantment);
        this.loadEnchantment(assassinEnchantment);
        this.loadEnchantment(heavyEnchantment);
        this.loadEnchantment(tokenHunterEnchantment);
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "All custom enchantments have been successfully loaded!");
    }

    public void unload() {
        this.unloadEnchantment(mobcoinHunterEnchantment);
        this.unloadEnchantment(agilityEnchantment);
        this.unloadEnchantment(saturationEnchantment);
        this.unloadEnchantment(fireResistanceEnchantment);
        this.unloadEnchantment(starlightEnchantment);
        this.unloadEnchantment(headhunterEnchantment);
        this.unloadEnchantment(waterBreathingEnchantment);
        this.unloadEnchantment(tripleEnchantment);
        this.unloadEnchantment(recoverEnchantment);
        this.unloadEnchantment(hellforgeEnchantment);
        this.unloadEnchantment(mobRusherEnchantment);
        this.unloadEnchantment(rejuvenationEnchantment);
        this.unloadEnchantment(headshotEnchantment);
        this.unloadEnchantment(assassinEnchantment);
        this.unloadEnchantment(heavyEnchantment);
        this.unloadEnchantment(tokenHunterEnchantment);
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "All custom enchantments have been successfully un-loaded!");
    }
    
    public void register() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(mobcoinHunterEnchantment, customEnchantments);
        pluginManager.registerEvents(agilityEnchantment, customEnchantments);
        pluginManager.registerEvents(fireResistanceEnchantment, customEnchantments);
        pluginManager.registerEvents(saturationEnchantment, customEnchantments);
        pluginManager.registerEvents(starlightEnchantment, customEnchantments);
        pluginManager.registerEvents(headhunterEnchantment, customEnchantments);
        pluginManager.registerEvents(waterBreathingEnchantment, customEnchantments);
        pluginManager.registerEvents(tripleEnchantment, customEnchantments);
        pluginManager.registerEvents(recoverEnchantment, customEnchantments);
        pluginManager.registerEvents(hellforgeEnchantment, customEnchantments);
        pluginManager.registerEvents(mobRusherEnchantment, customEnchantments);
        pluginManager.registerEvents(rejuvenationEnchantment, customEnchantments);
        pluginManager.registerEvents(headshotEnchantment, customEnchantments);
        pluginManager.registerEvents(assassinEnchantment, customEnchantments);
        pluginManager.registerEvents(heavyEnchantment, customEnchantments);
        pluginManager.registerEvents(tokenHunterEnchantment, customEnchantments);
    }

    public HashMap<Enchantment, Integer> getSupremeEnchantments() {
        HashMap<Enchantment, Integer> supremeEnchantments = new HashMap<>();
        supremeEnchantments.put(mobcoinHunterEnchantment, 3);
        supremeEnchantments.put(agilityEnchantment, 2);
        supremeEnchantments.put(headhunterEnchantment, 3);
        supremeEnchantments.put(tripleEnchantment, 3);
        supremeEnchantments.put(hellforgeEnchantment, 3);
        supremeEnchantments.put(recoverEnchantment, 3);
        supremeEnchantments.put(mobRusherEnchantment, 3);
        supremeEnchantments.put(rejuvenationEnchantment, 3);
        supremeEnchantments.put(headshotEnchantment, 3);
        supremeEnchantments.put(assassinEnchantment, 3);
        supremeEnchantments.put(heavyEnchantment, 3);
        supremeEnchantments.put(tokenHunterEnchantment, 3);
        return supremeEnchantments;
    }

    public HashMap<Enchantment, Integer> getRareEnchantments() {
        HashMap<Enchantment, Integer> rareEnchantments = new HashMap<>();
        rareEnchantments.put(mobcoinHunterEnchantment, 2);
        rareEnchantments.put(agilityEnchantment, 1);
        rareEnchantments.put(saturationEnchantment, 1);
        rareEnchantments.put(fireResistanceEnchantment, 1);
        rareEnchantments.put(starlightEnchantment, 1);
        rareEnchantments.put(headhunterEnchantment, 2);
        rareEnchantments.put(waterBreathingEnchantment, 1);
        rareEnchantments.put(tripleEnchantment, 2);
        rareEnchantments.put(hellforgeEnchantment, 2);
        rareEnchantments.put(recoverEnchantment, 2);
        rareEnchantments.put(mobRusherEnchantment, 2);
        rareEnchantments.put(rejuvenationEnchantment, 2);
        rareEnchantments.put(headshotEnchantment, 2);
        rareEnchantments.put(assassinEnchantment, 2);
        rareEnchantments.put(heavyEnchantment, 2);
        rareEnchantments.put(tokenHunterEnchantment, 2);
        return rareEnchantments;
    }

    public HashMap<Enchantment, Integer> getBasicEnchantments() {
        HashMap<Enchantment, Integer> basicEnchantments = new HashMap<>();
        basicEnchantments.put(mobcoinHunterEnchantment, 1);
        basicEnchantments.put(saturationEnchantment, 1);
        basicEnchantments.put(fireResistanceEnchantment, 1);
        basicEnchantments.put(starlightEnchantment, 1);
        basicEnchantments.put(headhunterEnchantment, 1);
        basicEnchantments.put(waterBreathingEnchantment, 1);
        basicEnchantments.put(tripleEnchantment, 1);
        basicEnchantments.put(hellforgeEnchantment, 1);
        basicEnchantments.put(recoverEnchantment, 1);
        basicEnchantments.put(mobRusherEnchantment, 1);
        basicEnchantments.put(rejuvenationEnchantment, 1);
        basicEnchantments.put(headshotEnchantment, 1);
        basicEnchantments.put(assassinEnchantment, 1);
        basicEnchantments.put(heavyEnchantment, 1);
        basicEnchantments.put(tokenHunterEnchantment, 1);
        return basicEnchantments;
    }

    private void loadEnchantment(Enchantment enchantment) {
        try {
            try {
                Field f = Enchantment.class.getDeclaredField("acceptingNew");
                f.setAccessible(true);
                f.set(null, true);
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                Enchantment.registerEnchantment(enchantment);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void unloadEnchantment(Enchantment enchantment) {
        try {
            Field byIdField = Enchantment.class.getDeclaredField("byId");
            Field byNameField = Enchantment.class.getDeclaredField("byName");

            byIdField.setAccessible(true);
            byNameField.setAccessible(true);

            HashMap<Integer, Enchantment> byId = (HashMap<Integer, Enchantment>) byIdField.get(null);
            HashMap<Integer, Enchantment> byName = (HashMap<Integer, Enchantment>) byNameField.get(null);

            if (byId.containsKey(enchantment.getId())) {
                byId.remove(enchantment.getId());
            }

            if (byName.containsKey(enchantment.getName())) {
                byName.remove(enchantment.getName());
            }
        } catch (Exception ignored) {
        }
    }
}
