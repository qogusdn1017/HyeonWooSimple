package com.github.qogusdn1017.hyeonwoosimple.simplecommands

import org.bukkit.ChatColor
import org.bukkit.Sound
import org.bukkit.attribute.Attribute
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter
import org.bukkit.entity.Player
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class GodEffect : CommandExecutor, TabCompleter {
    override fun onCommand(sender: CommandSender, cmd: Command, label: String, args: Array<out String>): Boolean {
        if (sender is Player) {
            if (sender.isOp) {
                sender.getAttribute(Attribute.GENERIC_MAX_HEALTH)!!.baseValue = 2048.0
                sender.addPotionEffect(PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1000000, 255, true))
                sender.addPotionEffect(PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1000000, 255, true))
                sender.addPotionEffect(PotionEffect(PotionEffectType.CONDUIT_POWER, 1000000, 255, true))
                sender.addPotionEffect(PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000, 255, true))
                sender.addPotionEffect(PotionEffect(PotionEffectType.NIGHT_VISION, 1000000, 255, true))
                sender.addPotionEffect(PotionEffect(PotionEffectType.REGENERATION, 1000000, 255, true))
                sender.addPotionEffect(PotionEffect(PotionEffectType.ABSORPTION, 1000000, 255, true))
                sender.addPotionEffect(PotionEffect(PotionEffectType.HEALTH_BOOST, 1000000, 255, true))
                sender.addPotionEffect(PotionEffect(PotionEffectType.HEAL, 1000000, 255, true))
                sender.addPotionEffect(PotionEffect(PotionEffectType.DOLPHINS_GRACE, 1000000, 255, true))
                sender.addPotionEffect(PotionEffect(PotionEffectType.FAST_DIGGING, 1000000, 255, true))
                sender.addPotionEffect(PotionEffect(PotionEffectType.JUMP, 1000000, 15, true))
                sender.addPotionEffect(PotionEffect(PotionEffectType.JUMP, 1000000, 255, true))
                sender.addPotionEffect(PotionEffect(PotionEffectType.INVISIBILITY, 1000000, 255, true))
                sender.playSound(sender.location, Sound.ENTITY_WITHER_SPAWN, 1000.0f, 0.0f)
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