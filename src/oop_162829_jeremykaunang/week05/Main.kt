package oop_162829_jeremykaunang.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
    }
    println("-----------------------------")

    val mathHelper = MathHelper()

    println("=== METHOD OVERLOADING (Compile-Time Polymorphism) ===")
    println("Luas persegi (sisi=5): ${mathHelper.hitungLuas(5)}")
    println("Luas persegi panjang (4x6): ${mathHelper.hitungLuas(4, 6)}")
    println("Luas lingkaran (jari-jari=7.0): ${mathHelper.hitungLuas(7.0)}")
    println("-----------------------------")

    val eWallet1 = EWallet(accountName = "Budi", balance = 50000.0)
    val creditCard1 = CreditCard(accountName = "Ani", limit = 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(eWallet1, creditCard1)

    for (metode in daftarPembayaran) {
        metode.processPayment(75000.0)
    }

}