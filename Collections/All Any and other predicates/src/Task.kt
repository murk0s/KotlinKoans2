// Return true if all customers are from a given city
fun Shop.checkAllCustomersAreFrom(city: City): Boolean =
        customers.map { it.city == city }.all { it }

// Return true if there is at least one customer from a given city
fun Shop.hasCustomerFrom(city: City): Boolean =
        customers.map { it.city == city }.any { it }

// Return the number of customers from a given city
fun Shop.countCustomersFrom(city: City): Int =
        customers.map { it.city == city }.count { it }

// Return a customer who lives in a given city, or null if there is none
fun Shop.findCustomerFrom(city: City): Customer? =
        customers.firstOrNull { it.city == city }
