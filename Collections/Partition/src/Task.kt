// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> =
        this.customers.filter { moreUndelivered(it) }.toSet()

fun moreUndelivered(customer: Customer): Boolean {
    val (deli, undeli) = customer.orders.partition { it.isDelivered }
    return undeli.size > deli.size
}
