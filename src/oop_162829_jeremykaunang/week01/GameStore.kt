package oop_162829_jeremykaunang.week01

fun main() {
    val gameTitle: String = "Ready or Not"
    val price: Int = 799000

}
fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()