fun renderProductTable(): String {
    return html {
        table {
            tr (color = getTitleColor()){
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for ((rowNum, p) in products.iterator().withIndex()) {
                tr  {
                    td (getCellColor(0,rowNum)) {
                        text(p.description)
                    }
                    td (getCellColor(1,rowNum)) {
                        text(p.price)
                    }
                    td (getCellColor(2,rowNum)) {
                        text(p.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) %2 == 0) "#dce4ff" else "#eff2ff"
