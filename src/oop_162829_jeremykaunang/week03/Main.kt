package oop_162829_jeremykaunang.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasingPerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}
