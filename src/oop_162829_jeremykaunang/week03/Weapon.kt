package oop_162829_jeremykaunang.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Warning: Damage tidak boleh negatif! Nilai tidak diubah")
            } else if (value > 1000) {
                println("WARNING: Damage terlalu tinggi (Overpowered)! Di-cap ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}