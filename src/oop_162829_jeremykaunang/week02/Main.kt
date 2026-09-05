package oop_162829_jeremykaunang.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()
    scanner.nextLine() // Consume newline

    val hero = Hero(heroName, baseDamage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println()
        println("--- Hero HP: ${hero.hp} | Enemy HP: $enemyHp ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()
        scanner.nextLine() // Consume newline

        if (choice == 1) {
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Sisa HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                hero.takeDamage(enemyDamage)
                println("Musuh membalas dengan damage $enemyDamage!")
                println("Sisa HP Hero: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("Hero kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid, coba lagi.")
        }
    }

    println()
    if (!hero.isAlive()) {
        println("Hero telah kalah! Musuh menang.")
    } else if (enemyHp <= 0) {
        println("Musuh berhasil dikalahkan! Hero menang!")
    } else {
        println("Pertarungan dihentikan.")
    }
}