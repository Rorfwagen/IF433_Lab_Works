package oop_162829_jeremykaunang.week10

data class Coin(override val name: String, val balance: Double) : Named
data class Transaction(val id: String, val amount: Double)
