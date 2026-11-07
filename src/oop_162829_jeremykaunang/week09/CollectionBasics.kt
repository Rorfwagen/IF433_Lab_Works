package oop_162829_jeremykaunang.week09

fun main() {
    println("=== TEST LIST ===")
    val frameworks: List<String> = listOf("Koltin", "Java", "C++")

    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")

    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1,2,3,4)
    println ("Unique Numbers (Set): $uniqueNumbers")

    val activeUsers = mutableListOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserD")
    println("Active Users: $activeUsers")
}