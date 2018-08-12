// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = customers.filter { item ->
    val (delivered, undelivered) = item.orders.partition { item -> item.isDelivered }
    delivered.size < undelivered.size
}.toSet()
