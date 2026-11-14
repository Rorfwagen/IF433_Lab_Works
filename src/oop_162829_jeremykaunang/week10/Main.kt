package oop_162829_jeremykaunang.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generic in Koltin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice = PairBox("Bitcoin, 65000")
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

    println("\n=== TEST GENERIC FUNCTIONS ===")
    printData(3.14)
    val result = processData("Stable Coin")
    println("Hasil proses: $result")

    println("\n=== TEST CONSTRAINTS ===")
    val math = MathBox(10.5,20)
    println("Total: ${math.sum()}")
    println("Terbesar: ${getMax(45, 90)}")
}