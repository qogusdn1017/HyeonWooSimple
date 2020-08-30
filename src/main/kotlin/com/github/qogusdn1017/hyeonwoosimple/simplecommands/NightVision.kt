package com.github.qogusdn1017.hyeonwoosimple.simplecommands

import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter
import org.bukkit.entity.Player
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class NightVision : CommandExecutor, TabCompleter {
    override fun onCommand(sender: CommandSender, cmd: Command, label: String, args: Array<out String>): Boolean {
        if (sender is Player) {
            if (sender.isOp) {
                sender.addPotionEffect(PotionEffect(PotionEffectType.NIGHT_VISION, 1000000, 255, true, false))
            } else {
                sender.sendMessage("${ChatColor.RED}You don't have permission to use this command.")
            }
        } else {
            sender.sendMessage("Please use this command In-Game.")
        }
        return true
    }
    override fun onTabComplete(sender: CommandSender, cmd: Command, alias: String, args: Array<out String>): List<String> {
        return emptyList()
    }
}
