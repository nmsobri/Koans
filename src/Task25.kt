// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? = customers.maxBy { item -> item.orders.size }

// Return the most expensive product which has been ordered
fun Customer.getMostExpensiveOrderedProduct(): Product? = orders.flatMap { item -> item.products }.maxBy { item -> item.price }
