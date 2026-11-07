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

    println("\n=== TEST MAP ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A",
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val  inventory = mutableMapOf("Apples" to 50, "Banans" to 30)
    inventory["Oranges"] = 20
    inventory["Apples"] = 45
    println("Inventory: $inventory")
}