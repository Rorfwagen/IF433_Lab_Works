package oop_162829_jeremykaunang.week03

fun main() {
    val sword = Weapon("SUEÑO IMPOSIBLE")
    sword.damage = -50
    println("Damage: ${sword.damage}")
    sword.damage = 9999
    println("Damage: ${sword.damage}, Tier: ${sword.tier}")

    val player = Player("Don Quixote")

    player.addXp(50)
    player.addXp(60)
    println("Level akhir: ${player.level}")
}
