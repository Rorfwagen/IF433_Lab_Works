package oop_162829_jeremykaunang.week03

class Player(val username: String) {
private var xp: Int = 0

val level: Int
get() = (xp / 100) + 1

fun addXp(amount: Int) {
if (amount <= 0) {
println("WARNING: Jumlah XP harus positif!")
return
}
val levelSebelum = level
xp += amount
val levelSesudah = level
if (levelSesudah > levelSebelum) {
println("Level Up! Selamat $username naik ke level $level")
}

}

}