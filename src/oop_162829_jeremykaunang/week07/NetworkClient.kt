package oop_162829_jeremykaunang.week07

class NetworkClient private constructor(val url: String) {

    companion object {
        const val BASE_URL = "https://api.umn.ac.id"

        fun createClient(): NetworkClient {
            println("Membangun NetworkCLient dengan BASE_URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }

    fun connect() {
        println("Connecting to $url...")
    }
}
