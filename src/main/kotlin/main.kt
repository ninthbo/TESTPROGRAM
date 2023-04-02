
const val PRICE = 100
const val DISCOUNT = 100
const val DISCOUNT5 = 0.05
const val MELOMAN = 0.01

fun main(){
    val minBuy = 1_000
    val maxBuy = 10_000
    print("Введите количество песен для покупки: ")
    val products = readLine()!!.toUInt()
    println("Покупали ли вы музыку в прошлом месяце? (y/n)")
    val isMeloman = (readLine()!!.toString()) == "y"

    var totalPrice: Double = PRICE * products.toDouble()
    if (totalPrice >= maxBuy) {
        totalPrice *= (1 - DISCOUNT5);
    } else if (totalPrice >= minBuy) {
        totalPrice -= DISCOUNT
    }

    if (isMeloman) {
        totalPrice *= (1 - MELOMAN);
    }

    print("Total price $totalPrice RUB")
}