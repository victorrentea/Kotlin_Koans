// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val initial = customers.get(0).orders.flatMap { it.products }.toSet()
    return this.customers.
            fold(initial, {
                    set, c ->
                val listProd = c.orders.flatMap { it.products }.toSet()
                set intersect listProd
            })
}
// am dat-o-n bara !
// to be continued...

//
//{A,B}   -> {A,B}
//{A}     -> {A}
//{A,C}   -> {A}