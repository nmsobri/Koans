fun renderProductTable(): String {
    return html {
        table {
            tr(color = getTitleColor()) {
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
            for ((k, v) in products.withIndex()) {
                tr(color = getRowColor(k)) {
                    td {
                        text(v.description)
                    }
                    td {
                        text(v.price)
                    }
                    td {
                        text(v.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getRowColor(index: Int) = if (index % 2 == 0) "#dce4ff" else "#eff2ff"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"
