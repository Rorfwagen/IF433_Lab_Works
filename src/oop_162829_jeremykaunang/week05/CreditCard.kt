package oop_162829_jeremykaunang.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran CreditCard sebesar $amount BERHASIL. Terpakai: $usedAmount / $limit")
        } else {
            println("[$accountName] Transaksi DITOLAK. Melebihi limit kartu.")
        }
    }
}