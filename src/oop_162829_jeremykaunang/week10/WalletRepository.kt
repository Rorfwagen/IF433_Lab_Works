package oop_162829_jeremykaunang.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> = items
}
interface Named {
    val name: String
}

fun <T : Named> WalletRepository<T>.searchByName(query: String): List<T> {
    return getAll().filter { it.name.contains(query, ignoreCase = true) }
}