// Return the set of cities the customers are from
fun Shop.getCitiesCustomersAreFrom(): Set<City> = customers.map { elem -> elem.city }.toSet()

// Return a list of the customers who live in the given city
fun Shop.getCustomersFrom(city: City): List<Customer> = customers.filter { elem -> elem.city == city }
