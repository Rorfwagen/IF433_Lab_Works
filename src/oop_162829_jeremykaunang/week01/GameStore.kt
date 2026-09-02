package oop_162829_jeremykaunang.week01

fun main() {
    val gameTitle: String = "Ready or Not"
    val price: Int = 799000

    val finalPrice = calculateDiscount(price)
    printlReceipt(title = gameTitle, finalPrice = finalPrice)

        val userNote: String? = null
    println("Catatan: ${userNote ?: "Tidak ada catatan"}")
}
fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.8).toInt() else (price * 0.9).toInt()

fun printlReceipt(title: String, finalPrice: Int) {
println("Judul: $title")
println("Harga Akhir: $finalPrice")
}
