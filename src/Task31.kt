// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    //get all products
    val deliveredProducts = orders.flatMap { orders -> orders.products.filter { orders.isDelivered } }
    //find most expensive product
    return deliveredProducts.maxBy { it -> it.price }

}

// Return how many times the given product was ordered.
// Note: a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    //get all products
    val allOrderedProducts = customers.flatMap { customers -> customers.orders.flatMap { orders -> orders.products } }
    return allOrderedProducts.count { products -> products == product }

}