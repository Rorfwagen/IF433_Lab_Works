package oop_162829_jeremykaunang.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url..")
    }
}
