data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override operator fun compareTo(other : MyDate) : Int {
        return compareValuesBy(this, other, MyDate::year, MyDate::month, MyDate::dayOfMonth)
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
