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

    println("\n--- Testing ElectricCar ---")
    val myTesla = ElectricCar("Tesla", 4, 85)
    myTesla.accelerate()
    myTesla.honk()
    myTesla.openTrunk()

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager("Budi", 10_000_000)
    val developer = Developer("Sari", 8_000_000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}