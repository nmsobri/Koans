// Return all products this customer has ordered
fun Customer.getOrderedProducts(): Set<Product> = orders.flatMap { item -> item.products }.toSet()

// Return all products that were ordered by at least one customer
fun Shop.getAllOrderedProducts(): Set<Product> = customers.flatMap { item -> item.orders }.flatMap { item -> item.products }.toSet()
