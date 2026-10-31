package UTS_162829_JeremyKaunang

enum class OrderStatus {
    WAITING_LIST,
    COOKING,
    DELIVERED
}

data class Customer(
    val name: String,
    val phone: String,
    val deliveryAddress: String
)

interface IBillable {
    fun calculateSubtotal(quantity: Int): Double
    fun printMenuDetails(quantity: Int)
}

abstract class CateringMenu(
    val name: String,
    menuCode: String,
    basePrice: Double
) : IBillable {

    var menuCode: String = menuCode
        get() = "UMN-$field"
        set(value) {
            field = value.uppercase()
        }

    var basePrice: Double = basePrice
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("[Error] Invalid price!")
            }
        }

    init {
        this.menuCode = menuCode
        this.basePrice = basePrice
    }

    abstract override fun calculateSubtotal(quantity: Int): Double
    abstract override fun printMenuDetails(quantity: Int)
}

class FoodMenu(
    name: String,
    menuCode: String,
    basePrice: Double,
    val packagingFee: Double = 3000.0
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        return (basePrice + packagingFee) * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val subtotal = calculateSubtotal(quantity)
        println("1. [FOOD] $menuCode - $name")
        println("Qty: $quantity portions | Subtotal: Rp ${String.format("%,.0f", subtotal).replace(',', '.')}")
    }
}

class DrinkMenu(
    name: String,
    menuCode: String,
    basePrice: Double,
    val isLargeSize: Boolean
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        val effectivePrice = if (isLargeSize) basePrice + 5000.0 else basePrice
        return effectivePrice * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val subtotal = calculateSubtotal(quantity)
        val sizeLabel = if (isLargeSize) " (Large)" else ""
        println("2. [DRINK] $menuCode - $name$sizeLabel")
        println("Qty: $quantity cups | Subtotal: Rp ${String.format("%,.0f", subtotal).replace(',', '.')}")
    }
}

class CateringOrder(
    val customer: Customer,
    var status: OrderStatus = OrderStatus.WAITING_LIST
) {
    private val orderItems: MutableList<Pair<CateringMenu, Int>> = mutableListOf()

    fun addMenuToOrder(menu: CateringMenu, qty: Int) {
        orderItems.add(Pair(menu, qty))
        println("Order successfully added!")
    }

    fun printInvoice() {
        println("================ INVOICE ================")
        println("Customer: ${customer.name} (${customer.phone})")
        println("Delivery Address: ${customer.deliveryAddress}")
        println("Order Status: $status")

        var grandTotal = 0.0
        for ((index, itemPair) in orderItems.withIndex()) {
            val menu = itemPair.first
            val qty = itemPair.second
            val subtotal = menu.calculateSubtotal(qty)
            grandTotal += subtotal

            if (menu is FoodMenu) {
                println("${index + 1}. [FOOD] ${menu.menuCode} - ${menu.name}")
                println("Qty: $qty portions | Subtotal: Rp ${String.format("%,.0f", subtotal).replace(',', '.')}")
            } else if (menu is DrinkMenu) {
                val sizeLabel = if (menu.isLargeSize) " (Large)" else ""
                println("${index + 1}. [DRINK] ${menu.menuCode} - ${menu.name}$sizeLabel")
                println("Qty: $qty cups | Subtotal: Rp ${String.format("%,.0f", subtotal).replace(',', '.')}")
            }
        }
        println("GRAND TOTAL: Rp ${String.format("%,.0f", grandTotal).replace(',', '.')}")
        println("=========================================")
    }
}