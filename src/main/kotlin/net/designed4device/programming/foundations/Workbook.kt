package net.designed4device.programming.foundations

class Workbook {

    /**
     * Variables and Types
     */
    val unitCost: Int = 20
    var quantity: Int = 5

    /**
     * Functions
     */
    fun getTotal(): Int {
        return quantity * unitCost
    }

    /**
     * if, else if, else
     */
    fun getDollarDiscount(quantity: Int): Int {
        if (quantity > 10) {
            return 2
        } else if (quantity > 5) {
            return 1
        } else {
            return 0
        }
    }

    /**
     * for loops
     */
    fun sumOf1toN(n: Int): Int {
        var sum = 0
        val range = (1..n)

        for (i in range) {
            sum += i
        }

        return sum
    }
}

