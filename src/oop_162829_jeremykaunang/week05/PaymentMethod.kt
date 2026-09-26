package oop_162829_jeremykaunang.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}