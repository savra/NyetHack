package com.hvdbs.nyethack

fun main(args: Array<String>) {
    val player = Player("Madrigal")
    player.castFireball()

    printPlayerStatus(player, player.auraColor())
}

private fun printPlayerStatus(
    player: Player,
    auraColor: String
) {
    println("(Aura: ${player.auraColor()}) " +
            "(Blessed: ${if (player.isBlessed) "YES" else "NO"})")
    println("${player.name} ${player.formatHealthStatus()}")
}