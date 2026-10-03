package oop_162829_jeremykaunang.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    val lamp = SmartLamp("L-01", "Ruang Tamu")
    val speaker = SmartSpeaker("S-01", "Google Nest Dapur")
    val cctv = SmartCCTV("C-01", "Ezviz Garasi")
}