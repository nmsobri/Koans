// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val allOrderedProducts = customers.flatMap { it -> it.orders.flatMap { it -> it.products } }.toSet()

    return customers.fold(allOrderedProducts) { allProducts, customer ->
        allProducts.intersect(customer.orders.flatMap { it -> it.products }.toSet())
    }
}
