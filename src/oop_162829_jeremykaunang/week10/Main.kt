package oop_162829_jeremykaunang.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generic in Koltin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}"
}