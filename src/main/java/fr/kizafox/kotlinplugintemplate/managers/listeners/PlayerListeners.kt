package fr.kizafox.kotlinplugintemplate.managers.listeners

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

object PlayerListeners : Listener {

    @EventHandler
    fun onLogin(event: PlayerJoinEvent){
        var player = event.player

        player.sendMessage("${ChatColor.AQUA}Welcome to my server ${player.name}!")
    }
}