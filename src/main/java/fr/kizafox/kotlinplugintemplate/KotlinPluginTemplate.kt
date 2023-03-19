package fr.kizafox.kotlinplugintemplate

import fr.kizafox.kotlinplugintemplate.managers.commands.CommandTest
import fr.kizafox.kotlinplugintemplate.managers.listeners.PlayerListeners
import org.bukkit.plugin.java.JavaPlugin

/**
 * Welcome to the main class of this plugin.
 * @author: KIZAFOX
 */
class KotlinPluginTemplate : JavaPlugin() {

    companion object {
        private var instance: KotlinPluginTemplate? = null
    }

    override fun onEnable() {
        instance = this

        server.pluginManager.registerEvents(PlayerListeners, this);

        getCommand("test")?.setExecutor(CommandTest)

        logger.info("Plugin enabled !")
    }

    override fun onDisable() {
        logger.info("Plugin disabled !")
    }
}
