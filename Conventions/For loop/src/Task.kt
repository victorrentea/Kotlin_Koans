class DateRange(private val start: MyDate, private val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): MyDateIterator = MyDateIterator(start, end)
}
class MyDateIterator(start: MyDate, private val end: MyDate) : Iterator<MyDate> {
    var current = start
    override fun hasNext(): Boolean = current <= end
    override fun next(): MyDate {
        return current++
    }
}

fun main() {
    var d = MyDate(2019,7,12);
    println(d++)
    println(++d)
    println(d)
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {

    val dateRange: DateRange = firstDate..secondDate
    for (date in dateRange) {
        handler(date)
    }
}
