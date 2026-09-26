package oop_162829_jeremykaunang.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran Ewallet sebesar $amount Berhasil. Sisa saldo: $balance")
        } else {
            println("[$accountName] Pembayaran Ewallet GAGAL. Saldo tidak cukup.")
        }
    }
    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Top up sebesar $amount berhasil. Saldo sekarang $balance")
    }
}