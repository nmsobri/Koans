class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {

    override operator fun iterator(): Iterator<MyDate> = object : Iterator<MyDate> {
        var current = start

        override fun hasNext(): Boolean {
            return current <= end
        }

        override fun next(): MyDate {
            val result = current
            current = current.nextDay()
            return result
        }

    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
