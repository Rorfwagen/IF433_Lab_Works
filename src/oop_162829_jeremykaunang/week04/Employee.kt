package oop_162829_jeremykaunang.week04

open class Employee(val name: String, val baseSalary: Int) {

    open fun work() {
        println("$name sedang berkerja.")
    }

    open fun calculateBonus(): Int {
        return baseSalary / 10
    }
}