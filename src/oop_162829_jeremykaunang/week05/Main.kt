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
        println("------------------------------")
    }

    val mathHelper = MathHelper()

    println("=== METHOD OVERLOADING (Compile-Time Polymorphism) ===")
    val luasPersegi = mathHelper.hitungLuas(5)
    println("Luas persegi (sisi=5): $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(4,6)
    println("Luas persegi panjang (4x6): $luasPersegiPanjang")

    val luaslingkaran = mathHelper.hitungLuas(7.0)
    println("Luas lingkaran (jari-jari=7.0): $luaslingkaran")
    println("------------------------------")
}