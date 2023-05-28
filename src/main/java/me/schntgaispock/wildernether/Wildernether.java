package me.schntgaispock.wildernether;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Random;

import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.Nonnull;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.bstats.bukkit.Metrics;
import org.bukkit.NamespacedKey;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import me.schntgaispock.wildernether.integration.SlimeHUDSetup;
import me.schntgaispock.wildernether.listeners.Listeners;
import me.schntgaispock.wildernether.managers.ItemManager;
import me.schntgaispock.wildernether.managers.LootManager;
import org.mini2Dx.gettext.GetText;
import org.mini2Dx.gettext.PoFile;

/**
 * See the <a href="https://github.com/SchnTgaiSpock/Wildernether/wiki">Wildernether wiki</a> for more info about the addon
 */
public class Wildernether extends AbstractAddon {

    static Wildernether instance;

    final Random random = ThreadLocalRandom.current();

    public Wildernether() {
        super("SlimeTraditionalTranslation", "Wildernether", "master", "options.auto-update");
    }

    public static Wildernether getInstance() {
        return instance;
    }

    public Random getRandom() {
        return this.random;
    }

    @Override
    @SuppressWarnings("unused")
    public void enable() {
        instance = this;

        getLogger().info("#=======================================#");
        getLogger().info("#    Wildernether - By SchnTgaiSpock    #");
        getLogger().info("#=======================================#");

        GetText.setLocale(Locale.TRADITIONAL_CHINESE);
        InputStream inputStream = getClass().getResourceAsStream("/translations/zh_tw.po");
        if (inputStream == null) {
            getLogger().severe("錯誤！無法找到翻譯檔案，請回報給翻譯者。");
            getServer().getPluginManager().disablePlugin(this);
            return;
        } else {
            getLogger().info("載入繁體翻譯檔案...");
            try {
                PoFile poFile = new PoFile(Locale.TRADITIONAL_CHINESE, inputStream);
                GetText.add(poFile);
            } catch (ParseCancellationException | IOException e) {
                getLogger().severe("錯誤！讀取翻譯時發生錯誤，請回報給翻譯者：" + e.getMessage());
                getServer().getPluginManager().disablePlugin(this);
                return;
            }
        }

        ItemManager.setup();
        LootManager.setup();
        Listeners.setup();

        // Might do more with this later idk
        Metrics metrics = new Metrics(this, 15487);

        if (getInstance().getServer().getPluginManager().isPluginEnabled("SlimeHUD")) {
            try {
                getLogger().info(GetText.tr("SlimeHUD was found on this server!"));
                getLogger().info(GetText.tr("Setting up Wildernether for SlimeHUD..."));
                SlimeHUDSetup.setup();
            } catch (NoClassDefFoundError e) {
                getLogger().warning(GetText.tr("This server is using an old version of SlimeHUD that is incompatitable with this version of Wildernether."));
                getLogger().warning(GetText.tr("Please update SlimeHUD to version 1.2.0 or higher!"));
            }
        }
    }

    @Override
    protected void disable() {
        instance = null;
    }

    public static NamespacedKey newNamespacedKey(@Nonnull String name) {
        return new NamespacedKey(Wildernether.getInstance(), name);
    }
}
