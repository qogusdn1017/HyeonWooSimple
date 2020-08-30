package com.github.qogusdn1017.hyeonwoosimple

import com.github.qogusdn1017.hyeonwoosimple.simplecommands.*
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import com.github.qogusdn1017.hyeonwoosimple.simpleevent.SimpleEvent

/***
/
/ @author BaeHyeonWoo
/
/ Full Directing, Original Author of this code is BaeHyeonWoo ; with help and idea from HappyAndJust and B1ackAnge1.
/
/ I'll add Special thanks at here if someone reports bug or gives me idea.
/
*/

class SimpleMain : JavaPlugin() {
        override fun onEnable() {
        logger.info("BaeHyeonWoo Plugin is Successfully Enabled.")
        Bukkit.getPluginManager().registerEvents(SimpleEvent(), this)
            // getCommand 떡칠
            getCommand("ci")?.setExecutor(ClearInventory())
            getCommand("ci")?.tabCompleter = ClearInventory()
            getCommand("챠")?.setExecutor(ClearInventory())
            getCommand("챠")?.tabCompleter = ClearInventory()
            getCommand("compass")?.setExecutor(Compass())
            getCommand("compass")?.tabCompleter = Compass()
            getCommand("나침반")?.setExecutor(Compass())
            getCommand("나침반")?.tabCompleter = Compass()
            getCommand("야투")?.setExecutor(NightVision())
            getCommand("야투")?.tabCompleter = (NightVision())
            getCommand("야간투시")?.setExecutor(NightVision())
            getCommand("야간투시")?.tabCompleter = (NightVision())
            getCommand("nv")?.setExecutor(NightVision())
            getCommand("nv")?.tabCompleter = (NightVision())
            getCommand("god")?.setExecutor(GodEffect())
            getCommand("god")?.tabCompleter = (GodEffect())
            getCommand("rmgod")?.setExecutor(RemoveGodEffect())
            getCommand("rmgod")?.tabCompleter = (RemoveGodEffect())
            getCommand("ev")?.setExecutor(Invisibility())
            getCommand("ev")?.tabCompleter = (Invisibility())
            getCommand("rmev")?.setExecutor(RemoveInvisibilityEffect())
            getCommand("rmev")?.tabCompleter = (RemoveInvisibilityEffect())
            getCommand("giveop")?.setExecutor(GiveOP())
            getCommand("giveop")?.tabCompleter = (GiveOP())
    }
    override fun onDisable() {
        logger.info("BaeHyeonWoo Plugin is Successfully Disabled.")
    }
}