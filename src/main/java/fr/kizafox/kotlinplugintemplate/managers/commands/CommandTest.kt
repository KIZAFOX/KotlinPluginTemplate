package fr.kizafox.kotlinplugintemplate.managers.commands

import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

object CommandTest : CommandExecutor{
    /**
     * Executes the given command, returning its success.
     * <br></br>
     * If false is returned, then the "usage" plugin.yml entry for this command
     * (if defined) will be sent to the player.
     *
     * @param sender Source of the command
     * @param command Command which was executed
     * @param label Alias of the command which was used
     * @param args Passed command arguments
     * @return true if a valid command, otherwise false
     */
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>?): Boolean {
        sender.sendMessage("${ChatColor.GOLD}Hello ${sender.name}!")
        return false;
    }

}
