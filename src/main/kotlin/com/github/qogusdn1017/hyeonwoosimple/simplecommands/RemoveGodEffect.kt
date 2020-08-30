package com.github.qogusdn1017.hyeonwoosimple.simplecommands

import org.bukkit.ChatColor
import org.bukkit.Sound
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter
import org.bukkit.entity.Player
import org.bukkit.potion.PotionEffectType

class RemoveGodEffect : CommandExecutor, TabCompleter {
    override fun onCommand(sender: CommandSender, cmd: Command, label: String, args: Array<out String>): Boolean {
        if (sender is Player) {
            if (sender.isOp) {
                sender.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE)
                sender.removePotionEffect(PotionEffectType.FIRE_RESISTANCE)
                sender.removePotionEffect(PotionEffectType.CONDUIT_POWER)
                sender.removePotionEffect(PotionEffectType.ABSORPTION)
                sender.removePotionEffect(PotionEffectType.HEALTH_BOOST)
                sender.removePotionEffect(PotionEffectType.HEAL)
                sender.removePotionEffect(PotionEffectType.DOLPHINS_GRACE)
                sender.removePotionEffect(PotionEffectType.FAST_DIGGING)
                sender.removePotionEffect(PotionEffectType.JUMP)
                sender.removePotionEffect(PotionEffectType.INVISIBILITY)
                sender.removePotionEffect(PotionEffectType.REGENERATION)
                sender.removePotionEffect(PotionEffectType.INCREASE_DAMAGE)
                sender.removePotionEffect(PotionEffectType.NIGHT_VISION)
                sender.stopSound(Sound.ENTITY_WITHER_SPAWN)
            }
            else {
                sender.sendMessage("${ChatColor.RED}You don't have permission to use this command.")
            }
        }
        else {
            sender.sendMessage("Please use this command In-Game.")
        }
        return true
    }
    override fun onTabComplete(sender: CommandSender, cmd: Command, alias: String, args: Array<out String>): List<String> {
        return emptyList()
    }
}
