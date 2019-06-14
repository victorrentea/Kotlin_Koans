data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int =
        when {
            year != other.year -> year - other.year
            month != other.month -> month - other.month
            else -> dayOfMonth - other.dayOfMonth
        }

    operator fun plus(other : MyDate): MyDate = MyDate(1,1,1)

}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2

fun main() {
    MyDate(1,1,1) + MyDate(1,1,1)
}
