package net.designed4device.programming.foundations

import org.junit.Test
import kotlin.test.assertEquals

class WorkbookTest {

    val workbook = Workbook()

    /**
     * create a value called unitCost that is initialized with
     * a Double (decimal) value of 20.99
     */
//    @Test
//    fun `it stores the unitCost value`() {
//        assertEquals(20.99, workbook.unitCost)
//    }


    /**
     * create a variable called quantity that is initialized
     * with a Integer value of 5
     */
//    @Test
//    fun `it stores the quantity variable`() {
//        assertEquals(5, workbook.quantity)
//    }


    /**
     * write a function called getTotal that returns the
     * total price based on the unitCost and quantity
     */
//    @Test
//    fun `it calculates the total price`() {
//        assertEquals(104.95, workbook.getTotal())
//    }

    /**
     * Add an if statement to the getDollarDiscount function
     * to return the value of 2 when quantity > 10
     */
    @Test
    fun `it returns the dollar discount of 2 for quantities greater than 10`() {
        assertEquals(2, workbook.getDollarDiscount(17))
    }

    /**
     * Add an else if statement to the getDollarDiscount function
     * to return the value of 1 when quantity > 5
     */
    @Test
    fun `it returns the dollar discount of 1 for quantities greater than 5 `() {
        assertEquals(1, 7)
    }

    /**
     * Add an else statement to the getDollarDiscount function
     * and move the return 0 into it
     */
    @Test
    fun `it returns the dollar discount of 0 if the quantity is 5 or less`() {
        assertEquals(0, 2)
    }

    /**
     * Use a for loop to finish writing the function sumOf1toN
     * which calculates the sum of all integers from 1 through n
     */
    @Test
    fun `it calculates the sum of all numbers from 1 through n`() {
        assertEquals(15, workbook.sumOf1toN(5))
    }
}