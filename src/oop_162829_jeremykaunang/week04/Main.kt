package oop_162829_jeremykaunang.week04

fun main() {

    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}