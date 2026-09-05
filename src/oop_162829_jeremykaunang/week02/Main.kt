// MainLoan.kt
package oop_162829_jeremykaunang.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- LIBRARY FINE SYSTEM ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var loanDuration = scanner.nextInt()
    scanner.nextLine() // Consume newline

    if (loanDuration < 0) {
        loanDuration = 1
    }

    val loan = Loan(bookTitle, borrower, loanDuration)
    val fine = loan.calculateFine()

    println("--- Detail Peminjaman ---")
    println("Judul: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Lama Pinjam: ${loan.loanDuration} hari")
    println("Total Denda: Rp $fine")
}