import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

class TimeIntervalCount(val timeInterval: TimeInterval, val count: Int)

operator fun TimeInterval.times(count: Int) = TimeIntervalCount(this,count)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate =
        this.addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(timeIntervalCount: TimeIntervalCount): MyDate {
    var currentDate = this
    for (i in 1 .. timeIntervalCount.count) {
        currentDate += timeIntervalCount.timeInterval
    }
    return currentDate
}


fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
