package com.github.qogusdn1017.hyeonwoosimple.simpleevent

import com.destroystokyo.paper.event.server.PaperServerListPingEvent
import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.event.block.BlockPlaceEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent
import java.util.*

class SimpleEvent : Listener {
    @EventHandler
    fun onBreak(e: BlockBreakEvent) {
        val p = e.player
        run {
            e.isCancelled = !p.isOp
        }
    }

    @EventHandler
    fun onPlace(e: BlockPlaceEvent) {
        val p = e.player
        run {
            e.isCancelled = !p.isOp
        }
    }

    @EventHandler
    fun onJoin(e: PlayerJoinEvent) {
        val p = e.player
        p.sendMessage(ChatColor.DARK_GREEN.toString() + "Welcome to HyeonWoo Server!")
        p.sendTitle(
                ChatColor.GOLD.toString() + "" + p.name,
                ChatColor.GREEN.toString() + "Welcome :)",
                1,
                150,
                1
        )
        e.joinMessage =  "${ChatColor.YELLOW}" + p.name + "${ChatColor.YELLOW}님이 서버에 접속하셨습니다!"

    }
@EventHandler
    fun onQuit(e: PlayerQuitEvent) {
        val p = e.player
        e.quitMessage =  "${ChatColor.YELLOW}" + p.name + "${ChatColor.YELLOW}님이 서버 접속을 종료하셨습니다!"
    }

    @EventHandler
    fun onPaperServerListPingEvent(e: PaperServerListPingEvent) {
        val c = Calendar.getInstance()

        e.numPlayers = c.get(Calendar.YEAR) * 10000 + (c.get(Calendar.MONTH) + 1) * 100 + c.get(Calendar.DAY_OF_MONTH)
        e.maxPlayers = c.get(Calendar.HOUR) * 10000 + c.get(Calendar.MINUTE) * 100 + c.get(Calendar.SECOND)
        e.motd = ChatColor.GREEN.toString() + "Welcome."
        e.playerSample.clear()
    }
}
